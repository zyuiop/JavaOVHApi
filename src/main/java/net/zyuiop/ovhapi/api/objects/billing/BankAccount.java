package net.zyuiop.ovhapi.api.objects.billing;

/**
 * SEPA bank account info
 */

public class BankAccount { 

	private java.lang.String validationDocumentLink;
	private java.lang.String uniqueReference;
	private boolean defaultPaymentMean;
	private java.lang.String description;
	private java.lang.String state;
	private java.util.Date mandateSignatureDate;
	private java.lang.String iban;
	private java.lang.String ownerName;
	private java.lang.String ownerAddress;
	private long id;

	public BankAccount() {
	}

	public java.lang.String getValidationDocumentLink() { 
		return this.validationDocumentLink;
	} 

	public void setValidationDocumentLink(java.lang.String validationDocumentLink) { 
		this.validationDocumentLink = validationDocumentLink;
	} 

	public BankAccount validationDocumentLink(java.lang.String validationDocumentLink) { 
		this.validationDocumentLink = validationDocumentLink;
		return this;
	} 

	public java.lang.String getUniqueReference() { 
		return this.uniqueReference;
	} 

	public void setUniqueReference(java.lang.String uniqueReference) { 
		this.uniqueReference = uniqueReference;
	} 

	public BankAccount uniqueReference(java.lang.String uniqueReference) { 
		this.uniqueReference = uniqueReference;
		return this;
	} 

	public boolean getDefaultPaymentMean() { 
		return this.defaultPaymentMean;
	} 

	public void setDefaultPaymentMean(boolean defaultPaymentMean) { 
		this.defaultPaymentMean = defaultPaymentMean;
	} 

	public BankAccount defaultPaymentMean(boolean defaultPaymentMean) { 
		this.defaultPaymentMean = defaultPaymentMean;
		return this;
	} 

	public java.lang.String getDescription() { 
		return this.description;
	} 

	public void setDescription(java.lang.String description) { 
		this.description = description;
	} 

	public BankAccount description(java.lang.String description) { 
		this.description = description;
		return this;
	} 

	public java.lang.String getState() { 
		return this.state;
	} 

	public void setState(java.lang.String state) { 
		this.state = state;
	} 

	public BankAccount state(java.lang.String state) { 
		this.state = state;
		return this;
	} 

	public java.util.Date getMandateSignatureDate() { 
		return this.mandateSignatureDate;
	} 

	public void setMandateSignatureDate(java.util.Date mandateSignatureDate) { 
		this.mandateSignatureDate = mandateSignatureDate;
	} 

	public BankAccount mandateSignatureDate(java.util.Date mandateSignatureDate) { 
		this.mandateSignatureDate = mandateSignatureDate;
		return this;
	} 

	public java.lang.String getIban() { 
		return this.iban;
	} 

	public void setIban(java.lang.String iban) { 
		this.iban = iban;
	} 

	public BankAccount iban(java.lang.String iban) { 
		this.iban = iban;
		return this;
	} 

	public java.lang.String getOwnerName() { 
		return this.ownerName;
	} 

	public void setOwnerName(java.lang.String ownerName) { 
		this.ownerName = ownerName;
	} 

	public BankAccount ownerName(java.lang.String ownerName) { 
		this.ownerName = ownerName;
		return this;
	} 

	public java.lang.String getOwnerAddress() { 
		return this.ownerAddress;
	} 

	public void setOwnerAddress(java.lang.String ownerAddress) { 
		this.ownerAddress = ownerAddress;
	} 

	public BankAccount ownerAddress(java.lang.String ownerAddress) { 
		this.ownerAddress = ownerAddress;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public BankAccount id(long id) { 
		this.id = id;
		return this;
	} 

}
