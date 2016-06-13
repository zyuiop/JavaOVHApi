package net.zyuiop.ovhapi.impl.objects.support;

import net.zyuiop.ovhapi.api.objects.support.Ticket;
/**
 * Support Ticket
 */

public class TicketImpl implements Ticket { 

	private long ticketId;
	private java.lang.String accountId;
	private java.util.Date updateDate;
	private java.lang.String subject;
	private java.lang.String lastMessageFrom;
	private java.lang.String serviceName;
	private long ticketNumber;
	private java.lang.String state;
	private java.util.Date creationDate;
	private java.lang.String category;
	private java.lang.String product;
	private java.lang.String type;

	public TicketImpl() {
	}

	public long getTicketId() { 
		return this.ticketId;
	} 

	public void setTicketId(long ticketId) { 
		this.ticketId = ticketId;
	} 

	public TicketImpl ticketId(long ticketId) { 
		this.ticketId = ticketId;
		return this;
	} 

	public java.lang.String getAccountId() { 
		return this.accountId;
	} 

	public void setAccountId(java.lang.String accountId) { 
		this.accountId = accountId;
	} 

	public TicketImpl accountId(java.lang.String accountId) { 
		this.accountId = accountId;
		return this;
	} 

	public java.util.Date getUpdateDate() { 
		return this.updateDate;
	} 

	public void setUpdateDate(java.util.Date updateDate) { 
		this.updateDate = updateDate;
	} 

	public TicketImpl updateDate(java.util.Date updateDate) { 
		this.updateDate = updateDate;
		return this;
	} 

	public java.lang.String getSubject() { 
		return this.subject;
	} 

	public void setSubject(java.lang.String subject) { 
		this.subject = subject;
	} 

	public TicketImpl subject(java.lang.String subject) { 
		this.subject = subject;
		return this;
	} 

	public java.lang.String getLastMessageFrom() { 
		return this.lastMessageFrom;
	} 

	public void setLastMessageFrom(java.lang.String lastMessageFrom) { 
		this.lastMessageFrom = lastMessageFrom;
	} 

	public TicketImpl lastMessageFrom(java.lang.String lastMessageFrom) { 
		this.lastMessageFrom = lastMessageFrom;
		return this;
	} 

	public java.lang.String getServiceName() { 
		return this.serviceName;
	} 

	public void setServiceName(java.lang.String serviceName) { 
		this.serviceName = serviceName;
	} 

	public TicketImpl serviceName(java.lang.String serviceName) { 
		this.serviceName = serviceName;
		return this;
	} 

	public long getTicketNumber() { 
		return this.ticketNumber;
	} 

	public void setTicketNumber(long ticketNumber) { 
		this.ticketNumber = ticketNumber;
	} 

	public TicketImpl ticketNumber(long ticketNumber) { 
		this.ticketNumber = ticketNumber;
		return this;
	} 

	public java.lang.String getState() { 
		return this.state;
	} 

	public void setState(java.lang.String state) { 
		this.state = state;
	} 

	public TicketImpl state(java.lang.String state) { 
		this.state = state;
		return this;
	} 

	public java.util.Date getCreationDate() { 
		return this.creationDate;
	} 

	public void setCreationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
	} 

	public TicketImpl creationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
		return this;
	} 

	public java.lang.String getCategory() { 
		return this.category;
	} 

	public void setCategory(java.lang.String category) { 
		this.category = category;
	} 

	public TicketImpl category(java.lang.String category) { 
		this.category = category;
		return this;
	} 

	public java.lang.String getProduct() { 
		return this.product;
	} 

	public void setProduct(java.lang.String product) { 
		this.product = product;
	} 

	public TicketImpl product(java.lang.String product) { 
		this.product = product;
		return this;
	} 

	public java.lang.String getType() { 
		return this.type;
	} 

	public void setType(java.lang.String type) { 
		this.type = type;
	} 

	public TicketImpl type(java.lang.String type) { 
		this.type = type;
		return this;
	} 

}
