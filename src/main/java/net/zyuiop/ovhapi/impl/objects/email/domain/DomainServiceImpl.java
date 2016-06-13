package net.zyuiop.ovhapi.impl.objects.email.domain;

import net.zyuiop.ovhapi.api.objects.email.domain.DomainService;
/**
 * Domain service
 */

public class DomainServiceImpl implements DomainService { 

	private java.lang.String domain;
	private java.util.Date creationDate;
	private long[] allowedAccountSize;
	private java.lang.String status;
	private long filerz;

	public DomainServiceImpl() {
	}

	public java.lang.String getDomain() { 
		return this.domain;
	} 

	public void setDomain(java.lang.String domain) { 
		this.domain = domain;
	} 

	public DomainServiceImpl domain(java.lang.String domain) { 
		this.domain = domain;
		return this;
	} 

	public java.util.Date getCreationDate() { 
		return this.creationDate;
	} 

	public void setCreationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
	} 

	public DomainServiceImpl creationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
		return this;
	} 

	public long[] getAllowedAccountSize() { 
		return this.allowedAccountSize;
	} 

	public void setAllowedAccountSize(long[] allowedAccountSize) { 
		this.allowedAccountSize = allowedAccountSize;
	} 

	public DomainServiceImpl allowedAccountSize(long[] allowedAccountSize) { 
		this.allowedAccountSize = allowedAccountSize;
		return this;
	} 

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public DomainServiceImpl status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public long getFilerz() { 
		return this.filerz;
	} 

	public void setFilerz(long filerz) { 
		this.filerz = filerz;
	} 

	public DomainServiceImpl filerz(long filerz) { 
		this.filerz = filerz;
		return this;
	} 

}
