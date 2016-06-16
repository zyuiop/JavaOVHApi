package net.zyuiop.ovhapi.impl.objects.billing;

import net.zyuiop.ovhapi.api.objects.billing.VoucherAccount;
/**
 * Details about a Voucher account
 */

public class VoucherAccountImpl implements VoucherAccount { 

	private java.lang.String voucherAccountId;
	private net.zyuiop.ovhapi.impl.objects.order.PriceImpl balance;
	private java.util.Date lastUpdate;
	private java.util.Date openDate;

	public VoucherAccountImpl() {
	}

	public java.lang.String getVoucherAccountId() { 
		return this.voucherAccountId;
	} 

	public void setVoucherAccountId(java.lang.String voucherAccountId) { 
		this.voucherAccountId = voucherAccountId;
	} 

	public VoucherAccountImpl voucherAccountId(java.lang.String voucherAccountId) { 
		this.voucherAccountId = voucherAccountId;
		return this;
	} 

	public net.zyuiop.ovhapi.impl.objects.order.PriceImpl getBalance() { 
		return this.balance;
	} 

	public void setBalance(net.zyuiop.ovhapi.impl.objects.order.PriceImpl balance) { 
		this.balance = balance;
	} 

	public VoucherAccountImpl balance(net.zyuiop.ovhapi.impl.objects.order.PriceImpl balance) { 
		this.balance = balance;
		return this;
	} 

	public java.util.Date getLastUpdate() { 
		return this.lastUpdate;
	} 

	public void setLastUpdate(java.util.Date lastUpdate) { 
		this.lastUpdate = lastUpdate;
	} 

	public VoucherAccountImpl lastUpdate(java.util.Date lastUpdate) { 
		this.lastUpdate = lastUpdate;
		return this;
	} 

	public java.util.Date getOpenDate() { 
		return this.openDate;
	} 

	public void setOpenDate(java.util.Date openDate) { 
		this.openDate = openDate;
	} 

	public VoucherAccountImpl openDate(java.util.Date openDate) { 
		this.openDate = openDate;
		return this;
	} 

}
