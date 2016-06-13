package net.zyuiop.ovhapi.api.objects.pack.xdsl;

/**
 * Pack of xDSL services
 */

public interface PackAdsl { 

	/**
	 * @return Name of the xdsl pack
	 */
	java.lang.String getPackName(); 

	/**
	 * @return Capabilities of the pack
	 */
	net.zyuiop.ovhapi.api.objects.pack.xdsl.PackCapabilities getCapabilities(); 

	/**
	 * @return Price of the offer
	 */
	net.zyuiop.ovhapi.api.objects.order.Price getOfferPrice(); 

	/**
	 * @return Customer pack description
	 */
	java.lang.String getDescription(); 

	/**
	 * @return Name of the offer
	 */
	java.lang.String getOfferDescription(); 

}
