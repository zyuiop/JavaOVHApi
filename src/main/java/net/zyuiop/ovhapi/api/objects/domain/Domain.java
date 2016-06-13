package net.zyuiop.ovhapi.api.objects.domain;

/**
 * Domain name administration
 */

public interface Domain { 

	/**
	 * @return Is whois obfuscation supported by this domain name's registry
	 */
	boolean getOwoSupported(); 

	/**
	 * @return Does the registry support ipv6 glue record
	 */
	boolean getGlueRecordIpv6Supported(); 

	/**
	 * @return Transfer lock status
	 */
	java.lang.String getTransferLockStatus(); 

	/**
	 * @return Domain's offer
	 */
	java.lang.String getOffer(); 

	/**
	 * @return Contact Owner (you can edit it via /me/contact/<ID>)
	 */
	java.lang.String getWhoisOwner(); 

	/**
	 * @return Is DNSSEC implemented for this domain name's tld
	 */
	boolean getDnssecSupported(); 

	/**
	 * @return Parent service
	 */
	net.zyuiop.ovhapi.api.objects.domain.ParentService getParentService(); 

	/**
	 * @return Domain name
	 */
	java.lang.String getDomain(); 

	/**
	 * @return Last update date
	 */
	java.util.Date getLastUpdate(); 

	/**
	 * @return Does the registry support multi ip glue record
	 */
	boolean getGlueRecordMultiIpSupported(); 

	/**
	 * @return Name servers type
	 */
	java.lang.String getNameServerType(); 

}
