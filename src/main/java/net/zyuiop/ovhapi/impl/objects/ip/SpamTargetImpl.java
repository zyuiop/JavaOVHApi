package net.zyuiop.ovhapi.impl.objects.ip;

import net.zyuiop.ovhapi.api.objects.ip.SpamTarget;
/**
 * Spam's target information
 */

public class SpamTargetImpl implements SpamTarget { 

	private java.lang.String destinationIp;
	private java.lang.String messageId;
	private long date;
	private long spamscore;

	public SpamTargetImpl() {
	}

	public java.lang.String getDestinationIp() { 
		return this.destinationIp;
	} 

	public void setDestinationIp(java.lang.String destinationIp) { 
		this.destinationIp = destinationIp;
	} 

	public SpamTargetImpl destinationIp(java.lang.String destinationIp) { 
		this.destinationIp = destinationIp;
		return this;
	} 

	public java.lang.String getMessageId() { 
		return this.messageId;
	} 

	public void setMessageId(java.lang.String messageId) { 
		this.messageId = messageId;
	} 

	public SpamTargetImpl messageId(java.lang.String messageId) { 
		this.messageId = messageId;
		return this;
	} 

	public long getDate() { 
		return this.date;
	} 

	public void setDate(long date) { 
		this.date = date;
	} 

	public SpamTargetImpl date(long date) { 
		this.date = date;
		return this;
	} 

	public long getSpamscore() { 
		return this.spamscore;
	} 

	public void setSpamscore(long spamscore) { 
		this.spamscore = spamscore;
	} 

	public SpamTargetImpl spamscore(long spamscore) { 
		this.spamscore = spamscore;
		return this;
	} 

}
