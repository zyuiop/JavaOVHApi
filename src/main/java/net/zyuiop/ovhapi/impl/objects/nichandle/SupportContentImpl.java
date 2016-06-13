package net.zyuiop.ovhapi.impl.objects.nichandle;

import net.zyuiop.ovhapi.api.objects.nichandle.SupportContent;
/**
 * Message details
 */

public class SupportContentImpl implements SupportContent { 

	private java.util.Date date;
	private java.lang.String type;
	private java.lang.String message;

	public SupportContentImpl() {
	}

	public java.util.Date getDate() { 
		return this.date;
	} 

	public void setDate(java.util.Date date) { 
		this.date = date;
	} 

	public SupportContentImpl date(java.util.Date date) { 
		this.date = date;
		return this;
	} 

	public java.lang.String getType() { 
		return this.type;
	} 

	public void setType(java.lang.String type) { 
		this.type = type;
	} 

	public SupportContentImpl type(java.lang.String type) { 
		this.type = type;
		return this;
	} 

	public java.lang.String getMessage() { 
		return this.message;
	} 

	public void setMessage(java.lang.String message) { 
		this.message = message;
	} 

	public SupportContentImpl message(java.lang.String message) { 
		this.message = message;
		return this;
	} 

}
