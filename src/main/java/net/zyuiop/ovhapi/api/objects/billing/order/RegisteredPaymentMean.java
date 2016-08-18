package net.zyuiop.ovhapi.api.objects.billing.order;

/**
 * A registered payment mean
 */

public class RegisteredPaymentMean { 

	private java.lang.String paymentMean;

	public RegisteredPaymentMean() {
	}

	public java.lang.String getPaymentMean() { 
		return this.paymentMean;
	} 

	public void setPaymentMean(java.lang.String paymentMean) { 
		this.paymentMean = paymentMean;
	} 

	public RegisteredPaymentMean paymentMean(java.lang.String paymentMean) { 
		this.paymentMean = paymentMean;
		return this;
	} 

}
