package net.zyuiop.ovhapi.impl.objects.xdsl;

import net.zyuiop.ovhapi.api.objects.xdsl.DHCPStaticAddress;
/**
 * DHCP Static Address
 */

public class DHCPStaticAddressImpl implements DHCPStaticAddress { 

	private long taskId;
	private java.lang.String IPAddress;
	private java.lang.String MACAddress;
	private java.lang.String name;

	public DHCPStaticAddressImpl() {
	}

	public long getTaskId() { 
		return this.taskId;
	} 

	public void setTaskId(long taskId) { 
		this.taskId = taskId;
	} 

	public DHCPStaticAddressImpl taskId(long taskId) { 
		this.taskId = taskId;
		return this;
	} 

	public java.lang.String getIPAddress() { 
		return this.IPAddress;
	} 

	public void setIPAddress(java.lang.String IPAddress) { 
		this.IPAddress = IPAddress;
	} 

	public DHCPStaticAddressImpl IPAddress(java.lang.String IPAddress) { 
		this.IPAddress = IPAddress;
		return this;
	} 

	public java.lang.String getMACAddress() { 
		return this.MACAddress;
	} 

	public void setMACAddress(java.lang.String MACAddress) { 
		this.MACAddress = MACAddress;
	} 

	public DHCPStaticAddressImpl MACAddress(java.lang.String MACAddress) { 
		this.MACAddress = MACAddress;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public DHCPStaticAddressImpl name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

}
