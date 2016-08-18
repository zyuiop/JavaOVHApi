package net.zyuiop.ovhapi.api.objects.xdsl.eligibility;

/**
 * List of available meeting time slots
 */

public class MeetingSlots { 

	private net.zyuiop.ovhapi.api.objects.xdsl.eligibility.MeetingSlot[] meetingSlots;
	private boolean canBookFakeMeeting;

	public MeetingSlots() {
	}

	public net.zyuiop.ovhapi.api.objects.xdsl.eligibility.MeetingSlot[] getMeetingSlots() { 
		return this.meetingSlots;
	} 

	public void setMeetingSlots(net.zyuiop.ovhapi.api.objects.xdsl.eligibility.MeetingSlot[] meetingSlots) { 
		this.meetingSlots = meetingSlots;
	} 

	public MeetingSlots meetingSlots(net.zyuiop.ovhapi.api.objects.xdsl.eligibility.MeetingSlot[] meetingSlots) { 
		this.meetingSlots = meetingSlots;
		return this;
	} 

	public boolean getCanBookFakeMeeting() { 
		return this.canBookFakeMeeting;
	} 

	public void setCanBookFakeMeeting(boolean canBookFakeMeeting) { 
		this.canBookFakeMeeting = canBookFakeMeeting;
	} 

	public MeetingSlots canBookFakeMeeting(boolean canBookFakeMeeting) { 
		this.canBookFakeMeeting = canBookFakeMeeting;
		return this;
	} 

}
