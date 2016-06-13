package net.zyuiop.ovhapi.api.objects.cloud.project;

/**
 * Credit details
 */

public interface NewProjectCredit { 

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
	 * @return Credit description
	 */
	java.lang.String getDescription(); 

	/**
	 * @return Use credits on following products
	 */
	java.lang.String getProducts(); 

}
