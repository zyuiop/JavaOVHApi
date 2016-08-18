package net.zyuiop.ovhapi.api.objects.nichandle;

/**
 * List of all your contact with support
 */

public class Support { 

	private java.lang.String domain;
	private long threadId;
	private java.lang.String subject;
	private java.lang.String status;
	private java.util.Date openDate;
	private java.lang.String category;
	private java.util.Date closeDate;

	public Support() {
	}

	public java.lang.String getDomain() { 
		return this.domain;
	} 

	public void setDomain(java.lang.String domain) { 
		this.domain = domain;
	} 

	public Support domain(java.lang.String domain) { 
		this.domain = domain;
		return this;
	} 

	public long getThreadId() { 
		return this.threadId;
	} 

	public void setThreadId(long threadId) { 
		this.threadId = threadId;
	} 

	public Support threadId(long threadId) { 
		this.threadId = threadId;
		return this;
	} 

	public java.lang.String getSubject() { 
		return this.subject;
	} 

	public void setSubject(java.lang.String subject) { 
		this.subject = subject;
	} 

	public Support subject(java.lang.String subject) { 
		this.subject = subject;
		return this;
	} 

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public Support status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public java.util.Date getOpenDate() { 
		return this.openDate;
	} 

	public void setOpenDate(java.util.Date openDate) { 
		this.openDate = openDate;
	} 

	public Support openDate(java.util.Date openDate) { 
		this.openDate = openDate;
		return this;
	} 

	public java.lang.String getCategory() { 
		return this.category;
	} 

	public void setCategory(java.lang.String category) { 
		this.category = category;
	} 

	public Support category(java.lang.String category) { 
		this.category = category;
		return this;
	} 

	public java.util.Date getCloseDate() { 
		return this.closeDate;
	} 

	public void setCloseDate(java.util.Date closeDate) { 
		this.closeDate = closeDate;
	} 

	public Support closeDate(java.util.Date closeDate) { 
		this.closeDate = closeDate;
		return this;
	} 

}
