package net.zyuiop.ovhapi.api.methods;

/**
 * A class to interact with OVH's /hpcspot APIs
 */

public interface Hpcspot { 



	/**
	 * Details of the consumption of your account
	 * Facultative parameters ? true
	 * @param serviceName The internal name of your HPC Spot account
	 * @param hpcspotItemId Filter the value of hpcspotItemId property (=)
	 * @param hpcspotItemEndDate.to Filter the value of hpcspotItemEndDate property (<=)
	 * @param orderId Filter the value of orderId property (=)
	 * @param type Filter the value of type property (=)
	 * @param hpcspotItemEndDate.from Filter the value of hpcspotItemEndDate property (>=)
	*/
	long[] getServiceNameConsumption(java.lang.String serviceName, long hpcspotItemId, java.util.Date hpcspotItemEndDateTo, long orderId, java.lang.String type, java.util.Date hpcspotItemEndDateFrom) throws java.io.IOException;

	/**
	 * Details of the consumption of your account
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your HPC Spot account
	*/
	long[] getServiceNameConsumption(java.lang.String serviceName) throws java.io.IOException;


	/**
	 * List available services
	 * Facultative parameters ? false
	*/
	java.lang.String[] getHpcspot() throws java.io.IOException;


}
