package net.zyuiop.ovhapi.impl.objects.email.exchange;

import net.zyuiop.ovhapi.api.objects.email.exchange.ExchangeServiceActiveSyncNotification;
/**
 * Get email addresses subscribed to ActiveSync quarantine notifications
 */

public class ExchangeServiceActiveSyncNotificationImpl implements ExchangeServiceActiveSyncNotification { 

	private java.util.Date creationDate;
	private long notifiedAccountId;
	private java.lang.String primaryEmailAddress;
	private java.lang.String state;

	public ExchangeServiceActiveSyncNotificationImpl() {
	}

	public java.util.Date getCreationDate() { 
		return this.creationDate;
	} 

	public void setCreationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
	} 

	public ExchangeServiceActiveSyncNotificationImpl creationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
		return this;
	} 

	public long getNotifiedAccountId() { 
		return this.notifiedAccountId;
	} 

	public void setNotifiedAccountId(long notifiedAccountId) { 
		this.notifiedAccountId = notifiedAccountId;
	} 

	public ExchangeServiceActiveSyncNotificationImpl notifiedAccountId(long notifiedAccountId) { 
		this.notifiedAccountId = notifiedAccountId;
		return this;
	} 

	public java.lang.String getPrimaryEmailAddress() { 
		return this.primaryEmailAddress;
	} 

	public void setPrimaryEmailAddress(java.lang.String primaryEmailAddress) { 
		this.primaryEmailAddress = primaryEmailAddress;
	} 

	public ExchangeServiceActiveSyncNotificationImpl primaryEmailAddress(java.lang.String primaryEmailAddress) { 
		this.primaryEmailAddress = primaryEmailAddress;
		return this;
	} 

	public java.lang.String getState() { 
		return this.state;
	} 

	public void setState(java.lang.String state) { 
		this.state = state;
	} 

	public ExchangeServiceActiveSyncNotificationImpl state(java.lang.String state) { 
		this.state = state;
		return this;
	} 

}
