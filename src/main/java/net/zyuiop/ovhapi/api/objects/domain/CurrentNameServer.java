package net.zyuiop.ovhapi.api.objects.domain;

/**
 * CurrentNameServer
 */

public interface CurrentNameServer { 

	/**
	 * @return toDelete flag of the name server
	 */
	boolean getToDelete(); 

	/**
	 * @return Ip of the name server
	 */
	java.lang.String getIp(); 

	/**
	 * @return isUsed flag of the name server
	 */
	boolean getIsUsed(); 

	/**
	 * @return Id of the name server
	 */
	long getId(); 

	/**
	 * @return Host of the name server
	 */
	java.lang.String getHost(); 

}
