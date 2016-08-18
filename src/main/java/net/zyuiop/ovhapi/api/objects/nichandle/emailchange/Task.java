package net.zyuiop.ovhapi.api.objects.nichandle.emailchange;

/**
 * Task running an email change on an account
 */

public class Task { 

	private java.util.Date dateDone;
	private long id;
	private java.util.Date dateRequest;
	private java.lang.String state;
	private java.lang.String newEmail;

	public Task() {
	}

	public java.util.Date getDateDone() { 
		return this.dateDone;
	} 

	public void setDateDone(java.util.Date dateDone) { 
		this.dateDone = dateDone;
	} 

	public Task dateDone(java.util.Date dateDone) { 
		this.dateDone = dateDone;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public Task id(long id) { 
		this.id = id;
		return this;
	} 

	public java.util.Date getDateRequest() { 
		return this.dateRequest;
	} 

	public void setDateRequest(java.util.Date dateRequest) { 
		this.dateRequest = dateRequest;
	} 

	public Task dateRequest(java.util.Date dateRequest) { 
		this.dateRequest = dateRequest;
		return this;
	} 

	public java.lang.String getState() { 
		return this.state;
	} 

	public void setState(java.lang.String state) { 
		this.state = state;
	} 

	public Task state(java.lang.String state) { 
		this.state = state;
		return this;
	} 

	public java.lang.String getNewEmail() { 
		return this.newEmail;
	} 

	public void setNewEmail(java.lang.String newEmail) { 
		this.newEmail = newEmail;
	} 

	public Task newEmail(java.lang.String newEmail) { 
		this.newEmail = newEmail;
		return this;
	} 

}
