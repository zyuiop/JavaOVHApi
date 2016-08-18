package net.zyuiop.ovhapi.api.objects.cloud.instance;

/**
 * InstanceDetail
 */

public class InstanceDetail { 

	private java.lang.String status;
	private java.lang.String name;
	private java.lang.String region;
	private net.zyuiop.ovhapi.api.objects.cloud.image.Image image;
	private java.util.Date created;
	private net.zyuiop.ovhapi.api.objects.cloud.sshkey.SshKeyDetail sshKey;
	private net.zyuiop.ovhapi.api.objects.cloud.instance.MonthlyBilling monthlyBilling;
	private net.zyuiop.ovhapi.api.objects.cloud.instance.IpAddress[] ipAddresses;
	private java.lang.String id;
	private net.zyuiop.ovhapi.api.objects.cloud.flavor.Flavor flavor;

	public InstanceDetail() {
	}

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public InstanceDetail status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public InstanceDetail name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public java.lang.String getRegion() { 
		return this.region;
	} 

	public void setRegion(java.lang.String region) { 
		this.region = region;
	} 

	public InstanceDetail region(java.lang.String region) { 
		this.region = region;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.cloud.image.Image getImage() { 
		return this.image;
	} 

	public void setImage(net.zyuiop.ovhapi.api.objects.cloud.image.Image image) { 
		this.image = image;
	} 

	public InstanceDetail image(net.zyuiop.ovhapi.api.objects.cloud.image.Image image) { 
		this.image = image;
		return this;
	} 

	public java.util.Date getCreated() { 
		return this.created;
	} 

	public void setCreated(java.util.Date created) { 
		this.created = created;
	} 

	public InstanceDetail created(java.util.Date created) { 
		this.created = created;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.cloud.sshkey.SshKeyDetail getSshKey() { 
		return this.sshKey;
	} 

	public void setSshKey(net.zyuiop.ovhapi.api.objects.cloud.sshkey.SshKeyDetail sshKey) { 
		this.sshKey = sshKey;
	} 

	public InstanceDetail sshKey(net.zyuiop.ovhapi.api.objects.cloud.sshkey.SshKeyDetail sshKey) { 
		this.sshKey = sshKey;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.cloud.instance.MonthlyBilling getMonthlyBilling() { 
		return this.monthlyBilling;
	} 

	public void setMonthlyBilling(net.zyuiop.ovhapi.api.objects.cloud.instance.MonthlyBilling monthlyBilling) { 
		this.monthlyBilling = monthlyBilling;
	} 

	public InstanceDetail monthlyBilling(net.zyuiop.ovhapi.api.objects.cloud.instance.MonthlyBilling monthlyBilling) { 
		this.monthlyBilling = monthlyBilling;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.cloud.instance.IpAddress[] getIpAddresses() { 
		return this.ipAddresses;
	} 

	public void setIpAddresses(net.zyuiop.ovhapi.api.objects.cloud.instance.IpAddress[] ipAddresses) { 
		this.ipAddresses = ipAddresses;
	} 

	public InstanceDetail ipAddresses(net.zyuiop.ovhapi.api.objects.cloud.instance.IpAddress[] ipAddresses) { 
		this.ipAddresses = ipAddresses;
		return this;
	} 

	public java.lang.String getId() { 
		return this.id;
	} 

	public void setId(java.lang.String id) { 
		this.id = id;
	} 

	public InstanceDetail id(java.lang.String id) { 
		this.id = id;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.cloud.flavor.Flavor getFlavor() { 
		return this.flavor;
	} 

	public void setFlavor(net.zyuiop.ovhapi.api.objects.cloud.flavor.Flavor flavor) { 
		this.flavor = flavor;
	} 

	public InstanceDetail flavor(net.zyuiop.ovhapi.api.objects.cloud.flavor.Flavor flavor) { 
		this.flavor = flavor;
		return this;
	} 

}
