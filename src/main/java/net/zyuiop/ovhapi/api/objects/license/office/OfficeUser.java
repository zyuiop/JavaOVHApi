package net.zyuiop.ovhapi.api.objects.license.office;

/**
 * Office user
 */

public class OfficeUser { 

	private java.lang.String firstName;
	private java.lang.String status;
	private java.lang.String[] licences;
	private java.lang.String lastName;
	private java.lang.String activationEmail;
	private long taskPendingId;

	public OfficeUser() {
	}

	public java.lang.String getFirstName() { 
		return this.firstName;
	} 

	public void setFirstName(java.lang.String firstName) { 
		this.firstName = firstName;
	} 

	public OfficeUser firstName(java.lang.String firstName) { 
		this.firstName = firstName;
		return this;
	} 

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public OfficeUser status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public java.lang.String[] getLicences() { 
		return this.licences;
	} 

	public void setLicences(java.lang.String[] licences) { 
		this.licences = licences;
	} 

	public OfficeUser licences(java.lang.String[] licences) { 
		this.licences = licences;
		return this;
	} 

	public java.lang.String getLastName() { 
		return this.lastName;
	} 

	public void setLastName(java.lang.String lastName) { 
		this.lastName = lastName;
	} 

	public OfficeUser lastName(java.lang.String lastName) { 
		this.lastName = lastName;
		return this;
	} 

	public java.lang.String getActivationEmail() { 
		return this.activationEmail;
	} 

	public void setActivationEmail(java.lang.String activationEmail) { 
		this.activationEmail = activationEmail;
	} 

	public OfficeUser activationEmail(java.lang.String activationEmail) { 
		this.activationEmail = activationEmail;
		return this;
	} 

	public long getTaskPendingId() { 
		return this.taskPendingId;
	} 

	public void setTaskPendingId(long taskPendingId) { 
		this.taskPendingId = taskPendingId;
	} 

	public OfficeUser taskPendingId(long taskPendingId) { 
		this.taskPendingId = taskPendingId;
		return this;
	} 

}
