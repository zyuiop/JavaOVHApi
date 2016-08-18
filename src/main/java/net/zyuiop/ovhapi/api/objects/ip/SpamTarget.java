package net.zyuiop.ovhapi.api.objects.ip;

/**
 * Spam's target information
 */

public class SpamTarget { 

	private java.lang.String destinationIp;
	private java.lang.String messageId;
	private long date;
	private long spamscore;

	public SpamTarget() {
	}

	public java.lang.String getDestinationIp() { 
		return this.destinationIp;
	} 

	public void setDestinationIp(java.lang.String destinationIp) { 
		this.destinationIp = destinationIp;
	} 

	public SpamTarget destinationIp(java.lang.String destinationIp) { 
		this.destinationIp = destinationIp;
		return this;
	} 

	public java.lang.String getMessageId() { 
		return this.messageId;
	} 

	public void setMessageId(java.lang.String messageId) { 
		this.messageId = messageId;
	} 

	public SpamTarget messageId(java.lang.String messageId) { 
		this.messageId = messageId;
		return this;
	} 

	public long getDate() { 
		return this.date;
	} 

	public void setDate(long date) { 
		this.date = date;
	} 

	public SpamTarget date(long date) { 
		this.date = date;
		return this;
	} 

	public long getSpamscore() { 
		return this.spamscore;
	} 

	public void setSpamscore(long spamscore) { 
		this.spamscore = spamscore;
	} 

	public SpamTarget spamscore(long spamscore) { 
		this.spamscore = spamscore;
		return this;
	} 

}
