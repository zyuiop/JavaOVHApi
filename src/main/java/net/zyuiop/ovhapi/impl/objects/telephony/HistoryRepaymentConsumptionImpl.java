package net.zyuiop.ovhapi.impl.objects.telephony;

import net.zyuiop.ovhapi.api.objects.telephony.HistoryRepaymentConsumption;
/**
 * Previous repayment bill
 */

public class HistoryRepaymentConsumptionImpl implements HistoryRepaymentConsumption { 

	private java.lang.String billingNumber;
	private java.util.Date date;
	private java.lang.String status;
	private net.zyuiop.ovhapi.api.objects.order.Price price;

	public HistoryRepaymentConsumptionImpl() {
	}

	public java.lang.String getBillingNumber() { 
		return this.billingNumber;
	} 

	public void setBillingNumber(java.lang.String billingNumber) { 
		this.billingNumber = billingNumber;
	} 

	public HistoryRepaymentConsumptionImpl billingNumber(java.lang.String billingNumber) { 
		this.billingNumber = billingNumber;
		return this;
	} 

	public java.util.Date getDate() { 
		return this.date;
	} 

	public void setDate(java.util.Date date) { 
		this.date = date;
	} 

	public HistoryRepaymentConsumptionImpl date(java.util.Date date) { 
		this.date = date;
		return this;
	} 

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public HistoryRepaymentConsumptionImpl status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.order.Price getPrice() { 
		return this.price;
	} 

	public void setPrice(net.zyuiop.ovhapi.api.objects.order.Price price) { 
		this.price = price;
	} 

	public HistoryRepaymentConsumptionImpl price(net.zyuiop.ovhapi.api.objects.order.Price price) { 
		this.price = price;
		return this;
	} 

}
