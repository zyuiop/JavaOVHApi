package net.zyuiop.ovhapi.api.objects.order;

/**
 * Price with it's currency and textual representation
 */

public class Price { 

	private java.lang.String currencyCode;
	private double value;
	private java.lang.String text;

	public Price() {
	}

	public java.lang.String getCurrencyCode() { 
		return this.currencyCode;
	} 

	public void setCurrencyCode(java.lang.String currencyCode) { 
		this.currencyCode = currencyCode;
	} 

	public Price currencyCode(java.lang.String currencyCode) { 
		this.currencyCode = currencyCode;
		return this;
	} 

	public double getValue() { 
		return this.value;
	} 

	public void setValue(double value) { 
		this.value = value;
	} 

	public Price value(double value) { 
		this.value = value;
		return this;
	} 

	public java.lang.String getText() { 
		return this.text;
	} 

	public void setText(java.lang.String text) { 
		this.text = text;
	} 

	public Price text(java.lang.String text) { 
		this.text = text;
		return this;
	} 

}
