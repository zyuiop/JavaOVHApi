package net.zyuiop.ovhapi.api.objects.xdsl.eligibility;

/**
 * Represents a time slot for a meeting
 */

public class MeetingSlot { 

	private java.lang.String uiCode;
	private java.util.Date endDate;
	private java.util.Date startDate;

	public MeetingSlot() {
	}

	public java.lang.String getUiCode() { 
		return this.uiCode;
	} 

	public void setUiCode(java.lang.String uiCode) { 
		this.uiCode = uiCode;
	} 

	public MeetingSlot uiCode(java.lang.String uiCode) { 
		this.uiCode = uiCode;
		return this;
	} 

	public java.util.Date getEndDate() { 
		return this.endDate;
	} 

	public void setEndDate(java.util.Date endDate) { 
		this.endDate = endDate;
	} 

	public MeetingSlot endDate(java.util.Date endDate) { 
		this.endDate = endDate;
		return this;
	} 

	public java.util.Date getStartDate() { 
		return this.startDate;
	} 

	public void setStartDate(java.util.Date startDate) { 
		this.startDate = startDate;
	} 

	public MeetingSlot startDate(java.util.Date startDate) { 
		this.startDate = startDate;
		return this;
	} 

}
