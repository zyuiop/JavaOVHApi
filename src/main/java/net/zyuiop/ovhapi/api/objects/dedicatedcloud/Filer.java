package net.zyuiop.ovhapi.api.objects.dedicatedcloud;

/**
 * Dedicated Cloud Filer
 */

public class Filer { 

	private java.lang.String profile;
	private java.lang.String billingType;
	private java.lang.String name;
	private long filerId;
	private net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue size;
	private java.lang.String state;

	public Filer() {
	}

	public java.lang.String getProfile() { 
		return this.profile;
	} 

	public void setProfile(java.lang.String profile) { 
		this.profile = profile;
	} 

	public Filer profile(java.lang.String profile) { 
		this.profile = profile;
		return this;
	} 

	public java.lang.String getBillingType() { 
		return this.billingType;
	} 

	public void setBillingType(java.lang.String billingType) { 
		this.billingType = billingType;
	} 

	public Filer billingType(java.lang.String billingType) { 
		this.billingType = billingType;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public Filer name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public long getFilerId() { 
		return this.filerId;
	} 

	public void setFilerId(long filerId) { 
		this.filerId = filerId;
	} 

	public Filer filerId(long filerId) { 
		this.filerId = filerId;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue getSize() { 
		return this.size;
	} 

	public void setSize(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue size) { 
		this.size = size;
	} 

	public Filer size(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue size) { 
		this.size = size;
		return this;
	} 

	public java.lang.String getState() { 
		return this.state;
	} 

	public void setState(java.lang.String state) { 
		this.state = state;
	} 

	public Filer state(java.lang.String state) { 
		this.state = state;
		return this;
	} 

}
