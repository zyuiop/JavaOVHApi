package net.zyuiop.ovhapi.api.objects.order;

/**
 * Prices of an order
 */

public class OrderPrices { 

	private net.zyuiop.ovhapi.api.objects.order.Price withoutTax;
	private net.zyuiop.ovhapi.api.objects.order.Price tax;
	private net.zyuiop.ovhapi.api.objects.order.Price withTax;

	public OrderPrices() {
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getWithoutTax() { 
		return this.withoutTax;
	} 

	public void setWithoutTax(net.zyuiop.ovhapi.api.objects.order.Price withoutTax) { 
		this.withoutTax = withoutTax;
	} 

	public OrderPrices withoutTax(net.zyuiop.ovhapi.api.objects.order.Price withoutTax) { 
		this.withoutTax = withoutTax;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.order.Price getTax() { 
		return this.tax;
	} 

	public void setTax(net.zyuiop.ovhapi.api.objects.order.Price tax) { 
		this.tax = tax;
	} 

	public OrderPrices tax(net.zyuiop.ovhapi.api.objects.order.Price tax) { 
		this.tax = tax;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.order.Price getWithTax() { 
		return this.withTax;
	} 

	public void setWithTax(net.zyuiop.ovhapi.api.objects.order.Price withTax) { 
		this.withTax = withTax;
	} 

	public OrderPrices withTax(net.zyuiop.ovhapi.api.objects.order.Price withTax) { 
		this.withTax = withTax;
		return this;
	} 

}
