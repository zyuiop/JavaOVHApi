package net.zyuiop.ovhapi.impl.objects.billing;

import net.zyuiop.ovhapi.api.objects.billing.Payment;
/**
 * Details about a payment
 */

public class PaymentImpl implements Payment { 

	private java.util.Date paymentDate;
	private java.lang.String paymentIdentifier;
	private java.lang.String paymentType;

	public PaymentImpl() {
	}

	public java.util.Date getPaymentDate() { 
		return this.paymentDate;
	} 

	public void setPaymentDate(java.util.Date paymentDate) { 
		this.paymentDate = paymentDate;
	} 

	public PaymentImpl paymentDate(java.util.Date paymentDate) { 
		this.paymentDate = paymentDate;
		return this;
	} 

	public java.lang.String getPaymentIdentifier() { 
		return this.paymentIdentifier;
	} 

	public void setPaymentIdentifier(java.lang.String paymentIdentifier) { 
		this.paymentIdentifier = paymentIdentifier;
	} 

	public PaymentImpl paymentIdentifier(java.lang.String paymentIdentifier) { 
		this.paymentIdentifier = paymentIdentifier;
		return this;
	} 

	public java.lang.String getPaymentType() { 
		return this.paymentType;
	} 

	public void setPaymentType(java.lang.String paymentType) { 
		this.paymentType = paymentType;
	} 

	public PaymentImpl paymentType(java.lang.String paymentType) { 
		this.paymentType = paymentType;
		return this;
	} 

}
