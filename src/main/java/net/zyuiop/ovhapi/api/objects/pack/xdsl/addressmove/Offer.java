package net.zyuiop.ovhapi.api.objects.pack.xdsl.addressmove;

/**
 * An offer
 */

public interface Offer { 

	/**
	 * @return Status of the request
	 */
	java.lang.String getProvider(); 

	/**
	 * @return The download synchronisation in kbps
	 */
	long getSyncDownload(); 

	/**
	 * @return The code of the offer
	 */
	java.lang.String getOfferCode(); 

	/**
	 * @return The status of the landline
	 */
	java.lang.String getLineStatus(); 

	/**
	 * @return Tells whether the tested number can be ported to OVH or not
	 */
	net.zyuiop.ovhapi.api.objects.xdsl.eligibility.Portability getPortability(); 

	/**
	 * @return Detailed information about the sections between the DSLAM and the telephone jack
	 */
	net.zyuiop.ovhapi.api.objects.xdsl.LineSectionLength getLineSectionsLength(); 

	/**
	 * @return The estimated upload synchronisation in kbps
	 */
	long getEstimatedUpload(); 

	/**
	 * @return DSL technology
	 */
	java.lang.String getType(); 

	/**
	 * @return Address of the landline
	 */
	net.zyuiop.ovhapi.api.objects.xdsl.eligibility.Address getAddress(); 

	/**
	 * @return The price of this offer
	 */
	net.zyuiop.ovhapi.api.objects.order.Price getPrice(); 

	/**
	 * @return The estimated download synchronisation in kbps
	 */
	long getEstimatedDownload(); 

	/**
	 * @return Available meeting slots for the creation of this offer.
	 */
	net.zyuiop.ovhapi.api.objects.xdsl.eligibility.MeetingSlots getMeetingSlots(); 

	/**
	 * @return The NRA of the landline
	 */
	java.lang.String getNra(); 

	/**
	 * @return The unbundling type
	 */
	java.lang.String getUnbundling(); 

	/**
	 * @return The upload synchronisation in kbps
	 */
	long getSyncUpload(); 

}
