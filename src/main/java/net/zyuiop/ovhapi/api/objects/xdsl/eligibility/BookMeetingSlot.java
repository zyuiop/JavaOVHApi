package net.zyuiop.ovhapi.api.objects.xdsl.eligibility;

/**
 * Parameters to book a time slot for a meeting
 */

public interface BookMeetingSlot { 

	/**
	 * @return The time slot to book, null if fakeMeeting is true
	 */
	net.zyuiop.ovhapi.api.objects.xdsl.eligibility.MeetingSlot getMeetingSlot(); 

	/**
	 * @return The name of the customer
	 */
	java.lang.String getName(); 

	/**
	 * @return Whether or not to book a fake meeting slots (if no slots are available)
	 */
	boolean getFakeMeeting(); 

}
