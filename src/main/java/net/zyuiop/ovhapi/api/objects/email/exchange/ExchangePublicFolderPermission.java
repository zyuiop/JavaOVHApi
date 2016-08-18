package net.zyuiop.ovhapi.api.objects.email.exchange;

/**
 * Exchange organization public folder permission
 */

public class ExchangePublicFolderPermission { 

	private java.util.Date creationDate;
	private long allowedAccountId;
	private long taskPendingId;
	private java.lang.String accessRights;
	private java.lang.String state;

	public ExchangePublicFolderPermission() {
	}

	public java.util.Date getCreationDate() { 
		return this.creationDate;
	} 

	public void setCreationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
	} 

	public ExchangePublicFolderPermission creationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
		return this;
	} 

	public long getAllowedAccountId() { 
		return this.allowedAccountId;
	} 

	public void setAllowedAccountId(long allowedAccountId) { 
		this.allowedAccountId = allowedAccountId;
	} 

	public ExchangePublicFolderPermission allowedAccountId(long allowedAccountId) { 
		this.allowedAccountId = allowedAccountId;
		return this;
	} 

	public long getTaskPendingId() { 
		return this.taskPendingId;
	} 

	public void setTaskPendingId(long taskPendingId) { 
		this.taskPendingId = taskPendingId;
	} 

	public ExchangePublicFolderPermission taskPendingId(long taskPendingId) { 
		this.taskPendingId = taskPendingId;
		return this;
	} 

	public java.lang.String getAccessRights() { 
		return this.accessRights;
	} 

	public void setAccessRights(java.lang.String accessRights) { 
		this.accessRights = accessRights;
	} 

	public ExchangePublicFolderPermission accessRights(java.lang.String accessRights) { 
		this.accessRights = accessRights;
		return this;
	} 

	public java.lang.String getState() { 
		return this.state;
	} 

	public void setState(java.lang.String state) { 
		this.state = state;
	} 

	public ExchangePublicFolderPermission state(java.lang.String state) { 
		this.state = state;
		return this;
	} 

}
