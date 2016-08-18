package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Time condition
 */

public class OvhPabxDialplanExtensionConditionTime { 

	private java.lang.String timeFrom;
	private java.lang.String weekDay;
	private java.lang.String timeTo;
	private long conditionId;

	public OvhPabxDialplanExtensionConditionTime() {
	}

	public java.lang.String getTimeFrom() { 
		return this.timeFrom;
	} 

	public void setTimeFrom(java.lang.String timeFrom) { 
		this.timeFrom = timeFrom;
	} 

	public OvhPabxDialplanExtensionConditionTime timeFrom(java.lang.String timeFrom) { 
		this.timeFrom = timeFrom;
		return this;
	} 

	public java.lang.String getWeekDay() { 
		return this.weekDay;
	} 

	public void setWeekDay(java.lang.String weekDay) { 
		this.weekDay = weekDay;
	} 

	public OvhPabxDialplanExtensionConditionTime weekDay(java.lang.String weekDay) { 
		this.weekDay = weekDay;
		return this;
	} 

	public java.lang.String getTimeTo() { 
		return this.timeTo;
	} 

	public void setTimeTo(java.lang.String timeTo) { 
		this.timeTo = timeTo;
	} 

	public OvhPabxDialplanExtensionConditionTime timeTo(java.lang.String timeTo) { 
		this.timeTo = timeTo;
		return this;
	} 

	public long getConditionId() { 
		return this.conditionId;
	} 

	public void setConditionId(long conditionId) { 
		this.conditionId = conditionId;
	} 

	public OvhPabxDialplanExtensionConditionTime conditionId(long conditionId) { 
		this.conditionId = conditionId;
		return this;
	} 

}
