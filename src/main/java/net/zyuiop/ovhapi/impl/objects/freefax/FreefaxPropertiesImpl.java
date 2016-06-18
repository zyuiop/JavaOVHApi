package net.zyuiop.ovhapi.impl.objects.freefax;

import net.zyuiop.ovhapi.api.objects.freefax.FreefaxProperties;
/**
 * Freefax properties
 */

public class FreefaxPropertiesImpl implements FreefaxProperties { 

	private java.lang.String fromName;
	private java.lang.String[] redirectionEmail;
	private java.lang.String number;
	private java.lang.String faxQuality;
	private long faxMaxCall;
	private java.lang.String faxTagLine;
	private java.lang.String fromEmail;

	public FreefaxPropertiesImpl() {
	}

	public java.lang.String getFromName() { 
		return this.fromName;
	} 

	public void setFromName(java.lang.String fromName) { 
		this.fromName = fromName;
	} 

	public FreefaxPropertiesImpl fromName(java.lang.String fromName) { 
		this.fromName = fromName;
		return this;
	} 

	public java.lang.String[] getRedirectionEmail() { 
		return this.redirectionEmail;
	} 

	public void setRedirectionEmail(java.lang.String[] redirectionEmail) { 
		this.redirectionEmail = redirectionEmail;
	} 

	public FreefaxPropertiesImpl redirectionEmail(java.lang.String[] redirectionEmail) { 
		this.redirectionEmail = redirectionEmail;
		return this;
	} 

	public java.lang.String getNumber() { 
		return this.number;
	} 

	public void setNumber(java.lang.String number) { 
		this.number = number;
	} 

	public FreefaxPropertiesImpl number(java.lang.String number) { 
		this.number = number;
		return this;
	} 

	public java.lang.String getFaxQuality() { 
		return this.faxQuality;
	} 

	public void setFaxQuality(java.lang.String faxQuality) { 
		this.faxQuality = faxQuality;
	} 

	public FreefaxPropertiesImpl faxQuality(java.lang.String faxQuality) { 
		this.faxQuality = faxQuality;
		return this;
	} 

	public long getFaxMaxCall() { 
		return this.faxMaxCall;
	} 

	public void setFaxMaxCall(long faxMaxCall) { 
		this.faxMaxCall = faxMaxCall;
	} 

	public FreefaxPropertiesImpl faxMaxCall(long faxMaxCall) { 
		this.faxMaxCall = faxMaxCall;
		return this;
	} 

	public java.lang.String getFaxTagLine() { 
		return this.faxTagLine;
	} 

	public void setFaxTagLine(java.lang.String faxTagLine) { 
		this.faxTagLine = faxTagLine;
	} 

	public FreefaxPropertiesImpl faxTagLine(java.lang.String faxTagLine) { 
		this.faxTagLine = faxTagLine;
		return this;
	} 

	public java.lang.String getFromEmail() { 
		return this.fromEmail;
	} 

	public void setFromEmail(java.lang.String fromEmail) { 
		this.fromEmail = fromEmail;
	} 

	public FreefaxPropertiesImpl fromEmail(java.lang.String fromEmail) { 
		this.fromEmail = fromEmail;
		return this;
	} 

}
