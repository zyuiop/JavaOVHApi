package net.zyuiop.ovhapi.api.objects.pack.xdsl.migration;

/**
 * List of available Migration offer
 */

public class MigrationOfferResponse { 

	private net.zyuiop.ovhapi.api.objects.pack.xdsl.migration.MigrationOffer[] offers;

	public MigrationOfferResponse() {
	}

	public net.zyuiop.ovhapi.api.objects.pack.xdsl.migration.MigrationOffer[] getOffers() { 
		return this.offers;
	} 

	public void setOffers(net.zyuiop.ovhapi.api.objects.pack.xdsl.migration.MigrationOffer[] offers) { 
		this.offers = offers;
	} 

	public MigrationOfferResponse offers(net.zyuiop.ovhapi.api.objects.pack.xdsl.migration.MigrationOffer[] offers) { 
		this.offers = offers;
		return this;
	} 

}
