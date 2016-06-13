package net.zyuiop.ovhapi.impl.objects.telephony;

import net.zyuiop.ovhapi.api.objects.telephony.SpecificNumber;
/**
 * Specific number available
 */

public class SpecificNumberImpl implements SpecificNumber { 

	private java.lang.String number;
	private boolean isPremium;

	public SpecificNumberImpl() {
	}

	public java.lang.String getNumber() { 
		return this.number;
	} 

	public void setNumber(java.lang.String number) { 
		this.number = number;
	} 

	public SpecificNumberImpl number(java.lang.String number) { 
		this.number = number;
		return this;
	} 

	public boolean getIsPremium() { 
		return this.isPremium;
	} 

	public void setIsPremium(boolean isPremium) { 
		this.isPremium = isPremium;
	} 

	public SpecificNumberImpl isPremium(boolean isPremium) { 
		this.isPremium = isPremium;
		return this;
	} 

}
