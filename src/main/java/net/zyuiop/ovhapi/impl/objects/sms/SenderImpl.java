package net.zyuiop.ovhapi.impl.objects.sms;

import net.zyuiop.ovhapi.api.objects.sms.Sender;
/**
 * SMS senders
 */

public class SenderImpl implements Sender { 

	private java.lang.String comment;
	private java.lang.String sender;
	private java.lang.String status;
	private java.lang.String type;
	private java.lang.String description;
	private java.lang.String referer;
	private java.lang.String validationMedia;

	public SenderImpl() {
	}

	public java.lang.String getComment() { 
		return this.comment;
	} 

	public void setComment(java.lang.String comment) { 
		this.comment = comment;
	} 

	public SenderImpl comment(java.lang.String comment) { 
		this.comment = comment;
		return this;
	} 

	public java.lang.String getSender() { 
		return this.sender;
	} 

	public void setSender(java.lang.String sender) { 
		this.sender = sender;
	} 

	public SenderImpl sender(java.lang.String sender) { 
		this.sender = sender;
		return this;
	} 

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public SenderImpl status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public java.lang.String getType() { 
		return this.type;
	} 

	public void setType(java.lang.String type) { 
		this.type = type;
	} 

	public SenderImpl type(java.lang.String type) { 
		this.type = type;
		return this;
	} 

	public java.lang.String getDescription() { 
		return this.description;
	} 

	public void setDescription(java.lang.String description) { 
		this.description = description;
	} 

	public SenderImpl description(java.lang.String description) { 
		this.description = description;
		return this;
	} 

	public java.lang.String getReferer() { 
		return this.referer;
	} 

	public void setReferer(java.lang.String referer) { 
		this.referer = referer;
	} 

	public SenderImpl referer(java.lang.String referer) { 
		this.referer = referer;
		return this;
	} 

	public java.lang.String getValidationMedia() { 
		return this.validationMedia;
	} 

	public void setValidationMedia(java.lang.String validationMedia) { 
		this.validationMedia = validationMedia;
	} 

	public SenderImpl validationMedia(java.lang.String validationMedia) { 
		this.validationMedia = validationMedia;
		return this;
	} 

}
