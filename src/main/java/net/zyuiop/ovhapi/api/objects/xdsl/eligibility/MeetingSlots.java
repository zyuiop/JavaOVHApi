package net.zyuiop.ovhapi.api.objects.xdsl.eligibility;

/**
 * List of available meeting time slots
 */

public interface MeetingSlots { 

	/**
	 * @return A time slot
	 */
	net.zyuiop.ovhapi.api.objects.xdsl.eligibility.MeetingSlot getMeetingSlots(); 

	/**
	 * @return Whether or not it is possible to book a fake meeting
	 */
	boolean getCanBookFakeMeeting(); 

}
