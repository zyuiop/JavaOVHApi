package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Informations related to the rate code
 */

public class RateCodeInformation { 

	private net.zyuiop.ovhapi.api.objects.order.Price pricePerCallWithoutTax;
	private java.lang.String code;
	private net.zyuiop.ovhapi.api.objects.order.Price pricePerMinuteWithoutTax;

	public RateCodeInformation() {
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getPricePerCallWithoutTax() { 
		return this.pricePerCallWithoutTax;
	} 

	public void setPricePerCallWithoutTax(net.zyuiop.ovhapi.api.objects.order.Price pricePerCallWithoutTax) { 
		this.pricePerCallWithoutTax = pricePerCallWithoutTax;
	} 

	public RateCodeInformation pricePerCallWithoutTax(net.zyuiop.ovhapi.api.objects.order.Price pricePerCallWithoutTax) { 
		this.pricePerCallWithoutTax = pricePerCallWithoutTax;
		return this;
	} 

	public java.lang.String getCode() { 
		return this.code;
	} 

	public void setCode(java.lang.String code) { 
		this.code = code;
	} 

	public RateCodeInformation code(java.lang.String code) { 
		this.code = code;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.order.Price getPricePerMinuteWithoutTax() { 
		return this.pricePerMinuteWithoutTax;
	} 

	public void setPricePerMinuteWithoutTax(net.zyuiop.ovhapi.api.objects.order.Price pricePerMinuteWithoutTax) { 
		this.pricePerMinuteWithoutTax = pricePerMinuteWithoutTax;
	} 

	public RateCodeInformation pricePerMinuteWithoutTax(net.zyuiop.ovhapi.api.objects.order.Price pricePerMinuteWithoutTax) { 
		this.pricePerMinuteWithoutTax = pricePerMinuteWithoutTax;
		return this;
	} 

}
