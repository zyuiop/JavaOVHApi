package net.zyuiop.ovhapi.impl.objects.nichandle.accessrestriction;

import net.zyuiop.ovhapi.api.objects.nichandle.accessrestriction.SmsCode;
/**
 * Send secret code
 */

public class SmsCodeImpl implements SmsCode { 

	private java.lang.String challenge;

	public SmsCodeImpl() {
	}

	public java.lang.String getChallenge() { 
		return this.challenge;
	} 

	public void setChallenge(java.lang.String challenge) { 
		this.challenge = challenge;
	} 

	public SmsCodeImpl challenge(java.lang.String challenge) { 
		this.challenge = challenge;
		return this;
	} 

}
