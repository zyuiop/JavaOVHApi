package net.zyuiop.ovhapi.impl.objects.order.cart;

import net.zyuiop.ovhapi.api.objects.order.cart.ConfigurationItem;
/**
 * Representation of a configuration item for personalizing product
 */

public class ConfigurationItemImpl implements ConfigurationItem { 

	private java.lang.String value;
	private long id;
	private java.lang.String label;

	public ConfigurationItemImpl() {
	}

	public java.lang.String getValue() { 
		return this.value;
	} 

	public void setValue(java.lang.String value) { 
		this.value = value;
	} 

	public ConfigurationItemImpl value(java.lang.String value) { 
		this.value = value;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public ConfigurationItemImpl id(long id) { 
		this.id = id;
		return this;
	} 

	public java.lang.String getLabel() { 
		return this.label;
	} 

	public void setLabel(java.lang.String label) { 
		this.label = label;
	} 

	public ConfigurationItemImpl label(java.lang.String label) { 
		this.label = label;
		return this;
	} 

}
