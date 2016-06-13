package net.zyuiop.ovhapi.api.objects.supply;

/**
 * Opening range for mondial relay point
 */

public interface MondialRelayDayPeriod { 

	/**
	 * @return Starting time (00:00 format)
	 */
	java.lang.String getStart(); 

	/**
	 * @return Ending time (00:00 format)
	 */
	java.lang.String getEnd(); 

}
