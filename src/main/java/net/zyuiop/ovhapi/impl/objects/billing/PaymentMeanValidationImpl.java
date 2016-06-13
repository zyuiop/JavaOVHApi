package net.zyuiop.ovhapi.impl.objects.billing;

import net.zyuiop.ovhapi.api.objects.billing.PaymentMeanValidation;
/**
 * A validation required to add a payment mean
 */

public class PaymentMeanValidationImpl implements PaymentMeanValidation { 

	private java.lang.String validationType;
	private java.lang.String url;

	public PaymentMeanValidationImpl() {
	}

	public java.lang.String getValidationType() { 
		return this.validationType;
	} 

	public void setValidationType(java.lang.String validationType) { 
		this.validationType = validationType;
	} 

	public PaymentMeanValidationImpl validationType(java.lang.String validationType) { 
		this.validationType = validationType;
		return this;
	} 

	public java.lang.String getUrl() { 
		return this.url;
	} 

	public void setUrl(java.lang.String url) { 
		this.url = url;
	} 

	public PaymentMeanValidationImpl url(java.lang.String url) { 
		this.url = url;
		return this;
	} 

}
