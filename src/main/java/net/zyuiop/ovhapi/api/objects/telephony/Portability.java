package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Portability informations
 */

public class Portability { 

	private java.lang.String step;
	private double orderId;
	private java.lang.String reference;
	private java.lang.String billingAccount;
	private java.lang.String status;
	private java.util.Date todoDate;
	private double id;

	public Portability() {
	}

	public java.lang.String getStep() { 
		return this.step;
	} 

	public void setStep(java.lang.String step) { 
		this.step = step;
	} 

	public Portability step(java.lang.String step) { 
		this.step = step;
		return this;
	} 

	public double getOrderId() { 
		return this.orderId;
	} 

	public void setOrderId(double orderId) { 
		this.orderId = orderId;
	} 

	public Portability orderId(double orderId) { 
		this.orderId = orderId;
		return this;
	} 

	public java.lang.String getReference() { 
		return this.reference;
	} 

	public void setReference(java.lang.String reference) { 
		this.reference = reference;
	} 

	public Portability reference(java.lang.String reference) { 
		this.reference = reference;
		return this;
	} 

	public java.lang.String getBillingAccount() { 
		return this.billingAccount;
	} 

	public void setBillingAccount(java.lang.String billingAccount) { 
		this.billingAccount = billingAccount;
	} 

	public Portability billingAccount(java.lang.String billingAccount) { 
		this.billingAccount = billingAccount;
		return this;
	} 

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public Portability status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public java.util.Date getTodoDate() { 
		return this.todoDate;
	} 

	public void setTodoDate(java.util.Date todoDate) { 
		this.todoDate = todoDate;
	} 

	public Portability todoDate(java.util.Date todoDate) { 
		this.todoDate = todoDate;
		return this;
	} 

	public double getId() { 
		return this.id;
	} 

	public void setId(double id) { 
		this.id = id;
	} 

	public Portability id(double id) { 
		this.id = id;
		return this;
	} 

}
