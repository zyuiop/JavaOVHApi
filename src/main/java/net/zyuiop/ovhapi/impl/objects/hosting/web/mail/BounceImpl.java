package net.zyuiop.ovhapi.impl.objects.hosting.web.mail;

import net.zyuiop.ovhapi.api.objects.hosting.web.mail.Bounce;
/**
 * The volume history type
 */

public class BounceImpl implements Bounce { 

	private java.lang.String to;
	private java.util.Date date;
	private java.lang.String message;

	public BounceImpl() {
	}

	public java.lang.String getTo() { 
		return this.to;
	} 

	public void setTo(java.lang.String to) { 
		this.to = to;
	} 

	public BounceImpl to(java.lang.String to) { 
		this.to = to;
		return this;
	} 

	public java.util.Date getDate() { 
		return this.date;
	} 

	public void setDate(java.util.Date date) { 
		this.date = date;
	} 

	public BounceImpl date(java.util.Date date) { 
		this.date = date;
		return this;
	} 

	public java.lang.String getMessage() { 
		return this.message;
	} 

	public void setMessage(java.lang.String message) { 
		this.message = message;
	} 

	public BounceImpl message(java.lang.String message) { 
		this.message = message;
		return this;
	} 

}
