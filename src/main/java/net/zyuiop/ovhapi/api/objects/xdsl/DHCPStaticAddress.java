package net.zyuiop.ovhapi.api.objects.xdsl;

/**
 * DHCP Static Address
 */

public class DHCPStaticAddress { 

	private long taskId;
	private java.lang.String IPAddress;
	private java.lang.String MACAddress;
	private java.lang.String name;

	public DHCPStaticAddress() {
	}

	public long getTaskId() { 
		return this.taskId;
	} 

	public void setTaskId(long taskId) { 
		this.taskId = taskId;
	} 

	public DHCPStaticAddress taskId(long taskId) { 
		this.taskId = taskId;
		return this;
	} 

	public java.lang.String getIPAddress() { 
		return this.IPAddress;
	} 

	public void setIPAddress(java.lang.String IPAddress) { 
		this.IPAddress = IPAddress;
	} 

	public DHCPStaticAddress IPAddress(java.lang.String IPAddress) { 
		this.IPAddress = IPAddress;
		return this;
	} 

	public java.lang.String getMACAddress() { 
		return this.MACAddress;
	} 

	public void setMACAddress(java.lang.String MACAddress) { 
		this.MACAddress = MACAddress;
	} 

	public DHCPStaticAddress MACAddress(java.lang.String MACAddress) { 
		this.MACAddress = MACAddress;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public DHCPStaticAddress name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

}
