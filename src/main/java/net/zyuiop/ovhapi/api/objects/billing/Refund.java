package net.zyuiop.ovhapi.api.objects.billing;

/**
 * Details about a Refund
 */

public class Refund { 

	private java.lang.String refundId;
	private java.lang.String pdfUrl;
	private java.util.Date date;
	private net.zyuiop.ovhapi.api.objects.order.Price priceWithoutTax;
	private net.zyuiop.ovhapi.api.objects.order.Price tax;
	private java.lang.String password;
	private long orderId;
	private java.lang.String url;
	private net.zyuiop.ovhapi.api.objects.order.Price priceWithTax;
	private java.lang.String originalBillId;

	public Refund() {
	}

	public java.lang.String getRefundId() { 
		return this.refundId;
	} 

	public void setRefundId(java.lang.String refundId) { 
		this.refundId = refundId;
	} 

	public Refund refundId(java.lang.String refundId) { 
		this.refundId = refundId;
		return this;
	} 

	public java.lang.String getPdfUrl() { 
		return this.pdfUrl;
	} 

	public void setPdfUrl(java.lang.String pdfUrl) { 
		this.pdfUrl = pdfUrl;
	} 

	public Refund pdfUrl(java.lang.String pdfUrl) { 
		this.pdfUrl = pdfUrl;
		return this;
	} 

	public java.util.Date getDate() { 
		return this.date;
	} 

	public void setDate(java.util.Date date) { 
		this.date = date;
	} 

	public Refund date(java.util.Date date) { 
		this.date = date;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.order.Price getPriceWithoutTax() { 
		return this.priceWithoutTax;
	} 

	public void setPriceWithoutTax(net.zyuiop.ovhapi.api.objects.order.Price priceWithoutTax) { 
		this.priceWithoutTax = priceWithoutTax;
	} 

	public Refund priceWithoutTax(net.zyuiop.ovhapi.api.objects.order.Price priceWithoutTax) { 
		this.priceWithoutTax = priceWithoutTax;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.order.Price getTax() { 
		return this.tax;
	} 

	public void setTax(net.zyuiop.ovhapi.api.objects.order.Price tax) { 
		this.tax = tax;
	} 

	public Refund tax(net.zyuiop.ovhapi.api.objects.order.Price tax) { 
		this.tax = tax;
		return this;
	} 

	public java.lang.String getPassword() { 
		return this.password;
	} 

	public void setPassword(java.lang.String password) { 
		this.password = password;
	} 

	public Refund password(java.lang.String password) { 
		this.password = password;
		return this;
	} 

	public long getOrderId() { 
		return this.orderId;
	} 

	public void setOrderId(long orderId) { 
		this.orderId = orderId;
	} 

	public Refund orderId(long orderId) { 
		this.orderId = orderId;
		return this;
	} 

	public java.lang.String getUrl() { 
		return this.url;
	} 

	public void setUrl(java.lang.String url) { 
		this.url = url;
	} 

	public Refund url(java.lang.String url) { 
		this.url = url;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.order.Price getPriceWithTax() { 
		return this.priceWithTax;
	} 

	public void setPriceWithTax(net.zyuiop.ovhapi.api.objects.order.Price priceWithTax) { 
		this.priceWithTax = priceWithTax;
	} 

	public Refund priceWithTax(net.zyuiop.ovhapi.api.objects.order.Price priceWithTax) { 
		this.priceWithTax = priceWithTax;
		return this;
	} 

	public java.lang.String getOriginalBillId() { 
		return this.originalBillId;
	} 

	public void setOriginalBillId(java.lang.String originalBillId) { 
		this.originalBillId = originalBillId;
	} 

	public Refund originalBillId(java.lang.String originalBillId) { 
		this.originalBillId = originalBillId;
		return this;
	} 

}
