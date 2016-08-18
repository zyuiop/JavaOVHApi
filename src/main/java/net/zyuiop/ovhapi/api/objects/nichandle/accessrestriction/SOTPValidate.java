package net.zyuiop.ovhapi.api.objects.nichandle.accessrestriction;

/**
 * Describe SOTP validation status
 */

public class SOTPValidate { 

	private long remainingCodes;

	public SOTPValidate() {
	}

	public long getRemainingCodes() { 
		return this.remainingCodes;
	} 

	public void setRemainingCodes(long remainingCodes) { 
		this.remainingCodes = remainingCodes;
	} 

	public SOTPValidate remainingCodes(long remainingCodes) { 
		this.remainingCodes = remainingCodes;
		return this;
	} 

}
