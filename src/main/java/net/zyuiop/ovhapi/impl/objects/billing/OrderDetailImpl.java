package net.zyuiop.ovhapi.impl.objects.billing;

import net.zyuiop.ovhapi.api.objects.billing.OrderDetail;
/**
 * Information about a Bill entry
 */

public class OrderDetailImpl implements OrderDetail { 

	private java.lang.String domain;
	private long orderDetailId;
	private net.zyuiop.ovhapi.impl.objects.order.PriceImpl totalPrice;
	private java.lang.String quantity;
	private net.zyuiop.ovhapi.impl.objects.order.PriceImpl unitPrice;
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

	public long getOrderDetailId() { 
		return this.orderDetailId;
	} 

	public void setOrderDetailId(long orderDetailId) { 
		this.orderDetailId = orderDetailId;
	} 

	public OrderDetailImpl orderDetailId(long orderDetailId) { 
		this.orderDetailId = orderDetailId;
		return this;
	} 

	public net.zyuiop.ovhapi.impl.objects.order.PriceImpl getTotalPrice() { 
		return this.totalPrice;
	} 

	public void setTotalPrice(net.zyuiop.ovhapi.impl.objects.order.PriceImpl totalPrice) { 
		this.totalPrice = totalPrice;
	} 

	public OrderDetailImpl totalPrice(net.zyuiop.ovhapi.impl.objects.order.PriceImpl totalPrice) { 
		this.totalPrice = totalPrice;
		return this;
	} 

	public java.lang.String getQuantity() { 
		return this.quantity;
	} 

	public void setQuantity(java.lang.String quantity) { 
		this.quantity = quantity;
	} 

	public OrderDetailImpl quantity(java.lang.String quantity) { 
		this.quantity = quantity;
		return this;
	} 

	public net.zyuiop.ovhapi.impl.objects.order.PriceImpl getUnitPrice() { 
		return this.unitPrice;
	} 

	public void setUnitPrice(net.zyuiop.ovhapi.impl.objects.order.PriceImpl unitPrice) { 
		this.unitPrice = unitPrice;
	} 

	public OrderDetailImpl unitPrice(net.zyuiop.ovhapi.impl.objects.order.PriceImpl unitPrice) { 
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
