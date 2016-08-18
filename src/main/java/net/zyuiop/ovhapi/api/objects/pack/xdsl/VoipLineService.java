package net.zyuiop.ovhapi.api.objects.pack.xdsl;

/**
 * VOIP line services
 */

public class VoipLineService { 

	private java.lang.String domain;
	private java.lang.String billingAccount;

	public VoipLineService() {
	}

	public java.lang.String getDomain() { 
		return this.domain;
	} 

	public void setDomain(java.lang.String domain) { 
		this.domain = domain;
	} 

	public VoipLineService domain(java.lang.String domain) { 
		this.domain = domain;
		return this;
	} 

	public java.lang.String getBillingAccount() { 
		return this.billingAccount;
	} 

	public void setBillingAccount(java.lang.String billingAccount) { 
		this.billingAccount = billingAccount;
	} 

	public VoipLineService billingAccount(java.lang.String billingAccount) { 
		this.billingAccount = billingAccount;
		return this;
	} 

}
