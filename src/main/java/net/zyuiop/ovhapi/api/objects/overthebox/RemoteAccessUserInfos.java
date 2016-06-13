package net.zyuiop.ovhapi.api.objects.overthebox;

/**
 * Infos about the remote user
 */

public interface RemoteAccessUserInfos { 

	/**
	 * @return IP from which the remote access will be allowed
	 */
	java.lang.String getIp(); 

	/**
	 * @return The user that will access the device remotely
	 */
	java.lang.String getUser(); 

	/**
	 * @return The public key authorized on the device (for SSH purpose)
	 */
	java.lang.String getPublicKey(); 

}
