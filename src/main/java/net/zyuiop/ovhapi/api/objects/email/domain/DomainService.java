package net.zyuiop.ovhapi.api.objects.email.domain;

/**
 * Domain service
 */

public class DomainService { 

	private java.lang.String domain;
	private java.util.Date creationDate;
	private long[] allowedAccountSize;
	private java.lang.String status;
	private long filerz;

	public DomainService() {
	}

	public java.lang.String getDomain() { 
		return this.domain;
	} 

	public void setDomain(java.lang.String domain) { 
		this.domain = domain;
	} 

	public DomainService domain(java.lang.String domain) { 
		this.domain = domain;
		return this;
	} 

	public java.util.Date getCreationDate() { 
		return this.creationDate;
	} 

	public void setCreationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
	} 

	public DomainService creationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
		return this;
	} 

	public long[] getAllowedAccountSize() { 
		return this.allowedAccountSize;
	} 

	public void setAllowedAccountSize(long[] allowedAccountSize) { 
		this.allowedAccountSize = allowedAccountSize;
	} 

	public DomainService allowedAccountSize(long[] allowedAccountSize) { 
		this.allowedAccountSize = allowedAccountSize;
		return this;
	} 

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public DomainService status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public long getFilerz() { 
		return this.filerz;
	} 

	public void setFilerz(long filerz) { 
		this.filerz = filerz;
	} 

	public DomainService filerz(long filerz) { 
		this.filerz = filerz;
		return this;
	} 

}
