package net.zyuiop.ovhapi.api.objects.overthebox;

/**
 * Device
 */

public class Device { 

	private java.lang.String publicIp;
	private boolean activated;
	private java.lang.String deviceId;
	private java.util.Date lastSeen;
	private net.zyuiop.ovhapi.api.objects.overthebox.DeviceInterface[] networkInterfaces;

	public Device() {
	}

	public java.lang.String getPublicIp() { 
		return this.publicIp;
	} 

	public void setPublicIp(java.lang.String publicIp) { 
		this.publicIp = publicIp;
	} 

	public Device publicIp(java.lang.String publicIp) { 
		this.publicIp = publicIp;
		return this;
	} 

	public boolean getActivated() { 
		return this.activated;
	} 

	public void setActivated(boolean activated) { 
		this.activated = activated;
	} 

	public Device activated(boolean activated) { 
		this.activated = activated;
		return this;
	} 

	public java.lang.String getDeviceId() { 
		return this.deviceId;
	} 

	public void setDeviceId(java.lang.String deviceId) { 
		this.deviceId = deviceId;
	} 

	public Device deviceId(java.lang.String deviceId) { 
		this.deviceId = deviceId;
		return this;
	} 

	public java.util.Date getLastSeen() { 
		return this.lastSeen;
	} 

	public void setLastSeen(java.util.Date lastSeen) { 
		this.lastSeen = lastSeen;
	} 

	public Device lastSeen(java.util.Date lastSeen) { 
		this.lastSeen = lastSeen;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.overthebox.DeviceInterface[] getNetworkInterfaces() { 
		return this.networkInterfaces;
	} 

	public void setNetworkInterfaces(net.zyuiop.ovhapi.api.objects.overthebox.DeviceInterface[] networkInterfaces) { 
		this.networkInterfaces = networkInterfaces;
	} 

	public Device networkInterfaces(net.zyuiop.ovhapi.api.objects.overthebox.DeviceInterface[] networkInterfaces) { 
		this.networkInterfaces = networkInterfaces;
		return this;
	} 

}
