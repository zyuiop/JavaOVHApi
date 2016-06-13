package net.zyuiop.ovhapi.api.objects.sms;

/**
 * Sms reach list
 */

public interface Exception { 

	/**
	 * @return The abreviated country code.
	 */
	java.lang.String getCountrySuffixe(); 

	/**
	 * @return The exception message
	 */
	java.lang.String getMessages(); 

	/**
	 * @return The type of routing restriction imposed by the operator
	 */
	java.lang.String getRestrictionCode(); 

	/**
	 * @return The list of operators impacted.
	 */
	java.lang.String getOperators(); 

	/**
	 * @return The substitution sender used to bypass operator filter
	 */
	java.lang.String getSubstitution(); 

}
