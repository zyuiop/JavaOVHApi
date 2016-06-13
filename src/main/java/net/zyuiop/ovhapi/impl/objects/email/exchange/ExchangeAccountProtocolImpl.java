package net.zyuiop.ovhapi.impl.objects.email.exchange;

import net.zyuiop.ovhapi.api.objects.email.exchange.ExchangeAccountProtocol;
/**
 * Get protocol status on that mailbox
 */

public class ExchangeAccountProtocolImpl implements ExchangeAccountProtocol { 

	private java.util.Date creationDate;
	private java.util.Date lastUpdate;
	private boolean POP;
	private boolean activeSync;
	private long taskPendingId;
	private boolean IMAP;
	private boolean webMail;

	public ExchangeAccountProtocolImpl() {
	}

	public java.util.Date getCreationDate() { 
		return this.creationDate;
	} 

	public void setCreationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
	} 

	public ExchangeAccountProtocolImpl creationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
		return this;
	} 

	public java.util.Date getLastUpdate() { 
		return this.lastUpdate;
	} 

	public void setLastUpdate(java.util.Date lastUpdate) { 
		this.lastUpdate = lastUpdate;
	} 

	public ExchangeAccountProtocolImpl lastUpdate(java.util.Date lastUpdate) { 
		this.lastUpdate = lastUpdate;
		return this;
	} 

	public boolean getPOP() { 
		return this.POP;
	} 

	public void setPOP(boolean POP) { 
		this.POP = POP;
	} 

	public ExchangeAccountProtocolImpl POP(boolean POP) { 
		this.POP = POP;
		return this;
	} 

	public boolean getActiveSync() { 
		return this.activeSync;
	} 

	public void setActiveSync(boolean activeSync) { 
		this.activeSync = activeSync;
	} 

	public ExchangeAccountProtocolImpl activeSync(boolean activeSync) { 
		this.activeSync = activeSync;
		return this;
	} 

	public long getTaskPendingId() { 
		return this.taskPendingId;
	} 

	public void setTaskPendingId(long taskPendingId) { 
		this.taskPendingId = taskPendingId;
	} 

	public ExchangeAccountProtocolImpl taskPendingId(long taskPendingId) { 
		this.taskPendingId = taskPendingId;
		return this;
	} 

	public boolean getIMAP() { 
		return this.IMAP;
	} 

	public void setIMAP(boolean IMAP) { 
		this.IMAP = IMAP;
	} 

	public ExchangeAccountProtocolImpl IMAP(boolean IMAP) { 
		this.IMAP = IMAP;
		return this;
	} 

	public boolean getWebMail() { 
		return this.webMail;
	} 

	public void setWebMail(boolean webMail) { 
		this.webMail = webMail;
	} 

	public ExchangeAccountProtocolImpl webMail(boolean webMail) { 
		this.webMail = webMail;
		return this;
	} 

}
