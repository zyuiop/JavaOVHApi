package net.zyuiop.ovhapi.impl.objects.telephony;

import net.zyuiop.ovhapi.api.objects.telephony.RateCodeInformation;
/**
 * Informations related to the rate code
 */

public class RateCodeInformationImpl implements RateCodeInformation { 

	private net.zyuiop.ovhapi.api.objects.order.Price pricePerCallWithoutTax;
	private java.lang.String code;
	private net.zyuiop.ovhapi.api.objects.order.Price pricePerMinuteWithoutTax;

	public RateCodeInformationImpl() {
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getPricePerCallWithoutTax() { 
		return this.pricePerCallWithoutTax;
	} 

	public void setPricePerCallWithoutTax(net.zyuiop.ovhapi.api.objects.order.Price pricePerCallWithoutTax) { 
		this.pricePerCallWithoutTax = pricePerCallWithoutTax;
	} 

	public RateCodeInformationImpl pricePerCallWithoutTax(net.zyuiop.ovhapi.api.objects.order.Price pricePerCallWithoutTax) { 
		this.pricePerCallWithoutTax = pricePerCallWithoutTax;
		return this;
	} 

	public java.lang.String getCode() { 
		return this.code;
	} 

	public void setCode(java.lang.String code) { 
		this.code = code;
	} 

	public RateCodeInformationImpl code(java.lang.String code) { 
		this.code = code;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.order.Price getPricePerMinuteWithoutTax() { 
		return this.pricePerMinuteWithoutTax;
	} 

	public void setPricePerMinuteWithoutTax(net.zyuiop.ovhapi.api.objects.order.Price pricePerMinuteWithoutTax) { 
		this.pricePerMinuteWithoutTax = pricePerMinuteWithoutTax;
	} 

	public RateCodeInformationImpl pricePerMinuteWithoutTax(net.zyuiop.ovhapi.api.objects.order.Price pricePerMinuteWithoutTax) { 
		this.pricePerMinuteWithoutTax = pricePerMinuteWithoutTax;
		return this;
	} 

}
