package net.zyuiop.ovhapi.impl.objects.nichandle.accessrestriction;

import net.zyuiop.ovhapi.api.objects.nichandle.accessrestriction.SmsSecret;
/**
 * Describe secret key
 */

public class SmsSecretImpl implements SmsSecret { 

	private long remainingTry;
	private long id;

	public SmsSecretImpl() {
	}

	public long getRemainingTry() { 
		return this.remainingTry;
	} 

	public void setRemainingTry(long remainingTry) { 
		this.remainingTry = remainingTry;
	} 

	public SmsSecretImpl remainingTry(long remainingTry) { 
		this.remainingTry = remainingTry;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public SmsSecretImpl id(long id) { 
		this.id = id;
		return this;
	} 

}
