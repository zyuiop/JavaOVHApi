package net.zyuiop.ovhapi.api.objects.hosting.web;

/**
 * Hosting automated emails
 */

public class Email { 

	private long bounce;
	private java.lang.String email;
	private long maxPerDay;
	private long sentToday;
	private long sent;
	private java.lang.String state;

	public Email() {
	}

	public long getBounce() { 
		return this.bounce;
	} 

	public void setBounce(long bounce) { 
		this.bounce = bounce;
	} 

	public Email bounce(long bounce) { 
		this.bounce = bounce;
		return this;
	} 

	public java.lang.String getEmail() { 
		return this.email;
	} 

	public void setEmail(java.lang.String email) { 
		this.email = email;
	} 

	public Email email(java.lang.String email) { 
		this.email = email;
		return this;
	} 

	public long getMaxPerDay() { 
		return this.maxPerDay;
	} 

	public void setMaxPerDay(long maxPerDay) { 
		this.maxPerDay = maxPerDay;
	} 

	public Email maxPerDay(long maxPerDay) { 
		this.maxPerDay = maxPerDay;
		return this;
	} 

	public long getSentToday() { 
		return this.sentToday;
	} 

	public void setSentToday(long sentToday) { 
		this.sentToday = sentToday;
	} 

	public Email sentToday(long sentToday) { 
		this.sentToday = sentToday;
		return this;
	} 

	public long getSent() { 
		return this.sent;
	} 

	public void setSent(long sent) { 
		this.sent = sent;
	} 

	public Email sent(long sent) { 
		this.sent = sent;
		return this;
	} 

	public java.lang.String getState() { 
		return this.state;
	} 

	public void setState(java.lang.String state) { 
		this.state = state;
	} 

	public Email state(java.lang.String state) { 
		this.state = state;
		return this;
	} 

}
