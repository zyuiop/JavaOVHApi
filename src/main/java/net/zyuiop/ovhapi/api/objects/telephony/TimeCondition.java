package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Time conditions
 */

public class TimeCondition { 

	private java.lang.String hourEnd;
	private java.lang.String status;
	private java.lang.String day;
	private java.lang.String policy;
	private long id;
	private java.lang.String hourBegin;

	public TimeCondition() {
	}

	public java.lang.String getHourEnd() { 
		return this.hourEnd;
	} 

	public void setHourEnd(java.lang.String hourEnd) { 
		this.hourEnd = hourEnd;
	} 

	public TimeCondition hourEnd(java.lang.String hourEnd) { 
		this.hourEnd = hourEnd;
		return this;
	} 

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public TimeCondition status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public java.lang.String getDay() { 
		return this.day;
	} 

	public void setDay(java.lang.String day) { 
		this.day = day;
	} 

	public TimeCondition day(java.lang.String day) { 
		this.day = day;
		return this;
	} 

	public java.lang.String getPolicy() { 
		return this.policy;
	} 

	public void setPolicy(java.lang.String policy) { 
		this.policy = policy;
	} 

	public TimeCondition policy(java.lang.String policy) { 
		this.policy = policy;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public TimeCondition id(long id) { 
		this.id = id;
		return this;
	} 

	public java.lang.String getHourBegin() { 
		return this.hourBegin;
	} 

	public void setHourBegin(java.lang.String hourBegin) { 
		this.hourBegin = hourBegin;
	} 

	public TimeCondition hourBegin(java.lang.String hourBegin) { 
		this.hourBegin = hourBegin;
		return this;
	} 

}
