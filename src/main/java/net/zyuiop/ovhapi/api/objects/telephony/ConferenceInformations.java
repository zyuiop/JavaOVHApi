package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Conference realtime informations structure
 */

public interface ConferenceInformations { 

	/**
	 * @return Whether or not the conference room is locked
	 */
	boolean getLocked(); 

	/**
	 * @return The current participants count in your conference room
	 */
	long getMembersCount(); 

	/**
	 * @return The date when the conference began
	 */
	java.util.Date getDateStart(); 

}
