package net.zyuiop.ovhapi.impl.objects.cloud.ip;

import net.zyuiop.ovhapi.api.objects.cloud.ip.FailoverIp;
/**
 * FailoverIp
 */

public class FailoverIpImpl implements FailoverIp { 

	private java.lang.String continentCode;
	private java.lang.String ip;
	private long progress;
	private java.lang.String status;
	private java.lang.String routedTo;
	private java.lang.String subType;
	private java.lang.String block;
	private java.lang.String id;
	private java.lang.String geoloc;

	public FailoverIpImpl() {
	}

	public java.lang.String getContinentCode() { 
		return this.continentCode;
	} 

	public void setContinentCode(java.lang.String continentCode) { 
		this.continentCode = continentCode;
	} 

	public FailoverIpImpl continentCode(java.lang.String continentCode) { 
		this.continentCode = continentCode;
		return this;
	} 

	public java.lang.String getIp() { 
		return this.ip;
	} 

	public void setIp(java.lang.String ip) { 
		this.ip = ip;
	} 

	public FailoverIpImpl ip(java.lang.String ip) { 
		this.ip = ip;
		return this;
	} 

	public long getProgress() { 
		return this.progress;
	} 

	public void setProgress(long progress) { 
		this.progress = progress;
	} 

	public FailoverIpImpl progress(long progress) { 
		this.progress = progress;
		return this;
	} 

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public FailoverIpImpl status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public java.lang.String getRoutedTo() { 
		return this.routedTo;
	} 

	public void setRoutedTo(java.lang.String routedTo) { 
		this.routedTo = routedTo;
	} 

	public FailoverIpImpl routedTo(java.lang.String routedTo) { 
		this.routedTo = routedTo;
		return this;
	} 

	public java.lang.String getSubType() { 
		return this.subType;
	} 

	public void setSubType(java.lang.String subType) { 
		this.subType = subType;
	} 

	public FailoverIpImpl subType(java.lang.String subType) { 
		this.subType = subType;
		return this;
	} 

	public java.lang.String getBlock() { 
		return this.block;
	} 

	public void setBlock(java.lang.String block) { 
		this.block = block;
	} 

	public FailoverIpImpl block(java.lang.String block) { 
		this.block = block;
		return this;
	} 

	public java.lang.String getId() { 
		return this.id;
	} 

	public void setId(java.lang.String id) { 
		this.id = id;
	} 

	public FailoverIpImpl id(java.lang.String id) { 
		this.id = id;
		return this;
	} 

	public java.lang.String getGeoloc() { 
		return this.geoloc;
	} 

	public void setGeoloc(java.lang.String geoloc) { 
		this.geoloc = geoloc;
	} 

	public FailoverIpImpl geoloc(java.lang.String geoloc) { 
		this.geoloc = geoloc;
		return this;
	} 

}
