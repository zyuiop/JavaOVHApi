package net.zyuiop.ovhapi.api.objects.dedicatedcloud;

/**
 * Dedicated Cloud Vlan
 */

public class Vlan { 

	private long vlanNumber;
	private java.lang.String name;
	private java.lang.String type;
	private java.lang.String routingRateLimit;
	private long vlanId;
	private java.lang.String state;

	public Vlan() {
	}

	public long getVlanNumber() { 
		return this.vlanNumber;
	} 

	public void setVlanNumber(long vlanNumber) { 
		this.vlanNumber = vlanNumber;
	} 

	public Vlan vlanNumber(long vlanNumber) { 
		this.vlanNumber = vlanNumber;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public Vlan name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public java.lang.String getType() { 
		return this.type;
	} 

	public void setType(java.lang.String type) { 
		this.type = type;
	} 

	public Vlan type(java.lang.String type) { 
		this.type = type;
		return this;
	} 

	public java.lang.String getRoutingRateLimit() { 
		return this.routingRateLimit;
	} 

	public void setRoutingRateLimit(java.lang.String routingRateLimit) { 
		this.routingRateLimit = routingRateLimit;
	} 

	public Vlan routingRateLimit(java.lang.String routingRateLimit) { 
		this.routingRateLimit = routingRateLimit;
		return this;
	} 

	public long getVlanId() { 
		return this.vlanId;
	} 

	public void setVlanId(long vlanId) { 
		this.vlanId = vlanId;
	} 

	public Vlan vlanId(long vlanId) { 
		this.vlanId = vlanId;
		return this;
	} 

	public java.lang.String getState() { 
		return this.state;
	} 

	public void setState(java.lang.String state) { 
		this.state = state;
	} 

	public Vlan state(java.lang.String state) { 
		this.state = state;
		return this;
	} 

}
