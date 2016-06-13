package net.zyuiop.ovhapi.api.objects.cloud.common;

/**
 * Voucher validity range
 */

public interface VoucherValidity { 

	/**
	 * @return Valid to
	 */
	java.util.Date getTo(); 

	/**
	 * @return Valid from
	 */
	java.util.Date getFrom(); 

}
