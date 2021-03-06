package net.zyuiop.ovhapi.api.objects.billing;

/**
 * Details about an OVH account
 */

public class Movement { 

	private long movementId;
	private java.util.Date date;
	private java.lang.String description;
	private net.zyuiop.ovhapi.api.objects.order.Price amount;
	private net.zyuiop.ovhapi.api.objects.order.Price balance;
	private long order;
	private java.lang.String operation;
	private net.zyuiop.ovhapi.api.objects.order.Price previousBalance;

	public Movement() {
	}

	public long getMovementId() { 
		return this.movementId;
	} 

	public void setMovementId(long movementId) { 
		this.movementId = movementId;
	} 

	public Movement movementId(long movementId) { 
		this.movementId = movementId;
		return this;
	} 

	public java.util.Date getDate() { 
		return this.date;
	} 

	public void setDate(java.util.Date date) { 
		this.date = date;
	} 

	public Movement date(java.util.Date date) { 
		this.date = date;
		return this;
	} 

	public java.lang.String getDescription() { 
		return this.description;
	} 

	public void setDescription(java.lang.String description) { 
		this.description = description;
	} 

	public Movement description(java.lang.String description) { 
		this.description = description;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.order.Price getAmount() { 
		return this.amount;
	} 

	public void setAmount(net.zyuiop.ovhapi.api.objects.order.Price amount) { 
		this.amount = amount;
	} 

	public Movement amount(net.zyuiop.ovhapi.api.objects.order.Price amount) { 
		this.amount = amount;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.order.Price getBalance() { 
		return this.balance;
	} 

	public void setBalance(net.zyuiop.ovhapi.api.objects.order.Price balance) { 
		this.balance = balance;
	} 

	public Movement balance(net.zyuiop.ovhapi.api.objects.order.Price balance) { 
		this.balance = balance;
		return this;
	} 

	public long getOrder() { 
		return this.order;
	} 

	public void setOrder(long order) { 
		this.order = order;
	} 

	public Movement order(long order) { 
		this.order = order;
		return this;
	} 

	public java.lang.String getOperation() { 
		return this.operation;
	} 

	public void setOperation(java.lang.String operation) { 
		this.operation = operation;
	} 

	public Movement operation(java.lang.String operation) { 
		this.operation = operation;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.order.Price getPreviousBalance() { 
		return this.previousBalance;
	} 

	public void setPreviousBalance(net.zyuiop.ovhapi.api.objects.order.Price previousBalance) { 
		this.previousBalance = previousBalance;
	} 

	public Movement previousBalance(net.zyuiop.ovhapi.api.objects.order.Price previousBalance) { 
		this.previousBalance = previousBalance;
		return this;
	} 

}
