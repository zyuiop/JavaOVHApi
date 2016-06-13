package net.zyuiop.ovhapi.impl.objects.overthebox;

import net.zyuiop.ovhapi.api.objects.overthebox.AvailableDeviceAction;
/**
 * Device action
 */

public class AvailableDeviceActionImpl implements AvailableDeviceAction { 

	private java.lang.String name;
	private java.lang.String description;

	public AvailableDeviceActionImpl() {
	}

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public AvailableDeviceActionImpl name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public java.lang.String getDescription() { 
		return this.description;
	} 

	public void setDescription(java.lang.String description) { 
		this.description = description;
	} 

	public AvailableDeviceActionImpl description(java.lang.String description) { 
		this.description = description;
		return this;
	} 

}
