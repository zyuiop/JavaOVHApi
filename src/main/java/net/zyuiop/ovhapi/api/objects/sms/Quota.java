package net.zyuiop.ovhapi.api.objects.sms;

/**
 * A structure describing all information about quota informations
 */

public class Quota { 

	private java.lang.String quotaStatus;
	private double quotaLeft;

	public Quota() {
	}

	public java.lang.String getQuotaStatus() { 
		return this.quotaStatus;
	} 

	public void setQuotaStatus(java.lang.String quotaStatus) { 
		this.quotaStatus = quotaStatus;
	} 

	public Quota quotaStatus(java.lang.String quotaStatus) { 
		this.quotaStatus = quotaStatus;
		return this;
	} 

	public double getQuotaLeft() { 
		return this.quotaLeft;
	} 

	public void setQuotaLeft(double quotaLeft) { 
		this.quotaLeft = quotaLeft;
	} 

	public Quota quotaLeft(double quotaLeft) { 
		this.quotaLeft = quotaLeft;
		return this;
	} 

}
