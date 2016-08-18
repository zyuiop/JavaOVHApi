package net.zyuiop.ovhapi.api.objects.nichandle;

/**
 * SMS notifications
 */

public class NichandleSmsNotification { 

	private java.util.Date updateDate;
	private java.util.Date creationDate;
	private java.lang.String status;
	private boolean abuse;
	private java.lang.String phoneNumber;

	public NichandleSmsNotification() {
	}

	public java.util.Date getUpdateDate() { 
		return this.updateDate;
	} 

	public void setUpdateDate(java.util.Date updateDate) { 
		this.updateDate = updateDate;
	} 

	public NichandleSmsNotification updateDate(java.util.Date updateDate) { 
		this.updateDate = updateDate;
		return this;
	} 

	public java.util.Date getCreationDate() { 
		return this.creationDate;
	} 

	public void setCreationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
	} 

	public NichandleSmsNotification creationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
		return this;
	} 

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public NichandleSmsNotification status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public boolean getAbuse() { 
		return this.abuse;
	} 

	public void setAbuse(boolean abuse) { 
		this.abuse = abuse;
	} 

	public NichandleSmsNotification abuse(boolean abuse) { 
		this.abuse = abuse;
		return this;
	} 

	public java.lang.String getPhoneNumber() { 
		return this.phoneNumber;
	} 

	public void setPhoneNumber(java.lang.String phoneNumber) { 
		this.phoneNumber = phoneNumber;
	} 

	public NichandleSmsNotification phoneNumber(java.lang.String phoneNumber) { 
		this.phoneNumber = phoneNumber;
		return this;
	} 

}
