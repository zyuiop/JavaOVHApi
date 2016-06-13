package net.zyuiop.ovhapi.api.objects.pca;

/**
 * cloud archives billing
 */

public interface Billing { 

	/**
	 * @return Billing reference name
	 */
	java.lang.String getReference(); 

	/**
	 * @return Date and time the operation took place
	 */
	java.util.Date getDate(); 

	/**
	 * @return Quantity of bytes for operation
	 */
	long getQuantity(); 

	/**
	 * @return Billing id
	 */
	long getId(); 

	/**
	 * @return Total usage after operation
	 */
	long getTotal(); 

	/**
	 * @return Billing action is billed.
	 */
	boolean getBilled(); 

}
