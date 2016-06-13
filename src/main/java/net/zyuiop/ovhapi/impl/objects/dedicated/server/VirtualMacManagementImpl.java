package net.zyuiop.ovhapi.impl.objects.dedicated.server;

import net.zyuiop.ovhapi.api.objects.dedicated.server.VirtualMacManagement;
/**
 *  ip address linked with this virtual mac address
 */

public class VirtualMacManagementImpl implements VirtualMacManagement { 

	private java.lang.String virtualMachineName;
	private java.lang.String ipAddress;

	public VirtualMacManagementImpl() {
	}

	public java.lang.String getVirtualMachineName() { 
		return this.virtualMachineName;
	} 

	public void setVirtualMachineName(java.lang.String virtualMachineName) { 
		this.virtualMachineName = virtualMachineName;
	} 

	public VirtualMacManagementImpl virtualMachineName(java.lang.String virtualMachineName) { 
		this.virtualMachineName = virtualMachineName;
		return this;
	} 

	public java.lang.String getIpAddress() { 
		return this.ipAddress;
	} 

	public void setIpAddress(java.lang.String ipAddress) { 
		this.ipAddress = ipAddress;
	} 

	public VirtualMacManagementImpl ipAddress(java.lang.String ipAddress) { 
		this.ipAddress = ipAddress;
		return this;
	} 

}
