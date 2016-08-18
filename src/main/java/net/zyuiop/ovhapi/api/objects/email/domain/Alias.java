package net.zyuiop.ovhapi.api.objects.email.domain;

/**
 * Aliases
 */

public class Alias { 

	private java.lang.String to;
	private java.lang.String from;
	private java.lang.String id;

	public Alias() {
	}

	public java.lang.String getTo() { 
		return this.to;
	} 

	public void setTo(java.lang.String to) { 
		this.to = to;
	} 

	public Alias to(java.lang.String to) { 
		this.to = to;
		return this;
	} 

	public java.lang.String getFrom() { 
		return this.from;
	} 

	public void setFrom(java.lang.String from) { 
		this.from = from;
	} 

	public Alias from(java.lang.String from) { 
		this.from = from;
		return this;
	} 

	public java.lang.String getId() { 
		return this.id;
	} 

	public void setId(java.lang.String id) { 
		this.id = id;
	} 

	public Alias id(java.lang.String id) { 
		this.id = id;
		return this;
	} 

}
