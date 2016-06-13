package net.zyuiop.ovhapi.api.objects.nichandle;

/**
 * Auto renewal information
 */

public interface NicAutorenewInfos { 

	/**
	 * @return give the last renew
	 */
	java.util.Date getLastRenew(); 

	/**
	 * @return Renewal active or not
	 */
	boolean getActive(); 

	/**
	 * @return give the renewal day
	 */
	long getRenewDay(); 

}
