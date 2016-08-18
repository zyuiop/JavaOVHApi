package net.zyuiop.ovhapi.api.objects.billing;

/**
 * A validation required to add a payment mean
 */

public class PaymentMeanValidation { 

	private java.lang.String validationType;
	private java.lang.String url;

	public PaymentMeanValidation() {
	}

	public java.lang.String getValidationType() { 
		return this.validationType;
	} 

	public void setValidationType(java.lang.String validationType) { 
		this.validationType = validationType;
	} 

	public PaymentMeanValidation validationType(java.lang.String validationType) { 
		this.validationType = validationType;
		return this;
	} 

	public java.lang.String getUrl() { 
		return this.url;
	} 

	public void setUrl(java.lang.String url) { 
		this.url = url;
	} 

	public PaymentMeanValidation url(java.lang.String url) { 
		this.url = url;
		return this;
	} 

}
