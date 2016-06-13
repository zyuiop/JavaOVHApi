package net.zyuiop.ovhapi.impl.objects.sms;

import net.zyuiop.ovhapi.api.objects.sms.Incoming;
/**
 * Sms history of sms incoming received
 */

public class IncomingImpl implements Incoming { 

	private double credits;
	private java.lang.String sender;
	private java.util.Date creationDatetime;
	private long id;
	private java.lang.String tag;
	private java.lang.String message;

	public IncomingImpl() {
	}

	public double getCredits() { 
		return this.credits;
	} 

	public void setCredits(double credits) { 
		this.credits = credits;
	} 

	public IncomingImpl credits(double credits) { 
		this.credits = credits;
		return this;
	} 

	public java.lang.String getSender() { 
		return this.sender;
	} 

	public void setSender(java.lang.String sender) { 
		this.sender = sender;
	} 

	public IncomingImpl sender(java.lang.String sender) { 
		this.sender = sender;
		return this;
	} 

	public java.util.Date getCreationDatetime() { 
		return this.creationDatetime;
	} 

	public void setCreationDatetime(java.util.Date creationDatetime) { 
		this.creationDatetime = creationDatetime;
	} 

	public IncomingImpl creationDatetime(java.util.Date creationDatetime) { 
		this.creationDatetime = creationDatetime;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public IncomingImpl id(long id) { 
		this.id = id;
		return this;
	} 

	public java.lang.String getTag() { 
		return this.tag;
	} 

	public void setTag(java.lang.String tag) { 
		this.tag = tag;
	} 

	public IncomingImpl tag(java.lang.String tag) { 
		this.tag = tag;
		return this;
	} 

	public java.lang.String getMessage() { 
		return this.message;
	} 

	public void setMessage(java.lang.String message) { 
		this.message = message;
	} 

	public IncomingImpl message(java.lang.String message) { 
		this.message = message;
		return this;
	} 

}
