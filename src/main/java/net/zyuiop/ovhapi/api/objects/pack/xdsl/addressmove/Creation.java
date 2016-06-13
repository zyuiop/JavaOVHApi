package net.zyuiop.ovhapi.api.objects.pack.xdsl.addressmove;

/**
 * The parameters needed to create a new landline
 */

public interface Creation { 

	/**
	 * @return Data to book a meeting slot
	 */
	net.zyuiop.ovhapi.api.objects.xdsl.eligibility.BookMeetingSlot getMeeting(); 

	/**
	 * @return The address
	 */
	net.zyuiop.ovhapi.api.objects.xdsl.eligibility.Address getAddress(); 

}
