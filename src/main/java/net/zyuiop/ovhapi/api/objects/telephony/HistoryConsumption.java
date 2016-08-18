package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Previous billed consumptions
 */

public class HistoryConsumption { 

	private java.util.Date date;
	private java.lang.String status;
	private net.zyuiop.ovhapi.api.objects.order.Price price;
	private net.zyuiop.ovhapi.api.objects.order.Price priceOutplan;

	public HistoryConsumption() {
	}

	public java.util.Date getDate() { 
		return this.date;
	} 

	public void setDate(java.util.Date date) { 
		this.date = date;
	} 

	public HistoryConsumption date(java.util.Date date) { 
		this.date = date;
		return this;
	} 

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public HistoryConsumption status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.order.Price getPrice() { 
		return this.price;
	} 

	public void setPrice(net.zyuiop.ovhapi.api.objects.order.Price price) { 
		this.price = price;
	} 

	public HistoryConsumption price(net.zyuiop.ovhapi.api.objects.order.Price price) { 
		this.price = price;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.order.Price getPriceOutplan() { 
		return this.priceOutplan;
	} 

	public void setPriceOutplan(net.zyuiop.ovhapi.api.objects.order.Price priceOutplan) { 
		this.priceOutplan = priceOutplan;
	} 

	public HistoryConsumption priceOutplan(net.zyuiop.ovhapi.api.objects.order.Price priceOutplan) { 
		this.priceOutplan = priceOutplan;
		return this;
	} 

}
