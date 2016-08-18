package net.zyuiop.ovhapi;

import net.zyuiop.ovhapi.api.OVHClient;
import net.zyuiop.ovhapi.impl.OVHClientImpl;

/**
 * @author zyuiop
 */
public class OVHClientManager {
	private static OVHClient client;

	/**
	 * Gets the currently initialized OVH client
	 * @return The current client, or null if none is found
	 */
	public static OVHClient getClient() {
		return client;
	}

	/**
	 * Creates and stores an OVH Client instance
	 * @param appKey the application key of your application
	 * @param appSecret the secret key of your application
	 * @param consumerKey the consumer token returned by OVH
	 * @return A brand new OVH Client
	 */
	public static OVHClient createClient(String appKey, String appSecret, String consumerKey) {
		client = new OVHClientImpl(appKey, appSecret, consumerKey);
		return client;
	}

	/**
	 * Creates and stores an unauthentificated OVH Client instance
	 * @param appKey the application key of your application
	 * @param appSecret the secret key of your application
	 * @return A brand new OVH Client
	 */
	public static OVHClient createClient(String appKey, String appSecret) {
		client = new OVHClientImpl(appKey, appSecret);
		return client;
	}

	/**
	 * Checks if an OVH client instance already exists and returns it if so
	 * If no instance has been created yet, it's created using {@link #createClient(String, String, String)}
	 * @param appKey the application key of your application
	 * @param appSecret the secret key of your application
	 * @param consumerKey the consumer token returned by OVH
	 * @return A brand new OVH Client
	 */
	public static OVHClient getOrCreateClient(String appKey, String appSecret, String consumerKey) {
		return client == null ? createClient(appKey, appSecret, consumerKey) : client;
	}
}