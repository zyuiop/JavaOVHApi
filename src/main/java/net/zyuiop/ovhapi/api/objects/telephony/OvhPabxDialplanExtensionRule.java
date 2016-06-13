package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Dialplan rule
 */

public interface OvhPabxDialplanExtensionRule { 

	/**
	 * @return The parameter of the chosen action
	 */
	java.lang.String getActionParam(); 

	/**
	 * @return If true, the rule will be executed only when the result of the conditions is false
	 */
	boolean getNegativeAction(); 

	/**
	 * @return The position of the rule in the extension (the rules are executed following this order)
	 */
	long getPosition(); 

	/**
	 * @return The action made by the rule
	 */
	java.lang.String getAction(); 

	/**
	 * @return null
	 */
	long getRuleId(); 

}
