package net.zyuiop.ovhapi.api.objects.billing;

/**
 * Available automatic payment means
 */

public class AutomaticPaymentMean { 

	private boolean paypal;
	private boolean bankAccount;
	private boolean creditCard;

	public AutomaticPaymentMean() {
	}

	public boolean getPaypal() { 
		return this.paypal;
	} 

	public void setPaypal(boolean paypal) { 
		this.paypal = paypal;
	} 

	public AutomaticPaymentMean paypal(boolean paypal) { 
		this.paypal = paypal;
		return this;
	} 

	public boolean getBankAccount() { 
		return this.bankAccount;
	} 

	public void setBankAccount(boolean bankAccount) { 
		this.bankAccount = bankAccount;
	} 

	public AutomaticPaymentMean bankAccount(boolean bankAccount) { 
		this.bankAccount = bankAccount;
		return this;
	} 

	public boolean getCreditCard() { 
		return this.creditCard;
	} 

	public void setCreditCard(boolean creditCard) { 
		this.creditCard = creditCard;
	} 

	public AutomaticPaymentMean creditCard(boolean creditCard) { 
		this.creditCard = creditCard;
		return this;
	} 

}
