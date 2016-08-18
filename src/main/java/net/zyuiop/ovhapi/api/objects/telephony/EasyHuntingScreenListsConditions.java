package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Screenlist condition
 */

public class EasyHuntingScreenListsConditions { 

	private java.lang.String callerIdNumber;
	private java.lang.String screenListType;
	private long conditionId;

	public EasyHuntingScreenListsConditions() {
	}

	public java.lang.String getCallerIdNumber() { 
		return this.callerIdNumber;
	} 

	public void setCallerIdNumber(java.lang.String callerIdNumber) { 
		this.callerIdNumber = callerIdNumber;
	} 

	public EasyHuntingScreenListsConditions callerIdNumber(java.lang.String callerIdNumber) { 
		this.callerIdNumber = callerIdNumber;
		return this;
	} 

	public java.lang.String getScreenListType() { 
		return this.screenListType;
	} 

	public void setScreenListType(java.lang.String screenListType) { 
		this.screenListType = screenListType;
	} 

	public EasyHuntingScreenListsConditions screenListType(java.lang.String screenListType) { 
		this.screenListType = screenListType;
		return this;
	} 

	public long getConditionId() { 
		return this.conditionId;
	} 

	public void setConditionId(long conditionId) { 
		this.conditionId = conditionId;
	} 

	public EasyHuntingScreenListsConditions conditionId(long conditionId) { 
		this.conditionId = conditionId;
		return this;
	} 

}
