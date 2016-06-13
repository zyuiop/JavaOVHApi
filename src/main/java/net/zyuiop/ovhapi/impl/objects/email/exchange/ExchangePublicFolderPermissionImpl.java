package net.zyuiop.ovhapi.impl.objects.email.exchange;

import net.zyuiop.ovhapi.api.objects.email.exchange.ExchangePublicFolderPermission;
/**
 * Exchange organization public folder permission
 */

public class ExchangePublicFolderPermissionImpl implements ExchangePublicFolderPermission { 

	private java.util.Date creationDate;
	private long allowedAccountId;
	private long taskPendingId;
	private java.lang.String accessRights;
	private java.lang.String state;

	public ExchangePublicFolderPermissionImpl() {
	}

	public java.util.Date getCreationDate() { 
		return this.creationDate;
	} 

	public void setCreationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
	} 

	public ExchangePublicFolderPermissionImpl creationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
		return this;
	} 

	public long getAllowedAccountId() { 
		return this.allowedAccountId;
	} 

	public void setAllowedAccountId(long allowedAccountId) { 
		this.allowedAccountId = allowedAccountId;
	} 

	public ExchangePublicFolderPermissionImpl allowedAccountId(long allowedAccountId) { 
		this.allowedAccountId = allowedAccountId;
		return this;
	} 

	public long getTaskPendingId() { 
		return this.taskPendingId;
	} 

	public void setTaskPendingId(long taskPendingId) { 
		this.taskPendingId = taskPendingId;
	} 

	public ExchangePublicFolderPermissionImpl taskPendingId(long taskPendingId) { 
		this.taskPendingId = taskPendingId;
		return this;
	} 

	public java.lang.String getAccessRights() { 
		return this.accessRights;
	} 

	public void setAccessRights(java.lang.String accessRights) { 
		this.accessRights = accessRights;
	} 

	public ExchangePublicFolderPermissionImpl accessRights(java.lang.String accessRights) { 
		this.accessRights = accessRights;
		return this;
	} 

	public java.lang.String getState() { 
		return this.state;
	} 

	public void setState(java.lang.String state) { 
		this.state = state;
	} 

	public ExchangePublicFolderPermissionImpl state(java.lang.String state) { 
		this.state = state;
		return this;
	} 

}
