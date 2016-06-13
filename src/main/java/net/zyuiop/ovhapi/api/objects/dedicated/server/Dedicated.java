package net.zyuiop.ovhapi.api.objects.dedicated.server;

/**
 * Server informations
 */

public interface Dedicated { 

	/**
	 * @return dedicated datacenter localisation
	 */
	java.lang.String getDatacenter(); 

	/**
	 * @return Does this server have professional use option
	 */
	boolean getProfessionalUse(); 

	/**
	 * @return Dedicated server support level
	 */
	java.lang.String getSupportLevel(); 

	/**
	 * @return dedicated server ip
	 */
	java.lang.String getIp(); 

	/**
	 * @return dedicater server commercial range
	 */
	java.lang.String getCommercialRange(); 

	/**
	 * @return Operating system
	 */
	java.lang.String getOs(); 

	/**
	 * @return null
	 */
	java.lang.String getState(); 

	/**
	 * @return your server id
	 */
	long getServerId(); 

	/**
	 * @return null
	 */
	long getBootId(); 

	/**
	 * @return dedicated server name
	 */
	java.lang.String getName(); 

	/**
	 * @return null
	 */
	java.lang.String getRescueMail(); 

	/**
	 * @return dedicated server reverse
	 */
	java.lang.String getReverse(); 

	/**
	 * @return Icmp monitoring state
	 */
	boolean getMonitoring(); 

	/**
	 * @return null
	 */
	java.lang.String getRack(); 

	/**
	 * @return null
	 */
	java.lang.String getRootDevice(); 

	/**
	 * @return null
	 */
	long getLinkSpeed(); 

}
