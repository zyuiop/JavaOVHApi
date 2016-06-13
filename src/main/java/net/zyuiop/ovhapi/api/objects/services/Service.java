package net.zyuiop.ovhapi.api.objects.services;

/**
 * Details about a Service
 */

public interface Service { 

	/**
	 * @return null
	 */
	java.lang.String getStatus(); 

	/**
	 * @return null
	 */
	java.util.Date getEngagedUpTo(); 

	/**
	 * @return All the possible renew period of your service in month
	 */
	long[] getPossibleRenewPeriod(); 

	/**
	 * @return null
	 */
	java.lang.String getContactBilling(); 

	/**
	 * @return Way of handling the renew
	 */
	net.zyuiop.ovhapi.api.objects.service.RenewType getRenew(); 

	/**
	 * @return null
	 */
	java.lang.String getDomain(); 

	/**
	 * @return null
	 */
	java.util.Date getExpiration(); 

	/**
	 * @return null
	 */
	java.lang.String getContactTech(); 

	/**
	 * @return null
	 */
	java.lang.String getContactAdmin(); 

	/**
	 * @return null
	 */
	java.util.Date getCreation(); 

}
