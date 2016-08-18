package net.zyuiop.ovhapi.api.objects.order.cart;

/**
 * Representation of a timeseries product
 */

public class TimeseriesProduct { 

	private java.lang.String productName;
	private java.lang.String planCode;
	private net.zyuiop.ovhapi.api.objects.order.cart.TimeseriesPricing[] prices;

	public TimeseriesProduct() {
	}

	public java.lang.String getProductName() { 
		return this.productName;
	} 

	public void setProductName(java.lang.String productName) { 
		this.productName = productName;
	} 

	public TimeseriesProduct productName(java.lang.String productName) { 
		this.productName = productName;
		return this;
	} 

	public java.lang.String getPlanCode() { 
		return this.planCode;
	} 

	public void setPlanCode(java.lang.String planCode) { 
		this.planCode = planCode;
	} 

	public TimeseriesProduct planCode(java.lang.String planCode) { 
		this.planCode = planCode;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.order.cart.TimeseriesPricing[] getPrices() { 
		return this.prices;
	} 

	public void setPrices(net.zyuiop.ovhapi.api.objects.order.cart.TimeseriesPricing[] prices) { 
		this.prices = prices;
	} 

	public TimeseriesProduct prices(net.zyuiop.ovhapi.api.objects.order.cart.TimeseriesPricing[] prices) { 
		this.prices = prices;
		return this;
	} 

}
