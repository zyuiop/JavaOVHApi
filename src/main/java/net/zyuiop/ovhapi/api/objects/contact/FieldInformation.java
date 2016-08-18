package net.zyuiop.ovhapi.api.objects.contact;

/**
 * Extras informations about a field
 */

public class FieldInformation { 

	private boolean mandatory;
	private java.lang.String fieldName;
	private boolean readOnly;

	public FieldInformation() {
	}

	public boolean getMandatory() { 
		return this.mandatory;
	} 

	public void setMandatory(boolean mandatory) { 
		this.mandatory = mandatory;
	} 

	public FieldInformation mandatory(boolean mandatory) { 
		this.mandatory = mandatory;
		return this;
	} 

	public java.lang.String getFieldName() { 
		return this.fieldName;
	} 

	public void setFieldName(java.lang.String fieldName) { 
		this.fieldName = fieldName;
	} 

	public FieldInformation fieldName(java.lang.String fieldName) { 
		this.fieldName = fieldName;
		return this;
	} 

	public boolean getReadOnly() { 
		return this.readOnly;
	} 

	public void setReadOnly(boolean readOnly) { 
		this.readOnly = readOnly;
	} 

	public FieldInformation readOnly(boolean readOnly) { 
		this.readOnly = readOnly;
		return this;
	} 

}
