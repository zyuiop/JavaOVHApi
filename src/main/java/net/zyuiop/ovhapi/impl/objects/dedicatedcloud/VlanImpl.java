package net.zyuiop.ovhapi.impl.objects.dedicatedcloud;

import net.zyuiop.ovhapi.api.objects.dedicatedcloud.Vlan;
/**
 * Dedicated Cloud Vlan
 */

public class VlanImpl implements Vlan { 

	private long vlanNumber;
	private java.lang.String name;
	private java.lang.String type;
	private java.lang.String routingRateLimit;
	private long vlanId;
	private java.lang.String state;

	public VlanImpl() {
	}

	public long getVlanNumber() { 
		return this.vlanNumber;
	} 

	public void setVlanNumber(long vlanNumber) { 
		this.vlanNumber = vlanNumber;
	} 

	public VlanImpl vlanNumber(long vlanNumber) { 
		this.vlanNumber = vlanNumber;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public VlanImpl name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public java.lang.String getType() { 
		return this.type;
	} 

	public void setType(java.lang.String type) { 
		this.type = type;
	} 

	public VlanImpl type(java.lang.String type) { 
		this.type = type;
		return this;
	} 

	public java.lang.String getRoutingRateLimit() { 
		return this.routingRateLimit;
	} 

	public void setRoutingRateLimit(java.lang.String routingRateLimit) { 
		this.routingRateLimit = routingRateLimit;
	} 

	public VlanImpl routingRateLimit(java.lang.String routingRateLimit) { 
		this.routingRateLimit = routingRateLimit;
		return this;
	} 

	public long getVlanId() { 
		return this.vlanId;
	} 

	public void setVlanId(long vlanId) { 
		this.vlanId = vlanId;
	} 

	public VlanImpl vlanId(long vlanId) { 
		this.vlanId = vlanId;
		return this;
	} 

	public java.lang.String getState() { 
		return this.state;
	} 

	public void setState(java.lang.String state) { 
		this.state = state;
	} 

	public VlanImpl state(java.lang.String state) { 
		this.state = state;
		return this;
	} 

}
