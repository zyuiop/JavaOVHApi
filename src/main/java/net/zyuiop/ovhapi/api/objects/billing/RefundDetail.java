package net.zyuiop.ovhapi.api.objects.billing;

/**
 * Information about a Bill entry
 */

public class RefundDetail { 

	private java.lang.String refundDetailId;
	private java.lang.String refundId;
	private net.zyuiop.ovhapi.api.objects.order.Price totalPrice;
	private java.lang.String quantity;
	private net.zyuiop.ovhapi.api.objects.order.Price unitPrice;
	private java.lang.String description;
	private java.lang.String domain;
	private java.lang.String reference;

	public RefundDetail() {
	}

	public java.lang.String getRefundDetailId() { 
		return this.refundDetailId;
	} 

	public void setRefundDetailId(java.lang.String refundDetailId) { 
		this.refundDetailId = refundDetailId;
	} 

	public RefundDetail refundDetailId(java.lang.String refundDetailId) { 
		this.refundDetailId = refundDetailId;
		return this;
	} 

	public java.lang.String getRefundId() { 
		return this.refundId;
	} 

	public void setRefundId(java.lang.String refundId) { 
		this.refundId = refundId;
	} 

	public RefundDetail refundId(java.lang.String refundId) { 
		this.refundId = refundId;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.order.Price getTotalPrice() { 
		return this.totalPrice;
	} 

	public void setTotalPrice(net.zyuiop.ovhapi.api.objects.order.Price totalPrice) { 
		this.totalPrice = totalPrice;
	} 

	public RefundDetail totalPrice(net.zyuiop.ovhapi.api.objects.order.Price totalPrice) { 
		this.totalPrice = totalPrice;
		return this;
	} 

	public java.lang.String getQuantity() { 
		return this.quantity;
	} 

	public void setQuantity(java.lang.String quantity) { 
		this.quantity = quantity;
	} 

	public RefundDetail quantity(java.lang.String quantity) { 
		this.quantity = quantity;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.order.Price getUnitPrice() { 
		return this.unitPrice;
	} 

	public void setUnitPrice(net.zyuiop.ovhapi.api.objects.order.Price unitPrice) { 
		this.unitPrice = unitPrice;
	} 

	public RefundDetail unitPrice(net.zyuiop.ovhapi.api.objects.order.Price unitPrice) { 
		this.unitPrice = unitPrice;
		return this;
	} 

	public java.lang.String getDescription() { 
		return this.description;
	} 

	public void setDescription(java.lang.String description) { 
		this.description = description;
	} 

	public RefundDetail description(java.lang.String description) { 
		this.description = description;
		return this;
	} 

	public java.lang.String getDomain() { 
		return this.domain;
	} 

	public void setDomain(java.lang.String domain) { 
		this.domain = domain;
	} 

	public RefundDetail domain(java.lang.String domain) { 
		this.domain = domain;
		return this;
	} 

	public java.lang.String getReference() { 
		return this.reference;
	} 

	public void setReference(java.lang.String reference) { 
		this.reference = reference;
	} 

	public RefundDetail reference(java.lang.String reference) { 
		this.reference = reference;
		return this;
	} 

}
