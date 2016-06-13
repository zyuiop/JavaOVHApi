package net.zyuiop.ovhapi.impl.objects.cloud.common;

import net.zyuiop.ovhapi.api.objects.cloud.common.VoucherValidity;
/**
 * Voucher validity range
 */

public class VoucherValidityImpl implements VoucherValidity { 

	private java.util.Date to;
	private java.util.Date from;

	public VoucherValidityImpl() {
	}

	public java.util.Date getTo() { 
		return this.to;
	} 

	public void setTo(java.util.Date to) { 
		this.to = to;
	} 

	public VoucherValidityImpl to(java.util.Date to) { 
		this.to = to;
		return this;
	} 

	public java.util.Date getFrom() { 
		return this.from;
	} 

	public void setFrom(java.util.Date from) { 
		this.from = from;
	} 

	public VoucherValidityImpl from(java.util.Date from) { 
		this.from = from;
		return this;
	} 

}
