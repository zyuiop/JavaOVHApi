package net.zyuiop.ovhapi.api.objects.nichandle;

/**
 * Email notification
 */

public class EmailNotification { 

	private java.lang.String body;
	private java.lang.String subject;
	private java.util.Date date;
	private long id;

	public EmailNotification() {
	}

	public java.lang.String getBody() { 
		return this.body;
	} 

	public void setBody(java.lang.String body) { 
		this.body = body;
	} 

	public EmailNotification body(java.lang.String body) { 
		this.body = body;
		return this;
	} 

	public java.lang.String getSubject() { 
		return this.subject;
	} 

	public void setSubject(java.lang.String subject) { 
		this.subject = subject;
	} 

	public EmailNotification subject(java.lang.String subject) { 
		this.subject = subject;
		return this;
	} 

	public java.util.Date getDate() { 
		return this.date;
	} 

	public void setDate(java.util.Date date) { 
		this.date = date;
	} 

	public EmailNotification date(java.util.Date date) { 
		this.date = date;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public EmailNotification id(long id) { 
		this.id = id;
		return this;
	} 

}
