package net.zyuiop.ovhapi.api.objects.billing;

/**
 * Information about a Bill entry
 */

public class OrderDetail { 

	private java.lang.String domain;
	private long orderDetailId;
	private net.zyuiop.ovhapi.api.objects.order.Price totalPrice;
	private java.lang.String quantity;
	private net.zyuiop.ovhapi.api.objects.order.Price unitPrice;
	private java.lang.String description;

	public OrderDetail() {
	}

	public java.lang.String getDomain() { 
		return this.domain;
	} 

	public void setDomain(java.lang.String domain) { 
		this.domain = domain;
	} 

	public OrderDetail domain(java.lang.String domain) { 
		this.domain = domain;
		return this;
	} 

	public long getOrderDetailId() { 
		return this.orderDetailId;
	} 

	public void setOrderDetailId(long orderDetailId) { 
		this.orderDetailId = orderDetailId;
	} 

	public OrderDetail orderDetailId(long orderDetailId) { 
		this.orderDetailId = orderDetailId;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.order.Price getTotalPrice() { 
		return this.totalPrice;
	} 

	public void setTotalPrice(net.zyuiop.ovhapi.api.objects.order.Price totalPrice) { 
		this.totalPrice = totalPrice;
	} 

	public OrderDetail totalPrice(net.zyuiop.ovhapi.api.objects.order.Price totalPrice) { 
		this.totalPrice = totalPrice;
		return this;
	} 

	public java.lang.String getQuantity() { 
		return this.quantity;
	} 

	public void setQuantity(java.lang.String quantity) { 
		this.quantity = quantity;
	} 

	public OrderDetail quantity(java.lang.String quantity) { 
		this.quantity = quantity;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.order.Price getUnitPrice() { 
		return this.unitPrice;
	} 

	public void setUnitPrice(net.zyuiop.ovhapi.api.objects.order.Price unitPrice) { 
		this.unitPrice = unitPrice;
	} 

	public OrderDetail unitPrice(net.zyuiop.ovhapi.api.objects.order.Price unitPrice) { 
		this.unitPrice = unitPrice;
		return this;
	} 

	public java.lang.String getDescription() { 
		return this.description;
	} 

	public void setDescription(java.lang.String description) { 
		this.description = description;
	} 

	public OrderDetail description(java.lang.String description) { 
		this.description = description;
		return this;
	} 

}
