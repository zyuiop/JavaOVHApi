package net.zyuiop.ovhapi.impl.objects.sms;

import net.zyuiop.ovhapi.api.objects.sms.Quota;
/**
 * A structure describing all information about quota informations
 */

public class QuotaImpl implements Quota { 

	private java.lang.String quotaStatus;
	private double quotaLeft;

	public QuotaImpl() {
	}

	public java.lang.String getQuotaStatus() { 
		return this.quotaStatus;
	} 

	public void setQuotaStatus(java.lang.String quotaStatus) { 
		this.quotaStatus = quotaStatus;
	} 

	public QuotaImpl quotaStatus(java.lang.String quotaStatus) { 
		this.quotaStatus = quotaStatus;
		return this;
	} 

	public double getQuotaLeft() { 
		return this.quotaLeft;
	} 

	public void setQuotaLeft(double quotaLeft) { 
		this.quotaLeft = quotaLeft;
	} 

	public QuotaImpl quotaLeft(double quotaLeft) { 
		this.quotaLeft = quotaLeft;
		return this;
	} 

}
