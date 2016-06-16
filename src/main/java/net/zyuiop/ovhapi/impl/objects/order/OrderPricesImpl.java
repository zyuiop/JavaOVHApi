package net.zyuiop.ovhapi.impl.objects.order;

import net.zyuiop.ovhapi.api.objects.order.OrderPrices;
/**
 * Prices of an order
 */

public class OrderPricesImpl implements OrderPrices { 

	private net.zyuiop.ovhapi.impl.objects.order.PriceImpl withoutTax;
	private net.zyuiop.ovhapi.impl.objects.order.PriceImpl tax;
	private net.zyuiop.ovhapi.impl.objects.order.PriceImpl withTax;

	public OrderPricesImpl() {
	}

	public net.zyuiop.ovhapi.impl.objects.order.PriceImpl getWithoutTax() { 
		return this.withoutTax;
	} 

	public void setWithoutTax(net.zyuiop.ovhapi.impl.objects.order.PriceImpl withoutTax) { 
		this.withoutTax = withoutTax;
	} 

	public OrderPricesImpl withoutTax(net.zyuiop.ovhapi.impl.objects.order.PriceImpl withoutTax) { 
		this.withoutTax = withoutTax;
		return this;
	} 

	public net.zyuiop.ovhapi.impl.objects.order.PriceImpl getTax() { 
		return this.tax;
	} 

	public void setTax(net.zyuiop.ovhapi.impl.objects.order.PriceImpl tax) { 
		this.tax = tax;
	} 

	public OrderPricesImpl tax(net.zyuiop.ovhapi.impl.objects.order.PriceImpl tax) { 
		this.tax = tax;
		return this;
	} 

	public net.zyuiop.ovhapi.impl.objects.order.PriceImpl getWithTax() { 
		return this.withTax;
	} 

	public void setWithTax(net.zyuiop.ovhapi.impl.objects.order.PriceImpl withTax) { 
		this.withTax = withTax;
	} 

	public OrderPricesImpl withTax(net.zyuiop.ovhapi.impl.objects.order.PriceImpl withTax) { 
		this.withTax = withTax;
		return this;
	} 

}
