package net.zyuiop.ovhapi.impl.objects.order.cart;

import net.zyuiop.ovhapi.api.objects.order.cart.Price;
/**
 * Price informations with label
 */

public class PriceImpl implements Price { 

	private java.lang.String label;
	private net.zyuiop.ovhapi.api.objects.order.Price price;

	public PriceImpl() {
	}

	public java.lang.String getLabel() { 
		return this.label;
	} 

	public void setLabel(java.lang.String label) { 
		this.label = label;
	} 

	public PriceImpl label(java.lang.String label) { 
		this.label = label;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.order.Price getPrice() { 
		return this.price;
	} 

	public void setPrice(net.zyuiop.ovhapi.api.objects.order.Price price) { 
		this.price = price;
	} 

	public PriceImpl price(net.zyuiop.ovhapi.api.objects.order.Price price) { 
		this.price = price;
		return this;
	} 

}
