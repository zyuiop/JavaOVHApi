package net.zyuiop.ovhapi.impl.objects.nichandle;

import net.zyuiop.ovhapi.api.objects.nichandle.EmailNotification;
/**
 * Email notification
 */

public class EmailNotificationImpl implements EmailNotification { 

	private java.lang.String body;
	private java.lang.String subject;
	private java.util.Date date;
	private long id;

	public EmailNotificationImpl() {
	}

	public java.lang.String getBody() { 
		return this.body;
	} 

	public void setBody(java.lang.String body) { 
		this.body = body;
	} 

	public EmailNotificationImpl body(java.lang.String body) { 
		this.body = body;
		return this;
	} 

	public java.lang.String getSubject() { 
		return this.subject;
	} 

	public void setSubject(java.lang.String subject) { 
		this.subject = subject;
	} 

	public EmailNotificationImpl subject(java.lang.String subject) { 
		this.subject = subject;
		return this;
	} 

	public java.util.Date getDate() { 
		return this.date;
	} 

	public void setDate(java.util.Date date) { 
		this.date = date;
	} 

	public EmailNotificationImpl date(java.util.Date date) { 
		this.date = date;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public EmailNotificationImpl id(long id) { 
		this.id = id;
		return this;
	} 

}
