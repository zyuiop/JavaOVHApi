package net.zyuiop.ovhapi.impl.objects.order.cart;

import net.zyuiop.ovhapi.api.objects.order.cart.Price;
/**
 * Price informations with label
 */

public class PriceImpl implements Price { 

	private java.lang.String label;
	private net.zyuiop.ovhapi.impl.objects.order.PriceImpl price;

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

	public net.zyuiop.ovhapi.impl.objects.order.PriceImpl getPrice() { 
		return this.price;
	} 

	public void setPrice(net.zyuiop.ovhapi.impl.objects.order.PriceImpl price) { 
		this.price = price;
	} 

	public PriceImpl price(net.zyuiop.ovhapi.impl.objects.order.PriceImpl price) { 
		this.price = price;
		return this;
	} 

}
