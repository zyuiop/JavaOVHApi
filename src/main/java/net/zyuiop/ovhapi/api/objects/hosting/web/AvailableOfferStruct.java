package net.zyuiop.ovhapi.api.objects.hosting.web;

/**
 * Struct which describs an boost offer from a service
 */

public class AvailableOfferStruct { 

	private java.lang.String offer;
	private net.zyuiop.ovhapi.api.objects.order.Price price;

	public AvailableOfferStruct() {
	}

	public java.lang.String getOffer() { 
		return this.offer;
	} 

	public void setOffer(java.lang.String offer) { 
		this.offer = offer;
	} 

	public AvailableOfferStruct offer(java.lang.String offer) { 
		this.offer = offer;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.order.Price getPrice() { 
		return this.price;
	} 

	public void setPrice(net.zyuiop.ovhapi.api.objects.order.Price price) { 
		this.price = price;
	} 

	public AvailableOfferStruct price(net.zyuiop.ovhapi.api.objects.order.Price price) { 
		this.price = price;
		return this;
	} 

}
