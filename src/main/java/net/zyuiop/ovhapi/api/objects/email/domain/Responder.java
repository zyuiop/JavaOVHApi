package net.zyuiop.ovhapi.api.objects.email.domain;

/**
 * Responder
 */

public class Responder { 

	private boolean copy;
	private java.util.Date to;
	private java.lang.String copyTo;
	private java.lang.String account;
	private java.util.Date from;
	private java.lang.String content;

	public Responder() {
	}

	public boolean getCopy() { 
		return this.copy;
	} 

	public void setCopy(boolean copy) { 
		this.copy = copy;
	} 

	public Responder copy(boolean copy) { 
		this.copy = copy;
		return this;
	} 

	public java.util.Date getTo() { 
		return this.to;
	} 

	public void setTo(java.util.Date to) { 
		this.to = to;
	} 

	public Responder to(java.util.Date to) { 
		this.to = to;
		return this;
	} 

	public java.lang.String getCopyTo() { 
		return this.copyTo;
	} 

	public void setCopyTo(java.lang.String copyTo) { 
		this.copyTo = copyTo;
	} 

	public Responder copyTo(java.lang.String copyTo) { 
		this.copyTo = copyTo;
		return this;
	} 

	public java.lang.String getAccount() { 
		return this.account;
	} 

	public void setAccount(java.lang.String account) { 
		this.account = account;
	} 

	public Responder account(java.lang.String account) { 
		this.account = account;
		return this;
	} 

	public java.util.Date getFrom() { 
		return this.from;
	} 

	public void setFrom(java.util.Date from) { 
		this.from = from;
	} 

	public Responder from(java.util.Date from) { 
		this.from = from;
		return this;
	} 

	public java.lang.String getContent() { 
		return this.content;
	} 

	public void setContent(java.lang.String content) { 
		this.content = content;
	} 

	public Responder content(java.lang.String content) { 
		this.content = content;
		return this;
	} 

}
