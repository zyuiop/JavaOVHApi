package net.zyuiop.ovhapi.api.objects.billing;

/**
 * Details about a statement income
 */

public class StatementIncome { 

	private net.zyuiop.ovhapi.api.objects.order.Price amount;
	private java.lang.String password;
	private java.lang.String pdfUrl;
	private java.lang.String statementIncomeId;
	private long orderId;
	private java.util.Date date;
	private java.lang.String url;

	public StatementIncome() {
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getAmount() { 
		return this.amount;
	} 

	public void setAmount(net.zyuiop.ovhapi.api.objects.order.Price amount) { 
		this.amount = amount;
	} 

	public StatementIncome amount(net.zyuiop.ovhapi.api.objects.order.Price amount) { 
		this.amount = amount;
		return this;
	} 

	public java.lang.String getPassword() { 
		return this.password;
	} 

	public void setPassword(java.lang.String password) { 
		this.password = password;
	} 

	public StatementIncome password(java.lang.String password) { 
		this.password = password;
		return this;
	} 

	public java.lang.String getPdfUrl() { 
		return this.pdfUrl;
	} 

	public void setPdfUrl(java.lang.String pdfUrl) { 
		this.pdfUrl = pdfUrl;
	} 

	public StatementIncome pdfUrl(java.lang.String pdfUrl) { 
		this.pdfUrl = pdfUrl;
		return this;
	} 

	public java.lang.String getStatementIncomeId() { 
		return this.statementIncomeId;
	} 

	public void setStatementIncomeId(java.lang.String statementIncomeId) { 
		this.statementIncomeId = statementIncomeId;
	} 

	public StatementIncome statementIncomeId(java.lang.String statementIncomeId) { 
		this.statementIncomeId = statementIncomeId;
		return this;
	} 

	public long getOrderId() { 
		return this.orderId;
	} 

	public void setOrderId(long orderId) { 
		this.orderId = orderId;
	} 

	public StatementIncome orderId(long orderId) { 
		this.orderId = orderId;
		return this;
	} 

	public java.util.Date getDate() { 
		return this.date;
	} 

	public void setDate(java.util.Date date) { 
		this.date = date;
	} 

	public StatementIncome date(java.util.Date date) { 
		this.date = date;
		return this;
	} 

	public java.lang.String getUrl() { 
		return this.url;
	} 

	public void setUrl(java.lang.String url) { 
		this.url = url;
	} 

	public StatementIncome url(java.lang.String url) { 
		this.url = url;
		return this;
	} 

}
