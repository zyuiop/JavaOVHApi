package net.zyuiop.ovhapi.api.objects.sms;

/**
 * SMS senders
 */

public class Sender { 

	private java.lang.String comment;
	private java.lang.String sender;
	private java.lang.String status;
	private java.lang.String type;
	private java.lang.String description;
	private java.lang.String referer;
	private java.lang.String validationMedia;

	public Sender() {
	}

	public java.lang.String getComment() { 
		return this.comment;
	} 

	public void setComment(java.lang.String comment) { 
		this.comment = comment;
	} 

	public Sender comment(java.lang.String comment) { 
		this.comment = comment;
		return this;
	} 

	public java.lang.String getSender() { 
		return this.sender;
	} 

	public void setSender(java.lang.String sender) { 
		this.sender = sender;
	} 

	public Sender sender(java.lang.String sender) { 
		this.sender = sender;
		return this;
	} 

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public Sender status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public java.lang.String getType() { 
		return this.type;
	} 

	public void setType(java.lang.String type) { 
		this.type = type;
	} 

	public Sender type(java.lang.String type) { 
		this.type = type;
		return this;
	} 

	public java.lang.String getDescription() { 
		return this.description;
	} 

	public void setDescription(java.lang.String description) { 
		this.description = description;
	} 

	public Sender description(java.lang.String description) { 
		this.description = description;
		return this;
	} 

	public java.lang.String getReferer() { 
		return this.referer;
	} 

	public void setReferer(java.lang.String referer) { 
		this.referer = referer;
	} 

	public Sender referer(java.lang.String referer) { 
		this.referer = referer;
		return this;
	} 

	public java.lang.String getValidationMedia() { 
		return this.validationMedia;
	} 

	public void setValidationMedia(java.lang.String validationMedia) { 
		this.validationMedia = validationMedia;
	} 

	public Sender validationMedia(java.lang.String validationMedia) { 
		this.validationMedia = validationMedia;
		return this;
	} 

}
