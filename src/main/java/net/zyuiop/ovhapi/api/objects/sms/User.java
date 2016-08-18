package net.zyuiop.ovhapi.api.objects.sms;

/**
 * SMS users
 */

public class User { 

	private net.zyuiop.ovhapi.api.objects.sms.Quota quotaInformations;
	private java.lang.String password;
	private java.lang.String stopCallBack;
	private java.lang.String[] ipRestrictions;
	private net.zyuiop.ovhapi.api.objects.sms.AlertThreshold alertThresholdInformations;
	private java.lang.String login;
	private java.lang.String callBack;

	public User() {
	}

	public net.zyuiop.ovhapi.api.objects.sms.Quota getQuotaInformations() { 
		return this.quotaInformations;
	} 

	public void setQuotaInformations(net.zyuiop.ovhapi.api.objects.sms.Quota quotaInformations) { 
		this.quotaInformations = quotaInformations;
	} 

	public User quotaInformations(net.zyuiop.ovhapi.api.objects.sms.Quota quotaInformations) { 
		this.quotaInformations = quotaInformations;
		return this;
	} 

	public java.lang.String getPassword() { 
		return this.password;
	} 

	public void setPassword(java.lang.String password) { 
		this.password = password;
	} 

	public User password(java.lang.String password) { 
		this.password = password;
		return this;
	} 

	public java.lang.String getStopCallBack() { 
		return this.stopCallBack;
	} 

	public void setStopCallBack(java.lang.String stopCallBack) { 
		this.stopCallBack = stopCallBack;
	} 

	public User stopCallBack(java.lang.String stopCallBack) { 
		this.stopCallBack = stopCallBack;
		return this;
	} 

	public java.lang.String[] getIpRestrictions() { 
		return this.ipRestrictions;
	} 

	public void setIpRestrictions(java.lang.String[] ipRestrictions) { 
		this.ipRestrictions = ipRestrictions;
	} 

	public User ipRestrictions(java.lang.String[] ipRestrictions) { 
		this.ipRestrictions = ipRestrictions;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.sms.AlertThreshold getAlertThresholdInformations() { 
		return this.alertThresholdInformations;
	} 

	public void setAlertThresholdInformations(net.zyuiop.ovhapi.api.objects.sms.AlertThreshold alertThresholdInformations) { 
		this.alertThresholdInformations = alertThresholdInformations;
	} 

	public User alertThresholdInformations(net.zyuiop.ovhapi.api.objects.sms.AlertThreshold alertThresholdInformations) { 
		this.alertThresholdInformations = alertThresholdInformations;
		return this;
	} 

	public java.lang.String getLogin() { 
		return this.login;
	} 

	public void setLogin(java.lang.String login) { 
		this.login = login;
	} 

	public User login(java.lang.String login) { 
		this.login = login;
		return this;
	} 

	public java.lang.String getCallBack() { 
		return this.callBack;
	} 

	public void setCallBack(java.lang.String callBack) { 
		this.callBack = callBack;
	} 

	public User callBack(java.lang.String callBack) { 
		this.callBack = callBack;
		return this;
	} 

}
