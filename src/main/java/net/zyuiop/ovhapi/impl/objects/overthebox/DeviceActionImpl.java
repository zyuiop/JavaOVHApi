package net.zyuiop.ovhapi.impl.objects.overthebox;

import net.zyuiop.ovhapi.api.objects.overthebox.DeviceAction;
/**
 * Device action
 */

public class DeviceActionImpl implements DeviceAction { 

	private java.lang.String actionId;
	private java.lang.String status;
	private java.lang.String name;

	public DeviceActionImpl() {
	}

	public java.lang.String getActionId() { 
		return this.actionId;
	} 

	public void setActionId(java.lang.String actionId) { 
		this.actionId = actionId;
	} 

	public DeviceActionImpl actionId(java.lang.String actionId) { 
		this.actionId = actionId;
		return this;
	} 

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public DeviceActionImpl status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public DeviceActionImpl name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

}
