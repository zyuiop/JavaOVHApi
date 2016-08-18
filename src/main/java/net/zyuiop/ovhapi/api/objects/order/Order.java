package net.zyuiop.ovhapi.api.objects.order;

/**
 * An order
 */

public class Order { 

	private long orderId;
	private java.lang.String url;
	private net.zyuiop.ovhapi.api.objects.order.OrderDetail[] details;
	private net.zyuiop.ovhapi.api.objects.order.Contract[] contracts;
	private net.zyuiop.ovhapi.api.objects.order.OrderPrices prices;

	public Order() {
	}

	public long getOrderId() { 
		return this.orderId;
	} 

	public void setOrderId(long orderId) { 
		this.orderId = orderId;
	} 

	public Order orderId(long orderId) { 
		this.orderId = orderId;
		return this;
	} 

	public java.lang.String getUrl() { 
		return this.url;
	} 

	public void setUrl(java.lang.String url) { 
		this.url = url;
	} 

	public Order url(java.lang.String url) { 
		this.url = url;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.order.OrderDetail[] getDetails() { 
		return this.details;
	} 

	public void setDetails(net.zyuiop.ovhapi.api.objects.order.OrderDetail[] details) { 
		this.details = details;
	} 

	public Order details(net.zyuiop.ovhapi.api.objects.order.OrderDetail[] details) { 
		this.details = details;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.order.Contract[] getContracts() { 
		return this.contracts;
	} 

	public void setContracts(net.zyuiop.ovhapi.api.objects.order.Contract[] contracts) { 
		this.contracts = contracts;
	} 

	public Order contracts(net.zyuiop.ovhapi.api.objects.order.Contract[] contracts) { 
		this.contracts = contracts;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.order.OrderPrices getPrices() { 
		return this.prices;
	} 

	public void setPrices(net.zyuiop.ovhapi.api.objects.order.OrderPrices prices) { 
		this.prices = prices;
	} 

	public Order prices(net.zyuiop.ovhapi.api.objects.order.OrderPrices prices) { 
		this.prices = prices;
		return this;
	} 

}
