package net.zyuiop.ovhapi.api.objects.billing;

/**
 * Details about an Order
 */

public class Order { 

	private java.lang.String pdfUrl;
	private java.util.Date date;
	private net.zyuiop.ovhapi.api.objects.order.Price priceWithoutTax;
	private net.zyuiop.ovhapi.api.objects.order.Price tax;
	private java.util.Date expirationDate;
	private java.lang.String password;
	private long orderId;
	private java.lang.String url;
	private net.zyuiop.ovhapi.api.objects.order.Price priceWithTax;

	public Order() {
	}

	public java.lang.String getPdfUrl() { 
		return this.pdfUrl;
	} 

	public void setPdfUrl(java.lang.String pdfUrl) { 
		this.pdfUrl = pdfUrl;
	} 

	public Order pdfUrl(java.lang.String pdfUrl) { 
		this.pdfUrl = pdfUrl;
		return this;
	} 

	public java.util.Date getDate() { 
		return this.date;
	} 

	public void setDate(java.util.Date date) { 
		this.date = date;
	} 

	public Order date(java.util.Date date) { 
		this.date = date;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.order.Price getPriceWithoutTax() { 
		return this.priceWithoutTax;
	} 

	public void setPriceWithoutTax(net.zyuiop.ovhapi.api.objects.order.Price priceWithoutTax) { 
		this.priceWithoutTax = priceWithoutTax;
	} 

	public Order priceWithoutTax(net.zyuiop.ovhapi.api.objects.order.Price priceWithoutTax) { 
		this.priceWithoutTax = priceWithoutTax;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.order.Price getTax() { 
		return this.tax;
	} 

	public void setTax(net.zyuiop.ovhapi.api.objects.order.Price tax) { 
		this.tax = tax;
	} 

	public Order tax(net.zyuiop.ovhapi.api.objects.order.Price tax) { 
		this.tax = tax;
		return this;
	} 

	public java.util.Date getExpirationDate() { 
		return this.expirationDate;
	} 

	public void setExpirationDate(java.util.Date expirationDate) { 
		this.expirationDate = expirationDate;
	} 

	public Order expirationDate(java.util.Date expirationDate) { 
		this.expirationDate = expirationDate;
		return this;
	} 

	public java.lang.String getPassword() { 
		return this.password;
	} 

	public void setPassword(java.lang.String password) { 
		this.password = password;
	} 

	public Order password(java.lang.String password) { 
		this.password = password;
		return this;
	} 

	public long getOrderId() { 
		return this.orderId;
	} 

	public void setOrderId(long orderId) { 
		this.orderId = orderId;
	} 

	public Order orderId(long orderId) { 
		this.orderId = orderId;
		return this;
	} 

	public java.lang.String getUrl() { 
		return this.url;
	} 

	public void setUrl(java.lang.String url) { 
		this.url = url;
	} 

	public Order url(java.lang.String url) { 
		this.url = url;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.order.Price getPriceWithTax() { 
		return this.priceWithTax;
	} 

	public void setPriceWithTax(net.zyuiop.ovhapi.api.objects.order.Price priceWithTax) { 
		this.priceWithTax = priceWithTax;
	} 

	public Order priceWithTax(net.zyuiop.ovhapi.api.objects.order.Price priceWithTax) { 
		this.priceWithTax = priceWithTax;
		return this;
	} 

}
