package net.zyuiop.ovhapi.impl.objects.billing;

import net.zyuiop.ovhapi.api.objects.billing.VoucherMovement;
/**
 * Details about a voucher account
 */

public class VoucherMovementImpl implements VoucherMovement { 

	private long movementId;
	private java.util.Date date;
	private java.lang.String description;
	private net.zyuiop.ovhapi.impl.objects.order.PriceImpl amount;
	private net.zyuiop.ovhapi.impl.objects.order.PriceImpl balance;
	private long order;
	private java.lang.String operation;
	private net.zyuiop.ovhapi.impl.objects.order.PriceImpl previousBalance;

	public VoucherMovementImpl() {
	}

	public long getMovementId() { 
		return this.movementId;
	} 

	public void setMovementId(long movementId) { 
		this.movementId = movementId;
	} 

	public VoucherMovementImpl movementId(long movementId) { 
		this.movementId = movementId;
		return this;
	} 

	public java.util.Date getDate() { 
		return this.date;
	} 

	public void setDate(java.util.Date date) { 
		this.date = date;
	} 

	public VoucherMovementImpl date(java.util.Date date) { 
		this.date = date;
		return this;
	} 

	public java.lang.String getDescription() { 
		return this.description;
	} 

	public void setDescription(java.lang.String description) { 
		this.description = description;
	} 

	public VoucherMovementImpl description(java.lang.String description) { 
		this.description = description;
		return this;
	} 

	public net.zyuiop.ovhapi.impl.objects.order.PriceImpl getAmount() { 
		return this.amount;
	} 

	public void setAmount(net.zyuiop.ovhapi.impl.objects.order.PriceImpl amount) { 
		this.amount = amount;
	} 

	public VoucherMovementImpl amount(net.zyuiop.ovhapi.impl.objects.order.PriceImpl amount) { 
		this.amount = amount;
		return this;
	} 

	public net.zyuiop.ovhapi.impl.objects.order.PriceImpl getBalance() { 
		return this.balance;
	} 

	public void setBalance(net.zyuiop.ovhapi.impl.objects.order.PriceImpl balance) { 
		this.balance = balance;
	} 

	public VoucherMovementImpl balance(net.zyuiop.ovhapi.impl.objects.order.PriceImpl balance) { 
		this.balance = balance;
		return this;
	} 

	public long getOrder() { 
		return this.order;
	} 

	public void setOrder(long order) { 
		this.order = order;
	} 

	public VoucherMovementImpl order(long order) { 
		this.order = order;
		return this;
	} 

	public java.lang.String getOperation() { 
		return this.operation;
	} 

	public void setOperation(java.lang.String operation) { 
		this.operation = operation;
	} 

	public VoucherMovementImpl operation(java.lang.String operation) { 
		this.operation = operation;
		return this;
	} 

	public net.zyuiop.ovhapi.impl.objects.order.PriceImpl getPreviousBalance() { 
		return this.previousBalance;
	} 

	public void setPreviousBalance(net.zyuiop.ovhapi.impl.objects.order.PriceImpl previousBalance) { 
		this.previousBalance = previousBalance;
	} 

	public VoucherMovementImpl previousBalance(net.zyuiop.ovhapi.impl.objects.order.PriceImpl previousBalance) { 
		this.previousBalance = previousBalance;
		return this;
	} 

}
