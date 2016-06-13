package net.zyuiop.ovhapi.api.objects.nichandle;

/**
 * Describe all rules for a given field
 */

public interface CreationRule { 

	/**
	 * @return null
	 */
	boolean getMandatory(); 

	/**
	 * @return null
	 */
	java.lang.String getRegularExpression(); 

}
