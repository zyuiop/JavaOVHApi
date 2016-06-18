package net.zyuiop.ovhapi.impl.objects.pack.xdsl.migration;

import net.zyuiop.ovhapi.api.objects.pack.xdsl.migration.MigrationOffer;
/**
 * Migration offer
 */

public class MigrationOfferImpl implements MigrationOffer { 

	private long engageMonths;
	private boolean needModem;
	private net.zyuiop.ovhapi.impl.objects.order.PriceImpl due;
	private net.zyuiop.ovhapi.impl.objects.pack.xdsl.migration.OfferAvailableOptionImpl[] options;
	private java.lang.String description;
	private net.zyuiop.ovhapi.impl.objects.order.PriceImpl currentOfferPrice;
	private java.lang.String modemMacToReturn;
	private net.zyuiop.ovhapi.impl.objects.pack.xdsl.migration.SubServiceToDeleteImpl[] subServicesToDelete;
	private java.lang.String offerName;
	private java.lang.String url;
	private net.zyuiop.ovhapi.impl.objects.order.PriceImpl price;
	private java.lang.String[] contractList;
	private boolean needNewModem;

	public MigrationOfferImpl() {
	}

	public long getEngageMonths() { 
		return this.engageMonths;
	} 

	public void setEngageMonths(long engageMonths) { 
		this.engageMonths = engageMonths;
	} 

	public MigrationOfferImpl engageMonths(long engageMonths) { 
		this.engageMonths = engageMonths;
		return this;
	} 

	public boolean getNeedModem() { 
		return this.needModem;
	} 

	public void setNeedModem(boolean needModem) { 
		this.needModem = needModem;
	} 

	public MigrationOfferImpl needModem(boolean needModem) { 
		this.needModem = needModem;
		return this;
	} 

	public net.zyuiop.ovhapi.impl.objects.order.PriceImpl getDue() { 
		return this.due;
	} 

	public void setDue(net.zyuiop.ovhapi.impl.objects.order.PriceImpl due) { 
		this.due = due;
	} 

	public MigrationOfferImpl due(net.zyuiop.ovhapi.impl.objects.order.PriceImpl due) { 
		this.due = due;
		return this;
	} 

	public net.zyuiop.ovhapi.impl.objects.pack.xdsl.migration.OfferAvailableOptionImpl[] getOptions() { 
		return this.options;
	} 

	public void setOptions(net.zyuiop.ovhapi.impl.objects.pack.xdsl.migration.OfferAvailableOptionImpl[] options) { 
		this.options = options;
	} 

	public MigrationOfferImpl options(net.zyuiop.ovhapi.impl.objects.pack.xdsl.migration.OfferAvailableOptionImpl[] options) { 
		this.options = options;
		return this;
	} 

	public java.lang.String getDescription() { 
		return this.description;
	} 

	public void setDescription(java.lang.String description) { 
		this.description = description;
	} 

	public MigrationOfferImpl description(java.lang.String description) { 
		this.description = description;
		return this;
	} 

	public net.zyuiop.ovhapi.impl.objects.order.PriceImpl getCurrentOfferPrice() { 
		return this.currentOfferPrice;
	} 

	public void setCurrentOfferPrice(net.zyuiop.ovhapi.impl.objects.order.PriceImpl currentOfferPrice) { 
		this.currentOfferPrice = currentOfferPrice;
	} 

	public MigrationOfferImpl currentOfferPrice(net.zyuiop.ovhapi.impl.objects.order.PriceImpl currentOfferPrice) { 
		this.currentOfferPrice = currentOfferPrice;
		return this;
	} 

	public java.lang.String getModemMacToReturn() { 
		return this.modemMacToReturn;
	} 

	public void setModemMacToReturn(java.lang.String modemMacToReturn) { 
		this.modemMacToReturn = modemMacToReturn;
	} 

	public MigrationOfferImpl modemMacToReturn(java.lang.String modemMacToReturn) { 
		this.modemMacToReturn = modemMacToReturn;
		return this;
	} 

	public net.zyuiop.ovhapi.impl.objects.pack.xdsl.migration.SubServiceToDeleteImpl[] getSubServicesToDelete() { 
		return this.subServicesToDelete;
	} 

	public void setSubServicesToDelete(net.zyuiop.ovhapi.impl.objects.pack.xdsl.migration.SubServiceToDeleteImpl[] subServicesToDelete) { 
		this.subServicesToDelete = subServicesToDelete;
	} 

	public MigrationOfferImpl subServicesToDelete(net.zyuiop.ovhapi.impl.objects.pack.xdsl.migration.SubServiceToDeleteImpl[] subServicesToDelete) { 
		this.subServicesToDelete = subServicesToDelete;
		return this;
	} 

	public java.lang.String getOfferName() { 
		return this.offerName;
	} 

	public void setOfferName(java.lang.String offerName) { 
		this.offerName = offerName;
	} 

	public MigrationOfferImpl offerName(java.lang.String offerName) { 
		this.offerName = offerName;
		return this;
	} 

	public java.lang.String getUrl() { 
		return this.url;
	} 

	public void setUrl(java.lang.String url) { 
		this.url = url;
	} 

	public MigrationOfferImpl url(java.lang.String url) { 
		this.url = url;
		return this;
	} 

	public net.zyuiop.ovhapi.impl.objects.order.PriceImpl getPrice() { 
		return this.price;
	} 

	public void setPrice(net.zyuiop.ovhapi.impl.objects.order.PriceImpl price) { 
		this.price = price;
	} 

	public MigrationOfferImpl price(net.zyuiop.ovhapi.impl.objects.order.PriceImpl price) { 
		this.price = price;
		return this;
	} 

	public java.lang.String[] getContractList() { 
		return this.contractList;
	} 

	public void setContractList(java.lang.String[] contractList) { 
		this.contractList = contractList;
	} 

	public MigrationOfferImpl contractList(java.lang.String[] contractList) { 
		this.contractList = contractList;
		return this;
	} 

	public boolean getNeedNewModem() { 
		return this.needNewModem;
	} 

	public void setNeedNewModem(boolean needNewModem) { 
		this.needNewModem = needNewModem;
	} 

	public MigrationOfferImpl needNewModem(boolean needNewModem) { 
		this.needNewModem = needNewModem;
		return this;
	} 

}
