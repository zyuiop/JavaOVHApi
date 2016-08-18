package net.zyuiop.ovhapi.api.objects.cloud.instance;

/**
 * MonthlyBilling
 */

public class MonthlyBilling { 

	private java.util.Date since;
	private java.lang.String status;

	public MonthlyBilling() {
	}

	public java.util.Date getSince() { 
		return this.since;
	} 

	public void setSince(java.util.Date since) { 
		this.since = since;
	} 

	public MonthlyBilling since(java.util.Date since) { 
		this.since = since;
		return this;
	} 

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public MonthlyBilling status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

}
