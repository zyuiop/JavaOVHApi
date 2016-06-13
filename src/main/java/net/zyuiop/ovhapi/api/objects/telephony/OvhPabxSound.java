package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * The PABX sounds
 */

public interface OvhPabxSound { 

	/**
	 * @return The sound filename
	 */
	java.lang.String getName(); 

	/**
	 * @return null
	 */
	long getSoundId(); 

}
