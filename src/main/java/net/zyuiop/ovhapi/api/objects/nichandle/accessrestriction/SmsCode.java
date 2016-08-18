package net.zyuiop.ovhapi.api.objects.nichandle.accessrestriction;

/**
 * Send secret code
 */

public class SmsCode { 

	private java.lang.String challenge;

	public SmsCode() {
	}

	public java.lang.String getChallenge() { 
		return this.challenge;
	} 

	public void setChallenge(java.lang.String challenge) { 
		this.challenge = challenge;
	} 

	public SmsCode challenge(java.lang.String challenge) { 
		this.challenge = challenge;
		return this;
	} 

}
