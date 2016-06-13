package net.zyuiop.ovhapi.impl.objects.telephony;

import net.zyuiop.ovhapi.api.objects.telephony.EasyHuntingTimeConditionsSettings;
/**
 * Easy hunting time conditions options
 */

public class EasyHuntingTimeConditionsSettingsImpl implements EasyHuntingTimeConditionsSettings { 

	private boolean enable;
	private java.lang.String slot1Number;
	private java.lang.String unavailableNumber;
	private java.lang.String slot1Type;
	private java.lang.String unavailableType;

	public EasyHuntingTimeConditionsSettingsImpl() {
	}

	public boolean getEnable() { 
		return this.enable;
	} 

	public void setEnable(boolean enable) { 
		this.enable = enable;
	} 

	public EasyHuntingTimeConditionsSettingsImpl enable(boolean enable) { 
		this.enable = enable;
		return this;
	} 

	public java.lang.String getSlot1Number() { 
		return this.slot1Number;
	} 

	public void setSlot1Number(java.lang.String slot1Number) { 
		this.slot1Number = slot1Number;
	} 

	public EasyHuntingTimeConditionsSettingsImpl slot1Number(java.lang.String slot1Number) { 
		this.slot1Number = slot1Number;
		return this;
	} 

	public java.lang.String getUnavailableNumber() { 
		return this.unavailableNumber;
	} 

	public void setUnavailableNumber(java.lang.String unavailableNumber) { 
		this.unavailableNumber = unavailableNumber;
	} 

	public EasyHuntingTimeConditionsSettingsImpl unavailableNumber(java.lang.String unavailableNumber) { 
		this.unavailableNumber = unavailableNumber;
		return this;
	} 

	public java.lang.String getSlot1Type() { 
		return this.slot1Type;
	} 

	public void setSlot1Type(java.lang.String slot1Type) { 
		this.slot1Type = slot1Type;
	} 

	public EasyHuntingTimeConditionsSettingsImpl slot1Type(java.lang.String slot1Type) { 
		this.slot1Type = slot1Type;
		return this;
	} 

	public java.lang.String getUnavailableType() { 
		return this.unavailableType;
	} 

	public void setUnavailableType(java.lang.String unavailableType) { 
		this.unavailableType = unavailableType;
	} 

	public EasyHuntingTimeConditionsSettingsImpl unavailableType(java.lang.String unavailableType) { 
		this.unavailableType = unavailableType;
		return this;
	} 

}
