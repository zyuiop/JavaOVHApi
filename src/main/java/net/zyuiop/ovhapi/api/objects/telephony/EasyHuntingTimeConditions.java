package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Easy hunting time conditions
 */

public class EasyHuntingTimeConditions { 

	private java.lang.String timeFrom;
	private java.lang.String weekDay;
	private java.lang.String timeTo;
	private java.lang.String policy;
	private long conditionId;

	public EasyHuntingTimeConditions() {
	}

	public java.lang.String getTimeFrom() { 
		return this.timeFrom;
	} 

	public void setTimeFrom(java.lang.String timeFrom) { 
		this.timeFrom = timeFrom;
	} 

	public EasyHuntingTimeConditions timeFrom(java.lang.String timeFrom) { 
		this.timeFrom = timeFrom;
		return this;
	} 

	public java.lang.String getWeekDay() { 
		return this.weekDay;
	} 

	public void setWeekDay(java.lang.String weekDay) { 
		this.weekDay = weekDay;
	} 

	public EasyHuntingTimeConditions weekDay(java.lang.String weekDay) { 
		this.weekDay = weekDay;
		return this;
	} 

	public java.lang.String getTimeTo() { 
		return this.timeTo;
	} 

	public void setTimeTo(java.lang.String timeTo) { 
		this.timeTo = timeTo;
	} 

	public EasyHuntingTimeConditions timeTo(java.lang.String timeTo) { 
		this.timeTo = timeTo;
		return this;
	} 

	public java.lang.String getPolicy() { 
		return this.policy;
	} 

	public void setPolicy(java.lang.String policy) { 
		this.policy = policy;
	} 

	public EasyHuntingTimeConditions policy(java.lang.String policy) { 
		this.policy = policy;
		return this;
	} 

	public long getConditionId() { 
		return this.conditionId;
	} 

	public void setConditionId(long conditionId) { 
		this.conditionId = conditionId;
	} 

	public EasyHuntingTimeConditions conditionId(long conditionId) { 
		this.conditionId = conditionId;
		return this;
	} 

}
