package net.zyuiop.ovhapi.impl.objects.xdsl.eligibility;

import net.zyuiop.ovhapi.api.objects.xdsl.eligibility.BookMeetingSlot;
/**
 * Parameters to book a time slot for a meeting
 */

public class BookMeetingSlotImpl implements BookMeetingSlot { 

	private net.zyuiop.ovhapi.api.objects.xdsl.eligibility.MeetingSlot meetingSlot;
	private java.lang.String name;
	private boolean fakeMeeting;

	public BookMeetingSlotImpl() {
	}

	public net.zyuiop.ovhapi.api.objects.xdsl.eligibility.MeetingSlot getMeetingSlot() { 
		return this.meetingSlot;
	} 

	public void setMeetingSlot(net.zyuiop.ovhapi.api.objects.xdsl.eligibility.MeetingSlot meetingSlot) { 
		this.meetingSlot = meetingSlot;
	} 

	public BookMeetingSlotImpl meetingSlot(net.zyuiop.ovhapi.api.objects.xdsl.eligibility.MeetingSlot meetingSlot) { 
		this.meetingSlot = meetingSlot;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public BookMeetingSlotImpl name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public boolean getFakeMeeting() { 
		return this.fakeMeeting;
	} 

	public void setFakeMeeting(boolean fakeMeeting) { 
		this.fakeMeeting = fakeMeeting;
	} 

	public BookMeetingSlotImpl fakeMeeting(boolean fakeMeeting) { 
		this.fakeMeeting = fakeMeeting;
		return this;
	} 

}
