package net.zyuiop.ovhapi.api.objects.email.exchange;

/**
 * Exchange shared mailbox
 */

public class SharedAccount { 

	private long quota;
	private long spamTicketNumber;
	private boolean hiddenFromGAL;
	private java.lang.String state;
	private long currentUsage;
	private java.util.Date lastLogonDate;
	private java.lang.String[] mailingFilter;
	private java.lang.String lastName;
	private long id;
	private java.lang.String sharedEmailAddress;
	private java.lang.String displayName;
	private java.lang.String firstName;
	private java.lang.String initials;
	private boolean spamDetected;
	private java.util.Date lastLogoffDate;
	private java.util.Date creationDate;
	private long taskPendingId;

	public SharedAccount() {
	}

	public long getQuota() { 
		return this.quota;
	} 

	public void setQuota(long quota) { 
		this.quota = quota;
	} 

	public SharedAccount quota(long quota) { 
		this.quota = quota;
		return this;
	} 

	public long getSpamTicketNumber() { 
		return this.spamTicketNumber;
	} 

	public void setSpamTicketNumber(long spamTicketNumber) { 
		this.spamTicketNumber = spamTicketNumber;
	} 

	public SharedAccount spamTicketNumber(long spamTicketNumber) { 
		this.spamTicketNumber = spamTicketNumber;
		return this;
	} 

	public boolean getHiddenFromGAL() { 
		return this.hiddenFromGAL;
	} 

	public void setHiddenFromGAL(boolean hiddenFromGAL) { 
		this.hiddenFromGAL = hiddenFromGAL;
	} 

	public SharedAccount hiddenFromGAL(boolean hiddenFromGAL) { 
		this.hiddenFromGAL = hiddenFromGAL;
		return this;
	} 

	public java.lang.String getState() { 
		return this.state;
	} 

	public void setState(java.lang.String state) { 
		this.state = state;
	} 

	public SharedAccount state(java.lang.String state) { 
		this.state = state;
		return this;
	} 

	public long getCurrentUsage() { 
		return this.currentUsage;
	} 

	public void setCurrentUsage(long currentUsage) { 
		this.currentUsage = currentUsage;
	} 

	public SharedAccount currentUsage(long currentUsage) { 
		this.currentUsage = currentUsage;
		return this;
	} 

	public java.util.Date getLastLogonDate() { 
		return this.lastLogonDate;
	} 

	public void setLastLogonDate(java.util.Date lastLogonDate) { 
		this.lastLogonDate = lastLogonDate;
	} 

	public SharedAccount lastLogonDate(java.util.Date lastLogonDate) { 
		this.lastLogonDate = lastLogonDate;
		return this;
	} 

	public java.lang.String[] getMailingFilter() { 
		return this.mailingFilter;
	} 

	public void setMailingFilter(java.lang.String[] mailingFilter) { 
		this.mailingFilter = mailingFilter;
	} 

	public SharedAccount mailingFilter(java.lang.String[] mailingFilter) { 
		this.mailingFilter = mailingFilter;
		return this;
	} 

	public java.lang.String getLastName() { 
		return this.lastName;
	} 

	public void setLastName(java.lang.String lastName) { 
		this.lastName = lastName;
	} 

	public SharedAccount lastName(java.lang.String lastName) { 
		this.lastName = lastName;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public SharedAccount id(long id) { 
		this.id = id;
		return this;
	} 

	public java.lang.String getSharedEmailAddress() { 
		return this.sharedEmailAddress;
	} 

	public void setSharedEmailAddress(java.lang.String sharedEmailAddress) { 
		this.sharedEmailAddress = sharedEmailAddress;
	} 

	public SharedAccount sharedEmailAddress(java.lang.String sharedEmailAddress) { 
		this.sharedEmailAddress = sharedEmailAddress;
		return this;
	} 

	public java.lang.String getDisplayName() { 
		return this.displayName;
	} 

	public void setDisplayName(java.lang.String displayName) { 
		this.displayName = displayName;
	} 

	public SharedAccount displayName(java.lang.String displayName) { 
		this.displayName = displayName;
		return this;
	} 

	public java.lang.String getFirstName() { 
		return this.firstName;
	} 

	public void setFirstName(java.lang.String firstName) { 
		this.firstName = firstName;
	} 

	public SharedAccount firstName(java.lang.String firstName) { 
		this.firstName = firstName;
		return this;
	} 

	public java.lang.String getInitials() { 
		return this.initials;
	} 

	public void setInitials(java.lang.String initials) { 
		this.initials = initials;
	} 

	public SharedAccount initials(java.lang.String initials) { 
		this.initials = initials;
		return this;
	} 

	public boolean getSpamDetected() { 
		return this.spamDetected;
	} 

	public void setSpamDetected(boolean spamDetected) { 
		this.spamDetected = spamDetected;
	} 

	public SharedAccount spamDetected(boolean spamDetected) { 
		this.spamDetected = spamDetected;
		return this;
	} 

	public java.util.Date getLastLogoffDate() { 
		return this.lastLogoffDate;
	} 

	public void setLastLogoffDate(java.util.Date lastLogoffDate) { 
		this.lastLogoffDate = lastLogoffDate;
	} 

	public SharedAccount lastLogoffDate(java.util.Date lastLogoffDate) { 
		this.lastLogoffDate = lastLogoffDate;
		return this;
	} 

	public java.util.Date getCreationDate() { 
		return this.creationDate;
	} 

	public void setCreationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
	} 

	public SharedAccount creationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
		return this;
	} 

	public long getTaskPendingId() { 
		return this.taskPendingId;
	} 

	public void setTaskPendingId(long taskPendingId) { 
		this.taskPendingId = taskPendingId;
	} 

	public SharedAccount taskPendingId(long taskPendingId) { 
		this.taskPendingId = taskPendingId;
		return this;
	} 

}
