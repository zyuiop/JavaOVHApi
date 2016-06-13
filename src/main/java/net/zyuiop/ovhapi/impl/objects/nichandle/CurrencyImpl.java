package net.zyuiop.ovhapi.impl.objects.nichandle;

import net.zyuiop.ovhapi.api.objects.nichandle.Currency;
/**
 * Customer currency
 */

public class CurrencyImpl implements Currency { 

	private java.lang.String symbol;
	private java.lang.String code;

	public CurrencyImpl() {
	}

	public java.lang.String getSymbol() { 
		return this.symbol;
	} 

	public void setSymbol(java.lang.String symbol) { 
		this.symbol = symbol;
	} 

	public CurrencyImpl symbol(java.lang.String symbol) { 
		this.symbol = symbol;
		return this;
	} 

	public java.lang.String getCode() { 
		return this.code;
	} 

	public void setCode(java.lang.String code) { 
		this.code = code;
	} 

	public CurrencyImpl code(java.lang.String code) { 
		this.code = code;
		return this;
	} 

}
