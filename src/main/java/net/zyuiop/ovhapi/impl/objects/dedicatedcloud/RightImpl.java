package net.zyuiop.ovhapi.impl.objects.dedicatedcloud;

import net.zyuiop.ovhapi.api.objects.dedicatedcloud.Right;
/**
 * Dedicated Cloud User right
 */

public class RightImpl implements Right { 

	private boolean canAddRessource;
	private java.lang.String right;
	private long rightId;
	private long datacenterId;
	private java.lang.String vmNetworkRole;
	private java.lang.String networkRole;

	public RightImpl() {
	}

	public boolean getCanAddRessource() { 
		return this.canAddRessource;
	} 

	public void setCanAddRessource(boolean canAddRessource) { 
		this.canAddRessource = canAddRessource;
	} 

	public RightImpl canAddRessource(boolean canAddRessource) { 
		this.canAddRessource = canAddRessource;
		return this;
	} 

	public java.lang.String getRight() { 
		return this.right;
	} 

	public void setRight(java.lang.String right) { 
		this.right = right;
	} 

	public RightImpl right(java.lang.String right) { 
		this.right = right;
		return this;
	} 

	public long getRightId() { 
		return this.rightId;
	} 

	public void setRightId(long rightId) { 
		this.rightId = rightId;
	} 

	public RightImpl rightId(long rightId) { 
		this.rightId = rightId;
		return this;
	} 

	public long getDatacenterId() { 
		return this.datacenterId;
	} 

	public void setDatacenterId(long datacenterId) { 
		this.datacenterId = datacenterId;
	} 

	public RightImpl datacenterId(long datacenterId) { 
		this.datacenterId = datacenterId;
		return this;
	} 

	public java.lang.String getVmNetworkRole() { 
		return this.vmNetworkRole;
	} 

	public void setVmNetworkRole(java.lang.String vmNetworkRole) { 
		this.vmNetworkRole = vmNetworkRole;
	} 

	public RightImpl vmNetworkRole(java.lang.String vmNetworkRole) { 
		this.vmNetworkRole = vmNetworkRole;
		return this;
	} 

	public java.lang.String getNetworkRole() { 
		return this.networkRole;
	} 

	public void setNetworkRole(java.lang.String networkRole) { 
		this.networkRole = networkRole;
	} 

	public RightImpl networkRole(java.lang.String networkRole) { 
		this.networkRole = networkRole;
		return this;
	} 

}
