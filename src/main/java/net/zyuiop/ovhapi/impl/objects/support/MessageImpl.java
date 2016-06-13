package net.zyuiop.ovhapi.impl.objects.support;

import net.zyuiop.ovhapi.api.objects.support.Message;
/**
 * Support ticket message
 */

public class MessageImpl implements Message { 

	private long ticketId;
	private long messageId;
	private java.lang.String body;
	private java.util.Date creationDate;
	private java.util.Date updateDate;
	private java.lang.String from;

	public MessageImpl() {
	}

	public long getTicketId() { 
		return this.ticketId;
	} 

	public void setTicketId(long ticketId) { 
		this.ticketId = ticketId;
	} 

	public MessageImpl ticketId(long ticketId) { 
		this.ticketId = ticketId;
		return this;
	} 

	public long getMessageId() { 
		return this.messageId;
	} 

	public void setMessageId(long messageId) { 
		this.messageId = messageId;
	} 

	public MessageImpl messageId(long messageId) { 
		this.messageId = messageId;
		return this;
	} 

	public java.lang.String getBody() { 
		return this.body;
	} 

	public void setBody(java.lang.String body) { 
		this.body = body;
	} 

	public MessageImpl body(java.lang.String body) { 
		this.body = body;
		return this;
	} 

	public java.util.Date getCreationDate() { 
		return this.creationDate;
	} 

	public void setCreationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
	} 

	public MessageImpl creationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
		return this;
	} 

	public java.util.Date getUpdateDate() { 
		return this.updateDate;
	} 

	public void setUpdateDate(java.util.Date updateDate) { 
		this.updateDate = updateDate;
	} 

	public MessageImpl updateDate(java.util.Date updateDate) { 
		this.updateDate = updateDate;
		return this;
	} 

	public java.lang.String getFrom() { 
		return this.from;
	} 

	public void setFrom(java.lang.String from) { 
		this.from = from;
	} 

	public MessageImpl from(java.lang.String from) { 
		this.from = from;
		return this;
	} 

}
