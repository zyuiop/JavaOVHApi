package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Current Return Merchandise Authorisation
 */

public interface Rma { 

	/**
	 * @return Termination datetime of the return merchandise authorisation ticket
	 */
	java.util.Date getTerminationDatetime(); 

	/**
	 * @return Return merchandise authorisation step
	 */
	java.lang.String getStatus(); 

	/**
	 * @return New merchandise brand in case of exchange
	 */
	java.lang.String getNewMerchandise(); 

	/**
	 * @return Contact information related to the delivery shipping in case of exchange
	 */
	net.zyuiop.ovhapi.api.objects.telephony.Contact getShippingContact(); 

	/**
	 * @return Offer type of the new merchandise in case of exchange
	 */
	java.lang.String getOfferTypeNew(); 

	/**
	 * @return Merchandise reference
	 */
	java.lang.String getEquipmentReference(); 

	/**
	 * @return Creation datetime of the return merchandise authorisation ticket
	 */
	java.util.Date getCreationDatetime(); 

	/**
	 * @return Typology process of merchandise return
	 */
	java.lang.String getType(); 

	/**
	 * @return Return merchandise authorisation identifier
	 */
	java.lang.String getId(); 

	/**
	 * @return Offer type of the return merchandise
	 */
	java.lang.String getOfferTypeOld(); 

	/**
	 * @return Reception datetime of the return merchandise authorisation ticket
	 */
	java.util.Date getReceptionDatetime(); 

}
