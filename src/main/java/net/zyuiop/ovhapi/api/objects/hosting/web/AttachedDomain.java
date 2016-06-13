package net.zyuiop.ovhapi.api.objects.hosting.web;

/**
 * Virtual service
 */

public interface AttachedDomain { 

	/**
	 * @return Domain linked (fqdn)
	 */
	java.lang.String getDomain(); 

	/**
	 * @return Is linked to the hosting cdn
	 */
	java.lang.String getCdn(); 

	/**
	 * @return IP location of the domain linked
	 */
	java.lang.String getIpLocation(); 

	/**
	 * @return Put domain for separate the logs
	 */
	java.lang.String getOwnLog(); 

	/**
	 * @return Firewall state for this path
	 */
	java.lang.String getFirewall(); 

	/**
	 * @return Put domain in ssl certificate
	 */
	boolean getSsl(); 

	/**
	 * @return Domain path, relative to your home directory
	 */
	java.lang.String getPath(); 

}
