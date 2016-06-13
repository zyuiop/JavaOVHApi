package net.zyuiop.ovhapi.impl.objects.support;

import net.zyuiop.ovhapi.api.objects.support.NewMessageInfo;
/**
 * Newly created support identifiers
 */

public class NewMessageInfoImpl implements NewMessageInfo { 

	private long ticketId;
	private long messageId;
	private long ticketNumber;

	public NewMessageInfoImpl() {
	}

	public long getTicketId() { 
		return this.ticketId;
	} 

	public void setTicketId(long ticketId) { 
		this.ticketId = ticketId;
	} 

	public NewMessageInfoImpl ticketId(long ticketId) { 
		this.ticketId = ticketId;
		return this;
	} 

	public long getMessageId() { 
		return this.messageId;
	} 

	public void setMessageId(long messageId) { 
		this.messageId = messageId;
	} 

	public NewMessageInfoImpl messageId(long messageId) { 
		this.messageId = messageId;
		return this;
	} 

	public long getTicketNumber() { 
		return this.ticketNumber;
	} 

	public void setTicketNumber(long ticketNumber) { 
		this.ticketNumber = ticketNumber;
	} 

	public NewMessageInfoImpl ticketNumber(long ticketNumber) { 
		this.ticketNumber = ticketNumber;
		return this;
	} 

}
