package net.zyuiop.ovhapi.impl.objects.iploadbalancing;

import net.zyuiop.ovhapi.api.objects.iploadbalancing.Frontend;
/**
 * Frontend
 */

public class FrontendImpl implements Frontend { 

	private java.lang.String zone;
	private boolean ssl;
	private java.lang.String name;
	private java.lang.String port;
	private boolean hsts;
	private java.lang.String redirectLocation;
	private long defaultBackendId;
	private java.lang.String type;
	private long id;

	public FrontendImpl() {
	}

	public java.lang.String getZone() { 
		return this.zone;
	} 

	public void setZone(java.lang.String zone) { 
		this.zone = zone;
	} 

	public FrontendImpl zone(java.lang.String zone) { 
		this.zone = zone;
		return this;
	} 

	public boolean getSsl() { 
		return this.ssl;
	} 

	public void setSsl(boolean ssl) { 
		this.ssl = ssl;
	} 

	public FrontendImpl ssl(boolean ssl) { 
		this.ssl = ssl;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public FrontendImpl name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public java.lang.String getPort() { 
		return this.port;
	} 

	public void setPort(java.lang.String port) { 
		this.port = port;
	} 

	public FrontendImpl port(java.lang.String port) { 
		this.port = port;
		return this;
	} 

	public boolean getHsts() { 
		return this.hsts;
	} 

	public void setHsts(boolean hsts) { 
		this.hsts = hsts;
	} 

	public FrontendImpl hsts(boolean hsts) { 
		this.hsts = hsts;
		return this;
	} 

	public java.lang.String getRedirectLocation() { 
		return this.redirectLocation;
	} 

	public void setRedirectLocation(java.lang.String redirectLocation) { 
		this.redirectLocation = redirectLocation;
	} 

	public FrontendImpl redirectLocation(java.lang.String redirectLocation) { 
		this.redirectLocation = redirectLocation;
		return this;
	} 

	public long getDefaultBackendId() { 
		return this.defaultBackendId;
	} 

	public void setDefaultBackendId(long defaultBackendId) { 
		this.defaultBackendId = defaultBackendId;
	} 

	public FrontendImpl defaultBackendId(long defaultBackendId) { 
		this.defaultBackendId = defaultBackendId;
		return this;
	} 

	public java.lang.String getType() { 
		return this.type;
	} 

	public void setType(java.lang.String type) { 
		this.type = type;
	} 

	public FrontendImpl type(java.lang.String type) { 
		this.type = type;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public FrontendImpl id(long id) { 
		this.id = id;
		return this;
	} 

}
