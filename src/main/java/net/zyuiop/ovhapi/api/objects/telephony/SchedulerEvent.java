package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Scheduled event
 */

public interface SchedulerEvent { 

	/**
	 * @return The unique ICS event identifier
	 */
	java.lang.String getUid(); 

	/**
	 * @return The beginning date of the event
	 */
	java.util.Date getDateStart(); 

	/**
	 * @return null
	 */
	java.lang.String getTitle(); 

	/**
	 * @return The ending date of the event
	 */
	java.util.Date getDateEnd(); 

	/**
	 * @return The category of the event
	 */
	java.lang.String getCategories(); 

	/**
	 * @return null
	 */
	java.lang.String getDescription(); 

}
