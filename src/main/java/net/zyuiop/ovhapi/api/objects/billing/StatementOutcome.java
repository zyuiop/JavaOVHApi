package net.zyuiop.ovhapi.api.objects.billing;

/**
 * Details about a statement outcome
 */

public class StatementOutcome { 

	private java.lang.String country;
	private java.lang.String pdfUrl;
	private java.util.Date date;
	private net.zyuiop.ovhapi.api.objects.order.Price amount;
	private java.lang.String password;
	private long orderId;
	private java.lang.String url;
	private java.lang.String statementOutcomeId;

	public StatementOutcome() {
	}

	public java.lang.String getCountry() { 
		return this.country;
	} 

	public void setCountry(java.lang.String country) { 
		this.country = country;
	} 

	public StatementOutcome country(java.lang.String country) { 
		this.country = country;
		return this;
	} 

	public java.lang.String getPdfUrl() { 
		return this.pdfUrl;
	} 

	public void setPdfUrl(java.lang.String pdfUrl) { 
		this.pdfUrl = pdfUrl;
	} 

	public StatementOutcome pdfUrl(java.lang.String pdfUrl) { 
		this.pdfUrl = pdfUrl;
		return this;
	} 

	public java.util.Date getDate() { 
		return this.date;
	} 

	public void setDate(java.util.Date date) { 
		this.date = date;
	} 

	public StatementOutcome date(java.util.Date date) { 
		this.date = date;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.order.Price getAmount() { 
		return this.amount;
	} 

	public void setAmount(net.zyuiop.ovhapi.api.objects.order.Price amount) { 
		this.amount = amount;
	} 

	public StatementOutcome amount(net.zyuiop.ovhapi.api.objects.order.Price amount) { 
		this.amount = amount;
		return this;
	} 

	public java.lang.String getPassword() { 
		return this.password;
	} 

	public void setPassword(java.lang.String password) { 
		this.password = password;
	} 

	public StatementOutcome password(java.lang.String password) { 
		this.password = password;
		return this;
	} 

	public long getOrderId() { 
		return this.orderId;
	} 

	public void setOrderId(long orderId) { 
		this.orderId = orderId;
	} 

	public StatementOutcome orderId(long orderId) { 
		this.orderId = orderId;
		return this;
	} 

	public java.lang.String getUrl() { 
		return this.url;
	} 

	public void setUrl(java.lang.String url) { 
		this.url = url;
	} 

	public StatementOutcome url(java.lang.String url) { 
		this.url = url;
		return this;
	} 

	public java.lang.String getStatementOutcomeId() { 
		return this.statementOutcomeId;
	} 

	public void setStatementOutcomeId(java.lang.String statementOutcomeId) { 
		this.statementOutcomeId = statementOutcomeId;
	} 

	public StatementOutcome statementOutcomeId(java.lang.String statementOutcomeId) { 
		this.statementOutcomeId = statementOutcomeId;
		return this;
	} 

}
