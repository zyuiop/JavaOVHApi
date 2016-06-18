package net.zyuiop.ovhapi.api.objects.cloud;

/**
 * Cloud alert on your consumption
 */

public interface AlertingAlert { 

	/**
	 * @return Alert date
	 */
	java.util.Date getAlertDate(); 

	/**
	 * @return Alert sent to
	 */
	java.lang.String[] getEmails(); 

	/**
	 * @return Alert id
	 */
	long getAlertId(); 

}
