package net.zyuiop.ovhapi.api.objects.xdsl.eligibility;

/**
 * Parameters to book a time slot for a meeting
 */

public class BookMeetingSlot { 

	private net.zyuiop.ovhapi.api.objects.xdsl.eligibility.MeetingSlot meetingSlot;
	private java.lang.String name;
	private boolean fakeMeeting;

	public BookMeetingSlot() {
	}

	public net.zyuiop.ovhapi.api.objects.xdsl.eligibility.MeetingSlot getMeetingSlot() { 
		return this.meetingSlot;
	} 

	public void setMeetingSlot(net.zyuiop.ovhapi.api.objects.xdsl.eligibility.MeetingSlot meetingSlot) { 
		this.meetingSlot = meetingSlot;
	} 

	public BookMeetingSlot meetingSlot(net.zyuiop.ovhapi.api.objects.xdsl.eligibility.MeetingSlot meetingSlot) { 
		this.meetingSlot = meetingSlot;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public BookMeetingSlot name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public boolean getFakeMeeting() { 
		return this.fakeMeeting;
	} 

	public void setFakeMeeting(boolean fakeMeeting) { 
		this.fakeMeeting = fakeMeeting;
	} 

	public BookMeetingSlot fakeMeeting(boolean fakeMeeting) { 
		this.fakeMeeting = fakeMeeting;
		return this;
	} 

}
