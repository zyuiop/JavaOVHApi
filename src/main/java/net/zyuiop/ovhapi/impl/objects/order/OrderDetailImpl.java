package net.zyuiop.ovhapi.impl.objects.order;

import net.zyuiop.ovhapi.api.objects.order.OrderDetail;
/**
 * Detail of an order
 */

public class OrderDetailImpl implements OrderDetail { 

	private java.lang.String domain;
	private net.zyuiop.ovhapi.api.objects.order.Price totalPrice;
	private long quantity;
	private net.zyuiop.ovhapi.api.objects.order.Price unitPrice;
	private java.lang.String description;

	public OrderDetailImpl() {
	}

	public java.lang.String getDomain() { 
		return this.domain;
	} 

	public void setDomain(java.lang.String domain) { 
		this.domain = domain;
	} 

	public OrderDetailImpl domain(java.lang.String domain) { 
		this.domain = domain;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.order.Price getTotalPrice() { 
		return this.totalPrice;
	} 

	public void setTotalPrice(net.zyuiop.ovhapi.api.objects.order.Price totalPrice) { 
		this.totalPrice = totalPrice;
	} 

	public OrderDetailImpl totalPrice(net.zyuiop.ovhapi.api.objects.order.Price totalPrice) { 
		this.totalPrice = totalPrice;
		return this;
	} 

	public long getQuantity() { 
		return this.quantity;
	} 

	public void setQuantity(long quantity) { 
		this.quantity = quantity;
	} 

	public OrderDetailImpl quantity(long quantity) { 
		this.quantity = quantity;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.order.Price getUnitPrice() { 
		return this.unitPrice;
	} 

	public void setUnitPrice(net.zyuiop.ovhapi.api.objects.order.Price unitPrice) { 
		this.unitPrice = unitPrice;
	} 

	public OrderDetailImpl unitPrice(net.zyuiop.ovhapi.api.objects.order.Price unitPrice) { 
		this.unitPrice = unitPrice;
		return this;
	} 

	public java.lang.String getDescription() { 
		return this.description;
	} 

	public void setDescription(java.lang.String description) { 
		this.description = description;
	} 

	public OrderDetailImpl description(java.lang.String description) { 
		this.description = description;
		return this;
	} 

}
