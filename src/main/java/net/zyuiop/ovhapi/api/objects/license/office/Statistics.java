package net.zyuiop.ovhapi.api.objects.license.office;

/**
 * License usage statistics.
 */

public interface Statistics { 

	/**
	 * @return Date of the statistics.
	 */
	java.util.Date getDate(); 

	/**
	 * @return List of lines associated to this statistics entity.
	 */
	net.zyuiop.ovhapi.api.objects.license.office.StatisticsLine getLines(); 

}
