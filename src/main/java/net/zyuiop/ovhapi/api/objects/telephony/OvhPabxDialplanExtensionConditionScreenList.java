package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Screenlist condition
 */

public class OvhPabxDialplanExtensionConditionScreenList { 

	private java.lang.String callerIdNumber;
	private long conditionId;

	public OvhPabxDialplanExtensionConditionScreenList() {
	}

	public java.lang.String getCallerIdNumber() { 
		return this.callerIdNumber;
	} 

	public void setCallerIdNumber(java.lang.String callerIdNumber) { 
		this.callerIdNumber = callerIdNumber;
	} 

	public OvhPabxDialplanExtensionConditionScreenList callerIdNumber(java.lang.String callerIdNumber) { 
		this.callerIdNumber = callerIdNumber;
		return this;
	} 

	public long getConditionId() { 
		return this.conditionId;
	} 

	public void setConditionId(long conditionId) { 
		this.conditionId = conditionId;
	} 

	public OvhPabxDialplanExtensionConditionScreenList conditionId(long conditionId) { 
		this.conditionId = conditionId;
		return this;
	} 

}
