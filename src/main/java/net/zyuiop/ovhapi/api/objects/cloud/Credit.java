package net.zyuiop.ovhapi.api.objects.cloud;

/**
 * Cloud credit
 */

public interface Credit { 

	/**
	 * @return Voucher code
	 */
	java.lang.String getVoucher(); 

	/**
	 * @return Credit description
	 */
	java.lang.String getDescription(); 

	/**
	 * @return Used credit
	 */
	net.zyuiop.ovhapi.api.objects.order.Price getUsed_credit(); 

	/**
	 * @return Available credit
	 */
	net.zyuiop.ovhapi.api.objects.order.Price getAvailable_credit(); 

	/**
	 * @return Total credit
	 */
	net.zyuiop.ovhapi.api.objects.order.Price getTotal_credit(); 

	/**
	 * @return Credit validity
	 */
	net.zyuiop.ovhapi.api.objects.cloud.common.VoucherValidity getValidity(); 

	/**
	 * @return Credit id
	 */
	long getId(); 

	/**
	 * @return Credit bill id
	 */
	java.lang.String getBill(); 

	/**
	 * @return Use credits on following products
	 */
	java.lang.String[] getProducts(); 

}
