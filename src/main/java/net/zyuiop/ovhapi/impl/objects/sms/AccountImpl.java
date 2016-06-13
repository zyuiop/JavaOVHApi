package net.zyuiop.ovhapi.impl.objects.sms;

import net.zyuiop.ovhapi.api.objects.sms.Account;
/**
 * SMS details
 */

public class AccountImpl implements Account { 

	private net.zyuiop.ovhapi.api.objects.sms.Response smsResponse;
	private java.lang.String status;
	private double creditsLeft;
	private java.lang.String name;
	private long userQuantityWithQuota;
	private java.lang.String description;
	private java.lang.String callBack;
	private double creditThresholdForAutomaticRecredit;
	private java.lang.String stopCallBack;
	private double creditsHoldByQuota;
	private long automaticRecreditAmount;
	private net.zyuiop.ovhapi.api.objects.sms.Templates templates;

	public AccountImpl() {
	}

	public net.zyuiop.ovhapi.api.objects.sms.Response getSmsResponse() { 
		return this.smsResponse;
	} 

	public void setSmsResponse(net.zyuiop.ovhapi.api.objects.sms.Response smsResponse) { 
		this.smsResponse = smsResponse;
	} 

	public AccountImpl smsResponse(net.zyuiop.ovhapi.api.objects.sms.Response smsResponse) { 
		this.smsResponse = smsResponse;
		return this;
	} 

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public AccountImpl status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public double getCreditsLeft() { 
		return this.creditsLeft;
	} 

	public void setCreditsLeft(double creditsLeft) { 
		this.creditsLeft = creditsLeft;
	} 

	public AccountImpl creditsLeft(double creditsLeft) { 
		this.creditsLeft = creditsLeft;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public AccountImpl name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public long getUserQuantityWithQuota() { 
		return this.userQuantityWithQuota;
	} 

	public void setUserQuantityWithQuota(long userQuantityWithQuota) { 
		this.userQuantityWithQuota = userQuantityWithQuota;
	} 

	public AccountImpl userQuantityWithQuota(long userQuantityWithQuota) { 
		this.userQuantityWithQuota = userQuantityWithQuota;
		return this;
	} 

	public java.lang.String getDescription() { 
		return this.description;
	} 

	public void setDescription(java.lang.String description) { 
		this.description = description;
	} 

	public AccountImpl description(java.lang.String description) { 
		this.description = description;
		return this;
	} 

	public java.lang.String getCallBack() { 
		return this.callBack;
	} 

	public void setCallBack(java.lang.String callBack) { 
		this.callBack = callBack;
	} 

	public AccountImpl callBack(java.lang.String callBack) { 
		this.callBack = callBack;
		return this;
	} 

	public double getCreditThresholdForAutomaticRecredit() { 
		return this.creditThresholdForAutomaticRecredit;
	} 

	public void setCreditThresholdForAutomaticRecredit(double creditThresholdForAutomaticRecredit) { 
		this.creditThresholdForAutomaticRecredit = creditThresholdForAutomaticRecredit;
	} 

	public AccountImpl creditThresholdForAutomaticRecredit(double creditThresholdForAutomaticRecredit) { 
		this.creditThresholdForAutomaticRecredit = creditThresholdForAutomaticRecredit;
		return this;
	} 

	public java.lang.String getStopCallBack() { 
		return this.stopCallBack;
	} 

	public void setStopCallBack(java.lang.String stopCallBack) { 
		this.stopCallBack = stopCallBack;
	} 

	public AccountImpl stopCallBack(java.lang.String stopCallBack) { 
		this.stopCallBack = stopCallBack;
		return this;
	} 

	public double getCreditsHoldByQuota() { 
		return this.creditsHoldByQuota;
	} 

	public void setCreditsHoldByQuota(double creditsHoldByQuota) { 
		this.creditsHoldByQuota = creditsHoldByQuota;
	} 

	public AccountImpl creditsHoldByQuota(double creditsHoldByQuota) { 
		this.creditsHoldByQuota = creditsHoldByQuota;
		return this;
	} 

	public long getAutomaticRecreditAmount() { 
		return this.automaticRecreditAmount;
	} 

	public void setAutomaticRecreditAmount(long automaticRecreditAmount) { 
		this.automaticRecreditAmount = automaticRecreditAmount;
	} 

	public AccountImpl automaticRecreditAmount(long automaticRecreditAmount) { 
		this.automaticRecreditAmount = automaticRecreditAmount;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.sms.Templates getTemplates() { 
		return this.templates;
	} 

	public void setTemplates(net.zyuiop.ovhapi.api.objects.sms.Templates templates) { 
		this.templates = templates;
	} 

	public AccountImpl templates(net.zyuiop.ovhapi.api.objects.sms.Templates templates) { 
		this.templates = templates;
		return this;
	} 

}
