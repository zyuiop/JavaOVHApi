package net.zyuiop.ovhapi.api.objects.xdsl.orderfollowup;

/**
 * A step of the order process
 */

public class Step { 

	private long expectedDuration;
	private java.lang.String status;
	private java.lang.String durationUnit;
	private java.lang.String name;
	private java.lang.String[] comments;
	private java.util.Date doneDate;

	public Step() {
	}

	public long getExpectedDuration() { 
		return this.expectedDuration;
	} 

	public void setExpectedDuration(long expectedDuration) { 
		this.expectedDuration = expectedDuration;
	} 

	public Step expectedDuration(long expectedDuration) { 
		this.expectedDuration = expectedDuration;
		return this;
	} 

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public Step status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public java.lang.String getDurationUnit() { 
		return this.durationUnit;
	} 

	public void setDurationUnit(java.lang.String durationUnit) { 
		this.durationUnit = durationUnit;
	} 

	public Step durationUnit(java.lang.String durationUnit) { 
		this.durationUnit = durationUnit;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public Step name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public java.lang.String[] getComments() { 
		return this.comments;
	} 

	public void setComments(java.lang.String[] comments) { 
		this.comments = comments;
	} 

	public Step comments(java.lang.String[] comments) { 
		this.comments = comments;
		return this;
	} 

	public java.util.Date getDoneDate() { 
		return this.doneDate;
	} 

	public void setDoneDate(java.util.Date doneDate) { 
		this.doneDate = doneDate;
	} 

	public Step doneDate(java.util.Date doneDate) { 
		this.doneDate = doneDate;
		return this;
	} 

}
