package net.zyuiop.ovhapi.api.objects.dedicated.server;

/**
 *  ip address linked with this virtual mac address
 */

public class VirtualMacManagement { 

	private java.lang.String virtualMachineName;
	private java.lang.String ipAddress;

	public VirtualMacManagement() {
	}

	public java.lang.String getVirtualMachineName() { 
		return this.virtualMachineName;
	} 

	public void setVirtualMachineName(java.lang.String virtualMachineName) { 
		this.virtualMachineName = virtualMachineName;
	} 

	public VirtualMacManagement virtualMachineName(java.lang.String virtualMachineName) { 
		this.virtualMachineName = virtualMachineName;
		return this;
	} 

	public java.lang.String getIpAddress() { 
		return this.ipAddress;
	} 

	public void setIpAddress(java.lang.String ipAddress) { 
		this.ipAddress = ipAddress;
	} 

	public VirtualMacManagement ipAddress(java.lang.String ipAddress) { 
		this.ipAddress = ipAddress;
		return this;
	} 

}
