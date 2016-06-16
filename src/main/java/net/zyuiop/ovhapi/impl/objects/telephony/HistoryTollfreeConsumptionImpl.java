package net.zyuiop.ovhapi.impl.objects.telephony;

import net.zyuiop.ovhapi.api.objects.telephony.HistoryTollfreeConsumption;
/**
 * Previous tollfree bill
 */

public class HistoryTollfreeConsumptionImpl implements HistoryTollfreeConsumption { 

	private java.util.Date date;
	private java.lang.String status;
	private net.zyuiop.ovhapi.impl.objects.order.PriceImpl price;

	public HistoryTollfreeConsumptionImpl() {
	}

	public java.util.Date getDate() { 
		return this.date;
	} 

	public void setDate(java.util.Date date) { 
		this.date = date;
	} 

	public HistoryTollfreeConsumptionImpl date(java.util.Date date) { 
		this.date = date;
		return this;
	} 

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public HistoryTollfreeConsumptionImpl status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public net.zyuiop.ovhapi.impl.objects.order.PriceImpl getPrice() { 
		return this.price;
	} 

	public void setPrice(net.zyuiop.ovhapi.impl.objects.order.PriceImpl price) { 
		this.price = price;
	} 

	public HistoryTollfreeConsumptionImpl price(net.zyuiop.ovhapi.impl.objects.order.PriceImpl price) { 
		this.price = price;
		return this;
	} 

}
