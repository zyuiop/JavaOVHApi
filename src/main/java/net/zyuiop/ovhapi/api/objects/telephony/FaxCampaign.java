package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Fax campaigns
 */

public interface FaxCampaign { 

	/**
	 * @return The count of failed faxes in the campaign
	 */
	long getCountFailed(); 

	/**
	 * @return The status of the fax campaign
	 */
	java.lang.String getStatus(); 

	/**
	 * @return The name of the fax campaign
	 */
	java.lang.String getName(); 

	/**
	 * @return The end date of the fax campaign
	 */
	java.util.Date getDateEnd(); 

	/**
	 * @return The total count of faxes in the campaign
	 */
	long getCountTotal(); 

	/**
	 * @return The count of success faxes in the campaign
	 */
	long getCountSuccess(); 

	/**
	 * @return The reference of the fax campaign
	 */
	java.lang.String getReference(); 

	/**
	 * @return The start date of the fax campaign
	 */
	java.util.Date getDateStart(); 

	/**
	 * @return The id of the fax campaign
	 */
	long getId(); 

}
