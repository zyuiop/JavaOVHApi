package net.zyuiop.ovhapi.impl.objects.telephony;

import net.zyuiop.ovhapi.api.objects.telephony.DetailedRateCodeInformation;
/**
 * Detailed informations related to this number
 */

public class DetailedRateCodeInformationImpl implements DetailedRateCodeInformation { 

	private net.zyuiop.ovhapi.impl.objects.order.PriceImpl pricePerCallWithoutTax;
	private net.zyuiop.ovhapi.impl.objects.order.PriceImpl repaymentPricePerCallWithoutTax;
	private java.lang.String rateCode;
	private net.zyuiop.ovhapi.impl.objects.order.PriceImpl pricePerMinuteWithoutTax;
	private java.util.Date cancelLimitDatetime;
	private net.zyuiop.ovhapi.impl.objects.order.PriceImpl repaymentPricePerMinuteWithoutTax;
	private net.zyuiop.ovhapi.impl.objects.order.PriceImpl updateRateCodePriceWithoutTax;
	private java.util.Date effectiveDatetime;

	public DetailedRateCodeInformationImpl() {
	}

	public net.zyuiop.ovhapi.impl.objects.order.PriceImpl getPricePerCallWithoutTax() { 
		return this.pricePerCallWithoutTax;
	} 

	public void setPricePerCallWithoutTax(net.zyuiop.ovhapi.impl.objects.order.PriceImpl pricePerCallWithoutTax) { 
		this.pricePerCallWithoutTax = pricePerCallWithoutTax;
	} 

	public DetailedRateCodeInformationImpl pricePerCallWithoutTax(net.zyuiop.ovhapi.impl.objects.order.PriceImpl pricePerCallWithoutTax) { 
		this.pricePerCallWithoutTax = pricePerCallWithoutTax;
		return this;
	} 

	public net.zyuiop.ovhapi.impl.objects.order.PriceImpl getRepaymentPricePerCallWithoutTax() { 
		return this.repaymentPricePerCallWithoutTax;
	} 

	public void setRepaymentPricePerCallWithoutTax(net.zyuiop.ovhapi.impl.objects.order.PriceImpl repaymentPricePerCallWithoutTax) { 
		this.repaymentPricePerCallWithoutTax = repaymentPricePerCallWithoutTax;
	} 

	public DetailedRateCodeInformationImpl repaymentPricePerCallWithoutTax(net.zyuiop.ovhapi.impl.objects.order.PriceImpl repaymentPricePerCallWithoutTax) { 
		this.repaymentPricePerCallWithoutTax = repaymentPricePerCallWithoutTax;
		return this;
	} 

	public java.lang.String getRateCode() { 
		return this.rateCode;
	} 

	public void setRateCode(java.lang.String rateCode) { 
		this.rateCode = rateCode;
	} 

	public DetailedRateCodeInformationImpl rateCode(java.lang.String rateCode) { 
		this.rateCode = rateCode;
		return this;
	} 

	public net.zyuiop.ovhapi.impl.objects.order.PriceImpl getPricePerMinuteWithoutTax() { 
		return this.pricePerMinuteWithoutTax;
	} 

	public void setPricePerMinuteWithoutTax(net.zyuiop.ovhapi.impl.objects.order.PriceImpl pricePerMinuteWithoutTax) { 
		this.pricePerMinuteWithoutTax = pricePerMinuteWithoutTax;
	} 

	public DetailedRateCodeInformationImpl pricePerMinuteWithoutTax(net.zyuiop.ovhapi.impl.objects.order.PriceImpl pricePerMinuteWithoutTax) { 
		this.pricePerMinuteWithoutTax = pricePerMinuteWithoutTax;
		return this;
	} 

	public java.util.Date getCancelLimitDatetime() { 
		return this.cancelLimitDatetime;
	} 

	public void setCancelLimitDatetime(java.util.Date cancelLimitDatetime) { 
		this.cancelLimitDatetime = cancelLimitDatetime;
	} 

	public DetailedRateCodeInformationImpl cancelLimitDatetime(java.util.Date cancelLimitDatetime) { 
		this.cancelLimitDatetime = cancelLimitDatetime;
		return this;
	} 

	public net.zyuiop.ovhapi.impl.objects.order.PriceImpl getRepaymentPricePerMinuteWithoutTax() { 
		return this.repaymentPricePerMinuteWithoutTax;
	} 

	public void setRepaymentPricePerMinuteWithoutTax(net.zyuiop.ovhapi.impl.objects.order.PriceImpl repaymentPricePerMinuteWithoutTax) { 
		this.repaymentPricePerMinuteWithoutTax = repaymentPricePerMinuteWithoutTax;
	} 

	public DetailedRateCodeInformationImpl repaymentPricePerMinuteWithoutTax(net.zyuiop.ovhapi.impl.objects.order.PriceImpl repaymentPricePerMinuteWithoutTax) { 
		this.repaymentPricePerMinuteWithoutTax = repaymentPricePerMinuteWithoutTax;
		return this;
	} 

	public net.zyuiop.ovhapi.impl.objects.order.PriceImpl getUpdateRateCodePriceWithoutTax() { 
		return this.updateRateCodePriceWithoutTax;
	} 

	public void setUpdateRateCodePriceWithoutTax(net.zyuiop.ovhapi.impl.objects.order.PriceImpl updateRateCodePriceWithoutTax) { 
		this.updateRateCodePriceWithoutTax = updateRateCodePriceWithoutTax;
	} 

	public DetailedRateCodeInformationImpl updateRateCodePriceWithoutTax(net.zyuiop.ovhapi.impl.objects.order.PriceImpl updateRateCodePriceWithoutTax) { 
		this.updateRateCodePriceWithoutTax = updateRateCodePriceWithoutTax;
		return this;
	} 

	public java.util.Date getEffectiveDatetime() { 
		return this.effectiveDatetime;
	} 

	public void setEffectiveDatetime(java.util.Date effectiveDatetime) { 
		this.effectiveDatetime = effectiveDatetime;
	} 

	public DetailedRateCodeInformationImpl effectiveDatetime(java.util.Date effectiveDatetime) { 
		this.effectiveDatetime = effectiveDatetime;
		return this;
	} 

}
