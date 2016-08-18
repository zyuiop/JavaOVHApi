package net.zyuiop.ovhapi.api.objects.email.exchange;

/**
 * Exchange mailbox
 */

public class Account { 

	private long spamTicketNumber;
	private java.lang.String state;
	private long currentUsage;
	private java.lang.String exchangeGuid;
	private boolean deleteOutlookAtExpiration;
	private long id;
	private java.lang.String renewOutlookPeriod;
	private boolean outlookLicense;
	private java.lang.String firstName;
	private java.lang.String primaryEmailAddress;
	private java.lang.String login;
	private java.util.Date passwordLastUpdate;
	private java.lang.String accountLicense;
	private boolean deleteAtExpiration;
	private long quota;
	private java.util.Date lastUpdateDate;
	private boolean hiddenFromGAL;
	private java.lang.String domain;
	private java.lang.String renewPeriod;
	private java.util.Date lastLogonDate;
	private java.lang.String lastName;
	private java.lang.String guid;
	private java.lang.String[] mailingFilter;
	private java.util.Date expirationOutlookDate;
	private java.lang.String displayName;
	private boolean spamDetected;
	private java.util.Date expirationDate;
	private java.util.Date lastLogoffDate;
	private java.util.Date creationDate;
	private java.lang.String initial;
	private java.lang.String SAMAccountName;
	private long taskPendingId;

	public Account() {
	}

	public long getSpamTicketNumber() { 
		return this.spamTicketNumber;
	} 

	public void setSpamTicketNumber(long spamTicketNumber) { 
		this.spamTicketNumber = spamTicketNumber;
	} 

	public Account spamTicketNumber(long spamTicketNumber) { 
		this.spamTicketNumber = spamTicketNumber;
		return this;
	} 

	public java.lang.String getState() { 
		return this.state;
	} 

	public void setState(java.lang.String state) { 
		this.state = state;
	} 

	public Account state(java.lang.String state) { 
		this.state = state;
		return this;
	} 

	public long getCurrentUsage() { 
		return this.currentUsage;
	} 

	public void setCurrentUsage(long currentUsage) { 
		this.currentUsage = currentUsage;
	} 

	public Account currentUsage(long currentUsage) { 
		this.currentUsage = currentUsage;
		return this;
	} 

	public java.lang.String getExchangeGuid() { 
		return this.exchangeGuid;
	} 

	public void setExchangeGuid(java.lang.String exchangeGuid) { 
		this.exchangeGuid = exchangeGuid;
	} 

	public Account exchangeGuid(java.lang.String exchangeGuid) { 
		this.exchangeGuid = exchangeGuid;
		return this;
	} 

	public boolean getDeleteOutlookAtExpiration() { 
		return this.deleteOutlookAtExpiration;
	} 

	public void setDeleteOutlookAtExpiration(boolean deleteOutlookAtExpiration) { 
		this.deleteOutlookAtExpiration = deleteOutlookAtExpiration;
	} 

