package net.zyuiop.ovhapi.api.objects.order.cart;

/**
 * Representation of a configuration item for personalizing product
 */

public interface ConfigurationItem { 

	/**
	 * @return Path to the resource in API.OVH.COM
	 */
	java.lang.String getValue(); 

	/**
	 * @return Configuration ID
	 */
	long getId(); 

	/**
	 * @return Identifier of the resource
	 */
	java.lang.String getLabel(); 

}
