package net.zyuiop.ovhapi.api.objects.hosting.web.mail;

/**
 * The volume history type
 */

public class Bounce { 

	private java.lang.String to;
	private java.util.Date date;
	private java.lang.String message;

	public Bounce() {
	}

	public java.lang.String getTo() { 
		return this.to;
	} 

	public void setTo(java.lang.String to) { 
		this.to = to;
	} 

	public Bounce to(java.lang.String to) { 
		this.to = to;
		return this;
	} 

	public java.util.Date getDate() { 
		return this.date;
	} 

	public void setDate(java.util.Date date) { 
		this.date = date;
	} 

	public Bounce date(java.util.Date date) { 
		this.date = date;
		return this;
	} 

	public java.lang.String getMessage() { 
		return this.message;
	} 

	public void setMessage(java.lang.String message) { 
		this.message = message;
	} 

	public Bounce message(java.lang.String message) { 
		this.message = message;
		return this;
	} 

}
