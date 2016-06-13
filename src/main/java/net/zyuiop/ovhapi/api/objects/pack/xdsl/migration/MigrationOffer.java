package net.zyuiop.ovhapi.api.objects.pack.xdsl.migration;

/**
 * Migration offer
 */

public interface MigrationOffer { 

	/**
	 * @return Number of months of engagement
	 */
	long getEngageMonths(); 

	/**
	 * @return Tells if the offer needs a modem
	 */
	boolean getNeedModem(); 

	/**
	 * @return Price to make the migration
	 */
	net.zyuiop.ovhapi.api.objects.order.Price getDue(); 

	/**
	 * @return Available options for the migration
	 */
	net.zyuiop.ovhapi.api.objects.pack.xdsl.migration.OfferAvailableOption getOptions(); 

	/**
	 * @return Description of the offer
	 */
	java.lang.String getDescription(); 

	/**
	 * @return Price of the current offer
	 */
	net.zyuiop.ovhapi.api.objects.order.Price getCurrentOfferPrice(); 

	/**
	 * @return Mac address of the modem to be returned
	 */
	java.lang.String getModemMacToReturn(); 

	/**
	 * @return List of sub services to delete
	 */
	net.zyuiop.ovhapi.api.objects.pack.xdsl.migration.SubServiceToDelete getSubServicesToDelete(); 

	/**
	 * @return Name of the offer
	 */
	java.lang.String getOfferName(); 

	/**
	 * @return URL of the offer
	 */
	java.lang.String getUrl(); 

	/**
	 * @return Price of the offer
	 */
	net.zyuiop.ovhapi.api.objects.order.Price getPrice(); 

	/**
	 * @return List of contracts
	 */
	java.lang.String getContractList(); 

	/**
	 * @return Tells if the customer will have to change its modem
	 */
	boolean getNeedNewModem(); 

}
