package net.zyuiop.ovhapi.impl.objects.order.cart;

import net.zyuiop.ovhapi.api.objects.order.cart.TimeseriesProduct;
/**
 * Representation of a timeseries product
 */

public class TimeseriesProductImpl implements TimeseriesProduct { 

	private java.lang.String productName;
	private java.lang.String planCode;
	private net.zyuiop.ovhapi.api.objects.order.cart.TimeseriesPricing prices;

	public TimeseriesProductImpl() {
	}

	public java.lang.String getProductName() { 
		return this.productName;
	} 

	public void setProductName(java.lang.String productName) { 
		this.productName = productName;
	} 

	public TimeseriesProductImpl productName(java.lang.String productName) { 
		this.productName = productName;
		return this;
	} 

	public java.lang.String getPlanCode() { 
		return this.planCode;
	} 

	public void setPlanCode(java.lang.String planCode) { 
		this.planCode = planCode;
	} 

	public TimeseriesProductImpl planCode(java.lang.String planCode) { 
		this.planCode = planCode;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.order.cart.TimeseriesPricing getPrices() { 
		return this.prices;
	} 

	public void setPrices(net.zyuiop.ovhapi.api.objects.order.cart.TimeseriesPricing prices) { 
		this.prices = prices;
	} 

	public TimeseriesProductImpl prices(net.zyuiop.ovhapi.api.objects.order.cart.TimeseriesPricing prices) { 
		this.prices = prices;
		return this;
	} 

}
