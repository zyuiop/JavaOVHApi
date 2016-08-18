package net.zyuiop.ovhapi.api.objects.billing;

/**
 * Paypal account info
 */

public class Paypal { 

	private java.lang.String email;
	private java.lang.String agreementId;
	private java.util.Date creationDate;
	private long id;
	private boolean defaultPaymentMean;
	private java.lang.String description;

	public Paypal() {
	}

	public java.lang.String getEmail() { 
		return this.email;
	} 

	public void setEmail(java.lang.String email) { 
		this.email = email;
	} 

	public Paypal email(java.lang.String email) { 
		this.email = email;
		return this;
	} 

	public java.lang.String getAgreementId() { 
		return this.agreementId;
	} 

	public void setAgreementId(java.lang.String agreementId) { 
		this.agreementId = agreementId;
	} 

	public Paypal agreementId(java.lang.String agreementId) { 
		this.agreementId = agreementId;
		return this;
	} 

	public java.util.Date getCreationDate() { 
		return this.creationDate;
	} 

	public void setCreationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
	} 

	public Paypal creationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public Paypal id(long id) { 
		this.id = id;
		return this;
	} 

	public boolean getDefaultPaymentMean() { 
		return this.defaultPaymentMean;
	} 

	public void setDefaultPaymentMean(boolean defaultPaymentMean) { 
		this.defaultPaymentMean = defaultPaymentMean;
	} 

	public Paypal defaultPaymentMean(boolean defaultPaymentMean) { 
		this.defaultPaymentMean = defaultPaymentMean;
		return this;
	} 

	public java.lang.String getDescription() { 
		return this.description;
	} 

	public void setDescription(java.lang.String description) { 
		this.description = description;
	} 

	public Paypal description(java.lang.String description) { 
		this.description = description;
		return this;
	} 

}
