package net.zyuiop.ovhapi.api.objects.xdsl;

/**
 * LAN Configuration of the Modem
 */

public class LAN { 

	private java.lang.String subnetMask;
	private long taskId;
	private java.lang.String IPAddress;
	private java.lang.String lanName;
	private java.lang.String addressingType;

	public LAN() {
	}

	public java.lang.String getSubnetMask() { 
		return this.subnetMask;
	} 

	public void setSubnetMask(java.lang.String subnetMask) { 
		this.subnetMask = subnetMask;
	} 

	public LAN subnetMask(java.lang.String subnetMask) { 
		this.subnetMask = subnetMask;
		return this;
	} 

	public long getTaskId() { 
		return this.taskId;
	} 

	public void setTaskId(long taskId) { 
		this.taskId = taskId;
	} 

	public LAN taskId(long taskId) { 
		this.taskId = taskId;
		return this;
	} 

	public java.lang.String getIPAddress() { 
		return this.IPAddress;
	} 

	public void setIPAddress(java.lang.String IPAddress) { 
		this.IPAddress = IPAddress;
	} 

	public LAN IPAddress(java.lang.String IPAddress) { 
		this.IPAddress = IPAddress;
		return this;
	} 

	public java.lang.String getLanName() { 
		return this.lanName;
	} 

	public void setLanName(java.lang.String lanName) { 
		this.lanName = lanName;
	} 

	public LAN lanName(java.lang.String lanName) { 
		this.lanName = lanName;
		return this;
	} 

	public java.lang.String getAddressingType() { 
		return this.addressingType;
	} 

	public void setAddressingType(java.lang.String addressingType) { 
		this.addressingType = addressingType;
	} 

	public LAN addressingType(java.lang.String addressingType) { 
		this.addressingType = addressingType;
		return this;
	} 

}
