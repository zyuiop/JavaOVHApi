package net.zyuiop.ovhapi.api.objects.xdsl;

/**
 * Connected Device
 */

public class ConnectedDevice { 

	private java.lang.String addressSource;
	private java.util.Date informationDate;
	private java.lang.String macAddress;
	private java.lang.String ipAddress;
	private boolean active;
	private java.lang.String hostName;
	private long leaseTimeRemaining;
	private java.lang.String interfaceType;

	public ConnectedDevice() {
	}

	public java.lang.String getAddressSource() { 
		return this.addressSource;
	} 

	public void setAddressSource(java.lang.String addressSource) { 
		this.addressSource = addressSource;
	} 

	public ConnectedDevice addressSource(java.lang.String addressSource) { 
		this.addressSource = addressSource;
		return this;
	} 

	public java.util.Date getInformationDate() { 
		return this.informationDate;
	} 

	public void setInformationDate(java.util.Date informationDate) { 
		this.informationDate = informationDate;
	} 

	public ConnectedDevice informationDate(java.util.Date informationDate) { 
		this.informationDate = informationDate;
		return this;
	} 

	public java.lang.String getMacAddress() { 
		return this.macAddress;
	} 

	public void setMacAddress(java.lang.String macAddress) { 
		this.macAddress = macAddress;
	} 

	public ConnectedDevice macAddress(java.lang.String macAddress) { 
		this.macAddress = macAddress;
		return this;
	} 

	public java.lang.String getIpAddress() { 
		return this.ipAddress;
	} 

	public void setIpAddress(java.lang.String ipAddress) { 
		this.ipAddress = ipAddress;
	} 

	public ConnectedDevice ipAddress(java.lang.String ipAddress) { 
		this.ipAddress = ipAddress;
		return this;
	} 

	public boolean getActive() { 
		return this.active;
	} 

	public void setActive(boolean active) { 
		this.active = active;
	} 

	public ConnectedDevice active(boolean active) { 
		this.active = active;
		return this;
	} 

	public java.lang.String getHostName() { 
		return this.hostName;
	} 

	public void setHostName(java.lang.String hostName) { 
		this.hostName = hostName;
	} 

	public ConnectedDevice hostName(java.lang.String hostName) { 
		this.hostName = hostName;
		return this;
	} 

	public long getLeaseTimeRemaining() { 
		return this.leaseTimeRemaining;
	} 

	public void setLeaseTimeRemaining(long leaseTimeRemaining) { 
		this.leaseTimeRemaining = leaseTimeRemaining;
	} 

	public ConnectedDevice leaseTimeRemaining(long leaseTimeRemaining) { 
		this.leaseTimeRemaining = leaseTimeRemaining;
		return this;
	} 

	public java.lang.String getInterfaceType() { 
		return this.interfaceType;
	} 

	public void setInterfaceType(java.lang.String interfaceType) { 
		this.interfaceType = interfaceType;
	} 

	public ConnectedDevice interfaceType(java.lang.String interfaceType) { 
		this.interfaceType = interfaceType;
		return this;
	} 

}
