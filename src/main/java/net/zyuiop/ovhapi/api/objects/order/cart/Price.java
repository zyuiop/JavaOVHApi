package net.zyuiop.ovhapi.api.objects.order.cart;

/**
 * Price informations with label
 */

public class Price { 

	private java.lang.String label;
	private net.zyuiop.ovhapi.api.objects.order.Price price;

	public Price() {
	}

	public java.lang.String getLabel() { 
		return this.label;
	} 

	public void setLabel(java.lang.String label) { 
		this.label = label;
	} 

	public Price label(java.lang.String label) { 
		this.label = label;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.order.Price getPrice() { 
		return this.price;
	} 

	public void setPrice(net.zyuiop.ovhapi.api.objects.order.Price price) { 
		this.price = price;
	} 

	public Price price(net.zyuiop.ovhapi.api.objects.order.Price price) { 
		this.price = price;
		return this;
	} 

}
