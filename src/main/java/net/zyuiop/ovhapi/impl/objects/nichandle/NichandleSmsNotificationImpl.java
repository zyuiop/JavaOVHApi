package net.zyuiop.ovhapi.impl.objects.nichandle;

import net.zyuiop.ovhapi.api.objects.nichandle.NichandleSmsNotification;
/**
 * SMS notifications
 */

public class NichandleSmsNotificationImpl implements NichandleSmsNotification { 

	private java.util.Date updateDate;
	private java.util.Date creationDate;
	private java.lang.String status;
	private boolean abuse;
	private java.lang.String phoneNumber;

	public NichandleSmsNotificationImpl() {
	}

	public java.util.Date getUpdateDate() { 
		return this.updateDate;
	} 

	public void setUpdateDate(java.util.Date updateDate) { 
		this.updateDate = updateDate;
	} 

	public NichandleSmsNotificationImpl updateDate(java.util.Date updateDate) { 
		this.updateDate = updateDate;
		return this;
	} 

	public java.util.Date getCreationDate() { 
		return this.creationDate;
	} 

	public void setCreationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
	} 

	public NichandleSmsNotificationImpl creationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
		return this;
	} 

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public NichandleSmsNotificationImpl status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public boolean getAbuse() { 
		return this.abuse;
	} 

	public void setAbuse(boolean abuse) { 
		this.abuse = abuse;
	} 

	public NichandleSmsNotificationImpl abuse(boolean abuse) { 
		this.abuse = abuse;
		return this;
	} 

	public java.lang.String getPhoneNumber() { 
		return this.phoneNumber;
	} 

	public void setPhoneNumber(java.lang.String phoneNumber) { 
		this.phoneNumber = phoneNumber;
	} 

	public NichandleSmsNotificationImpl phoneNumber(java.lang.String phoneNumber) { 
		this.phoneNumber = phoneNumber;
		return this;
	} 

}
