package net.zyuiop.ovhapi.impl.objects.sms;

import net.zyuiop.ovhapi.api.objects.sms.AlertThreshold;
/**
 * A structure describing all information about alert threshold informations
 */

public class AlertThresholdImpl implements AlertThreshold { 

	private java.lang.String support;
	private long alertThreshold;
	private java.lang.String alertEmail;
	private java.lang.String alertNumber;

	public AlertThresholdImpl() {
	}

	public java.lang.String getSupport() { 
		return this.support;
	} 

	public void setSupport(java.lang.String support) { 
		this.support = support;
	} 

	public AlertThresholdImpl support(java.lang.String support) { 
		this.support = support;
		return this;
	} 

	public long getAlertThreshold() { 
		return this.alertThreshold;
	} 

	public void setAlertThreshold(long alertThreshold) { 
		this.alertThreshold = alertThreshold;
	} 

	public AlertThresholdImpl alertThreshold(long alertThreshold) { 
		this.alertThreshold = alertThreshold;
		return this;
	} 

	public java.lang.String getAlertEmail() { 
		return this.alertEmail;
	} 

	public void setAlertEmail(java.lang.String alertEmail) { 
		this.alertEmail = alertEmail;
	} 

	public AlertThresholdImpl alertEmail(java.lang.String alertEmail) { 
		this.alertEmail = alertEmail;
		return this;
	} 

	public java.lang.String getAlertNumber() { 
		return this.alertNumber;
	} 

	public void setAlertNumber(java.lang.String alertNumber) { 
		this.alertNumber = alertNumber;
	} 

	public AlertThresholdImpl alertNumber(java.lang.String alertNumber) { 
		this.alertNumber = alertNumber;
		return this;
	} 

}
