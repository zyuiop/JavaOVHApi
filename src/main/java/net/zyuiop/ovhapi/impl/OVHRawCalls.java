package net.zyuiop.ovhapi.impl;

import net.zyuiop.ovhapi.api.OVHApiMethod;
import org.apache.commons.io.IOUtils;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

/**
 * @author zyuiop
 *         <p>
 *         This class manages all dirty calls to OVH Api, whereas OVHClientImpl only stores API's instances
 */
public abstract class OVHRawCalls {
	private final String appKey;
	private final String appSecret;
	private       String consumerKey;
	private long ovhDiff = 0;

	public OVHRawCalls(String appKey, String appSecret, String consumerKey) {
		this.appKey = appKey;
		this.appSecret = appSecret;
		this.authenticate(consumerKey);
	}

	public void authenticate(String consumerKey) {
		this.consumerKey = consumerKey;

		new Timer().schedule(new TimerTask() {
			@Override
			public void run() {
				try {
					String ovhTime = String.valueOf(callNoAuth(new URL("https://eu.api.ovh.com/1.0/auth/time")));
					Long l = Long.parseLong(ovhTime);
					ovhDiff = l - getTimestamp();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}, 0, TimeUnit.MINUTES.toMillis(5));
	}

	public OVHRawCalls(String appKey, String appSecret) {
		this.appKey = appKey;
		this.appSecret = appSecret;
	}

	public String getSignature(URL url, OVHApiMethod method, String data) {
		String notHashed = appSecret + "+" + consumerKey + "+" + method.name() + "+" + url.toString() + "+" + data + "+" + getTimestamp();
		return "$1$" + hash(notHashed);
	}

	private long getTimestamp() {
		return getSystemTimestamp() + ovhDiff;
	}

	private long getSystemTimestamp() {
		return System.currentTimeMillis() / 1000;
	}

	public String callRaw(URL url, OVHApiMethod method, String data) throws IOException {
		return callRaw(url, method, data, true);
	}

	public String callRaw(URL url, OVHApiMethod method, String data, boolean hasAuth) throws IOException, IllegalStateException {
		if (method == OVHApiMethod.GET && !data.isEmpty()) {
			url = new URL(url.toString() + data);
		}

		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setRequestMethod(method.name());
		connection.setRequestProperty("Content-Type", "application/json");
		connection.setRequestProperty("X-Ovh-Application", appKey);

		if (hasAuth) {
			if (consumerKey == null)
				throw new IllegalStateException("This OVHClient instance has no consumer key : cannot execute authenticated operations.");
			connection.setRequestProperty("X-Ovh-Consumer", consumerKey);
			connection.setRequestProperty("X-Ovh-Signature", getSignature(url, method, data));
			connection.setRequestProperty("X-Ovh-Timestamp", String.valueOf(getTimestamp()));
		}

		if (!data.isEmpty() && method != OVHApiMethod.GET) {
			connection.setDoOutput(true);
			DataOutputStream wr = new DataOutputStream(connection.getOutputStream());
			wr.writeBytes(data);
			wr.flush();
			wr.close();
		}

		connection.connect();
		if (connection.getResponseCode() != 200) {
			System.out.println("Error : " + connection.getResponseCode() + " " + IOUtils.toString(connection.getErrorStream()));
			System.out.println("Accessed address : " + url.toString());
			return null;
		}
		return IOUtils.toString(connection.getInputStream());
	}

	public String callNoAuth(URL url) throws IOException {
		return IOUtils.toString(url.openStream());
	}

	private static String hash(String text) {
		MessageDigest md;
		try {
			md = MessageDigest.getInstance("SHA-1");
			byte[] sha1hash;
			md.update(text.getBytes("iso-8859-1"), 0, text.length());
			sha1hash = md.digest();
			return convertToHex(sha1hash);
		} catch (NoSuchAlgorithmException e) {
			return "NoSuchAlgorithmException: " + text + " " + e;
		} catch (UnsupportedEncodingException e) {
			return "UnsupportedEncodingException: " + text + " " + e;
		}
	}

	private static String convertToHex(byte[] data) {
		StringBuilder buf = new StringBuilder();
		for (byte aData : data) {
			int halfbyte = (aData >>> 4) & 0x0F;
			int two_halfs = 0;
			do {
				if ((0 <= halfbyte) && (halfbyte <= 9))
					buf.append((char) ('0' + halfbyte));
				else
					buf.append((char) ('a' + (halfbyte - 10)));
				halfbyte = aData & 0x0F;
			} while (two_halfs++ < 1);
		}
		return buf.toString();
	}
}