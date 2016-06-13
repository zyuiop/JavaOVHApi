package net.zyuiop.ovhapi.api.objects.contact;

/**
 * Extras informations about a field
 */

public interface FieldInformation { 

	/**
	 * @return Indicates if the field is mandatory when editing
	 */
	boolean getMandatory(); 

	/**
	 * @return Name of the field concerned by restrictions
	 */
	java.lang.String getFieldName(); 

	/**
	 * @return Indicates if the field can't be edited
	 */
	boolean getReadOnly(); 

}
