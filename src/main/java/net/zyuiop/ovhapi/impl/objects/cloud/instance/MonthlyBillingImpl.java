package net.zyuiop.ovhapi.impl.objects.cloud.instance;

import net.zyuiop.ovhapi.api.objects.cloud.instance.MonthlyBilling;
/**
 * MonthlyBilling
 */

public class MonthlyBillingImpl implements MonthlyBilling { 

	private java.util.Date since;
	private java.lang.String status;

	public MonthlyBillingImpl() {
	}

	public java.util.Date getSince() { 
		return this.since;
	} 

	public void setSince(java.util.Date since) { 
		this.since = since;
	} 

	public MonthlyBillingImpl since(java.util.Date since) { 
		this.since = since;
		return this;
	} 

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public MonthlyBillingImpl status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

}
