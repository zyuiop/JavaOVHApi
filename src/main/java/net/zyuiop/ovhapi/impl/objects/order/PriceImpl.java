package net.zyuiop.ovhapi.impl.objects.order;

import net.zyuiop.ovhapi.api.objects.order.Price;
/**
 * Price with it's currency and textual representation
 */

public class PriceImpl implements Price { 

	private java.lang.String currencyCode;
	private double value;
	private java.lang.String text;

	public PriceImpl() {
	}

	public java.lang.String getCurrencyCode() { 
		return this.currencyCode;
	} 

	public void setCurrencyCode(java.lang.String currencyCode) { 
		this.currencyCode = currencyCode;
	} 

	public PriceImpl currencyCode(java.lang.String currencyCode) { 
		this.currencyCode = currencyCode;
		return this;
	} 

	public double getValue() { 
		return this.value;
	} 

	public void setValue(double value) { 
		this.value = value;
	} 

	public PriceImpl value(double value) { 
		this.value = value;
		return this;
	} 

	public java.lang.String getText() { 
		return this.text;
	} 

	public void setText(java.lang.String text) { 
		this.text = text;
	} 

	public PriceImpl text(java.lang.String text) { 
		this.text = text;
		return this;
	} 

}
