package net.zyuiop.ovhapi.impl.objects.nichandle.emailchange;

import net.zyuiop.ovhapi.api.objects.nichandle.emailchange.Task;
/**
 * Task running an email change on an account
 */

public class TaskImpl implements Task { 

	private java.util.Date dateDone;
	private long id;
	private java.util.Date dateRequest;
	private java.lang.String state;
	private java.lang.String newEmail;

	public TaskImpl() {
	}

	public java.util.Date getDateDone() { 
		return this.dateDone;
	} 

	public void setDateDone(java.util.Date dateDone) { 
		this.dateDone = dateDone;
	} 

	public TaskImpl dateDone(java.util.Date dateDone) { 
		this.dateDone = dateDone;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public TaskImpl id(long id) { 
		this.id = id;
		return this;
	} 

	public java.util.Date getDateRequest() { 
		return this.dateRequest;
	} 

	public void setDateRequest(java.util.Date dateRequest) { 
		this.dateRequest = dateRequest;
	} 

	public TaskImpl dateRequest(java.util.Date dateRequest) { 
		this.dateRequest = dateRequest;
		return this;
	} 

	public java.lang.String getState() { 
		return this.state;
	} 

	public void setState(java.lang.String state) { 
		this.state = state;
	} 

	public TaskImpl state(java.lang.String state) { 
		this.state = state;
		return this;
	} 

	public java.lang.String getNewEmail() { 
		return this.newEmail;
	} 

	public void setNewEmail(java.lang.String newEmail) { 
		this.newEmail = newEmail;
	} 

	public TaskImpl newEmail(java.lang.String newEmail) { 
		this.newEmail = newEmail;
		return this;
	} 

}
