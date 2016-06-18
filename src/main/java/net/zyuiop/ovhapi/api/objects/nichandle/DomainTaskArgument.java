package net.zyuiop.ovhapi.api.objects.nichandle;

/**
 * Domain operation argument
 */

public interface DomainTaskArgument { 

	/**
	 * @return List of impacted field names
	 */
	java.lang.String[] getFields(); 

	/**
	 * @return Value of the argument
	 */
	java.lang.String getValue(); 

	/**
	 * @return Type of the argument
	 */
	java.lang.String getType(); 

	/**
	 * @return Description of the argument
	 */
	java.lang.String getDescription(); 

	/**
	 * @return Key of the argument
	 */
	java.lang.String getKey(); 

	/**
	 * @return True if the argument is in read only
	 */
	boolean getReadOnly(); 

}
