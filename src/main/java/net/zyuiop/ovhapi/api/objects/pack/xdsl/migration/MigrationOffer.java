package net.zyuiop.ovhapi.api.objects.pack.xdsl.migration;

/**
 * Migration offer
 */

public class MigrationOffer { 

	private long engageMonths;
	private boolean needModem;
	private net.zyuiop.ovhapi.api.objects.order.Price due;
	private net.zyuiop.ovhapi.api.objects.pack.xdsl.migration.OfferAvailableOption[] options;
	private java.lang.String description;
	private net.zyuiop.ovhapi.api.objects.order.Price currentOfferPrice;
	private java.lang.String modemMacToReturn;
	private net.zyuiop.ovhapi.api.objects.pack.xdsl.migration.SubServiceToDelete[] subServicesToDelete;
	private java.lang.String offerName;
	private java.lang.String url;
	private net.zyuiop.ovhapi.api.objects.order.Price price;
	private java.lang.String[] contractList;
	private boolean needNewModem;

	public MigrationOffer() {
	}

	public long getEngageMonths() { 
		return this.engageMonths;
	} 

	public void setEngageMonths(long engageMonths) { 
		this.engageMonths = engageMonths;
	} 

	public MigrationOffer engageMonths(long engageMonths) { 
		this.engageMonths = engageMonths;
		return this;
	} 

	public boolean getNeedModem() { 
		return this.needModem;
	} 

	public void setNeedModem(boolean needModem) { 
		this.needModem = needModem;
	} 

	public MigrationOffer needModem(boolean needModem) { 
		this.needModem = needModem;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.order.Price getDue() { 
		return this.due;
	} 

	public void setDue(net.zyuiop.ovhapi.api.objects.order.Price due) { 
		this.due = due;
	} 

	public MigrationOffer due(net.zyuiop.ovhapi.api.objects.order.Price due) { 
		this.due = due;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.pack.xdsl.migration.OfferAvailableOption[] getOptions() { 
		return this.options;
	} 

	public void setOptions(net.zyuiop.ovhapi.api.objects.pack.xdsl.migration.OfferAvailableOption[] options) { 
		this.options = options;
	} 

	public MigrationOffer options(net.zyuiop.ovhapi.api.objects.pack.xdsl.migration.OfferAvailableOption[] options) { 
		this.options = options;
		return this;
	} 

	public java.lang.String getDescription() { 
		return this.description;
	} 

	public void setDescription(java.lang.String description) { 
		this.description = description;
	} 

	public MigrationOffer description(java.lang.String description) { 
		this.description = description;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.order.Price getCurrentOfferPrice() { 
		return this.currentOfferPrice;
	} 

	public void setCurrentOfferPrice(net.zyuiop.ovhapi.api.objects.order.Price currentOfferPrice) { 
		this.currentOfferPrice = currentOfferPrice;
	} 

	public MigrationOffer currentOfferPrice(net.zyuiop.ovhapi.api.objects.order.Price currentOfferPrice) { 
		this.currentOfferPrice = currentOfferPrice;
		return this;
	} 

	public java.lang.String getModemMacToReturn() { 
		return this.modemMacToReturn;
	} 

	public void setModemMacToReturn(java.lang.String modemMacToReturn) { 
		this.modemMacToReturn = modemMacToReturn;
	} 

	public MigrationOffer modemMacToReturn(java.lang.String modemMacToReturn) { 
		this.modemMacToReturn = modemMacToReturn;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.pack.xdsl.migration.SubServiceToDelete[] getSubServicesToDelete() { 
		return this.subServicesToDelete;
	} 

	public void setSubServicesToDelete(net.zyuiop.ovhapi.api.objects.pack.xdsl.migration.SubServiceToDelete[] subServicesToDelete) { 
		this.subServicesToDelete = subServicesToDelete;
	} 

	public MigrationOffer subServicesToDelete(net.zyuiop.ovhapi.api.objects.pack.xdsl.migration.SubServiceToDelete[] subServicesToDelete) { 
		this.subServicesToDelete = subServicesToDelete;
		return this;
	} 

	public java.lang.String getOfferName() { 
		return this.offerName;
	} 

	public void setOfferName(java.lang.String offerName) { 
		this.offerName = offerName;
	} 

	public MigrationOffer offerName(java.lang.String offerName) { 
		this.offerName = offerName;
		return this;
	} 

	public java.lang.String getUrl() { 
		return this.url;
	} 

	public void setUrl(java.lang.String url) { 
		this.url = url;
	} 

	public MigrationOffer url(java.lang.String url) { 
		this.url = url;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.order.Price getPrice() { 
		return this.price;
	} 

	public void setPrice(net.zyuiop.ovhapi.api.objects.order.Price price) { 
		this.price = price;
	} 

	public MigrationOffer price(net.zyuiop.ovhapi.api.objects.order.Price price) { 
		this.price = price;
		return this;
	} 

	public java.lang.String[] getContractList() { 
		return this.contractList;
	} 

	public void setContractList(java.lang.String[] contractList) { 
		this.contractList = contractList;
	} 

	public MigrationOffer contractList(java.lang.String[] contractList) { 
		this.contractList = contractList;
		return this;
	} 

	public boolean getNeedNewModem() { 
		return this.needNewModem;
	} 

	public void setNeedNewModem(boolean needNewModem) { 
		this.needNewModem = needNewModem;
	} 

	public MigrationOffer needNewModem(boolean needNewModem) { 
		this.needNewModem = needNewModem;
		return this;
	} 

}
