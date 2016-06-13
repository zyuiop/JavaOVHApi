package net.zyuiop.ovhapi.impl.objects.billing;

import net.zyuiop.ovhapi.api.objects.billing.FidelityMovement;
/**
 * Details about a fidelity account
 */

public class FidelityMovementImpl implements FidelityMovement { 

	private long movementId;
	private java.util.Date date;
	private java.lang.String description;
	private long amount;
	private long balance;
	private long order;
	private java.lang.String operation;
	private long previousBalance;

	public FidelityMovementImpl() {
	}

	public long getMovementId() { 
		return this.movementId;
	} 

	public void setMovementId(long movementId) { 
		this.movementId = movementId;
	} 

	public FidelityMovementImpl movementId(long movementId) { 
		this.movementId = movementId;
		return this;
	} 

	public java.util.Date getDate() { 
		return this.date;
	} 

	public void setDate(java.util.Date date) { 
		this.date = date;
	} 

	public FidelityMovementImpl date(java.util.Date date) { 
		this.date = date;
		return this;
	} 

	public java.lang.String getDescription() { 
		return this.description;
	} 

	public void setDescription(java.lang.String description) { 
		this.description = description;
	} 

	public FidelityMovementImpl description(java.lang.String description) { 
		this.description = description;
		return this;
	} 

	public long getAmount() { 
		return this.amount;
	} 

	public void setAmount(long amount) { 
		this.amount = amount;
	} 

	public FidelityMovementImpl amount(long amount) { 
		this.amount = amount;
		return this;
	} 

	public long getBalance() { 
		return this.balance;
	} 

	public void setBalance(long balance) { 
		this.balance = balance;
	} 

	public FidelityMovementImpl balance(long balance) { 
		this.balance = balance;
		return this;
	} 

	public long getOrder() { 
		return this.order;
	} 

	public void setOrder(long order) { 
		this.order = order;
	} 

	public FidelityMovementImpl order(long order) { 
		this.order = order;
		return this;
	} 

	public java.lang.String getOperation() { 
		return this.operation;
	} 

	public void setOperation(java.lang.String operation) { 
		this.operation = operation;
	} 

	public FidelityMovementImpl operation(java.lang.String operation) { 
		this.operation = operation;
		return this;
	} 

	public long getPreviousBalance() { 
		return this.previousBalance;
	} 

	public void setPreviousBalance(long previousBalance) { 
		this.previousBalance = previousBalance;
	} 

	public FidelityMovementImpl previousBalance(long previousBalance) { 
		this.previousBalance = previousBalance;
		return this;
	} 

}
