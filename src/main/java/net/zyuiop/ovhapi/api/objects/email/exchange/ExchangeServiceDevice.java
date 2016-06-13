package net.zyuiop.ovhapi.api.objects.email.exchange;

/**
 * Get the list of your ActiveSync devices registered on this Exchange service
 */

public interface ExchangeServiceDevice { 

	/**
	 * @return Device Id
	 */
	java.lang.String getDeviceId(); 

	/**
	 * @return International Mobile Equipment Identity
	 */
	java.lang.String getIMEI(); 

	/**
	 * @return Device State
	 */
	java.lang.String getDeviceState(); 

	/**
	 * @return Model device
	 */
	java.lang.String getDeviceModel(); 

	/**
	 * @return Exchange identity
	 */
	java.lang.String getIdentity(); 

	/**
	 * @return Creation date
	 */
	java.util.Date getCreationDate(); 

	/**
	 * @return Last update date
	 */
	java.util.Date getLastUpdate(); 

	/**
	 * @return user guid
	 */
	java.lang.String getGuid(); 

	/**
	 * @return Pending task id
	 */
	long getTaskPendingId(); 

}
