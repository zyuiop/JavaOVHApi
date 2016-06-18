package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Detail of a fax campaign
 */

public interface FaxCampaignDetail { 

	/**
	 * @return null
	 */
	java.lang.String[] getSuccess(); 

	/**
	 * @return null
	 */
	java.lang.String[] getFailed(); 

	/**
	 * @return null
	 */
	java.lang.String[] getTodo(); 

}
