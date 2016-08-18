package net.zyuiop.ovhapi.api.objects.cloud.instance;

/**
 * Instance
 */

public class Instance { 

	private java.lang.String status;
	private java.lang.String name;
	private java.lang.String region;
	private java.lang.String imageId;
	private java.util.Date created;
	private java.lang.String flavorId;
	private java.lang.String sshKeyId;
	private net.zyuiop.ovhapi.api.objects.cloud.instance.MonthlyBilling monthlyBilling;
	private net.zyuiop.ovhapi.api.objects.cloud.instance.IpAddress[] ipAddresses;
	private java.lang.String id;

	public Instance() {
	}

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public Instance status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public Instance name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public java.lang.String getRegion() { 
		return this.region;
	} 

	public void setRegion(java.lang.String region) { 
		this.region = region;
	} 

	public Instance region(java.lang.String region) { 
		this.region = region;
		return this;
	} 

	public java.lang.String getImageId() { 
		return this.imageId;
	} 

	public void setImageId(java.lang.String imageId) { 
		this.imageId = imageId;
	} 

	public Instance imageId(java.lang.String imageId) { 
		this.imageId = imageId;
		return this;
	} 

	public java.util.Date getCreated() { 
		return this.created;
	} 

	public void setCreated(java.util.Date created) { 
		this.created = created;
	} 

	public Instance created(java.util.Date created) { 
		this.created = created;
		return this;
	} 

	public java.lang.String getFlavorId() { 
		return this.flavorId;
	} 

	public void setFlavorId(java.lang.String flavorId) { 
		this.flavorId = flavorId;
	} 

	public Instance flavorId(java.lang.String flavorId) { 
		this.flavorId = flavorId;
		return this;
	} 

	public java.lang.String getSshKeyId() { 
		return this.sshKeyId;
	} 

	public void setSshKeyId(java.lang.String sshKeyId) { 
		this.sshKeyId = sshKeyId;
	} 

	public Instance sshKeyId(java.lang.String sshKeyId) { 
		this.sshKeyId = sshKeyId;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.cloud.instance.MonthlyBilling getMonthlyBilling() { 
		return this.monthlyBilling;
	} 

	public void setMonthlyBilling(net.zyuiop.ovhapi.api.objects.cloud.instance.MonthlyBilling monthlyBilling) { 
		this.monthlyBilling = monthlyBilling;
	} 

	public Instance monthlyBilling(net.zyuiop.ovhapi.api.objects.cloud.instance.MonthlyBilling monthlyBilling) { 
		this.monthlyBilling = monthlyBilling;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.cloud.instance.IpAddress[] getIpAddresses() { 
		return this.ipAddresses;
	} 

	public void setIpAddresses(net.zyuiop.ovhapi.api.objects.cloud.instance.IpAddress[] ipAddresses) { 
		this.ipAddresses = ipAddresses;
	} 

	public Instance ipAddresses(net.zyuiop.ovhapi.api.objects.cloud.instance.IpAddress[] ipAddresses) { 
		this.ipAddresses = ipAddresses;
		return this;
	} 

	public java.lang.String getId() { 
		return this.id;
	} 

	public void setId(java.lang.String id) { 
		this.id = id;
	} 

	public Instance id(java.lang.String id) { 
		this.id = id;
		return this;
	} 

}
