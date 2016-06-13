package net.zyuiop.ovhapi.api.objects.xdsl.eligibility;

/**
 * Represents a time slot for a meeting
 */

public interface MeetingSlot { 

	/**
	 * @return An opaque string that represents an intervention unit
	 */
	java.lang.String getUiCode(); 

	/**
	 * @return The end of the time slot
	 */
	java.util.Date getEndDate(); 

	/**
	 * @return The beginning of the time slot
	 */
	java.util.Date getStartDate(); 

}
