package net.zyuiop.ovhapi.api.objects.overthebox;

/**
 * Device action
 */

public class AvailableDeviceAction { 

	private java.lang.String name;
	private java.lang.String description;

	public AvailableDeviceAction() {
	}

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public AvailableDeviceAction name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public java.lang.String getDescription() { 
		return this.description;
	} 

	public void setDescription(java.lang.String description) { 
		this.description = description;
	} 

	public AvailableDeviceAction description(java.lang.String description) { 
		this.description = description;
		return this;
	} 

}
