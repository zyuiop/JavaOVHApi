package net.zyuiop.ovhapi.impl.objects.billing;

import net.zyuiop.ovhapi.api.objects.billing.Paypal;
/**
 * Paypal account info
 */

public class PaypalImpl implements Paypal { 

	private java.lang.String email;
	private java.lang.String agreementId;
	private java.util.Date creationDate;
	private long id;
	private boolean defaultPaymentMean;
	private java.lang.String description;

	public PaypalImpl() {
	}

	public java.lang.String getEmail() { 
		return this.email;
	} 

	public void setEmail(java.lang.String email) { 
		this.email = email;
	} 

	public PaypalImpl email(java.lang.String email) { 
		this.email = email;
		return this;
	} 

	public java.lang.String getAgreementId() { 
		return this.agreementId;
	} 

	public void setAgreementId(java.lang.String agreementId) { 
		this.agreementId = agreementId;
	} 

	public PaypalImpl agreementId(java.lang.String agreementId) { 
		this.agreementId = agreementId;
		return this;
	} 

	public java.util.Date getCreationDate() { 
		return this.creationDate;
	} 

	public void setCreationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
	} 

	public PaypalImpl creationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public PaypalImpl id(long id) { 
		this.id = id;
		return this;
	} 

	public boolean getDefaultPaymentMean() { 
		return this.defaultPaymentMean;
	} 

	public void setDefaultPaymentMean(boolean defaultPaymentMean) { 
		this.defaultPaymentMean = defaultPaymentMean;
	} 

	public PaypalImpl defaultPaymentMean(boolean defaultPaymentMean) { 
		this.defaultPaymentMean = defaultPaymentMean;
		return this;
	} 

	public java.lang.String getDescription() { 
		return this.description;
	} 

	public void setDescription(java.lang.String description) { 
		this.description = description;
	} 

	public PaypalImpl description(java.lang.String description) { 
		this.description = description;
		return this;
	} 

}
