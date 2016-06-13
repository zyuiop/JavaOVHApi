package net.zyuiop.ovhapi.impl.objects.xdsl;

import net.zyuiop.ovhapi.api.objects.xdsl.LAN;
/**
 * LAN Configuration of the Modem
 */

public class LANImpl implements LAN { 

	private java.lang.String subnetMask;
	private long taskId;
	private java.lang.String IPAddress;
	private java.lang.String lanName;
	private java.lang.String addressingType;

	public LANImpl() {
	}

	public java.lang.String getSubnetMask() { 
		return this.subnetMask;
	} 

	public void setSubnetMask(java.lang.String subnetMask) { 
		this.subnetMask = subnetMask;
	} 

	public LANImpl subnetMask(java.lang.String subnetMask) { 
		this.subnetMask = subnetMask;
		return this;
	} 

	public long getTaskId() { 
		return this.taskId;
	} 

	public void setTaskId(long taskId) { 
		this.taskId = taskId;
	} 

	public LANImpl taskId(long taskId) { 
		this.taskId = taskId;
		return this;
	} 

	public java.lang.String getIPAddress() { 
		return this.IPAddress;
	} 

	public void setIPAddress(java.lang.String IPAddress) { 
		this.IPAddress = IPAddress;
	} 

	public LANImpl IPAddress(java.lang.String IPAddress) { 
		this.IPAddress = IPAddress;
		return this;
	} 

	public java.lang.String getLanName() { 
		return this.lanName;
	} 

	public void setLanName(java.lang.String lanName) { 
		this.lanName = lanName;
	} 

	public LANImpl lanName(java.lang.String lanName) { 
		this.lanName = lanName;
		return this;
	} 

	public java.lang.String getAddressingType() { 
		return this.addressingType;
	} 

	public void setAddressingType(java.lang.String addressingType) { 
		this.addressingType = addressingType;
	} 

	public LANImpl addressingType(java.lang.String addressingType) { 
		this.addressingType = addressingType;
		return this;
	} 

}
