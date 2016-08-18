package net.zyuiop.ovhapi.api.objects.nichandle;

/**
 * Message details
 */

public class SupportContent { 

	private java.util.Date date;
	private java.lang.String type;
	private java.lang.String message;

	public SupportContent() {
	}

	public java.util.Date getDate() { 
		return this.date;
	} 

	public void setDate(java.util.Date date) { 
		this.date = date;
	} 

	public SupportContent date(java.util.Date date) { 
		this.date = date;
		return this;
	} 

	public java.lang.String getType() { 
		return this.type;
	} 

	public void setType(java.lang.String type) { 
		this.type = type;
	} 

	public SupportContent type(java.lang.String type) { 
		this.type = type;
		return this;
	} 

	public java.lang.String getMessage() { 
		return this.message;
	} 

	public void setMessage(java.lang.String message) { 
		this.message = message;
	} 

	public SupportContent message(java.lang.String message) { 
		this.message = message;
		return this;
	} 

}
