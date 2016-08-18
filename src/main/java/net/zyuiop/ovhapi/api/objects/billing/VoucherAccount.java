package net.zyuiop.ovhapi.api.objects.billing;

/**
 * Details about a Voucher account
 */

public class VoucherAccount { 

	private java.lang.String voucherAccountId;
	private net.zyuiop.ovhapi.api.objects.order.Price balance;
	private java.util.Date lastUpdate;
	private java.util.Date openDate;

	public VoucherAccount() {
	}

	public java.lang.String getVoucherAccountId() { 
		return this.voucherAccountId;
	} 

	public void setVoucherAccountId(java.lang.String voucherAccountId) { 
		this.voucherAccountId = voucherAccountId;
	} 

	public VoucherAccount voucherAccountId(java.lang.String voucherAccountId) { 
		this.voucherAccountId = voucherAccountId;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.order.Price getBalance() { 
		return this.balance;
	} 

	public void setBalance(net.zyuiop.ovhapi.api.objects.order.Price balance) { 
		this.balance = balance;
	} 

	public VoucherAccount balance(net.zyuiop.ovhapi.api.objects.order.Price balance) { 
		this.balance = balance;
		return this;
	} 

	public java.util.Date getLastUpdate() { 
		return this.lastUpdate;
	} 

	public void setLastUpdate(java.util.Date lastUpdate) { 
		this.lastUpdate = lastUpdate;
	} 

	public VoucherAccount lastUpdate(java.util.Date lastUpdate) { 
		this.lastUpdate = lastUpdate;
		return this;
	} 

	public java.util.Date getOpenDate() { 
		return this.openDate;
	} 

	public void setOpenDate(java.util.Date openDate) { 
		this.openDate = openDate;
	} 

	public VoucherAccount openDate(java.util.Date openDate) { 
		this.openDate = openDate;
		return this;
	} 

}
