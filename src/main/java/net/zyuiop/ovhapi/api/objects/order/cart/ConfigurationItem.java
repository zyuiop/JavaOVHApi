package net.zyuiop.ovhapi.api.objects.order.cart;

/**
 * Representation of a configuration item for personalizing product
 */

public class ConfigurationItem { 

	private java.lang.String value;
	private long id;
	private java.lang.String label;

	public ConfigurationItem() {
	}

	public java.lang.String getValue() { 
		return this.value;
	} 

	public void setValue(java.lang.String value) { 
		this.value = value;
	} 

	public ConfigurationItem value(java.lang.String value) { 
		this.value = value;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public ConfigurationItem id(long id) { 
		this.id = id;
		return this;
	} 

	public java.lang.String getLabel() { 
		return this.label;
	} 

	public void setLabel(java.lang.String label) { 
		this.label = label;
	} 

	public ConfigurationItem label(java.lang.String label) { 
		this.label = label;
		return this;
	} 

}
