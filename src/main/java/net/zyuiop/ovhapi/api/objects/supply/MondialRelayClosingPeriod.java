package net.zyuiop.ovhapi.api.objects.supply;

/**
 * Closing period for mondial relay point
 */

public interface MondialRelayClosingPeriod { 

	/**
	 * @return Beginning of closing period
	 */
	java.util.Date getStart(); 

	/**
	 * @return Ending of closing period
	 */
	java.util.Date getEnd(); 

}
