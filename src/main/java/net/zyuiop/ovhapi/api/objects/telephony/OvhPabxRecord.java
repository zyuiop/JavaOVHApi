package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * The PABX records
 */

public interface OvhPabxRecord { 

	/**
	 * @return The begin date of the recorded call
	 */
	java.util.Date getCallStart(); 

	/**
	 * @return The record sound url
	 */
	java.lang.String getFileUrl(); 

	/**
	 * @return The caller number of the recorded call
	 */
	java.lang.String getCallerIdNumber(); 

	/**
	 * @return The end date of the recorded call
	 */
	java.util.Date getCallEnd(); 

	/**
	 * @return null
	 */
	long getId(); 

	/**
	 * @return The duration in seconds of the recorded call
	 */
	long getDuration(); 

	/**
	 * @return The caller name of the recorded call
	 */
	java.lang.String getCallerIdName(); 

}
