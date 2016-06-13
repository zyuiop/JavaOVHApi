package net.zyuiop.ovhapi.api.objects.sms;

/**
 * Sms receivers preloaded
 */

public interface Receiver { 

	/**
	 * @return Slot number id
	 */
	long getSlotId(); 

	/**
	 * @return Number of receiver records in the document
	 */
	long getRecords(); 

	/**
	 * @return Description name of the document
	 */
	java.lang.String getDescription(); 

	/**
	 * @return Creation date of the document
	 */
	java.util.Date getDatetime(); 

}
