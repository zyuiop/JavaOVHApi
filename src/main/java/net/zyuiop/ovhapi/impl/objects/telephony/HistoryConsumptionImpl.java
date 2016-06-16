package net.zyuiop.ovhapi.impl.objects.telephony;

import net.zyuiop.ovhapi.api.objects.telephony.HistoryConsumption;
/**
 * Previous billed consumptions
 */

public class HistoryConsumptionImpl implements HistoryConsumption { 

	private java.util.Date date;
	private java.lang.String status;
	private net.zyuiop.ovhapi.impl.objects.order.PriceImpl price;
	private net.zyuiop.ovhapi.impl.objects.order.PriceImpl priceOutplan;

	public HistoryConsumptionImpl() {
	}

	public java.util.Date getDate() { 
		return this.date;
	} 

	public void setDate(java.util.Date date) { 
		this.date = date;
	} 

	public HistoryConsumptionImpl date(java.util.Date date) { 
		this.date = date;
		return this;
	} 

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public HistoryConsumptionImpl status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public net.zyuiop.ovhapi.impl.objects.order.PriceImpl getPrice() { 
		return this.price;
	} 

	public void setPrice(net.zyuiop.ovhapi.impl.objects.order.PriceImpl price) { 
		this.price = price;
	} 

	public HistoryConsumptionImpl price(net.zyuiop.ovhapi.impl.objects.order.PriceImpl price) { 
		this.price = price;
		return this;
	} 

	public net.zyuiop.ovhapi.impl.objects.order.PriceImpl getPriceOutplan() { 
		return this.priceOutplan;
	} 

	public void setPriceOutplan(net.zyuiop.ovhapi.impl.objects.order.PriceImpl priceOutplan) { 
		this.priceOutplan = priceOutplan;
	} 

	public HistoryConsumptionImpl priceOutplan(net.zyuiop.ovhapi.impl.objects.order.PriceImpl priceOutplan) { 
		this.priceOutplan = priceOutplan;
		return this;
	} 

}
