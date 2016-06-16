package net.zyuiop.ovhapi.impl.objects.billing;

import net.zyuiop.ovhapi.api.objects.billing.BillDetail;
/**
 * Information about a Bill entry
 */

public class BillDetailImpl implements BillDetail { 

	private net.zyuiop.ovhapi.impl.objects.order.PriceImpl totalPrice;
	private java.util.Date periodStart;
	private java.lang.String quantity;
	private net.zyuiop.ovhapi.impl.objects.order.PriceImpl unitPrice;
	private java.lang.String description;
	private java.lang.String billDetailId;
	private java.lang.String domain;
	private java.util.Date periodEnd;

	public BillDetailImpl() {
	}

	public net.zyuiop.ovhapi.impl.objects.order.PriceImpl getTotalPrice() { 
		return this.totalPrice;
	} 

	public void setTotalPrice(net.zyuiop.ovhapi.impl.objects.order.PriceImpl totalPrice) { 
		this.totalPrice = totalPrice;
	} 

	public BillDetailImpl totalPrice(net.zyuiop.ovhapi.impl.objects.order.PriceImpl totalPrice) { 
		this.totalPrice = totalPrice;
		return this;
	} 

	public java.util.Date getPeriodStart() { 
		return this.periodStart;
	} 

	public void setPeriodStart(java.util.Date periodStart) { 
		this.periodStart = periodStart;
	} 

	public BillDetailImpl periodStart(java.util.Date periodStart) { 
		this.periodStart = periodStart;
		return this;
	} 

	public java.lang.String getQuantity() { 
		return this.quantity;
	} 

	public void setQuantity(java.lang.String quantity) { 
		this.quantity = quantity;
	} 

	public BillDetailImpl quantity(java.lang.String quantity) { 
		this.quantity = quantity;
		return this;
	} 

	public net.zyuiop.ovhapi.impl.objects.order.PriceImpl getUnitPrice() { 
		return this.unitPrice;
	} 

	public void setUnitPrice(net.zyuiop.ovhapi.impl.objects.order.PriceImpl unitPrice) { 
		this.unitPrice = unitPrice;
	} 

	public BillDetailImpl unitPrice(net.zyuiop.ovhapi.impl.objects.order.PriceImpl unitPrice) { 
		this.unitPrice = unitPrice;
		return this;
	} 

	public java.lang.String getDescription() { 
		return this.description;
	} 

	public void setDescription(java.lang.String description) { 
		this.description = description;
	} 

	public BillDetailImpl description(java.lang.String description) { 
		this.description = description;
		return this;
	} 

	public java.lang.String getBillDetailId() { 
		return this.billDetailId;
	} 

	public void setBillDetailId(java.lang.String billDetailId) { 
		this.billDetailId = billDetailId;
	} 

	public BillDetailImpl billDetailId(java.lang.String billDetailId) { 
		this.billDetailId = billDetailId;
		return this;
	} 

	public java.lang.String getDomain() { 
		return this.domain;
	} 

	public void setDomain(java.lang.String domain) { 
		this.domain = domain;
	} 

	public BillDetailImpl domain(java.lang.String domain) { 
		this.domain = domain;
		return this;
	} 

	public java.util.Date getPeriodEnd() { 
		return this.periodEnd;
	} 

	public void setPeriodEnd(java.util.Date periodEnd) { 
		this.periodEnd = periodEnd;
	} 

	public BillDetailImpl periodEnd(java.util.Date periodEnd) { 
		this.periodEnd = periodEnd;
		return this;
	} 

}
