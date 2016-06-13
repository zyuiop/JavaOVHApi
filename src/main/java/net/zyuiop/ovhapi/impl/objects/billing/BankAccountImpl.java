package net.zyuiop.ovhapi.impl.objects.billing;

import net.zyuiop.ovhapi.api.objects.billing.BankAccount;
/**
 * SEPA bank account info
 */

public class BankAccountImpl implements BankAccount { 

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

	public BankAccountImpl() {
	}

	public java.lang.String getValidationDocumentLink() { 
		return this.validationDocumentLink;
	} 

	public void setValidationDocumentLink(java.lang.String validationDocumentLink) { 
		this.validationDocumentLink = validationDocumentLink;
	} 

	public BankAccountImpl validationDocumentLink(java.lang.String validationDocumentLink) { 
		this.validationDocumentLink = validationDocumentLink;
		return this;
	} 

	public java.lang.String getUniqueReference() { 
		return this.uniqueReference;
	} 

	public void setUniqueReference(java.lang.String uniqueReference) { 
		this.uniqueReference = uniqueReference;
	} 

	public BankAccountImpl uniqueReference(java.lang.String uniqueReference) { 
		this.uniqueReference = uniqueReference;
		return this;
	} 

	public boolean getDefaultPaymentMean() { 
		return this.defaultPaymentMean;
	} 

	public void setDefaultPaymentMean(boolean defaultPaymentMean) { 
		this.defaultPaymentMean = defaultPaymentMean;
	} 

	public BankAccountImpl defaultPaymentMean(boolean defaultPaymentMean) { 
		this.defaultPaymentMean = defaultPaymentMean;
		return this;
	} 

	public java.lang.String getDescription() { 
		return this.description;
	} 

	public void setDescription(java.lang.String description) { 
		this.description = description;
	} 

	public BankAccountImpl description(java.lang.String description) { 
		this.description = description;
		return this;
	} 

	public java.lang.String getState() { 
		return this.state;
	} 

	public void setState(java.lang.String state) { 
		this.state = state;
	} 

	public BankAccountImpl state(java.lang.String state) { 
		this.state = state;
		return this;
	} 

	public java.util.Date getMandateSignatureDate() { 
		return this.mandateSignatureDate;
	} 

	public void setMandateSignatureDate(java.util.Date mandateSignatureDate) { 
		this.mandateSignatureDate = mandateSignatureDate;
	} 

	public BankAccountImpl mandateSignatureDate(java.util.Date mandateSignatureDate) { 
		this.mandateSignatureDate = mandateSignatureDate;
		return this;
	} 

	public java.lang.String getIban() { 
		return this.iban;
	} 

	public void setIban(java.lang.String iban) { 
		this.iban = iban;
	} 

	public BankAccountImpl iban(java.lang.String iban) { 
		this.iban = iban;
		return this;
	} 

	public java.lang.String getOwnerName() { 
		return this.ownerName;
	} 

	public void setOwnerName(java.lang.String ownerName) { 
		this.ownerName = ownerName;
	} 

	public BankAccountImpl ownerName(java.lang.String ownerName) { 
		this.ownerName = ownerName;
		return this;
	} 

	public java.lang.String getOwnerAddress() { 
		return this.ownerAddress;
	} 

	public void setOwnerAddress(java.lang.String ownerAddress) { 
		this.ownerAddress = ownerAddress;
	} 

	public BankAccountImpl ownerAddress(java.lang.String ownerAddress) { 
		this.ownerAddress = ownerAddress;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public BankAccountImpl id(long id) { 
		this.id = id;
		return this;
	} 

}
