package net.zyuiop.ovhapi.api.objects.billing;

/**
 * Credit card informations
 */

public class CreditCard { 

	private java.lang.String number;
	private boolean threeDsValidated;
	private long id;
	private java.lang.String type;
	private java.util.Date expirationDate;
	private boolean defaultPaymentMean;
	private java.lang.String description;

	public CreditCard() {
	}

	public java.lang.String getNumber() { 
		return this.number;
	} 

	public void setNumber(java.lang.String number) { 
		this.number = number;
	} 

	public CreditCard number(java.lang.String number) { 
		this.number = number;
		return this;
	} 

	public boolean getThreeDsValidated() { 
		return this.threeDsValidated;
	} 

	public void setThreeDsValidated(boolean threeDsValidated) { 
		this.threeDsValidated = threeDsValidated;
	} 

	public CreditCard threeDsValidated(boolean threeDsValidated) { 
		this.threeDsValidated = threeDsValidated;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public CreditCard id(long id) { 
		this.id = id;
		return this;
	} 

	public java.lang.String getType() { 
		return this.type;
	} 

	public void setType(java.lang.String type) { 
		this.type = type;
	} 

	public CreditCard type(java.lang.String type) { 
		this.type = type;
		return this;
	} 

	public java.util.Date getExpirationDate() { 
		return this.expirationDate;
	} 

	public void setExpirationDate(java.util.Date expirationDate) { 
		this.expirationDate = expirationDate;
	} 

	public CreditCard expirationDate(java.util.Date expirationDate) { 
		this.expirationDate = expirationDate;
		return this;
	} 

	public boolean getDefaultPaymentMean() { 
		return this.defaultPaymentMean;
	} 

	public void setDefaultPaymentMean(boolean defaultPaymentMean) { 
		this.defaultPaymentMean = defaultPaymentMean;
	} 

	public CreditCard defaultPaymentMean(boolean defaultPaymentMean) { 
		this.defaultPaymentMean = defaultPaymentMean;
		return this;
	} 

	public java.lang.String getDescription() { 
		return this.description;
	} 

	public void setDescription(java.lang.String description) { 
		this.description = description;
	} 

	public CreditCard description(java.lang.String description) { 
		this.description = description;
		return this;
	} 

}
