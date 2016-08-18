package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Previous tollfree bill
 */

public class HistoryTollfreeConsumption { 

	private java.util.Date date;
	private java.lang.String status;
	private net.zyuiop.ovhapi.api.objects.order.Price price;

	public HistoryTollfreeConsumption() {
	}

	public java.util.Date getDate() { 
		return this.date;
	} 

	public void setDate(java.util.Date date) { 
		this.date = date;
	} 

	public HistoryTollfreeConsumption date(java.util.Date date) { 
		this.date = date;
		return this;
	} 

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public HistoryTollfreeConsumption status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.order.Price getPrice() { 
		return this.price;
	} 

	public void setPrice(net.zyuiop.ovhapi.api.objects.order.Price price) { 
		this.price = price;
	} 

	public HistoryTollfreeConsumption price(net.zyuiop.ovhapi.api.objects.order.Price price) { 
		this.price = price;
		return this;
	} 

}
