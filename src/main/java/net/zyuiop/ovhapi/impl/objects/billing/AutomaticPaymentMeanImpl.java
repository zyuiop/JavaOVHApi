package net.zyuiop.ovhapi.impl.objects.billing;

import net.zyuiop.ovhapi.api.objects.billing.AutomaticPaymentMean;
/**
 * Available automatic payment means
 */

public class AutomaticPaymentMeanImpl implements AutomaticPaymentMean { 

	private boolean paypal;
	private boolean bankAccount;
	private boolean creditCard;

	public AutomaticPaymentMeanImpl() {
	}

	public boolean getPaypal() { 
		return this.paypal;
	} 

	public void setPaypal(boolean paypal) { 
		this.paypal = paypal;
	} 

	public AutomaticPaymentMeanImpl paypal(boolean paypal) { 
		this.paypal = paypal;
		return this;
	} 

	public boolean getBankAccount() { 
		return this.bankAccount;
	} 

	public void setBankAccount(boolean bankAccount) { 
		this.bankAccount = bankAccount;
	} 

	public AutomaticPaymentMeanImpl bankAccount(boolean bankAccount) { 
		this.bankAccount = bankAccount;
		return this;
	} 

	public boolean getCreditCard() { 
		return this.creditCard;
	} 

	public void setCreditCard(boolean creditCard) { 
		this.creditCard = creditCard;
	} 

	public AutomaticPaymentMeanImpl creditCard(boolean creditCard) { 
		this.creditCard = creditCard;
		return this;
	} 

}
