package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Detailed informations related to this number
 */

public class DetailedRateCodeInformation { 

	private net.zyuiop.ovhapi.api.objects.order.Price pricePerCallWithoutTax;
	private net.zyuiop.ovhapi.api.objects.order.Price repaymentPricePerCallWithoutTax;
	private java.lang.String rateCode;
	private net.zyuiop.ovhapi.api.objects.order.Price pricePerMinuteWithoutTax;
	private java.util.Date cancelLimitDatetime;
	private net.zyuiop.ovhapi.api.objects.order.Price repaymentPricePerMinuteWithoutTax;
	private net.zyuiop.ovhapi.api.objects.order.Price updateRateCodePriceWithoutTax;
	private java.util.Date effectiveDatetime;

	public DetailedRateCodeInformation() {
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getPricePerCallWithoutTax() { 
		return this.pricePerCallWithoutTax;
	} 

	public void setPricePerCallWithoutTax(net.zyuiop.ovhapi.api.objects.order.Price pricePerCallWithoutTax) { 
		this.pricePerCallWithoutTax = pricePerCallWithoutTax;
	} 

	public DetailedRateCodeInformation pricePerCallWithoutTax(net.zyuiop.ovhapi.api.objects.order.Price pricePerCallWithoutTax) { 
		this.pricePerCallWithoutTax = pricePerCallWithoutTax;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.order.Price getRepaymentPricePerCallWithoutTax() { 
		return this.repaymentPricePerCallWithoutTax;
	} 

	public void setRepaymentPricePerCallWithoutTax(net.zyuiop.ovhapi.api.objects.order.Price repaymentPricePerCallWithoutTax) { 
		this.repaymentPricePerCallWithoutTax = repaymentPricePerCallWithoutTax;
	} 

	public DetailedRateCodeInformation repaymentPricePerCallWithoutTax(net.zyuiop.ovhapi.api.objects.order.Price repaymentPricePerCallWithoutTax) { 
		this.repaymentPricePerCallWithoutTax = repaymentPricePerCallWithoutTax;
		return this;
	} 

	public java.lang.String getRateCode() { 
		return this.rateCode;
	} 

	public void setRateCode(java.lang.String rateCode) { 
		this.rateCode = rateCode;
	} 

	public DetailedRateCodeInformation rateCode(java.lang.String rateCode) { 
		this.rateCode = rateCode;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.order.Price getPricePerMinuteWithoutTax() { 
		return this.pricePerMinuteWithoutTax;
	} 

	public void setPricePerMinuteWithoutTax(net.zyuiop.ovhapi.api.objects.order.Price pricePerMinuteWithoutTax) { 
		this.pricePerMinuteWithoutTax = pricePerMinuteWithoutTax;
	} 

	public DetailedRateCodeInformation pricePerMinuteWithoutTax(net.zyuiop.ovhapi.api.objects.order.Price pricePerMinuteWithoutTax) { 
		this.pricePerMinuteWithoutTax = pricePerMinuteWithoutTax;
		return this;
	} 

	public java.util.Date getCancelLimitDatetime() { 
		return this.cancelLimitDatetime;
	} 

	public void setCancelLimitDatetime(java.util.Date cancelLimitDatetime) { 
		this.cancelLimitDatetime = cancelLimitDatetime;
	} 

	public DetailedRateCodeInformation cancelLimitDatetime(java.util.Date cancelLimitDatetime) { 
		this.cancelLimitDatetime = cancelLimitDatetime;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.order.Price getRepaymentPricePerMinuteWithoutTax() { 
		return this.repaymentPricePerMinuteWithoutTax;
	} 

	public void setRepaymentPricePerMinuteWithoutTax(net.zyuiop.ovhapi.api.objects.order.Price repaymentPricePerMinuteWithoutTax) { 
		this.repaymentPricePerMinuteWithoutTax = repaymentPricePerMinuteWithoutTax;
	} 

	public DetailedRateCodeInformation repaymentPricePerMinuteWithoutTax(net.zyuiop.ovhapi.api.objects.order.Price repaymentPricePerMinuteWithoutTax) { 
		this.repaymentPricePerMinuteWithoutTax = repaymentPricePerMinuteWithoutTax;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.order.Price getUpdateRateCodePriceWithoutTax() { 
		return this.updateRateCodePriceWithoutTax;
	} 

	public void setUpdateRateCodePriceWithoutTax(net.zyuiop.ovhapi.api.objects.order.Price updateRateCodePriceWithoutTax) { 
		this.updateRateCodePriceWithoutTax = updateRateCodePriceWithoutTax;
	} 

	public DetailedRateCodeInformation updateRateCodePriceWithoutTax(net.zyuiop.ovhapi.api.objects.order.Price updateRateCodePriceWithoutTax) { 
		this.updateRateCodePriceWithoutTax = updateRateCodePriceWithoutTax;
		return this;
	} 

	public java.util.Date getEffectiveDatetime() { 
		return this.effectiveDatetime;
	} 

	public void setEffectiveDatetime(java.util.Date effectiveDatetime) { 
		this.effectiveDatetime = effectiveDatetime;
	} 

	public DetailedRateCodeInformation effectiveDatetime(java.util.Date effectiveDatetime) { 
		this.effectiveDatetime = effectiveDatetime;
		return this;
	} 

}
