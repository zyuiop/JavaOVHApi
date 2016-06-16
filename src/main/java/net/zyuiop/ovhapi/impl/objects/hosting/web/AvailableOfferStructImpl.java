package net.zyuiop.ovhapi.impl.objects.hosting.web;

import net.zyuiop.ovhapi.api.objects.hosting.web.AvailableOfferStruct;
/**
 * Struct which describs an boost offer from a service
 */

public class AvailableOfferStructImpl implements AvailableOfferStruct { 

	private java.lang.String offer;
	private net.zyuiop.ovhapi.impl.objects.order.PriceImpl price;

	public AvailableOfferStructImpl() {
	}

	public java.lang.String getOffer() { 
		return this.offer;
	} 

	public void setOffer(java.lang.String offer) { 
		this.offer = offer;
	} 

	public AvailableOfferStructImpl offer(java.lang.String offer) { 
		this.offer = offer;
		return this;
	} 

	public net.zyuiop.ovhapi.impl.objects.order.PriceImpl getPrice() { 
		return this.price;
	} 

	public void setPrice(net.zyuiop.ovhapi.impl.objects.order.PriceImpl price) { 
		this.price = price;
	} 

	public AvailableOfferStructImpl price(net.zyuiop.ovhapi.impl.objects.order.PriceImpl price) { 
		this.price = price;
		return this;
	} 

}
