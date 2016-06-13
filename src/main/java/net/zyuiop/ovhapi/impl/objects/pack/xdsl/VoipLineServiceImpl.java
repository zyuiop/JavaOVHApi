package net.zyuiop.ovhapi.impl.objects.pack.xdsl;

import net.zyuiop.ovhapi.api.objects.pack.xdsl.VoipLineService;
/**
 * VOIP line services
 */

public class VoipLineServiceImpl implements VoipLineService { 

	private java.lang.String domain;
	private java.lang.String billingAccount;

	public VoipLineServiceImpl() {
	}

	public java.lang.String getDomain() { 
		return this.domain;
	} 

	public void setDomain(java.lang.String domain) { 
		this.domain = domain;
	} 

	public VoipLineServiceImpl domain(java.lang.String domain) { 
		this.domain = domain;
		return this;
	} 

	public java.lang.String getBillingAccount() { 
		return this.billingAccount;
	} 

	public void setBillingAccount(java.lang.String billingAccount) { 
		this.billingAccount = billingAccount;
	} 

	public VoipLineServiceImpl billingAccount(java.lang.String billingAccount) { 
		this.billingAccount = billingAccount;
		return this;
	} 

}
