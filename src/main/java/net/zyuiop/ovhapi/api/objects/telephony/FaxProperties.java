package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Fax properties
 */

public class FaxProperties { 

	private java.lang.String callNumber;
	private java.lang.String fromName;
	private java.lang.String[] redirectionEmail;
	private java.lang.String faxQuality;
	private long faxMaxCall;
	private java.lang.String fromEmail;
	private java.lang.String countryCode;

	public FaxProperties() {
	}

	public java.lang.String getCallNumber() { 
		return this.callNumber;
	} 

	public void setCallNumber(java.lang.String callNumber) { 
		this.callNumber = callNumber;
	} 

	public FaxProperties callNumber(java.lang.String callNumber) { 
		this.callNumber = callNumber;
		return this;
	} 

	public java.lang.String getFromName() { 
		return this.fromName;
	} 

	public void setFromName(java.lang.String fromName) { 
		this.fromName = fromName;
	} 

	public FaxProperties fromName(java.lang.String fromName) { 
		this.fromName = fromName;
		return this;
	} 

	public java.lang.String[] getRedirectionEmail() { 
		return this.redirectionEmail;
	} 

	public void setRedirectionEmail(java.lang.String[] redirectionEmail) { 
		this.redirectionEmail = redirectionEmail;
	} 

	public FaxProperties redirectionEmail(java.lang.String[] redirectionEmail) { 
		this.redirectionEmail = redirectionEmail;
		return this;
	} 

	public java.lang.String getFaxQuality() { 
		return this.faxQuality;
	} 

	public void setFaxQuality(java.lang.String faxQuality) { 
		this.faxQuality = faxQuality;
	} 

	public FaxProperties faxQuality(java.lang.String faxQuality) { 
		this.faxQuality = faxQuality;
		return this;
	} 

	public long getFaxMaxCall() { 
		return this.faxMaxCall;
	} 

	public void setFaxMaxCall(long faxMaxCall) { 
		this.faxMaxCall = faxMaxCall;
	} 

	public FaxProperties faxMaxCall(long faxMaxCall) { 
		this.faxMaxCall = faxMaxCall;
		return this;
	} 

	public java.lang.String getFromEmail() { 
		return this.fromEmail;
	} 

	public void setFromEmail(java.lang.String fromEmail) { 
		this.fromEmail = fromEmail;
	} 

	public FaxProperties fromEmail(java.lang.String fromEmail) { 
		this.fromEmail = fromEmail;
		return this;
	} 

	public java.lang.String getCountryCode() { 
		return this.countryCode;
	} 

	public void setCountryCode(java.lang.String countryCode) { 
		this.countryCode = countryCode;
	} 

	public FaxProperties countryCode(java.lang.String countryCode) { 
		this.countryCode = countryCode;
		return this;
	} 

}
