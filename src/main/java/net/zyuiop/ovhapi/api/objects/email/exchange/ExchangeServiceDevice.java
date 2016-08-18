package net.zyuiop.ovhapi.api.objects.email.exchange;

/**
 * Get the list of your ActiveSync devices registered on this Exchange service
 */

public class ExchangeServiceDevice { 

	private java.lang.String deviceId;
	private java.lang.String IMEI;
	private java.lang.String deviceState;
	private java.lang.String deviceModel;
	private java.lang.String identity;
	private java.util.Date creationDate;
	private java.util.Date lastUpdate;
	private java.lang.String guid;
	private long taskPendingId;

	public ExchangeServiceDevice() {
	}

	public java.lang.String getDeviceId() { 
		return this.deviceId;
	} 

	public void setDeviceId(java.lang.String deviceId) { 
		this.deviceId = deviceId;
	} 

	public ExchangeServiceDevice deviceId(java.lang.String deviceId) { 
		this.deviceId = deviceId;
		return this;
	} 

	public java.lang.String getIMEI() { 
		return this.IMEI;
	} 

	public void setIMEI(java.lang.String IMEI) { 
		this.IMEI = IMEI;
	} 

	public ExchangeServiceDevice IMEI(java.lang.String IMEI) { 
		this.IMEI = IMEI;
		return this;
	} 

	public java.lang.String getDeviceState() { 
		return this.deviceState;
	} 

	public void setDeviceState(java.lang.String deviceState) { 
		this.deviceState = deviceState;
	} 

	public ExchangeServiceDevice deviceState(java.lang.String deviceState) { 
		this.deviceState = deviceState;
		return this;
	} 

	public java.lang.String getDeviceModel() { 
		return this.deviceModel;
	} 

	public void setDeviceModel(java.lang.String deviceModel) { 
		this.deviceModel = deviceModel;
	} 

	public ExchangeServiceDevice deviceModel(java.lang.String deviceModel) { 
		this.deviceModel = deviceModel;
		return this;
	} 

	public java.lang.String getIdentity() { 
		return this.identity;
	} 

	public void setIdentity(java.lang.String identity) { 
		this.identity = identity;
	} 

	public ExchangeServiceDevice identity(java.lang.String identity) { 
		this.identity = identity;
		return this;
	} 

	public java.util.Date getCreationDate() { 
		return this.creationDate;
	} 

	public void setCreationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
	} 

	public ExchangeServiceDevice creationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
		return this;
	} 

	public java.util.Date getLastUpdate() { 
		return this.lastUpdate;
	} 

	public void setLastUpdate(java.util.Date lastUpdate) { 
		this.lastUpdate = lastUpdate;
	} 

	public ExchangeServiceDevice lastUpdate(java.util.Date lastUpdate) { 
		this.lastUpdate = lastUpdate;
		return this;
	} 

	public java.lang.String getGuid() { 
		return this.guid;
	} 

	public void setGuid(java.lang.String guid) { 
		this.guid = guid;
	} 

	public ExchangeServiceDevice guid(java.lang.String guid) { 
		this.guid = guid;
		return this;
	} 

	public long getTaskPendingId() { 
		return this.taskPendingId;
	} 

	public void setTaskPendingId(long taskPendingId) { 
		this.taskPendingId = taskPendingId;
	} 

	public ExchangeServiceDevice taskPendingId(long taskPendingId) { 
		this.taskPendingId = taskPendingId;
		return this;
	} 

}
