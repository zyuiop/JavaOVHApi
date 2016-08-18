package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Dialplan
 */

public class OvhPabxDialplan { 

	private java.util.Date lastUpdate;
	private java.lang.String name;
	private java.lang.String showCallerNumber;
	private long transferTimeout;
	private long dialplanId;
	private boolean anonymousRejection;

	public OvhPabxDialplan() {
	}

	public java.util.Date getLastUpdate() { 
		return this.lastUpdate;
	} 

	public void setLastUpdate(java.util.Date lastUpdate) { 
		this.lastUpdate = lastUpdate;
	} 

	public OvhPabxDialplan lastUpdate(java.util.Date lastUpdate) { 
		this.lastUpdate = lastUpdate;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public OvhPabxDialplan name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public java.lang.String getShowCallerNumber() { 
		return this.showCallerNumber;
	} 

	public void setShowCallerNumber(java.lang.String showCallerNumber) { 
		this.showCallerNumber = showCallerNumber;
	} 

	public OvhPabxDialplan showCallerNumber(java.lang.String showCallerNumber) { 
		this.showCallerNumber = showCallerNumber;
		return this;
	} 

	public long getTransferTimeout() { 
		return this.transferTimeout;
	} 

	public void setTransferTimeout(long transferTimeout) { 
		this.transferTimeout = transferTimeout;
	} 

	public OvhPabxDialplan transferTimeout(long transferTimeout) { 
		this.transferTimeout = transferTimeout;
		return this;
	} 

	public long getDialplanId() { 
		return this.dialplanId;
	} 

	public void setDialplanId(long dialplanId) { 
		this.dialplanId = dialplanId;
	} 

	public OvhPabxDialplan dialplanId(long dialplanId) { 
		this.dialplanId = dialplanId;
		return this;
	} 

	public boolean getAnonymousRejection() { 
		return this.anonymousRejection;
	} 

	public void setAnonymousRejection(boolean anonymousRejection) { 
		this.anonymousRejection = anonymousRejection;
	} 

	public OvhPabxDialplan anonymousRejection(boolean anonymousRejection) { 
		this.anonymousRejection = anonymousRejection;
		return this;
	} 

}
