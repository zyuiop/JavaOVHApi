package net.zyuiop.ovhapi.impl.objects.xdsl.eligibility;

import net.zyuiop.ovhapi.api.objects.xdsl.eligibility.MeetingSlots;
/**
 * List of available meeting time slots
 */

public class MeetingSlotsImpl implements MeetingSlots { 

	private net.zyuiop.ovhapi.api.objects.xdsl.eligibility.MeetingSlot meetingSlots;
	private boolean canBookFakeMeeting;

	public MeetingSlotsImpl() {
	}

	public net.zyuiop.ovhapi.api.objects.xdsl.eligibility.MeetingSlot getMeetingSlots() { 
		return this.meetingSlots;
	} 

	public void setMeetingSlots(net.zyuiop.ovhapi.api.objects.xdsl.eligibility.MeetingSlot meetingSlots) { 
		this.meetingSlots = meetingSlots;
	} 

	public MeetingSlotsImpl meetingSlots(net.zyuiop.ovhapi.api.objects.xdsl.eligibility.MeetingSlot meetingSlots) { 
		this.meetingSlots = meetingSlots;
		return this;
	} 

	public boolean getCanBookFakeMeeting() { 
		return this.canBookFakeMeeting;
	} 

	public void setCanBookFakeMeeting(boolean canBookFakeMeeting) { 
		this.canBookFakeMeeting = canBookFakeMeeting;
	} 

	public MeetingSlotsImpl canBookFakeMeeting(boolean canBookFakeMeeting) { 
		this.canBookFakeMeeting = canBookFakeMeeting;
		return this;
	} 

}
