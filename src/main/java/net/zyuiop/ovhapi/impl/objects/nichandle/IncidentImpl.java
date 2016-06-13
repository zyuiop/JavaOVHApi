package net.zyuiop.ovhapi.impl.objects.nichandle;

import net.zyuiop.ovhapi.api.objects.nichandle.Incident;
/**
 * List of all your ticket incident messages
 */

public class IncidentImpl implements Incident { 

	private long ticketId;
	private java.lang.String domain;
	private java.lang.String subject;
	private java.util.Date openDate;
	private java.lang.String status;
	private java.lang.String category;
	private java.util.Date closeDate;

	public IncidentImpl() {
	}

	public long getTicketId() { 
		return this.ticketId;
	} 

	public void setTicketId(long ticketId) { 
		this.ticketId = ticketId;
	} 

	public IncidentImpl ticketId(long ticketId) { 
		this.ticketId = ticketId;
		return this;
	} 

	public java.lang.String getDomain() { 
		return this.domain;
	} 

	public void setDomain(java.lang.String domain) { 
		this.domain = domain;
	} 

	public IncidentImpl domain(java.lang.String domain) { 
		this.domain = domain;
		return this;
	} 

	public java.lang.String getSubject() { 
		return this.subject;
	} 

	public void setSubject(java.lang.String subject) { 
		this.subject = subject;
	} 

	public IncidentImpl subject(java.lang.String subject) { 
		this.subject = subject;
		return this;
	} 

	public java.util.Date getOpenDate() { 
		return this.openDate;
	} 

	public void setOpenDate(java.util.Date openDate) { 
		this.openDate = openDate;
	} 

	public IncidentImpl openDate(java.util.Date openDate) { 
		this.openDate = openDate;
		return this;
	} 

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public IncidentImpl status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public java.lang.String getCategory() { 
		return this.category;
	} 

	public void setCategory(java.lang.String category) { 
		this.category = category;
	} 

	public IncidentImpl category(java.lang.String category) { 
		this.category = category;
		return this;
	} 

	public java.util.Date getCloseDate() { 
		return this.closeDate;
	} 

	public void setCloseDate(java.util.Date closeDate) { 
		this.closeDate = closeDate;
	} 

	public IncidentImpl closeDate(java.util.Date closeDate) { 
		this.closeDate = closeDate;
		return this;
	} 

}
