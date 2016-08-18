package net.zyuiop.ovhapi.api.objects.billing.order.paymentmean;

/**
 * Choice for an HTTP multi value parameter
 */

public class HttpParameterChoice { 

	private java.lang.String value;
	private java.lang.String name;

	public HttpParameterChoice() {
	}

	public java.lang.String getValue() { 
		return this.value;
	} 

	public void setValue(java.lang.String value) { 
		this.value = value;
	} 

	public HttpParameterChoice value(java.lang.String value) { 
		this.value = value;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public HttpParameterChoice name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

}
