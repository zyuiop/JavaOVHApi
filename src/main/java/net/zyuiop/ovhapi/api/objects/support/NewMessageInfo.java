package net.zyuiop.ovhapi.api.objects.support;

/**
 * Newly created support identifiers
 */

public class NewMessageInfo { 

	private long ticketId;
	private long messageId;
	private long ticketNumber;

	public NewMessageInfo() {
	}

	public long getTicketId() { 
		return this.ticketId;
	} 

	public void setTicketId(long ticketId) { 
		this.ticketId = ticketId;
	} 

	public NewMessageInfo ticketId(long ticketId) { 
		this.ticketId = ticketId;
		return this;
	} 

	public long getMessageId() { 
		return this.messageId;
	} 

	public void setMessageId(long messageId) { 
		this.messageId = messageId;
	} 

	public NewMessageInfo messageId(long messageId) { 
		this.messageId = messageId;
		return this;
	} 

	public long getTicketNumber() { 
		return this.ticketNumber;
	} 

	public void setTicketNumber(long ticketNumber) { 
		this.ticketNumber = ticketNumber;
	} 

	public NewMessageInfo ticketNumber(long ticketNumber) { 
		this.ticketNumber = ticketNumber;
		return this;
	} 

}
