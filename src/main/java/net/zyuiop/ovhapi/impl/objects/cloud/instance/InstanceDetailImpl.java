package net.zyuiop.ovhapi.impl.objects.cloud.instance;

import net.zyuiop.ovhapi.api.objects.cloud.instance.InstanceDetail;
/**
 * InstanceDetail
 */

public class InstanceDetailImpl implements InstanceDetail { 

	private java.lang.String status;
	private java.lang.String name;
	private java.lang.String region;
	private net.zyuiop.ovhapi.impl.objects.cloud.image.ImageImpl image;
	private java.util.Date created;
	private net.zyuiop.ovhapi.impl.objects.cloud.sshkey.SshKeyDetailImpl sshKey;
	private net.zyuiop.ovhapi.impl.objects.cloud.instance.MonthlyBillingImpl monthlyBilling;
	private net.zyuiop.ovhapi.impl.objects.cloud.instance.IpAddressImpl[] ipAddresses;
	private java.lang.String id;
	private net.zyuiop.ovhapi.impl.objects.cloud.flavor.FlavorImpl flavor;

	public InstanceDetailImpl() {
	}

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public InstanceDetailImpl status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public InstanceDetailImpl name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public java.lang.String getRegion() { 
		return this.region;
	} 

	public void setRegion(java.lang.String region) { 
		this.region = region;
	} 

	public InstanceDetailImpl region(java.lang.String region) { 
		this.region = region;
		return this;
	} 

	public net.zyuiop.ovhapi.impl.objects.cloud.image.ImageImpl getImage() { 
		return this.image;
	} 

	public void setImage(net.zyuiop.ovhapi.impl.objects.cloud.image.ImageImpl image) { 
		this.image = image;
	} 

	public InstanceDetailImpl image(net.zyuiop.ovhapi.impl.objects.cloud.image.ImageImpl image) { 
		this.image = image;
		return this;
	} 

	public java.util.Date getCreated() { 
		return this.created;
	} 

	public void setCreated(java.util.Date created) { 
		this.created = created;
	} 

	public InstanceDetailImpl created(java.util.Date created) { 
		this.created = created;
		return this;
	} 

	public net.zyuiop.ovhapi.impl.objects.cloud.sshkey.SshKeyDetailImpl getSshKey() { 
		return this.sshKey;
	} 

	public void setSshKey(net.zyuiop.ovhapi.impl.objects.cloud.sshkey.SshKeyDetailImpl sshKey) { 
		this.sshKey = sshKey;
	} 

	public InstanceDetailImpl sshKey(net.zyuiop.ovhapi.impl.objects.cloud.sshkey.SshKeyDetailImpl sshKey) { 
		this.sshKey = sshKey;
		return this;
	} 

	public net.zyuiop.ovhapi.impl.objects.cloud.instance.MonthlyBillingImpl getMonthlyBilling() { 
		return this.monthlyBilling;
	} 

	public void setMonthlyBilling(net.zyuiop.ovhapi.impl.objects.cloud.instance.MonthlyBillingImpl monthlyBilling) { 
		this.monthlyBilling = monthlyBilling;
	} 

	public InstanceDetailImpl monthlyBilling(net.zyuiop.ovhapi.impl.objects.cloud.instance.MonthlyBillingImpl monthlyBilling) { 
		this.monthlyBilling = monthlyBilling;
		return this;
	} 

	public net.zyuiop.ovhapi.impl.objects.cloud.instance.IpAddressImpl[] getIpAddresses() { 
		return this.ipAddresses;
	} 

	public void setIpAddresses(net.zyuiop.ovhapi.impl.objects.cloud.instance.IpAddressImpl[] ipAddresses) { 
		this.ipAddresses = ipAddresses;
	} 

	public InstanceDetailImpl ipAddresses(net.zyuiop.ovhapi.impl.objects.cloud.instance.IpAddressImpl[] ipAddresses) { 
		this.ipAddresses = ipAddresses;
		return this;
	} 

	public java.lang.String getId() { 
		return this.id;
	} 

	public void setId(java.lang.String id) { 
		this.id = id;
	} 

	public InstanceDetailImpl id(java.lang.String id) { 
		this.id = id;
		return this;
	} 

	public net.zyuiop.ovhapi.impl.objects.cloud.flavor.FlavorImpl getFlavor() { 
		return this.flavor;
	} 

	public void setFlavor(net.zyuiop.ovhapi.impl.objects.cloud.flavor.FlavorImpl flavor) { 
		this.flavor = flavor;
	} 

	public InstanceDetailImpl flavor(net.zyuiop.ovhapi.impl.objects.cloud.flavor.FlavorImpl flavor) { 
		this.flavor = flavor;
		return this;
	} 

}
