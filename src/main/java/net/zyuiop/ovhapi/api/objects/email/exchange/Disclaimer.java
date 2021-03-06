package net.zyuiop.ovhapi.api.objects.email.exchange;

/**
 * Exchange organization disclaimer
 */

public class Disclaimer { 

	private java.util.Date creationDate;
	private java.lang.String name;
	private java.lang.String content;
	private boolean outsideOnly;
	private long taskPendingId;

	public Disclaimer() {
	}

	public java.util.Date getCreationDate() { 
		return this.creationDate;
	} 

	public void setCreationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
	} 

	public Disclaimer creationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public Disclaimer name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public java.lang.String getContent() { 
		return this.content;
	} 

	public void setContent(java.lang.String content) { 
		this.content = content;
	} 

	public Disclaimer content(java.lang.String content) { 
		this.content = content;
		return this;
	} 

	public boolean getOutsideOnly() { 
		return this.outsideOnly;
	} 

	public void setOutsideOnly(boolean outsideOnly) { 
		this.outsideOnly = outsideOnly;
	} 

	public Disclaimer outsideOnly(boolean outsideOnly) { 
		this.outsideOnly = outsideOnly;
		return this;
	} 

	public long getTaskPendingId() { 
		return this.taskPendingId;
	} 

	public void setTaskPendingId(long taskPendingId) { 
		this.taskPendingId = taskPendingId;
	} 

	public Disclaimer taskPendingId(long taskPendingId) { 
		this.taskPendingId = taskPendingId;
		return this;
	} 

}
