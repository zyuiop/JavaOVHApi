package net.zyuiop.ovhapi.api.objects.domain.zone;

/**
 * Zone resource records
 */

public interface Record { 

	/**
	 * @return Resource record target
	 */
	java.lang.String getTarget(); 

	/**
	 * @return Resource record ttl
	 */
	long getTtl(); 

	/**
	 * @return Resource record zone
	 */
	java.lang.String getZone(); 

	/**
	 * @return Resource record Name
	 */
	java.lang.String getFieldType(); 

	/**
	 * @return Id of the zone resource record
	 */
	long getId(); 

	/**
	 * @return Resource record subdomain
	 */
	java.lang.String getSubDomain(); 

}
