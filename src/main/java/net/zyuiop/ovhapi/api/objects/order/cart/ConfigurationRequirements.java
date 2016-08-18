package net.zyuiop.ovhapi.api.objects.order.cart;

/**
 * Information about a configuration
 */

public class ConfigurationRequirements { 

	private boolean required;
	private java.lang.String[] fields;
	private java.lang.String label;
	private java.lang.String type;

	public ConfigurationRequirements() {
	}

	public boolean getRequired() { 
		return this.required;
	} 

	public void setRequired(boolean required) { 
		this.required = required;
	} 

	public ConfigurationRequirements required(boolean required) { 
		this.required = required;
		return this;
	} 

	public java.lang.String[] getFields() { 
		return this.fields;
	} 

	public void setFields(java.lang.String[] fields) { 
		this.fields = fields;
	} 

	public ConfigurationRequirements fields(java.lang.String[] fields) { 
		this.fields = fields;
		return this;
	} 

	public java.lang.String getLabel() { 
		return this.label;
	} 

	public void setLabel(java.lang.String label) { 
		this.label = label;
	} 

	public ConfigurationRequirements label(java.lang.String label) { 
		this.label = label;
		return this;
	} 

	public java.lang.String getType() { 
		return this.type;
	} 

	public void setType(java.lang.String type) { 
		this.type = type;
	} 

	public ConfigurationRequirements type(java.lang.String type) { 
		this.type = type;
		return this;
	} 

}
