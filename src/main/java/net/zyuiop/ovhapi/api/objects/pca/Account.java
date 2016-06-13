package net.zyuiop.ovhapi.api.objects.pca;

/**
 * Cloud Archives Account
 */

public interface Account { 

	/**
	 * @return account domain
	 */
	java.lang.String getDomain(); 

	/**
	 * @return encrypted password
	 */
	java.lang.String getPassword(); 

	/**
	 * @return ssh key to be used for upload and download
	 */
	java.lang.String getSshkey(); 

	/**
	 * @return login for cloud archives
	 */
	java.lang.String getLogin(); 

	/**
	 * @return host where to upload files to
	 */
	java.lang.String getHost(); 

}
