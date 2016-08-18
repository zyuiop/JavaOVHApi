package net.zyuiop.ovhapi.api.objects.overthebox;

/**
 * Device action
 */

public class DeviceAction { 

	private java.lang.String actionId;
	private java.lang.String status;
	private java.lang.String name;

	public DeviceAction() {
	}

	public java.lang.String getActionId() { 
		return this.actionId;
	} 

	public void setActionId(java.lang.String actionId) { 
		this.actionId = actionId;
	} 

	public DeviceAction actionId(java.lang.String actionId) { 
		this.actionId = actionId;
		return this;
	} 

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public DeviceAction status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public DeviceAction name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

}
