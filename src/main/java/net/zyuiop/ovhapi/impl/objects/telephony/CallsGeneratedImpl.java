package net.zyuiop.ovhapi.impl.objects.telephony;

import net.zyuiop.ovhapi.api.objects.telephony.CallsGenerated;
/**
 * Automatic Call made by Call Generator on this line
 */

public class CallsGeneratedImpl implements CallsGenerated { 

	private java.util.Date answerDatetime;
	private java.util.Date callCreatedDatetime;
	private java.lang.String callee;
	private java.lang.String application;
	private long callDuration;
	private java.lang.String dtmf;
	private java.lang.String uuid;
	private java.lang.String billingNumber;
	private java.lang.String identifier;
	private java.lang.String applicationResult;
	private java.lang.String transferFrom;
	private java.lang.String caller;
	private java.util.Date hangupDatetime;
	private java.lang.String hangupCause;

	public CallsGeneratedImpl() {
	}

	public java.util.Date getAnswerDatetime() { 
		return this.answerDatetime;
	} 

	public void setAnswerDatetime(java.util.Date answerDatetime) { 
		this.answerDatetime = answerDatetime;
	} 

	public CallsGeneratedImpl answerDatetime(java.util.Date answerDatetime) { 
		this.answerDatetime = answerDatetime;
		return this;
	} 

	public java.util.Date getCallCreatedDatetime() { 
		return this.callCreatedDatetime;
	} 

	public void setCallCreatedDatetime(java.util.Date callCreatedDatetime) { 
		this.callCreatedDatetime = callCreatedDatetime;
	} 

	public CallsGeneratedImpl callCreatedDatetime(java.util.Date callCreatedDatetime) { 
		this.callCreatedDatetime = callCreatedDatetime;
		return this;
	} 

	public java.lang.String getCallee() { 
		return this.callee;
	} 

	public void setCallee(java.lang.String callee) { 
		this.callee = callee;
	} 

	public CallsGeneratedImpl callee(java.lang.String callee) { 
		this.callee = callee;
		return this;
	} 

	public java.lang.String getApplication() { 
		return this.application;
	} 

	public void setApplication(java.lang.String application) { 
		this.application = application;
	} 

	public CallsGeneratedImpl application(java.lang.String application) { 
		this.application = application;
		return this;
	} 

	public long getCallDuration() { 
		return this.callDuration;
	} 

	public void setCallDuration(long callDuration) { 
		this.callDuration = callDuration;
	} 

	public CallsGeneratedImpl callDuration(long callDuration) { 
		this.callDuration = callDuration;
		return this;
	} 

	public java.lang.String getDtmf() { 
		return this.dtmf;
	} 

	public void setDtmf(java.lang.String dtmf) { 
		this.dtmf = dtmf;
	} 

	public CallsGeneratedImpl dtmf(java.lang.String dtmf) { 
		this.dtmf = dtmf;
		return this;
	} 

	public java.lang.String getUuid() { 
		return this.uuid;
	} 

	public void setUuid(java.lang.String uuid) { 
		this.uuid = uuid;
	} 

	public CallsGeneratedImpl uuid(java.lang.String uuid) { 
		this.uuid = uuid;
		return this;
	} 

	public java.lang.String getBillingNumber() { 
		return this.billingNumber;
	} 

	public void setBillingNumber(java.lang.String billingNumber) { 
		this.billingNumber = billingNumber;
	} 

	public CallsGeneratedImpl billingNumber(java.lang.String billingNumber) { 
		this.billingNumber = billingNumber;
		return this;
	} 

	public java.lang.String getIdentifier() { 
		return this.identifier;
	} 

	public void setIdentifier(java.lang.String identifier) { 
		this.identifier = identifier;
	} 

	public CallsGeneratedImpl identifier(java.lang.String identifier) { 
		this.identifier = identifier;
		return this;
	} 

	public java.lang.String getApplicationResult() { 
		return this.applicationResult;
	} 

	public void setApplicationResult(java.lang.String applicationResult) { 
		this.applicationResult = applicationResult;
	} 

	public CallsGeneratedImpl applicationResult(java.lang.String applicationResult) { 
		this.applicationResult = applicationResult;
		return this;
	} 

	public java.lang.String getTransferFrom() { 
		return this.transferFrom;
	} 

	public void setTransferFrom(java.lang.String transferFrom) { 
		this.transferFrom = transferFrom;
	} 

	public CallsGeneratedImpl transferFrom(java.lang.String transferFrom) { 
		this.transferFrom = transferFrom;
		return this;
	} 

	public java.lang.String getCaller() { 
		return this.caller;
	} 

	public void setCaller(java.lang.String caller) { 
		this.caller = caller;
	} 

	public CallsGeneratedImpl caller(java.lang.String caller) { 
		this.caller = caller;
		return this;
	} 

	public java.util.Date getHangupDatetime() { 
		return this.hangupDatetime;
	} 

	public void setHangupDatetime(java.util.Date hangupDatetime) { 
		this.hangupDatetime = hangupDatetime;
	} 

	public CallsGeneratedImpl hangupDatetime(java.util.Date hangupDatetime) { 
		this.hangupDatetime = hangupDatetime;
		return this;
	} 

	public java.lang.String getHangupCause() { 
		return this.hangupCause;
	} 

	public void setHangupCause(java.lang.String hangupCause) { 
		this.hangupCause = hangupCause;
	} 

	public CallsGeneratedImpl hangupCause(java.lang.String hangupCause) { 
		this.hangupCause = hangupCause;
		return this;
	} 

}
