package net.zyuiop.ovhapi.impl.objects.sms;

import net.zyuiop.ovhapi.api.objects.sms.User;
/**
 * SMS users
 */

public class UserImpl implements User { 

	private net.zyuiop.ovhapi.impl.objects.sms.QuotaImpl quotaInformations;
	private java.lang.String password;
	private java.lang.String stopCallBack;
	private java.lang.String ipRestrictions;
	private net.zyuiop.ovhapi.impl.objects.sms.AlertThresholdImpl alertThresholdInformations;
	private java.lang.String login;
	private java.lang.String callBack;

	public UserImpl() {
	}

	public net.zyuiop.ovhapi.impl.objects.sms.QuotaImpl getQuotaInformations() { 
		return this.quotaInformations;
	} 

	public void setQuotaInformations(net.zyuiop.ovhapi.impl.objects.sms.QuotaImpl quotaInformations) { 
		this.quotaInformations = quotaInformations;
	} 

	public UserImpl quotaInformations(net.zyuiop.ovhapi.impl.objects.sms.QuotaImpl quotaInformations) { 
		this.quotaInformations = quotaInformations;
		return this;
	} 

	public java.lang.String getPassword() { 
		return this.password;
	} 

	public void setPassword(java.lang.String password) { 
		this.password = password;
	} 

	public UserImpl password(java.lang.String password) { 
		this.password = password;
		return this;
	} 

	public java.lang.String getStopCallBack() { 
		return this.stopCallBack;
	} 

	public void setStopCallBack(java.lang.String stopCallBack) { 
		this.stopCallBack = stopCallBack;
	} 

	public UserImpl stopCallBack(java.lang.String stopCallBack) { 
		this.stopCallBack = stopCallBack;
		return this;
	} 

	public java.lang.String getIpRestrictions() { 
		return this.ipRestrictions;
	} 

	public void setIpRestrictions(java.lang.String ipRestrictions) { 
		this.ipRestrictions = ipRestrictions;
	} 

	public UserImpl ipRestrictions(java.lang.String ipRestrictions) { 
		this.ipRestrictions = ipRestrictions;
		return this;
	} 

	public net.zyuiop.ovhapi.impl.objects.sms.AlertThresholdImpl getAlertThresholdInformations() { 
		return this.alertThresholdInformations;
	} 

	public void setAlertThresholdInformations(net.zyuiop.ovhapi.impl.objects.sms.AlertThresholdImpl alertThresholdInformations) { 
		this.alertThresholdInformations = alertThresholdInformations;
	} 

	public UserImpl alertThresholdInformations(net.zyuiop.ovhapi.impl.objects.sms.AlertThresholdImpl alertThresholdInformations) { 
		this.alertThresholdInformations = alertThresholdInformations;
		return this;
	} 

	public java.lang.String getLogin() { 
		return this.login;
	} 

	public void setLogin(java.lang.String login) { 
		this.login = login;
	} 

	public UserImpl login(java.lang.String login) { 
		this.login = login;
		return this;
	} 

	public java.lang.String getCallBack() { 
		return this.callBack;
	} 

	public void setCallBack(java.lang.String callBack) { 
		this.callBack = callBack;
	} 

	public UserImpl callBack(java.lang.String callBack) { 
		this.callBack = callBack;
		return this;
	} 

}
