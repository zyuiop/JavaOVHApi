package net.zyuiop.ovhapi.api.objects.supply;

/**
 * Day with schedule for mondial relay point opening
 */

public interface MondialRelayOpening { 

	/**
	 * @return Opening range
	 */
	net.zyuiop.ovhapi.api.objects.supply.MondialRelayDayPeriod[] getSunday(); 

	/**
	 * @return Opening range
	 */
	net.zyuiop.ovhapi.api.objects.supply.MondialRelayDayPeriod[] getWednesday(); 

	/**
	 * @return Opening range
	 */
	net.zyuiop.ovhapi.api.objects.supply.MondialRelayDayPeriod[] getFriday(); 

	/**
	 * @return Opening range
	 */
	net.zyuiop.ovhapi.api.objects.supply.MondialRelayDayPeriod[] getSaturday(); 

	/**
	 * @return Opening range
	 */
	net.zyuiop.ovhapi.api.objects.supply.MondialRelayDayPeriod[] getThursday(); 

	/**
	 * @return Opening range
	 */
	net.zyuiop.ovhapi.api.objects.supply.MondialRelayDayPeriod[] getMonday(); 

	/**
	 * @return Opening range
	 */
	net.zyuiop.ovhapi.api.objects.supply.MondialRelayDayPeriod[] getTuesday(); 

}
