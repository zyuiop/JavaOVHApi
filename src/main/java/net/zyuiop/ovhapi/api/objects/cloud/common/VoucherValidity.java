package net.zyuiop.ovhapi.api.objects.cloud.common;

/**
 * Voucher validity range
 */

public class VoucherValidity { 

	private java.util.Date to;
	private java.util.Date from;

	public VoucherValidity() {
	}

	public java.util.Date getTo() { 
		return this.to;
	} 

	public void setTo(java.util.Date to) { 
		this.to = to;
	} 

	public VoucherValidity to(java.util.Date to) { 
		this.to = to;
		return this;
	} 

	public java.util.Date getFrom() { 
		return this.from;
	} 

	public void setFrom(java.util.Date from) { 
		this.from = from;
	} 

	public VoucherValidity from(java.util.Date from) { 
		this.from = from;
		return this;
	} 

}
