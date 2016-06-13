package net.zyuiop.ovhapi.api.objects.xdsl.orderfollowup;

/**
 * A step of the order process
 */

public interface Step { 

	/**
	 * @return null
	 */
	long getExpectedDuration(); 

	/**
	 * @return null
	 */
	java.lang.String getStatus(); 

	/**
	 * @return null
	 */
	java.lang.String getDurationUnit(); 

	/**
	 * @return null
	 */
	java.lang.String getName(); 

	/**
	 * @return null
	 */
	java.lang.String getComments(); 

	/**
	 * @return null
	 */
	java.util.Date getDoneDate(); 

}
