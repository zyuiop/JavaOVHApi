package net.zyuiop.ovhapi.impl.objects.billing.order.paymentmean;

import net.zyuiop.ovhapi.api.objects.billing.order.paymentmean.HttpParameterChoice;
/**
 * Choice for an HTTP multi value parameter
 */

public class HttpParameterChoiceImpl implements HttpParameterChoice { 

	private java.lang.String value;
	private java.lang.String name;

	public HttpParameterChoiceImpl() {
	}

	public java.lang.String getValue() { 
		return this.value;
	} 

	public void setValue(java.lang.String value) { 
		this.value = value;
	} 

	public HttpParameterChoiceImpl value(java.lang.String value) { 
		this.value = value;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public HttpParameterChoiceImpl name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

}
