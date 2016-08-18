package net.zyuiop.ovhapi.api.objects.overthebox;

/**
 * A device for registration
 */

public class DeviceForRegistration { 

	private boolean activated;
	private java.lang.String deviceId;
	private java.util.Date lastSeen;

	public DeviceForRegistration() {
	}

	public boolean getActivated() { 
		return this.activated;
	} 

	public void setActivated(boolean activated) { 
		this.activated = activated;
	} 

	public DeviceForRegistration activated(boolean activated) { 
		this.activated = activated;
		return this;
	} 

	public java.lang.String getDeviceId() { 
		return this.deviceId;
	} 

	public void setDeviceId(java.lang.String deviceId) { 
		this.deviceId = deviceId;
	} 

	public DeviceForRegistration deviceId(java.lang.String deviceId) { 
		this.deviceId = deviceId;
		return this;
	} 

	public java.util.Date getLastSeen() { 
		return this.lastSeen;
	} 

	public void setLastSeen(java.util.Date lastSeen) { 
		this.lastSeen = lastSeen;
	} 

	public DeviceForRegistration lastSeen(java.util.Date lastSeen) { 
		this.lastSeen = lastSeen;
		return this;
	} 

}
