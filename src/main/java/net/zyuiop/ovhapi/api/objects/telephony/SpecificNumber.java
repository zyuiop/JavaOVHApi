package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Specific number available
 */

public class SpecificNumber { 

	private java.lang.String number;
	private boolean isPremium;

	public SpecificNumber() {
	}

	public java.lang.String getNumber() { 
		return this.number;
	} 

	public void setNumber(java.lang.String number) { 
		this.number = number;
	} 

	public SpecificNumber number(java.lang.String number) { 
		this.number = number;
		return this;
	} 

	public boolean getIsPremium() { 
		return this.isPremium;
	} 

	public void setIsPremium(boolean isPremium) { 
		this.isPremium = isPremium;
	} 

	public SpecificNumber isPremium(boolean isPremium) { 
		this.isPremium = isPremium;
		return this;
	} 

}
