package net.zyuiop.ovhapi.api.objects.iploadbalancing;

/**
 * Ssl
 */

public class Ssl { 

	private java.lang.String serial;
	private java.lang.String subject;
	private long id;
	private java.lang.String type;

	public Ssl() {
	}

	public java.lang.String getSerial() { 
		return this.serial;
	} 

	public void setSerial(java.lang.String serial) { 
		this.serial = serial;
	} 

	public Ssl serial(java.lang.String serial) { 
		this.serial = serial;
		return this;
	} 

	public java.lang.String getSubject() { 
		return this.subject;
	} 

	public void setSubject(java.lang.String subject) { 
		this.subject = subject;
	} 

	public Ssl subject(java.lang.String subject) { 
		this.subject = subject;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public Ssl id(long id) { 
		this.id = id;
		return this;
	} 

	public java.lang.String getType() { 
		return this.type;
	} 

	public void setType(java.lang.String type) { 
		this.type = type;
	} 

	public Ssl type(java.lang.String type) { 
		this.type = type;
		return this;
	} 

}
