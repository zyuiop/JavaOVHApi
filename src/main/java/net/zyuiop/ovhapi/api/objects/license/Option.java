package net.zyuiop.ovhapi.api.objects.license;

/**
 * Your License options
 */

public interface Option { 

	/**
	 * @return Quantity or corresponding label of the designated option enabled on your license
	 */
	java.lang.String getAmount(); 

	/**
	 * @return This option related version
	 */
	java.lang.String getVersion(); 

	/**
	 * @return This option designation
	 */
	java.lang.String getLabel(); 

	/**
	 * @return Specifies whether this option can be released or not
	 */
	boolean getCanBeDeleted(); 

	/**
	 * @return This option expiration date
	 */
	java.util.Date getExpirationDate(); 

}
