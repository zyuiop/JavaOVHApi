package net.zyuiop.ovhapi.api.objects.order.cart;

/**
 * Information about a configuration
 */

public interface ConfigurationRequirements { 

	/**
	 * @return Indicates if the configuration item is required
	 */
	boolean getRequired(); 

	/**
	 * @return Indicates if some particular fields have to be inputed during the creation of `type` resource
	 */
	java.lang.String[] getFields(); 

	/**
	 * @return Label for your configuration item
	 */
	java.lang.String getLabel(); 

	/**
	 * @return Type of the configuration item
	 */
	java.lang.String getType(); 

}
