package net.zyuiop.ovhapi.impl.objects.nichandle;

import net.zyuiop.ovhapi.api.objects.nichandle.VoucherStatus;
/**
 * Voucher Status and Information
 */

public class VoucherStatusImpl implements VoucherStatus { 

	private boolean validity;

	public VoucherStatusImpl() {
	}

	public boolean getValidity() { 
		return this.validity;
	} 

	public void setValidity(boolean validity) { 
		this.validity = validity;
	} 

	public VoucherStatusImpl validity(boolean validity) { 
		this.validity = validity;
		return this;
	} 

}
