package net.zyuiop.ovhapi.impl.objects.nichandle.contactchange;

import net.zyuiop.ovhapi.api.objects.nichandle.contactchange.Task;
/**
 * Task running a contact change on a service
 */

public class TaskImpl implements Task { 

	private java.lang.String toAccount;
	private java.lang.String askingAccount;
	private java.lang.String contactTypes;
	private java.lang.String state;
	private java.lang.String fromAccount;
	private java.util.Date dateDone;
	private long id;
	private java.lang.String serviceDomain;
	private java.util.Date dateRequest;

	public TaskImpl() {
	}

	public java.lang.String getToAccount() { 
		return this.toAccount;
	} 

	public void setToAccount(java.lang.String toAccount) { 
		this.toAccount = toAccount;
	} 

	public TaskImpl toAccount(java.lang.String toAccount) { 
		this.toAccount = toAccount;
		return this;
	} 

	public java.lang.String getAskingAccount() { 
		return this.askingAccount;
	} 

	public void setAskingAccount(java.lang.String askingAccount) { 
		this.askingAccount = askingAccount;
	} 

	public TaskImpl askingAccount(java.lang.String askingAccount) { 
		this.askingAccount = askingAccount;
		return this;
	} 

	public java.lang.String getContactTypes() { 
		return this.contactTypes;
	} 

	public void setContactTypes(java.lang.String contactTypes) { 
		this.contactTypes = contactTypes;
	} 

	public TaskImpl contactTypes(java.lang.String contactTypes) { 
		this.contactTypes = contactTypes;
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

	public java.lang.String getFromAccount() { 
		return this.fromAccount;
	} 

	public void setFromAccount(java.lang.String fromAccount) { 
		this.fromAccount = fromAccount;
	} 

	public TaskImpl fromAccount(java.lang.String fromAccount) { 
		this.fromAccount = fromAccount;
		return this;
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

	public java.lang.String getServiceDomain() { 
		return this.serviceDomain;
	} 

	public void setServiceDomain(java.lang.String serviceDomain) { 
		this.serviceDomain = serviceDomain;
	} 

	public TaskImpl serviceDomain(java.lang.String serviceDomain) { 
		this.serviceDomain = serviceDomain;
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

}
