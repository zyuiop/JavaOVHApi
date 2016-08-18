package net.zyuiop.ovhapi.api.objects.dedicated.server;

/**
 * SPLA licenses management
 */

public class Spla { 

	private java.util.Date lastUpdate;
	private java.lang.String status;
	private long id;
	private java.lang.String type;
	private java.lang.String serialNumber;

	public Spla() {
	}

	public java.util.Date getLastUpdate() { 
		return this.lastUpdate;
	} 

	public void setLastUpdate(java.util.Date lastUpdate) { 
		this.lastUpdate = lastUpdate;
	} 

	public Spla lastUpdate(java.util.Date lastUpdate) { 
		this.lastUpdate = lastUpdate;
		return this;
	} 

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public Spla status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public Spla id(long id) { 
		this.id = id;
		return this;
	} 

	public java.lang.String getType() { 
		return this.type;
	} 

	public void setType(java.lang.String type) { 
		this.type = type;
	} 

	public Spla type(java.lang.String type) { 
		this.type = type;
		return this;
	} 

	public java.lang.String getSerialNumber() { 
		return this.serialNumber;
	} 

	public void setSerialNumber(java.lang.String serialNumber) { 
		this.serialNumber = serialNumber;
	} 

	public Spla serialNumber(java.lang.String serialNumber) { 
		this.serialNumber = serialNumber;
		return this;
	} 

}
