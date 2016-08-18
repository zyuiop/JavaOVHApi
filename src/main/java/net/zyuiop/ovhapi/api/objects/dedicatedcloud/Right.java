package net.zyuiop.ovhapi.api.objects.dedicatedcloud;

/**
 * Dedicated Cloud User right
 */

public class Right { 

	private boolean canAddRessource;
	private java.lang.String right;
	private long rightId;
	private long datacenterId;
	private java.lang.String vmNetworkRole;
	private java.lang.String networkRole;

	public Right() {
	}

	public boolean getCanAddRessource() { 
		return this.canAddRessource;
	} 

	public void setCanAddRessource(boolean canAddRessource) { 
		this.canAddRessource = canAddRessource;
	} 

	public Right canAddRessource(boolean canAddRessource) { 
		this.canAddRessource = canAddRessource;
		return this;
	} 

	public java.lang.String getRight() { 
		return this.right;
	} 

	public void setRight(java.lang.String right) { 
		this.right = right;
	} 

	public Right right(java.lang.String right) { 
		this.right = right;
		return this;
	} 

	public long getRightId() { 
		return this.rightId;
	} 

	public void setRightId(long rightId) { 
		this.rightId = rightId;
	} 

	public Right rightId(long rightId) { 
		this.rightId = rightId;
		return this;
	} 

	public long getDatacenterId() { 
		return this.datacenterId;
	} 

	public void setDatacenterId(long datacenterId) { 
		this.datacenterId = datacenterId;
	} 

	public Right datacenterId(long datacenterId) { 
		this.datacenterId = datacenterId;
		return this;
	} 

	public java.lang.String getVmNetworkRole() { 
		return this.vmNetworkRole;
	} 

	public void setVmNetworkRole(java.lang.String vmNetworkRole) { 
		this.vmNetworkRole = vmNetworkRole;
	} 

	public Right vmNetworkRole(java.lang.String vmNetworkRole) { 
		this.vmNetworkRole = vmNetworkRole;
		return this;
	} 

	public java.lang.String getNetworkRole() { 
		return this.networkRole;
	} 

	public void setNetworkRole(java.lang.String networkRole) { 
		this.networkRole = networkRole;
	} 

	public Right networkRole(java.lang.String networkRole) { 
		this.networkRole = networkRole;
		return this;
	} 

}
