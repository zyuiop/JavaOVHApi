package net.zyuiop.ovhapi.impl.objects.telephony;

import net.zyuiop.ovhapi.api.objects.telephony.EasyHuntingScreenListsConditionsSettings;
/**
 * Easy hunting screen lists conditions options
 */

public class EasyHuntingScreenListsConditionsSettingsImpl implements EasyHuntingScreenListsConditionsSettings { 

	private java.lang.String status;

	public EasyHuntingScreenListsConditionsSettingsImpl() {
	}

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public EasyHuntingScreenListsConditionsSettingsImpl status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

}
