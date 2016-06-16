package net.zyuiop.ovhapi.impl.objects.pack.xdsl;

import net.zyuiop.ovhapi.api.objects.pack.xdsl.PackAdsl;
/**
 * Pack of xDSL services
 */

public class PackAdslImpl implements PackAdsl { 

	private java.lang.String packName;
	private net.zyuiop.ovhapi.impl.objects.pack.xdsl.PackCapabilitiesImpl capabilities;
	private net.zyuiop.ovhapi.impl.objects.order.PriceImpl offerPrice;
	private java.lang.String description;
	private java.lang.String offerDescription;

	public PackAdslImpl() {
	}

	public java.lang.String getPackName() { 
		return this.packName;
	} 

	public void setPackName(java.lang.String packName) { 
		this.packName = packName;
	} 

	public PackAdslImpl packName(java.lang.String packName) { 
		this.packName = packName;
		return this;
	} 

	public net.zyuiop.ovhapi.impl.objects.pack.xdsl.PackCapabilitiesImpl getCapabilities() { 
		return this.capabilities;
	} 

	public void setCapabilities(net.zyuiop.ovhapi.impl.objects.pack.xdsl.PackCapabilitiesImpl capabilities) { 
		this.capabilities = capabilities;
	} 

	public PackAdslImpl capabilities(net.zyuiop.ovhapi.impl.objects.pack.xdsl.PackCapabilitiesImpl capabilities) { 
		this.capabilities = capabilities;
		return this;
	} 

	public net.zyuiop.ovhapi.impl.objects.order.PriceImpl getOfferPrice() { 
		return this.offerPrice;
	} 

	public void setOfferPrice(net.zyuiop.ovhapi.impl.objects.order.PriceImpl offerPrice) { 
		this.offerPrice = offerPrice;
	} 

	public PackAdslImpl offerPrice(net.zyuiop.ovhapi.impl.objects.order.PriceImpl offerPrice) { 
		this.offerPrice = offerPrice;
		return this;
	} 

	public java.lang.String getDescription() { 
		return this.description;
	} 

	public void setDescription(java.lang.String description) { 
		this.description = description;
	} 

	public PackAdslImpl description(java.lang.String description) { 
		this.description = description;
		return this;
	} 

	public java.lang.String getOfferDescription() { 
		return this.offerDescription;
	} 

	public void setOfferDescription(java.lang.String offerDescription) { 
		this.offerDescription = offerDescription;
	} 

	public PackAdslImpl offerDescription(java.lang.String offerDescription) { 
		this.offerDescription = offerDescription;
		return this;
	} 

}
