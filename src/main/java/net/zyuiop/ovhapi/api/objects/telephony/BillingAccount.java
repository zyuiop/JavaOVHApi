package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Billing Account
 */

public interface BillingAccount { 

	/**
	 * @return Allowed outplan
	 */
	net.zyuiop.ovhapi.api.objects.order.Price getAllowedOutplan(); 

	/**
	 * @return Security deposit amount
	 */
	net.zyuiop.ovhapi.api.objects.order.Price getSecurityDeposit(); 

	/**
	 * @return Current status of billing account
	 */
	java.lang.String getStatus(); 

	/**
	 * @return Allowed threshold credit
	 */
	net.zyuiop.ovhapi.api.objects.order.Price getCreditThreshold(); 

	/**
	 * @return Current outplan
	 */
	net.zyuiop.ovhapi.api.objects.order.Price getCurrentOutplan(); 

	/**
	 * @return Description of the billing account
	 */
	java.lang.String getDescription(); 

}
