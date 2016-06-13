package net.zyuiop.ovhapi.impl.objects.contact;

import net.zyuiop.ovhapi.api.objects.contact.FieldInformation;
/**
 * Extras informations about a field
 */

public class FieldInformationImpl implements FieldInformation { 

	private boolean mandatory;
	private java.lang.String fieldName;
	private boolean readOnly;

	public FieldInformationImpl() {
	}

	public boolean getMandatory() { 
		return this.mandatory;
	} 

	public void setMandatory(boolean mandatory) { 
		this.mandatory = mandatory;
	} 

	public FieldInformationImpl mandatory(boolean mandatory) { 
		this.mandatory = mandatory;
		return this;
	} 

	public java.lang.String getFieldName() { 
		return this.fieldName;
	} 

	public void setFieldName(java.lang.String fieldName) { 
		this.fieldName = fieldName;
	} 

	public FieldInformationImpl fieldName(java.lang.String fieldName) { 
		this.fieldName = fieldName;
		return this;
	} 

	public boolean getReadOnly() { 
		return this.readOnly;
	} 

	public void setReadOnly(boolean readOnly) { 
		this.readOnly = readOnly;
	} 

	public FieldInformationImpl readOnly(boolean readOnly) { 
		this.readOnly = readOnly;
		return this;
	} 

}
