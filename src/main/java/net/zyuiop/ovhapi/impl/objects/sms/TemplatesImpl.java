package net.zyuiop.ovhapi.impl.objects.sms;

import net.zyuiop.ovhapi.api.objects.sms.Templates;
/**
 * A structure describing all information about templates informations
 */

public class TemplatesImpl implements Templates { 

	private boolean customizedEmailMode;
	private java.lang.String emailBody;
	private boolean customizedSmsMode;
	private java.lang.String emailSubject;
	private java.lang.String smsBody;
	private java.lang.String emailFrom;

	public TemplatesImpl() {
	}

	public boolean getCustomizedEmailMode() { 
		return this.customizedEmailMode;
	} 

	public void setCustomizedEmailMode(boolean customizedEmailMode) { 
		this.customizedEmailMode = customizedEmailMode;
	} 

	public TemplatesImpl customizedEmailMode(boolean customizedEmailMode) { 
		this.customizedEmailMode = customizedEmailMode;
		return this;
	} 

	public java.lang.String getEmailBody() { 
		return this.emailBody;
	} 

	public void setEmailBody(java.lang.String emailBody) { 
		this.emailBody = emailBody;
	} 

	public TemplatesImpl emailBody(java.lang.String emailBody) { 
		this.emailBody = emailBody;
		return this;
	} 

	public boolean getCustomizedSmsMode() { 
		return this.customizedSmsMode;
	} 

	public void setCustomizedSmsMode(boolean customizedSmsMode) { 
		this.customizedSmsMode = customizedSmsMode;
	} 

	public TemplatesImpl customizedSmsMode(boolean customizedSmsMode) { 
		this.customizedSmsMode = customizedSmsMode;
		return this;
	} 

	public java.lang.String getEmailSubject() { 
		return this.emailSubject;
	} 

	public void setEmailSubject(java.lang.String emailSubject) { 
		this.emailSubject = emailSubject;
	} 

	public TemplatesImpl emailSubject(java.lang.String emailSubject) { 
		this.emailSubject = emailSubject;
		return this;
	} 

	public java.lang.String getSmsBody() { 
		return this.smsBody;
	} 

	public void setSmsBody(java.lang.String smsBody) { 
		this.smsBody = smsBody;
	} 

	public TemplatesImpl smsBody(java.lang.String smsBody) { 
		this.smsBody = smsBody;
		return this;
	} 

	public java.lang.String getEmailFrom() { 
		return this.emailFrom;
	} 

	public void setEmailFrom(java.lang.String emailFrom) { 
		this.emailFrom = emailFrom;
	} 

	public TemplatesImpl emailFrom(java.lang.String emailFrom) { 
		this.emailFrom = emailFrom;
		return this;
	} 

}
