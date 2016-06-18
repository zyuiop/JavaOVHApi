package net.zyuiop.ovhapi.impl.objects.pack.xdsl.migration;

import net.zyuiop.ovhapi.api.objects.pack.xdsl.migration.MigrationOfferResponse;
/**
 * List of available Migration offer
 */

public class MigrationOfferResponseImpl implements MigrationOfferResponse { 

	private net.zyuiop.ovhapi.impl.objects.pack.xdsl.migration.MigrationOfferImpl[] offers;

	public MigrationOfferResponseImpl() {
	}

	public net.zyuiop.ovhapi.impl.objects.pack.xdsl.migration.MigrationOfferImpl[] getOffers() { 
		return this.offers;
	} 

	public void setOffers(net.zyuiop.ovhapi.impl.objects.pack.xdsl.migration.MigrationOfferImpl[] offers) { 
		this.offers = offers;
	} 

	public MigrationOfferResponseImpl offers(net.zyuiop.ovhapi.impl.objects.pack.xdsl.migration.MigrationOfferImpl[] offers) { 
		this.offers = offers;
		return this;
	} 

}
