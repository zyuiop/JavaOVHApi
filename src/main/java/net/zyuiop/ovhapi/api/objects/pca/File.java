package net.zyuiop.ovhapi.api.objects.pca;

/**
 * cloud archives files
 */

public interface File { 

	/**
	 * @return File SHA1 hash
	 */
	java.lang.String getSHA1(); 

	/**
	 * @return File name
	 */
	java.lang.String getName(); 

	/**
	 * @return File state
	 */
	java.lang.String getState(); 

	/**
	 * @return File size, in bytes
	 */
	long getSize(); 

	/**
	 * @return File SHA256 hash
	 */
	java.lang.String getSHA256(); 

	/**
	 * @return File id
	 */
	java.lang.String getId(); 

	/**
	 * @return File type
	 */
	java.lang.String getType(); 

	/**
	 * @return File MD5 hash
	 */
	java.lang.String getMD5(); 

}
