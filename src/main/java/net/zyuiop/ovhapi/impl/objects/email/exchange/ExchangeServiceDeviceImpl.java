package net.zyuiop.ovhapi.impl.objects.email.exchange;

import net.zyuiop.ovhapi.api.objects.email.exchange.ExchangeServiceDevice;
/**
 * Get the list of your ActiveSync devices registered on this Exchange service
 */

public class ExchangeServiceDeviceImpl implements ExchangeServiceDevice { 

	private java.lang.String deviceId;
	private java.lang.String IMEI;
	private java.lang.String deviceState;
	private java.lang.String deviceModel;
	private java.lang.String identity;
	private java.util.Date creationDate;
	private java.util.Date lastUpdate;
	private java.lang.String guid;
	private long taskPendingId;

	public ExchangeServiceDeviceImpl() {
	}

	public java.lang.String getDeviceId() { 
		return this.deviceId;
	} 

	public void setDeviceId(java.lang.String deviceId) { 
		this.deviceId = deviceId;
	} 

	public ExchangeServiceDeviceImpl deviceId(java.lang.String deviceId) { 
		this.deviceId = deviceId;
		return this;
	} 

	public java.lang.String getIMEI() { 
		return this.IMEI;
	} 

	public void setIMEI(java.lang.String IMEI) { 
		this.IMEI = IMEI;
	} 

	public ExchangeServiceDeviceImpl IMEI(java.lang.String IMEI) { 
		this.IMEI = IMEI;
		return this;
	} 

	public java.lang.String getDeviceState() { 
		return this.deviceState;
	} 

	public void setDeviceState(java.lang.String deviceState) { 
		this.deviceState = deviceState;
	} 

	public ExchangeServiceDeviceImpl deviceState(java.lang.String deviceState) { 
		this.deviceState = deviceState;
		return this;
	} 

	public java.lang.String getDeviceModel() { 
		return this.deviceModel;
	} 

	public void setDeviceModel(java.lang.String deviceModel) { 
		this.deviceModel = deviceModel;
	} 

	public ExchangeServiceDeviceImpl deviceModel(java.lang.String deviceModel) { 
		this.deviceModel = deviceModel;
		return this;
	} 

	public java.lang.String getIdentity() { 
		return this.identity;
	} 

	public void setIdentity(java.lang.String identity) { 
		this.identity = identity;
	} 

	public ExchangeServiceDeviceImpl identity(java.lang.String identity) { 
		this.identity = identity;
		return this;
	} 

	public java.util.Date getCreationDate() { 
		return this.creationDate;
	} 

	public void setCreationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
	} 

	public ExchangeServiceDeviceImpl creationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
		return this;
	} 

	public java.util.Date getLastUpdate() { 
		return this.lastUpdate;
	} 

	public void setLastUpdate(java.util.Date lastUpdate) { 
		this.lastUpdate = lastUpdate;
	} 

	public ExchangeServiceDeviceImpl lastUpdate(java.util.Date lastUpdate) { 
		this.lastUpdate = lastUpdate;
		return this;
	} 

	public java.lang.String getGuid() { 
		return this.guid;
	} 

	public void setGuid(java.lang.String guid) { 
		this.guid = guid;
	} 

	public ExchangeServiceDeviceImpl guid(java.lang.String guid) { 
		this.guid = guid;
		return this;
	} 

	public long getTaskPendingId() { 
		return this.taskPendingId;
	} 

	public void setTaskPendingId(long taskPendingId) { 
		this.taskPendingId = taskPendingId;
	} 

	public ExchangeServiceDeviceImpl taskPendingId(long taskPendingId) { 
		this.taskPendingId = taskPendingId;
		return this;
	} 

}
