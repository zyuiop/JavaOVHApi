package net.zyuiop.ovhapi.impl.objects.dedicated.housing;

import net.zyuiop.ovhapi.api.objects.dedicated.housing.Options;
/**
 * A structure describing current housing options
 */

public class OptionsImpl implements Options { 

	private long apcCount;
	private java.lang.String highAvailabilityRouting;
	private boolean handsneyes;

	public OptionsImpl() {
	}

	public long getApcCount() { 
		return this.apcCount;
	} 

	public void setApcCount(long apcCount) { 
		this.apcCount = apcCount;
	} 

	public OptionsImpl apcCount(long apcCount) { 
		this.apcCount = apcCount;
		return this;
	} 

	public java.lang.String getHighAvailabilityRouting() { 
		return this.highAvailabilityRouting;
	} 

	public void setHighAvailabilityRouting(java.lang.String highAvailabilityRouting) { 
		this.highAvailabilityRouting = highAvailabilityRouting;
	} 

	public OptionsImpl highAvailabilityRouting(java.lang.String highAvailabilityRouting) { 
		this.highAvailabilityRouting = highAvailabilityRouting;
		return this;
	} 

	public boolean getHandsneyes() { 
		return this.handsneyes;
	} 

	public void setHandsneyes(boolean handsneyes) { 
		this.handsneyes = handsneyes;
	} 

	public OptionsImpl handsneyes(boolean handsneyes) { 
		this.handsneyes = handsneyes;
		return this;
	} 

}
