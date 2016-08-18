package net.zyuiop.ovhapi.api.objects.billing;

/**
 * Details about a voucher account
 */

public class VoucherMovement { 

	private long movementId;
	private java.util.Date date;
	private java.lang.String description;
	private net.zyuiop.ovhapi.api.objects.order.Price amount;
	private net.zyuiop.ovhapi.api.objects.order.Price balance;
	private long order;
	private java.lang.String operation;
	private net.zyuiop.ovhapi.api.objects.order.Price previousBalance;

	public VoucherMovement() {
	}

	public long getMovementId() { 
		return this.movementId;
	} 

	public void setMovementId(long movementId) { 
		this.movementId = movementId;
	} 

	public VoucherMovement movementId(long movementId) { 
		this.movementId = movementId;
		return this;
	} 

	public java.util.Date getDate() { 
		return this.date;
	} 

	public void setDate(java.util.Date date) { 
		this.date = date;
	} 

	public VoucherMovement date(java.util.Date date) { 
		this.date = date;
		return this;
	} 

	public java.lang.String getDescription() { 
		return this.description;
	} 

	public void setDescription(java.lang.String description) { 
		this.description = description;
	} 

	public VoucherMovement description(java.lang.String description) { 
		this.description = description;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.order.Price getAmount() { 
		return this.amount;
	} 

	public void setAmount(net.zyuiop.ovhapi.api.objects.order.Price amount) { 
		this.amount = amount;
	} 

	public VoucherMovement amount(net.zyuiop.ovhapi.api.objects.order.Price amount) { 
		this.amount = amount;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.order.Price getBalance() { 
		return this.balance;
	} 

	public void setBalance(net.zyuiop.ovhapi.api.objects.order.Price balance) { 
		this.balance = balance;
	} 

	public VoucherMovement balance(net.zyuiop.ovhapi.api.objects.order.Price balance) { 
		this.balance = balance;
		return this;
	} 

	public long getOrder() { 
		return this.order;
	} 

	public void setOrder(long order) { 
		this.order = order;
	} 

	public VoucherMovement order(long order) { 
		this.order = order;
		return this;
	} 

	public java.lang.String getOperation() { 
		return this.operation;
	} 

	public void setOperation(java.lang.String operation) { 
		this.operation = operation;
	} 

	public VoucherMovement operation(java.lang.String operation) { 
		this.operation = operation;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.order.Price getPreviousBalance() { 
		return this.previousBalance;
	} 

	public void setPreviousBalance(net.zyuiop.ovhapi.api.objects.order.Price previousBalance) { 
		this.previousBalance = previousBalance;
	} 

	public VoucherMovement previousBalance(net.zyuiop.ovhapi.api.objects.order.Price previousBalance) { 
		this.previousBalance = previousBalance;
		return this;
	} 

}
