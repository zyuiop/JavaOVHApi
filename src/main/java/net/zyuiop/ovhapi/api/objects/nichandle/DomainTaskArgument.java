package net.zyuiop.ovhapi.api.objects.nichandle;

/**
 * Domain operation argument
 */

public class DomainTaskArgument { 

	private java.lang.String[] fields;
	private java.lang.String value;
	private java.lang.String type;
	private java.lang.String description;
	private java.lang.String key;
	private boolean readOnly;

	public DomainTaskArgument() {
	}

	public java.lang.String[] getFields() { 
		return this.fields;
	} 

	public void setFields(java.lang.String[] fields) { 
		this.fields = fields;
	} 

	public DomainTaskArgument fields(java.lang.String[] fields) { 
		this.fields = fields;
		return this;
	} 

	public java.lang.String getValue() { 
		return this.value;
	} 

	public void setValue(java.lang.String value) { 
		this.value = value;
	} 

	public DomainTaskArgument value(java.lang.String value) { 
		this.value = value;
		return this;
	} 

	public java.lang.String getType() { 
		return this.type;
	} 

	public void setType(java.lang.String type) { 
		this.type = type;
	} 

	public DomainTaskArgument type(java.lang.String type) { 
		this.type = type;
		return this;
	} 

	public java.lang.String getDescription() { 
		return this.description;
	} 

	public void setDescription(java.lang.String description) { 
		this.description = description;
	} 

	public DomainTaskArgument description(java.lang.String description) { 
		this.description = description;
		return this;
	} 

	public java.lang.String getKey() { 
		return this.key;
	} 

	public void setKey(java.lang.String key) { 
		this.key = key;
	} 

	public DomainTaskArgument key(java.lang.String key) { 
		this.key = key;
		return this;
	} 

	public boolean getReadOnly() { 
		return this.readOnly;
	} 

	public void setReadOnly(boolean readOnly) { 
		this.readOnly = readOnly;
	} 

	public DomainTaskArgument readOnly(boolean readOnly) { 
		this.readOnly = readOnly;
		return this;
	} 

}
