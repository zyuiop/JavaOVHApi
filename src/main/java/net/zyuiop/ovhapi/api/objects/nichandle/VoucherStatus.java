package net.zyuiop.ovhapi.api.objects.nichandle;

/**
 * Voucher Status and Information
 */

public class VoucherStatus { 

	private boolean validity;

	public VoucherStatus() {
	}

	public boolean getValidity() { 
		return this.validity;
	} 

	public void setValidity(boolean validity) { 
		this.validity = validity;
	} 

	public VoucherStatus validity(boolean validity) { 
		this.validity = validity;
		return this;
	} 

}
