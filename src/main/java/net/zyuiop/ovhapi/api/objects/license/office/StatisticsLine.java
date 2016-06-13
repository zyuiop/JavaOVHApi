package net.zyuiop.ovhapi.api.objects.license.office;

/**
 * License usage statistics line.
 */

public interface StatisticsLine { 

	/**
	 * @return Count of activated licenses at the end of the day.
	 */
	long getEndOfDayCount(); 

	/**
	 * @return Type of the Office license.
	 */
	java.lang.String getLicenceType(); 

	/**
	 * @return Maximum count of simultaneous activated licences.
	 */
	long getPeakCount(); 

}
