package net.zyuiop.ovhapi.impl.objects.nichandle.accessrestriction;

import net.zyuiop.ovhapi.api.objects.nichandle.accessrestriction.SOTPValidate;
/**
 * Describe SOTP validation status
 */

public class SOTPValidateImpl implements SOTPValidate { 

	private long remainingCodes;

	public SOTPValidateImpl() {
	}

	public long getRemainingCodes() { 
		return this.remainingCodes;
	} 

	public void setRemainingCodes(long remainingCodes) { 
		this.remainingCodes = remainingCodes;
	} 

	public SOTPValidateImpl remainingCodes(long remainingCodes) { 
		this.remainingCodes = remainingCodes;
		return this;
	} 

}
