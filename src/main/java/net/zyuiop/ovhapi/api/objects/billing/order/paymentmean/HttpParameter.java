package net.zyuiop.ovhapi.api.objects.billing.order.paymentmean;

/**
 * Parameter to give to a payment page
 */

public class HttpParameter { 

	private java.lang.String value;
	private java.lang.String name;
	private net.zyuiop.ovhapi.api.objects.billing.order.paymentmean.HttpParameterChoice[] choice;

	public HttpParameter() {
	}

	public java.lang.String getValue() { 
		return this.value;
	} 

	public void setValue(java.lang.String value) { 
		this.value = value;
	} 

	public HttpParameter value(java.lang.String value) { 
		this.value = value;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public HttpParameter name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.billing.order.paymentmean.HttpParameterChoice[] getChoice() { 
		return this.choice;
	} 

	public void setChoice(net.zyuiop.ovhapi.api.objects.billing.order.paymentmean.HttpParameterChoice[] choice) { 
		this.choice = choice;
	} 

	public HttpParameter choice(net.zyuiop.ovhapi.api.objects.billing.order.paymentmean.HttpParameterChoice[] choice) { 
		this.choice = choice;
		return this;
	} 

}
