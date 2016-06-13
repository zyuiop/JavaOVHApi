package net.zyuiop.ovhapi.impl.methods;

import net.zyuiop.ovhapi.api.methods.Auth;
import com.google.gson.Gson;
import net.zyuiop.ovhapi.api.OVHApiMethod;
import java.util.HashMap;
import java.util.Map;
import net.zyuiop.ovhapi.impl.OVHRawCalls;
import java.net.URL;
public class AuthImpl implements Auth { 

	private final OVHRawCalls client;

	public AuthImpl(OVHRawCalls client) { 
		this.client = client;
	}

	public net.zyuiop.ovhapi.api.objects.api.Credential getCurrentCredential() throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/currentCredential";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.api.Credential.class);
	}

	public net.zyuiop.ovhapi.api.objects.auth.Credential postCredential(net.zyuiop.ovhapi.api.objects.auth.AccessRule accessRules, java.lang.String redirection) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/credential";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("accessRules", accessRules);
		dataMap.put("redirection", redirection);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, false), net.zyuiop.ovhapi.api.objects.auth.Credential.class);
	}

	public net.zyuiop.ovhapi.api.objects.auth.Credential postCredential(net.zyuiop.ovhapi.api.objects.auth.AccessRule accessRules) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/credential";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("accessRules", accessRules);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, false), net.zyuiop.ovhapi.api.objects.auth.Credential.class);
	}

	public long getTime() throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/time";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, false), long.class);
	}

	public void postLogout() throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/logout";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

}
