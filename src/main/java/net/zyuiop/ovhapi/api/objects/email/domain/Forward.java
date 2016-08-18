package net.zyuiop.ovhapi.api.objects.email.domain;

/**
 * Forward
 */

public class Forward { 

	private java.lang.String to;
	private java.lang.String from;
	private java.lang.String id;

	public Forward() {
	}

	public java.lang.String getTo() { 
		return this.to;
	} 

	public void setTo(java.lang.String to) { 
		this.to = to;
	} 

	public Forward to(java.lang.String to) { 
		this.to = to;
		return this;
	} 

	public java.lang.String getFrom() { 
		return this.from;
	} 

	public void setFrom(java.lang.String from) { 
		this.from = from;
	} 

	public Forward from(java.lang.String from) { 
		this.from = from;
		return this;
	} 

	public java.lang.String getId() { 
		return this.id;
	} 

	public void setId(java.lang.String id) { 
		this.id = id;
	} 

	public Forward id(java.lang.String id) { 
		this.id = id;
		return this;
	} 

}
