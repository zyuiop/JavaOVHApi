package net.zyuiop.ovhapi.api.objects.xdsl;

/**
 * A message log from the DSLAM
 */

public interface DslamPortLog { 

	/**
	 * @return The number of times this message occured between date and lastOccurrenceDate
	 */
	long getNumberOfOccurrences(); 

	/**
	 * @return The last time this message occured
	 */
	java.util.Date getLastOccurrenceDate(); 

	/**
	 * @return null
	 */
	java.util.Date getDate(); 

	/**
	 * @return null
	 */
	java.lang.String getMessage(); 

}
