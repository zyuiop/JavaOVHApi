package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Detailed informations related to this number
 */

public interface DetailedRateCodeInformation { 

	/**
	 * @return Price per call
	 */
	net.zyuiop.ovhapi.api.objects.order.Price getPricePerCallWithoutTax(); 

	/**
	 * @return Repayment per call
	 */
	net.zyuiop.ovhapi.api.objects.order.Price getRepaymentPricePerCallWithoutTax(); 

	/**
	 * @return Scheduled rate code
	 */
	java.lang.String getRateCode(); 

	/**
	 * @return Price in minute
	 */
	net.zyuiop.ovhapi.api.objects.order.Price getPricePerMinuteWithoutTax(); 

	/**
	 * @return Cancelable datetime deadline for the new scheduled rateCode
	 */
	java.util.Date getCancelLimitDatetime(); 

	/**
	 * @return Repayment per minute
	 */
	net.zyuiop.ovhapi.api.objects.order.Price getRepaymentPricePerMinuteWithoutTax(); 

	/**
	 * @return Fees concerning rateCode update
	 */
	net.zyuiop.ovhapi.api.objects.order.Price getUpdateRateCodePriceWithoutTax(); 

	/**
	 * @return Effective datetime
	 */
	java.util.Date getEffectiveDatetime(); 

}
