package net.zyuiop.ovhapi.api.objects.email.exchange;

/**
 * Mailing list
 */

public class MailingList { 

	private boolean spamDetected;
	private long spamTicketNumber;
	private java.util.Date lastUpdateDate;
	private boolean hiddenFromGAL;
	private java.lang.String departRestriction;
	private java.lang.String joinRestriction;
	private java.lang.String mailingListAddress;
	private long maxSendSize;
	private boolean senderAuthentification;
	private java.lang.String state;
	private long maxReceiveSize;
	private java.util.Date creationDate;
	private long taskPendingId;
	private java.lang.String displayName;

	public MailingList() {
	}

	public boolean getSpamDetected() { 
		return this.spamDetected;
	} 

	public void setSpamDetected(boolean spamDetected) { 
		this.spamDetected = spamDetected;
	} 

	public MailingList spamDetected(boolean spamDetected) { 
		this.spamDetected = spamDetected;
		return this;
	} 

	public long getSpamTicketNumber() { 
		return this.spamTicketNumber;
	} 

	public void setSpamTicketNumber(long spamTicketNumber) { 
		this.spamTicketNumber = spamTicketNumber;
	} 

	public MailingList spamTicketNumber(long spamTicketNumber) { 
		this.spamTicketNumber = spamTicketNumber;
		return this;
	} 

	public java.util.Date getLastUpdateDate() { 
		return this.lastUpdateDate;
	} 

	public void setLastUpdateDate(java.util.Date lastUpdateDate) { 
		this.lastUpdateDate = lastUpdateDate;
	} 

	public MailingList lastUpdateDate(java.util.Date lastUpdateDate) { 
		this.lastUpdateDate = lastUpdateDate;
		return this;
	} 

	public boolean getHiddenFromGAL() { 
		return this.hiddenFromGAL;
	} 

	public void setHiddenFromGAL(boolean hiddenFromGAL) { 
		this.hiddenFromGAL = hiddenFromGAL;
	} 

	public MailingList hiddenFromGAL(boolean hiddenFromGAL) { 
		this.hiddenFromGAL = hiddenFromGAL;
		return this;
	} 

	public java.lang.String getDepartRestriction() { 
		return this.departRestriction;
	} 

	public void setDepartRestriction(java.lang.String departRestriction) { 
		this.departRestriction = departRestriction;
	} 

	public MailingList departRestriction(java.lang.String departRestriction) { 
		this.departRestriction = departRestriction;
		return this;
	} 

	public java.lang.String getJoinRestriction() { 
		return this.joinRestriction;
	} 

	public void setJoinRestriction(java.lang.String joinRestriction) { 
		this.joinRestriction = joinRestriction;
	} 

	public MailingList joinRestriction(java.lang.String joinRestriction) { 
		this.joinRestriction = joinRestriction;
		return this;
	} 

	public java.lang.String getMailingListAddress() { 
		return this.mailingListAddress;
	} 

	public void setMailingListAddress(java.lang.String mailingListAddress) { 
		this.mailingListAddress = mailingListAddress;
	} 

	public MailingList mailingListAddress(java.lang.String mailingListAddress) { 
		this.mailingListAddress = mailingListAddress;
		return this;
	} 

	public long getMaxSendSize() { 
		return this.maxSendSize;
	} 

	public void setMaxSendSize(long maxSendSize) { 
		this.maxSendSize = maxSendSize;
	} 

	public MailingList maxSendSize(long maxSendSize) { 
		this.maxSendSize = maxSendSize;
		return this;
	} 

	public boolean getSenderAuthentification() { 
		return this.senderAuthentification;
	} 

	public void setSenderAuthentification(boolean senderAuthentification) { 
		this.senderAuthentification = senderAuthentification;
	} 

	public MailingList senderAuthentification(boolean senderAuthentification) { 
		this.senderAuthentification = senderAuthentification;
		return this;
	} 

	public java.lang.String getState() { 
		return this.state;
	} 

	public void setState(java.lang.String state) { 
		this.state = state;
	} 

	public MailingList state(java.lang.String state) { 
		this.state = state;
		return this;
	} 

	public long getMaxReceiveSize() { 
		return this.maxReceiveSize;
	} 

	public void setMaxReceiveSize(long maxReceiveSize) { 
		this.maxReceiveSize = maxReceiveSize;
	} 

	public MailingList maxReceiveSize(long maxReceiveSize) { 
		this.maxReceiveSize = maxReceiveSize;
		return this;
	} 

	public java.util.Date getCreationDate() { 
		return this.creationDate;
	} 

	public void setCreationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
	} 

	public MailingList creationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
		return this;
	} 

	public long getTaskPendingId() { 
		return this.taskPendingId;
	} 

	public void setTaskPendingId(long taskPendingId) { 
		this.taskPendingId = taskPendingId;
	} 

	public MailingList taskPendingId(long taskPendingId) { 
		this.taskPendingId = taskPendingId;
		return this;
	} 

	public java.lang.String getDisplayName() { 
		return this.displayName;
	} 

	public void setDisplayName(java.lang.String displayName) { 
		this.displayName = displayName;
	} 

	public MailingList displayName(java.lang.String displayName) { 
		this.displayName = displayName;
		return this;
	} 

}
