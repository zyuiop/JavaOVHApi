package net.zyuiop.ovhapi.impl.objects.email.exchange;

import net.zyuiop.ovhapi.api.objects.email.exchange.DailyLicense;
/**
 * Exchange account license per day
 */

public class DailyLicenseImpl implements DailyLicense { 

	private java.util.Date date;
	private long outlookQuantity;
	private net.zyuiop.ovhapi.impl.objects.email.exchange.AccountLicenseImpl[] accountLicense;

	public DailyLicenseImpl() {
	}

	public java.util.Date getDate() { 
		return this.date;
	} 

	public void setDate(java.util.Date date) { 
		this.date = date;
	} 

	public DailyLicenseImpl date(java.util.Date date) { 
		this.date = date;
		return this;
	} 

	public long getOutlookQuantity() { 
		return this.outlookQuantity;
	} 

	public void setOutlookQuantity(long outlookQuantity) { 
		this.outlookQuantity = outlookQuantity;
	} 

	public DailyLicenseImpl outlookQuantity(long outlookQuantity) { 
		this.outlookQuantity = outlookQuantity;
		return this;
	} 

	public net.zyuiop.ovhapi.impl.objects.email.exchange.AccountLicenseImpl[] getAccountLicense() { 
		return this.accountLicense;
	} 

	public void setAccountLicense(net.zyuiop.ovhapi.impl.objects.email.exchange.AccountLicenseImpl[] accountLicense) { 
		this.accountLicense = accountLicense;
	} 

	public DailyLicenseImpl accountLicense(net.zyuiop.ovhapi.impl.objects.email.exchange.AccountLicenseImpl[] accountLicense) { 
		this.accountLicense = accountLicense;
		return this;
	} 

}
