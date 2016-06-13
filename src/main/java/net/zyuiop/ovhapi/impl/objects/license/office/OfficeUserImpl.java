package net.zyuiop.ovhapi.impl.objects.license.office;

import net.zyuiop.ovhapi.api.objects.license.office.OfficeUser;
/**
 * Office user
 */

public class OfficeUserImpl implements OfficeUser { 

	private java.lang.String firstName;
	private java.lang.String status;
	private java.lang.String licences;
	private java.lang.String lastName;
	private java.lang.String activationEmail;
	private long taskPendingId;

	public OfficeUserImpl() {
	}

	public java.lang.String getFirstName() { 
		return this.firstName;
	} 

	public void setFirstName(java.lang.String firstName) { 
		this.firstName = firstName;
	} 

	public OfficeUserImpl firstName(java.lang.String firstName) { 
		this.firstName = firstName;
		return this;
	} 

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public OfficeUserImpl status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public java.lang.String getLicences() { 
		return this.licences;
	} 

	public void setLicences(java.lang.String licences) { 
		this.licences = licences;
	} 

	public OfficeUserImpl licences(java.lang.String licences) { 
		this.licences = licences;
		return this;
	} 

	public java.lang.String getLastName() { 
		return this.lastName;
	} 

	public void setLastName(java.lang.String lastName) { 
		this.lastName = lastName;
	} 

	public OfficeUserImpl lastName(java.lang.String lastName) { 
		this.lastName = lastName;
		return this;
	} 

	public java.lang.String getActivationEmail() { 
		return this.activationEmail;
	} 

	public void setActivationEmail(java.lang.String activationEmail) { 
		this.activationEmail = activationEmail;
	} 

	public OfficeUserImpl activationEmail(java.lang.String activationEmail) { 
		this.activationEmail = activationEmail;
		return this;
	} 

	public long getTaskPendingId() { 
		return this.taskPendingId;
	} 

	public void setTaskPendingId(long taskPendingId) { 
		this.taskPendingId = taskPendingId;
	} 

	public OfficeUserImpl taskPendingId(long taskPendingId) { 
		this.taskPendingId = taskPendingId;
		return this;
	} 

}
