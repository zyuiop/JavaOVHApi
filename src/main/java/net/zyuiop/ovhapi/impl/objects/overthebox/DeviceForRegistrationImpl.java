package net.zyuiop.ovhapi.impl.objects.overthebox;

import net.zyuiop.ovhapi.api.objects.overthebox.DeviceForRegistration;
/**
 * A device for registration
 */

public class DeviceForRegistrationImpl implements DeviceForRegistration { 

	private boolean activated;
	private java.lang.String deviceId;
	private java.util.Date lastSeen;

	public DeviceForRegistrationImpl() {
	}

	public boolean getActivated() { 
		return this.activated;
	} 

	public void setActivated(boolean activated) { 
		this.activated = activated;
	} 

	public DeviceForRegistrationImpl activated(boolean activated) { 
		this.activated = activated;
		return this;
	} 

	public java.lang.String getDeviceId() { 
		return this.deviceId;
	} 

	public void setDeviceId(java.lang.String deviceId) { 
		this.deviceId = deviceId;
	} 

	public DeviceForRegistrationImpl deviceId(java.lang.String deviceId) { 
		this.deviceId = deviceId;
		return this;
	} 

	public java.util.Date getLastSeen() { 
		return this.lastSeen;
	} 

	public void setLastSeen(java.util.Date lastSeen) { 
		this.lastSeen = lastSeen;
	} 

	public DeviceForRegistrationImpl lastSeen(java.util.Date lastSeen) { 
		this.lastSeen = lastSeen;
		return this;
	} 

}
