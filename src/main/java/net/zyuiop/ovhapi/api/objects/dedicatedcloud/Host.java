package net.zyuiop.ovhapi.api.objects.dedicatedcloud;

/**
 * Dedicated Cloud Host
 */

public class Host { 

	private java.lang.String profile;
	private net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue cpu;
	private java.lang.String billingType;
	private long hostId;
	private java.lang.String name;
	private net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue ram;
	private java.lang.String state;

	public Host() {
	}

	public java.lang.String getProfile() { 
		return this.profile;
	} 

	public void setProfile(java.lang.String profile) { 
		this.profile = profile;
	} 

	public Host profile(java.lang.String profile) { 
		this.profile = profile;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue getCpu() { 
		return this.cpu;
	} 

	public void setCpu(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue cpu) { 
		this.cpu = cpu;
	} 

	public Host cpu(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue cpu) { 
		this.cpu = cpu;
		return this;
	} 

	public java.lang.String getBillingType() { 
		return this.billingType;
	} 

	public void setBillingType(java.lang.String billingType) { 
		this.billingType = billingType;
	} 

	public Host billingType(java.lang.String billingType) { 
		this.billingType = billingType;
		return this;
	} 

	public long getHostId() { 
		return this.hostId;
	} 

	public void setHostId(long hostId) { 
		this.hostId = hostId;
	} 

	public Host hostId(long hostId) { 
		this.hostId = hostId;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public Host name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue getRam() { 
		return this.ram;
	} 

	public void setRam(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue ram) { 
		this.ram = ram;
	} 

	public Host ram(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue ram) { 
		this.ram = ram;
		return this;
	} 

	public java.lang.String getState() { 
		return this.state;
	} 

	public void setState(java.lang.String state) { 
		this.state = state;
	} 

	public Host state(java.lang.String state) { 
		this.state = state;
		return this;
	} 

}
