package net.zyuiop.ovhapi.api.objects.pack.xdsl.migration;

/**
 * List of available Migration offer
 */

public interface MigrationOfferResponse { 

	/**
	 * @return Array of offers
	 */
	net.zyuiop.ovhapi.api.objects.pack.xdsl.migration.MigrationOffer[] getOffers(); 

}
