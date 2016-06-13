package net.zyuiop.ovhapi.impl.objects.billing;

import net.zyuiop.ovhapi.api.objects.billing.Bill;
/**
 * Details about a Bill
 */

public class BillImpl implements Bill { 

	private java.lang.String pdfUrl;
	private java.util.Date date;
	private net.zyuiop.ovhapi.api.objects.order.Price priceWithoutTax;
	private net.zyuiop.ovhapi.api.objects.order.Price tax;
	private java.lang.String billId;
	private java.lang.String password;
	private long orderId;
	private java.lang.String url;
	private net.zyuiop.ovhapi.api.objects.order.Price priceWithTax;

	public BillImpl() {
	}

	public java.lang.String getPdfUrl() { 
		return this.pdfUrl;
	} 

	public void setPdfUrl(java.lang.String pdfUrl) { 
		this.pdfUrl = pdfUrl;
	} 

	public BillImpl pdfUrl(java.lang.String pdfUrl) { 
		this.pdfUrl = pdfUrl;
		return this;
	} 

	public java.util.Date getDate() { 
		return this.date;
	} 

	public void setDate(java.util.Date date) { 
		this.date = date;
	} 

	public BillImpl date(java.util.Date date) { 
		this.date = date;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.order.Price getPriceWithoutTax() { 
		return this.priceWithoutTax;
	} 

	public void setPriceWithoutTax(net.zyuiop.ovhapi.api.objects.order.Price priceWithoutTax) { 
		this.priceWithoutTax = priceWithoutTax;
	} 

	public BillImpl priceWithoutTax(net.zyuiop.ovhapi.api.objects.order.Price priceWithoutTax) { 
		this.priceWithoutTax = priceWithoutTax;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.order.Price getTax() { 
		return this.tax;
	} 

	public void setTax(net.zyuiop.ovhapi.api.objects.order.Price tax) { 
		this.tax = tax;
	} 

	public BillImpl tax(net.zyuiop.ovhapi.api.objects.order.Price tax) { 
		this.tax = tax;
		return this;
	} 

	public java.lang.String getBillId() { 
		return this.billId;
	} 

	public void setBillId(java.lang.String billId) { 
		this.billId = billId;
	} 

	public BillImpl billId(java.lang.String billId) { 
		this.billId = billId;
		return this;
	} 

	public java.lang.String getPassword() { 
		return this.password;
	} 

	public void setPassword(java.lang.String password) { 
		this.password = password;
	} 

	public BillImpl password(java.lang.String password) { 
		this.password = password;
		return this;
	} 

	public long getOrderId() { 
		return this.orderId;
	} 

	public void setOrderId(long orderId) { 
		this.orderId = orderId;
	} 

	public BillImpl orderId(long orderId) { 
		this.orderId = orderId;
		return this;
	} 

	public java.lang.String getUrl() { 
		return this.url;
	} 

	public void setUrl(java.lang.String url) { 
		this.url = url;
	} 

	public BillImpl url(java.lang.String url) { 
		this.url = url;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.order.Price getPriceWithTax() { 
		return this.priceWithTax;
	} 

	public void setPriceWithTax(net.zyuiop.ovhapi.api.objects.order.Price priceWithTax) { 
		this.priceWithTax = priceWithTax;
	} 

	public BillImpl priceWithTax(net.zyuiop.ovhapi.api.objects.order.Price priceWithTax) { 
		this.priceWithTax = priceWithTax;
		return this;
	} 

}
