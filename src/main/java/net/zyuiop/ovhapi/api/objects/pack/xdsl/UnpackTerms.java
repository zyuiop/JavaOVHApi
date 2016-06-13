package net.zyuiop.ovhapi.api.objects.pack.xdsl;

/**
 * Terms to unpack services
 */

public interface UnpackTerms { 

	/**
	 * @return Tells whether or not the service can be unpacked
	 */
	boolean getIsAllowed(); 

	/**
	 * @return Renew period in month of the service
	 */
	double getRenewPeriod(); 

	/**
	 * @return The price it will cost when it will be renew
	 */
	net.zyuiop.ovhapi.api.objects.order.Price getRenewPrice(); 

	/**
	 * @return Price bill on the unpack action
	 */
	net.zyuiop.ovhapi.api.objects.order.Price getPrice(); 

}
