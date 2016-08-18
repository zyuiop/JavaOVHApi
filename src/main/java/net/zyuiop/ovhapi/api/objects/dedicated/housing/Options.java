package net.zyuiop.ovhapi.api.objects.dedicated.housing;

/**
 * A structure describing current housing options
 */

public class Options { 

	private long apcCount;
	private java.lang.String highAvailabilityRouting;
	private boolean handsneyes;

	public Options() {
	}

	public long getApcCount() { 
		return this.apcCount;
	} 

	public void setApcCount(long apcCount) { 
		this.apcCount = apcCount;
	} 

	public Options apcCount(long apcCount) { 
		this.apcCount = apcCount;
		return this;
	} 

	public java.lang.String getHighAvailabilityRouting() { 
		return this.highAvailabilityRouting;
	} 

	public void setHighAvailabilityRouting(java.lang.String highAvailabilityRouting) { 
		this.highAvailabilityRouting = highAvailabilityRouting;
	} 

	public Options highAvailabilityRouting(java.lang.String highAvailabilityRouting) { 
		this.highAvailabilityRouting = highAvailabilityRouting;
		return this;
	} 

	public boolean getHandsneyes() { 
		return this.handsneyes;
	} 

	public void setHandsneyes(boolean handsneyes) { 
		this.handsneyes = handsneyes;
	} 

	public Options handsneyes(boolean handsneyes) { 
		this.handsneyes = handsneyes;
		return this;
	} 

}
