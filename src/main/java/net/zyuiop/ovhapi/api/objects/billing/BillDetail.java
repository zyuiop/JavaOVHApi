package net.zyuiop.ovhapi.api.objects.billing;

/**
 * Information about a Bill entry
 */

public class BillDetail { 

	private net.zyuiop.ovhapi.api.objects.order.Price totalPrice;
	private java.util.Date periodStart;
	private java.lang.String quantity;
	private net.zyuiop.ovhapi.api.objects.order.Price unitPrice;
	private java.lang.String description;
	private java.lang.String billDetailId;
	private java.lang.String domain;
	private java.util.Date periodEnd;

	public BillDetail() {
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getTotalPrice() { 
		return this.totalPrice;
	} 

	public void setTotalPrice(net.zyuiop.ovhapi.api.objects.order.Price totalPrice) { 
		this.totalPrice = totalPrice;
	} 

	public BillDetail totalPrice(net.zyuiop.ovhapi.api.objects.order.Price totalPrice) { 
		this.totalPrice = totalPrice;
		return this;
	} 

	public java.util.Date getPeriodStart() { 
		return this.periodStart;
	} 

	public void setPeriodStart(java.util.Date periodStart) { 
		this.periodStart = periodStart;
	} 

	public BillDetail periodStart(java.util.Date periodStart) { 
		this.periodStart = periodStart;
		return this;
	} 

	public java.lang.String getQuantity() { 
		return this.quantity;
	} 

	public void setQuantity(java.lang.String quantity) { 
		this.quantity = quantity;
	} 

	public BillDetail quantity(java.lang.String quantity) { 
		this.quantity = quantity;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.order.Price getUnitPrice() { 
		return this.unitPrice;
	} 

	public void setUnitPrice(net.zyuiop.ovhapi.api.objects.order.Price unitPrice) { 
		this.unitPrice = unitPrice;
	} 

	public BillDetail unitPrice(net.zyuiop.ovhapi.api.objects.order.Price unitPrice) { 
		this.unitPrice = unitPrice;
		return this;
	} 

	public java.lang.String getDescription() { 
		return this.description;
	} 

	public void setDescription(java.lang.String description) { 
		this.description = description;
	} 

	public BillDetail description(java.lang.String description) { 
		this.description = description;
		return this;
	} 

	public java.lang.String getBillDetailId() { 
		return this.billDetailId;
	} 

	public void setBillDetailId(java.lang.String billDetailId) { 
		this.billDetailId = billDetailId;
	} 

	public BillDetail billDetailId(java.lang.String billDetailId) { 
		this.billDetailId = billDetailId;
		return this;
	} 

	public java.lang.String getDomain() { 
		return this.domain;
	} 

	public void setDomain(java.lang.String domain) { 
		this.domain = domain;
	} 

	public BillDetail domain(java.lang.String domain) { 
		this.domain = domain;
		return this;
	} 

	public java.util.Date getPeriodEnd() { 
		return this.periodEnd;
	} 

	public void setPeriodEnd(java.util.Date periodEnd) { 
		this.periodEnd = periodEnd;
	} 

	public BillDetail periodEnd(java.util.Date periodEnd) { 
		this.periodEnd = periodEnd;
		return this;
	} 

}
