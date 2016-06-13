package net.zyuiop.ovhapi.impl.objects.telephony;

import net.zyuiop.ovhapi.api.objects.telephony.OvhPabxDialplanExtensionConditionScreenList;
/**
 * Screenlist condition
 */

public class OvhPabxDialplanExtensionConditionScreenListImpl implements OvhPabxDialplanExtensionConditionScreenList { 

	private java.lang.String callerIdNumber;
	private long conditionId;

	public OvhPabxDialplanExtensionConditionScreenListImpl() {
	}

	public java.lang.String getCallerIdNumber() { 
		return this.callerIdNumber;
	} 

	public void setCallerIdNumber(java.lang.String callerIdNumber) { 
		this.callerIdNumber = callerIdNumber;
	} 

	public OvhPabxDialplanExtensionConditionScreenListImpl callerIdNumber(java.lang.String callerIdNumber) { 
		this.callerIdNumber = callerIdNumber;
		return this;
	} 

	public long getConditionId() { 
		return this.conditionId;
	} 

	public void setConditionId(long conditionId) { 
		this.conditionId = conditionId;
	} 

	public OvhPabxDialplanExtensionConditionScreenListImpl conditionId(long conditionId) { 
		this.conditionId = conditionId;
		return this;
	} 

}
