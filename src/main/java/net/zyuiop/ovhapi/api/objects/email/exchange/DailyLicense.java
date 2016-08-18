package net.zyuiop.ovhapi.api.objects.email.exchange;

/**
 * Exchange account license per day
 */

public class DailyLicense { 

	private java.util.Date date;
	private long outlookQuantity;
	private net.zyuiop.ovhapi.api.objects.email.exchange.AccountLicense[] accountLicense;

	public DailyLicense() {
	}

	public java.util.Date getDate() { 
		return this.date;
	} 

	public void setDate(java.util.Date date) { 
		this.date = date;
	} 

	public DailyLicense date(java.util.Date date) { 
		this.date = date;
		return this;
	} 

	public long getOutlookQuantity() { 
		return this.outlookQuantity;
	} 

	public void setOutlookQuantity(long outlookQuantity) { 
		this.outlookQuantity = outlookQuantity;
	} 

	public DailyLicense outlookQuantity(long outlookQuantity) { 
		this.outlookQuantity = outlookQuantity;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.email.exchange.AccountLicense[] getAccountLicense() { 
		return this.accountLicense;
	} 

	public void setAccountLicense(net.zyuiop.ovhapi.api.objects.email.exchange.AccountLicense[] accountLicense) { 
		this.accountLicense = accountLicense;
	} 

	public DailyLicense accountLicense(net.zyuiop.ovhapi.api.objects.email.exchange.AccountLicense[] accountLicense) { 
		this.accountLicense = accountLicense;
		return this;
	} 

}
