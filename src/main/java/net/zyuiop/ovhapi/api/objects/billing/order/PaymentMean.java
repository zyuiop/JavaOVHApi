package net.zyuiop.ovhapi.api.objects.billing.order;

/**
 * All data needed to use a payment mean
 */

public class PaymentMean { 

	private net.zyuiop.ovhapi.api.objects.billing.order.paymentmean.HttpParameter[] parameters;
	private java.lang.String logo;
	private java.lang.String httpMethod;
	private java.lang.String htmlForm;
	private java.lang.String subType;
	private double fee;
	private java.lang.String url;

	public PaymentMean() {
	}

	public net.zyuiop.ovhapi.api.objects.billing.order.paymentmean.HttpParameter[] getParameters() { 
		return this.parameters;
	} 

	public void setParameters(net.zyuiop.ovhapi.api.objects.billing.order.paymentmean.HttpParameter[] parameters) { 
		this.parameters = parameters;
	} 

	public PaymentMean parameters(net.zyuiop.ovhapi.api.objects.billing.order.paymentmean.HttpParameter[] parameters) { 
		this.parameters = parameters;
		return this;
	} 

	public java.lang.String getLogo() { 
		return this.logo;
	} 

	public void setLogo(java.lang.String logo) { 
		this.logo = logo;
	} 

	public PaymentMean logo(java.lang.String logo) { 
		this.logo = logo;
		return this;
	} 

	public java.lang.String getHttpMethod() { 
		return this.httpMethod;
	} 

	public void setHttpMethod(java.lang.String httpMethod) { 
		this.httpMethod = httpMethod;
	} 

	public PaymentMean httpMethod(java.lang.String httpMethod) { 
		this.httpMethod = httpMethod;
		return this;
	} 

	public java.lang.String getHtmlForm() { 
		return this.htmlForm;
	} 

	public void setHtmlForm(java.lang.String htmlForm) { 
		this.htmlForm = htmlForm;
	} 

	public PaymentMean htmlForm(java.lang.String htmlForm) { 
		this.htmlForm = htmlForm;
		return this;
	} 

	public java.lang.String getSubType() { 
		return this.subType;
	} 

	public void setSubType(java.lang.String subType) { 
		this.subType = subType;
	} 

	public PaymentMean subType(java.lang.String subType) { 
		this.subType = subType;
		return this;
	} 

	public double getFee() { 
		return this.fee;
	} 

	public void setFee(double fee) { 
		this.fee = fee;
	} 

	public PaymentMean fee(double fee) { 
		this.fee = fee;
		return this;
	} 

	public java.lang.String getUrl() { 
		return this.url;
	} 

	public void setUrl(java.lang.String url) { 
		this.url = url;
	} 

	public PaymentMean url(java.lang.String url) { 
		this.url = url;
		return this;
	} 

}
