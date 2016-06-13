package net.zyuiop.ovhapi.impl.objects.veeamcloudconnect;

import net.zyuiop.ovhapi.api.objects.veeamcloudconnect.Account;
/**
 * Veeam Cloud Connect account
 */

public class AccountImpl implements Account { 

	private java.lang.String productOffer;
	private java.lang.String location;
	private java.lang.String serviceName;
	private long vmCount;

	public AccountImpl() {
	}

	public java.lang.String getProductOffer() { 
		return this.productOffer;
	} 

	public void setProductOffer(java.lang.String productOffer) { 
		this.productOffer = productOffer;
	} 

	public AccountImpl productOffer(java.lang.String productOffer) { 
		this.productOffer = productOffer;
		return this;
	} 

	public java.lang.String getLocation() { 
		return this.location;
	} 

	public void setLocation(java.lang.String location) { 
		this.location = location;
	} 

	public AccountImpl location(java.lang.String location) { 
		this.location = location;
		return this;
	} 

	public java.lang.String getServiceName() { 
		return this.serviceName;
	} 

	public void setServiceName(java.lang.String serviceName) { 
		this.serviceName = serviceName;
	} 

	public AccountImpl serviceName(java.lang.String serviceName) { 
		this.serviceName = serviceName;
		return this;
	} 

	public long getVmCount() { 
		return this.vmCount;
	} 

	public void setVmCount(long vmCount) { 
		this.vmCount = vmCount;
	} 

	public AccountImpl vmCount(long vmCount) { 
		this.vmCount = vmCount;
		return this;
	} 

}
