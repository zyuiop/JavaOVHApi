package net.zyuiop.ovhapi.impl.objects.email.exchange;

import net.zyuiop.ovhapi.api.objects.email.exchange.ExchangeServiceProtocol;
/**
 * Protocol access policy for this Exchange service
 */

public class ExchangeServiceProtocolImpl implements ExchangeServiceProtocol { 

	private boolean POP;
	private boolean webMail;
	private java.lang.String activeSyncPolicy;
	private java.util.Date creationDate;
	private java.util.Date lastUpdate;
	private boolean activeSync;
	private long taskPendingId;
	private boolean IMAP;

	public ExchangeServiceProtocolImpl() {
	}

	public boolean getPOP() { 
		return this.POP;
	} 

	public void setPOP(boolean POP) { 
		this.POP = POP;
	} 

	public ExchangeServiceProtocolImpl POP(boolean POP) { 
		this.POP = POP;
		return this;
	} 

	public boolean getWebMail() { 
		return this.webMail;
	} 

	public void setWebMail(boolean webMail) { 
		this.webMail = webMail;
	} 

	public ExchangeServiceProtocolImpl webMail(boolean webMail) { 
		this.webMail = webMail;
		return this;
	} 

	public java.lang.String getActiveSyncPolicy() { 
		return this.activeSyncPolicy;
	} 

	public void setActiveSyncPolicy(java.lang.String activeSyncPolicy) { 
		this.activeSyncPolicy = activeSyncPolicy;
	} 

	public ExchangeServiceProtocolImpl activeSyncPolicy(java.lang.String activeSyncPolicy) { 
		this.activeSyncPolicy = activeSyncPolicy;
		return this;
	} 

	public java.util.Date getCreationDate() { 
		return this.creationDate;
	} 

	public void setCreationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
	} 

	public ExchangeServiceProtocolImpl creationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
		return this;
	} 

	public java.util.Date getLastUpdate() { 
		return this.lastUpdate;
	} 

	public void setLastUpdate(java.util.Date lastUpdate) { 
		this.lastUpdate = lastUpdate;
	} 

	public ExchangeServiceProtocolImpl lastUpdate(java.util.Date lastUpdate) { 
		this.lastUpdate = lastUpdate;
		return this;
	} 

	public boolean getActiveSync() { 
		return this.activeSync;
	} 

	public void setActiveSync(boolean activeSync) { 
		this.activeSync = activeSync;
	} 

	public ExchangeServiceProtocolImpl activeSync(boolean activeSync) { 
		this.activeSync = activeSync;
		return this;
	} 

	public long getTaskPendingId() { 
		return this.taskPendingId;
	} 

	public void setTaskPendingId(long taskPendingId) { 
		this.taskPendingId = taskPendingId;
	} 

	public ExchangeServiceProtocolImpl taskPendingId(long taskPendingId) { 
		this.taskPendingId = taskPendingId;
		return this;
	} 

	public boolean getIMAP() { 
		return this.IMAP;
	} 

	public void setIMAP(boolean IMAP) { 
		this.IMAP = IMAP;
	} 

	public ExchangeServiceProtocolImpl IMAP(boolean IMAP) { 
		this.IMAP = IMAP;
		return this;
	} 

}
