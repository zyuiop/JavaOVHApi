package net.zyuiop.ovhapi.impl.objects.billing.order;

import net.zyuiop.ovhapi.api.objects.billing.order.RegisteredPaymentMean;
/**
 * A registered payment mean
 */

public class RegisteredPaymentMeanImpl implements RegisteredPaymentMean { 

	private java.lang.String paymentMean;

	public RegisteredPaymentMeanImpl() {
	}

	public java.lang.String getPaymentMean() { 
		return this.paymentMean;
	} 

	public void setPaymentMean(java.lang.String paymentMean) { 
		this.paymentMean = paymentMean;
	} 

	public RegisteredPaymentMeanImpl paymentMean(java.lang.String paymentMean) { 
		this.paymentMean = paymentMean;
		return this;
	} 

}