	public Account deleteOutlookAtExpiration(boolean deleteOutlookAtExpiration) { 
		this.deleteOutlookAtExpiration = deleteOutlookAtExpiration;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public Account id(long id) { 
		this.id = id;
		return this;
	} 

	public java.lang.String getRenewOutlookPeriod() { 
		return this.renewOutlookPeriod;
	} 

	public void setRenewOutlookPeriod(java.lang.String renewOutlookPeriod) { 
		this.renewOutlookPeriod = renewOutlookPeriod;
	} 

	public Account renewOutlookPeriod(java.lang.String renewOutlookPeriod) { 
		this.renewOutlookPeriod = renewOutlookPeriod;
		return this;
	} 

	public boolean getOutlookLicense() { 
		return this.outlookLicense;
	} 

	public void setOutlookLicense(boolean outlookLicense) { 
		this.outlookLicense = outlookLicense;
	} 

	public Account outlookLicense(boolean outlookLicense) { 
		this.outlookLicense = outlookLicense;
		return this;
	} 

	public java.lang.String getFirstName() { 
		return this.firstName;
	} 

	public void setFirstName(java.lang.String firstName) { 
		this.firstName = firstName;
	} 

	public Account firstName(java.lang.String firstName) { 
		this.firstName = firstName;
		return this;
	} 

	public java.lang.String getPrimaryEmailAddress() { 
		return this.primaryEmailAddress;
	} 

	public void setPrimaryEmailAddress(java.lang.String primaryEmailAddress) { 
		this.primaryEmailAddress = primaryEmailAddress;
	} 

	public Account primaryEmailAddress(java.lang.String primaryEmailAddress) { 
		this.primaryEmailAddress = primaryEmailAddress;
		return this;
	} 

	public java.lang.String getLogin() { 
		return this.login;
	} 

	public void setLogin(java.lang.String login) { 
		this.login = login;
	} 

	public Account login(java.lang.String login) { 
		this.login = login;
		return this;
	} 

	public java.util.Date getPasswordLastUpdate() { 
		return this.passwordLastUpdate;
	} 

	public void setPasswordLastUpdate(java.util.Date passwordLastUpdate) { 
		this.passwordLastUpdate = passwordLastUpdate;
	} 

	public Account passwordLastUpdate(java.util.Date passwordLastUpdate) { 
		this.passwordLastUpdate = passwordLastUpdate;
		return this;
	} 

	public java.lang.String getAccountLicense() { 
		return this.accountLicense;
	} 

	public void setAccountLicense(java.lang.String accountLicense) { 
		this.accountLicense = accountLicense;
	} 

	public Account accountLicense(java.lang.String accountLicense) { 
		this.accountLicense = accountLicense;
		return this;
	} 

	public boolean getDeleteAtExpiration() { 
		return this.deleteAtExpiration;
	} 

	public void setDeleteAtExpiration(boolean deleteAtExpiration) { 
		this.deleteAtExpiration = deleteAtExpiration;
	} 

	public Account deleteAtExpiration(boolean deleteAtExpiration) { 
		this.deleteAtExpiration = deleteAtExpiration;
		return this;
	} 

	public long getQuota() { 
		return this.quota;
	} 

	public void setQuota(long quota) { 
		this.quota = quota;
	} 

	public Account quota(long quota) { 
		this.quota = quota;
		return this;
	} 

	public java.util.Date getLastUpdateDate() { 
		return this.lastUpdateDate;
	} 

	public void setLastUpdateDate(java.util.Date lastUpdateDate) { 
		this.lastUpdateDate = lastUpdateDate;
	} 

	public Account lastUpdateDate(java.util.Date lastUpdateDate) { 
		this.lastUpdateDate = lastUpdateDate;
		return this;
	} 

	public boolean getHiddenFromGAL() { 
		return this.hiddenFromGAL;
	} 

	public void setHiddenFromGAL(boolean hiddenFromGAL) { 
		this.hiddenFromGAL = hiddenFromGAL;
	} 

	public Account hiddenFromGAL(boolean hiddenFromGAL) { 
		this.hiddenFromGAL = hiddenFromGAL;
		return this;
	} 

	public java.lang.String getDomain() { 
		return this.domain;
	} 

	public void setDomain(java.lang.String domain) { 
		this.domain = domain;
	} 

	public Account domain(java.lang.String domain) { 
		this.domain = domain;
		return this;
	} 

	public java.lang.String getRenewPeriod() { 
		return this.renewPeriod;
	} 

	public void setRenewPeriod(java.lang.String renewPeriod) { 
		this.renewPeriod = renewPeriod;
	} 

	public Account renewPeriod(java.lang.String renewPeriod) { 
		this.renewPeriod = renewPeriod;
		return this;
	} 

	public java.util.Date getLastLogonDate() { 
		return this.lastLogonDate;
	} 

	public void setLastLogonDate(java.util.Date lastLogonDate) { 
		this.lastLogonDate = lastLogonDate;
	} 

	public Account lastLogonDate(java.util.Date lastLogonDate) { 
		this.lastLogonDate = lastLogonDate;
		return this;
	} 

	public java.lang.String getLastName() { 
		return this.lastName;
	} 

	public void setLastName(java.lang.String lastName) { 
		this.lastName = lastName;
	} 

	public Account lastName(java.lang.String lastName) { 
		this.lastName = lastName;
		return this;
	} 

	public java.lang.String getGuid() { 
		return this.guid;
	} 

	public void setGuid(java.lang.String guid) { 
		this.guid = guid;
	} 

	public Account guid(java.lang.String guid) { 
		this.guid = guid;
		return this;
	} 

	public java.lang.String[] getMailingFilter() { 
		return this.mailingFilter;
	} 

	public void setMailingFilter(java.lang.String[] mailingFilter) { 
		this.mailingFilter = mailingFilter;
	} 

	public Account mailingFilter(java.lang.String[] mailingFilter) { 
		this.mailingFilter = mailingFilter;
		return this;
	} 

	public java.util.Date getExpirationOutlookDate() { 
		return this.expirationOutlookDate;
	} 

	public void setExpirationOutlookDate(java.util.Date expirationOutlookDate) { 
		this.expirationOutlookDate = expirationOutlookDate;
	} 

	public Account expirationOutlookDate(java.util.Date expirationOutlookDate) { 
		this.expirationOutlookDate = expirationOutlookDate;
		return this;
	} 

	public java.lang.String getDisplayName() { 
		return this.displayName;
	} 

	public void setDisplayName(java.lang.String displayName) { 
		this.displayName = displayName;
	} 

	public Account displayName(java.lang.String displayName) { 
		this.displayName = displayName;
		return this;
	} 

	public boolean getSpamDetected() { 
		return this.spamDetected;
	} 

	public void setSpamDetected(boolean spamDetected) { 
		this.spamDetected = spamDetected;
	} 

	public Account spamDetected(boolean spamDetected) { 
		this.spamDetected = spamDetected;
		return this;
	} 

	public java.util.Date getExpirationDate() { 
		return this.expirationDate;
	} 

	public void setExpirationDate(java.util.Date expirationDate) { 
		this.expirationDate = expirationDate;
	} 

	public Account expirationDate(java.util.Date expirationDate) { 
		this.expirationDate = expirationDate;
		return this;
	} 

	public java.util.Date getLastLogoffDate() { 
		return this.lastLogoffDate;
	} 

	public void setLastLogoffDate(java.util.Date lastLogoffDate) { 
		this.lastLogoffDate = lastLogoffDate;
	} 

	public Account lastLogoffDate(java.util.Date lastLogoffDate) { 
		this.lastLogoffDate = lastLogoffDate;
		return this;
	} 

	public java.util.Date getCreationDate() { 
		return this.creationDate;
	} 

	public void setCreationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
	} 

	public Account creationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
		return this;
	} 

	public java.lang.String getInitial() { 
		return this.initial;
	} 

	public void setInitial(java.lang.String initial) { 
		this.initial = initial;
	} 

	public Account initial(java.lang.String initial) { 
		this.initial = initial;
		return this;
	} 

	public java.lang.String getSAMAccountName() { 
		return this.SAMAccountName;
	} 

	public void setSAMAccountName(java.lang.String SAMAccountName) { 
		this.SAMAccountName = SAMAccountName;
	} 

	public Account SAMAccountName(java.lang.String SAMAccountName) { 
		this.SAMAccountName = SAMAccountName;
		return this;
	} 

	public long getTaskPendingId() { 
		return this.taskPendingId;
	} 

	public void setTaskPendingId(long taskPendingId) { 
		this.taskPendingId = taskPendingId;
	} 

	public Account taskPendingId(long taskPendingId) { 
		this.taskPendingId = taskPendingId;
		return this;
	} 

}
