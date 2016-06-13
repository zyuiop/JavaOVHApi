package net.zyuiop.ovhapi.api.objects.cloud.sshkey;

/**
 * SshKey
 */

public interface SshKey { 

	/**
	 * @return SSH key regions
	 */
	java.lang.String getRegions(); 

	/**
	 * @return SSH key name
	 */
	java.lang.String getName(); 

	/**
	 * @return SSH key id
	 */
	java.lang.String getId(); 

	/**
	 * @return SSH public key
	 */
	java.lang.String getPublicKey(); 

}
