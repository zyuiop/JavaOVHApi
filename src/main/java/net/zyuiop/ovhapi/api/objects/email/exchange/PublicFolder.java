package net.zyuiop.ovhapi.api.objects.email.exchange;

/**
 * Exchange organization public folder
 */

public class PublicFolder { 

	private long quota;
	private java.util.Date lastAccessTime;
	private java.util.Date lastModificationTime;
	private java.lang.String anonymousPermission;
	private long totalItemSize;
	private java.lang.String path;
	private boolean hasSubFolders;
	private long itemCount;
	private java.lang.String state;
	private java.util.Date lastUserAccessTime;
	private java.util.Date lastUserModificationTime;
	private java.util.Date creationDate;
	private java.lang.String type;
	private java.lang.String defaultPermission;
	private long taskPendingId;

	public PublicFolder() {
	}

	public long getQuota() { 
		return this.quota;
	} 

	public void setQuota(long quota) { 
		this.quota = quota;
	} 

	public PublicFolder quota(long quota) { 
		this.quota = quota;
		return this;
	} 

	public java.util.Date getLastAccessTime() { 
		return this.lastAccessTime;
	} 

	public void setLastAccessTime(java.util.Date lastAccessTime) { 
		this.lastAccessTime = lastAccessTime;
	} 

	public PublicFolder lastAccessTime(java.util.Date lastAccessTime) { 
		this.lastAccessTime = lastAccessTime;
		return this;
	} 

	public java.util.Date getLastModificationTime() { 
		return this.lastModificationTime;
	} 

	public void setLastModificationTime(java.util.Date lastModificationTime) { 
		this.lastModificationTime = lastModificationTime;
	} 

	public PublicFolder lastModificationTime(java.util.Date lastModificationTime) { 
		this.lastModificationTime = lastModificationTime;
		return this;
	} 

	public java.lang.String getAnonymousPermission() { 
		return this.anonymousPermission;
	} 

	public void setAnonymousPermission(java.lang.String anonymousPermission) { 
		this.anonymousPermission = anonymousPermission;
	} 

	public PublicFolder anonymousPermission(java.lang.String anonymousPermission) { 
		this.anonymousPermission = anonymousPermission;
		return this;
	} 

	public long getTotalItemSize() { 
		return this.totalItemSize;
	} 

	public void setTotalItemSize(long totalItemSize) { 
		this.totalItemSize = totalItemSize;
	} 

	public PublicFolder totalItemSize(long totalItemSize) { 
		this.totalItemSize = totalItemSize;
		return this;
	} 

	public java.lang.String getPath() { 
		return this.path;
	} 

	public void setPath(java.lang.String path) { 
		this.path = path;
	} 

	public PublicFolder path(java.lang.String path) { 
		this.path = path;
		return this;
	} 

	public boolean getHasSubFolders() { 
		return this.hasSubFolders;
	} 

	public void setHasSubFolders(boolean hasSubFolders) { 
		this.hasSubFolders = hasSubFolders;
	} 

	public PublicFolder hasSubFolders(boolean hasSubFolders) { 
		this.hasSubFolders = hasSubFolders;
		return this;
	} 

	public long getItemCount() { 
		return this.itemCount;
	} 

	public void setItemCount(long itemCount) { 
		this.itemCount = itemCount;
	} 

	public PublicFolder itemCount(long itemCount) { 
		this.itemCount = itemCount;
		return this;
	} 

	public java.lang.String getState() { 
		return this.state;
	} 

	public void setState(java.lang.String state) { 
		this.state = state;
	} 

	public PublicFolder state(java.lang.String state) { 
		this.state = state;
		return this;
	} 

	public java.util.Date getLastUserAccessTime() { 
		return this.lastUserAccessTime;
	} 

	public void setLastUserAccessTime(java.util.Date lastUserAccessTime) { 
		this.lastUserAccessTime = lastUserAccessTime;
	} 

	public PublicFolder lastUserAccessTime(java.util.Date lastUserAccessTime) { 
		this.lastUserAccessTime = lastUserAccessTime;
		return this;
	} 

	public java.util.Date getLastUserModificationTime() { 
		return this.lastUserModificationTime;
	} 

	public void setLastUserModificationTime(java.util.Date lastUserModificationTime) { 
		this.lastUserModificationTime = lastUserModificationTime;
	} 

	public PublicFolder lastUserModificationTime(java.util.Date lastUserModificationTime) { 
		this.lastUserModificationTime = lastUserModificationTime;
		return this;
	} 

	public java.util.Date getCreationDate() { 
		return this.creationDate;
	} 

	public void setCreationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
	} 

	public PublicFolder creationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
		return this;
	} 

	public java.lang.String getType() { 
		return this.type;
	} 

	public void setType(java.lang.String type) { 
		this.type = type;
	} 

	public PublicFolder type(java.lang.String type) { 
		this.type = type;
		return this;
	} 

	public java.lang.String getDefaultPermission() { 
		return this.defaultPermission;
	} 

	public void setDefaultPermission(java.lang.String defaultPermission) { 
		this.defaultPermission = defaultPermission;
	} 

	public PublicFolder defaultPermission(java.lang.String defaultPermission) { 
		this.defaultPermission = defaultPermission;
		return this;
	} 

	public long getTaskPendingId() { 
		return this.taskPendingId;
	} 

	public void setTaskPendingId(long taskPendingId) { 
		this.taskPendingId = taskPendingId;
	} 

	public PublicFolder taskPendingId(long taskPendingId) { 
		this.taskPendingId = taskPendingId;
		return this;
	} 

}
