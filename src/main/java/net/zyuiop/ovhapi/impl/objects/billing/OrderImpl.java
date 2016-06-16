package net.zyuiop.ovhapi.impl.objects.billing;

import net.zyuiop.ovhapi.api.objects.billing.Order;
/**
 * Details about an Order
 */

public class OrderImpl implements Order { 

	private java.lang.String pdfUrl;
	private java.util.Date date;
	private net.zyuiop.ovhapi.impl.objects.order.PriceImpl priceWithoutTax;
	private net.zyuiop.ovhapi.impl.objects.order.PriceImpl tax;
	private java.util.Date expirationDate;
	private java.lang.String password;
	private long orderId;
	private java.lang.String url;
	private net.zyuiop.ovhapi.impl.objects.order.PriceImpl priceWithTax;

	public OrderImpl() {
	}

	public java.lang.String getPdfUrl() { 
		return this.pdfUrl;
	} 

	public void setPdfUrl(java.lang.String pdfUrl) { 
		this.pdfUrl = pdfUrl;
	} 

	public OrderImpl pdfUrl(java.lang.String pdfUrl) { 
		this.pdfUrl = pdfUrl;
		return this;
	} 

	public java.util.Date getDate() { 
		return this.date;
	} 

	public void setDate(java.util.Date date) { 
		this.date = date;
	} 

	public OrderImpl date(java.util.Date date) { 
		this.date = date;
		return this;
	} 

	public net.zyuiop.ovhapi.impl.objects.order.PriceImpl getPriceWithoutTax() { 
		return this.priceWithoutTax;
	} 

	public void setPriceWithoutTax(net.zyuiop.ovhapi.impl.objects.order.PriceImpl priceWithoutTax) { 
		this.priceWithoutTax = priceWithoutTax;
	} 

	public OrderImpl priceWithoutTax(net.zyuiop.ovhapi.impl.objects.order.PriceImpl priceWithoutTax) { 
		this.priceWithoutTax = priceWithoutTax;
		return this;
	} 

	public net.zyuiop.ovhapi.impl.objects.order.PriceImpl getTax() { 
		return this.tax;
	} 

	public void setTax(net.zyuiop.ovhapi.impl.objects.order.PriceImpl tax) { 
		this.tax = tax;
	} 

	public OrderImpl tax(net.zyuiop.ovhapi.impl.objects.order.PriceImpl tax) { 
		this.tax = tax;
		return this;
	} 

	public java.util.Date getExpirationDate() { 
		return this.expirationDate;
	} 

	public void setExpirationDate(java.util.Date expirationDate) { 
		this.expirationDate = expirationDate;
	} 

	public OrderImpl expirationDate(java.util.Date expirationDate) { 
		this.expirationDate = expirationDate;
		return this;
	} 

	public java.lang.String getPassword() { 
		return this.password;
	} 

	public void setPassword(java.lang.String password) { 
		this.password = password;
	} 

	public OrderImpl password(java.lang.String password) { 
		this.password = password;
		return this;
	} 

	public long getOrderId() { 
		return this.orderId;
	} 

	public void setOrderId(long orderId) { 
		this.orderId = orderId;
	} 

	public OrderImpl orderId(long orderId) { 
		this.orderId = orderId;
		return this;
	} 

	public java.lang.String getUrl() { 
		return this.url;
	} 

	public void setUrl(java.lang.String url) { 
		this.url = url;
	} 

	public OrderImpl url(java.lang.String url) { 
		this.url = url;
		return this;
	} 

	public net.zyuiop.ovhapi.impl.objects.order.PriceImpl getPriceWithTax() { 
		return this.priceWithTax;
	} 

	public void setPriceWithTax(net.zyuiop.ovhapi.impl.objects.order.PriceImpl priceWithTax) { 
		this.priceWithTax = priceWithTax;
	} 

	public OrderImpl priceWithTax(net.zyuiop.ovhapi.impl.objects.order.PriceImpl priceWithTax) { 
		this.priceWithTax = priceWithTax;
		return this;
	} 

}
