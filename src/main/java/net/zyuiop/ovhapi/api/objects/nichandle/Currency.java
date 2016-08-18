package net.zyuiop.ovhapi.api.objects.nichandle;

/**
 * Customer currency
 */

public class Currency { 

	private java.lang.String symbol;
	private java.lang.String code;

	public Currency() {
	}

	public java.lang.String getSymbol() { 
		return this.symbol;
	} 

	public void setSymbol(java.lang.String symbol) { 
		this.symbol = symbol;
	} 

	public Currency symbol(java.lang.String symbol) { 
		this.symbol = symbol;
		return this;
	} 

	public java.lang.String getCode() { 
		return this.code;
	} 

	public void setCode(java.lang.String code) { 
		this.code = code;
	} 

	public Currency code(java.lang.String code) { 
		this.code = code;
		return this;
	} 

}
