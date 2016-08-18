package net.zyuiop.ovhapi.api.objects.nichandle.accessrestriction;

/**
 * Describe secret key
 */

public class SmsSecret { 

	private long remainingTry;
	private long id;

	public SmsSecret() {
	}

	public long getRemainingTry() { 
		return this.remainingTry;
	} 

	public void setRemainingTry(long remainingTry) { 
		this.remainingTry = remainingTry;
	} 

	public SmsSecret remainingTry(long remainingTry) { 
		this.remainingTry = remainingTry;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public SmsSecret id(long id) { 
		this.id = id;
		return this;
	} 

}
