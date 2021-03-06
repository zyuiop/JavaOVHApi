package net.zyuiop.ovhapi.api.objects.hosting.web;

/**
 * Virtual service
 */

public class OvhConfig { 

	private java.lang.String httpFirewall;
	private java.lang.String engineName;
	private boolean historical;
	private java.lang.String path;
	private java.lang.String environment;
	private boolean fileExist;
	private java.util.Date creationDate;
	private long id;
	private java.lang.String engineVersion;

	public OvhConfig() {
	}

	public java.lang.String getHttpFirewall() { 
		return this.httpFirewall;
	} 

	public void setHttpFirewall(java.lang.String httpFirewall) { 
		this.httpFirewall = httpFirewall;
	} 

	public OvhConfig httpFirewall(java.lang.String httpFirewall) { 
		this.httpFirewall = httpFirewall;
		return this;
	} 

	public java.lang.String getEngineName() { 
		return this.engineName;
	} 

	public void setEngineName(java.lang.String engineName) { 
		this.engineName = engineName;
	} 

	public OvhConfig engineName(java.lang.String engineName) { 
		this.engineName = engineName;
		return this;
	} 

	public boolean getHistorical() { 
		return this.historical;
	} 

	public void setHistorical(boolean historical) { 
		this.historical = historical;
	} 

	public OvhConfig historical(boolean historical) { 
		this.historical = historical;
		return this;
	} 

	public java.lang.String getPath() { 
		return this.path;
	} 

	public void setPath(java.lang.String path) { 
		this.path = path;
	} 

	public OvhConfig path(java.lang.String path) { 
		this.path = path;
		return this;
	} 

	public java.lang.String getEnvironment() { 
		return this.environment;
	} 

	public void setEnvironment(java.lang.String environment) { 
		this.environment = environment;
	} 

	public OvhConfig environment(java.lang.String environment) { 
		this.environment = environment;
		return this;
	} 

	public boolean getFileExist() { 
		return this.fileExist;
	} 

	public void setFileExist(boolean fileExist) { 
		this.fileExist = fileExist;
	} 

	public OvhConfig fileExist(boolean fileExist) { 
		this.fileExist = fileExist;
		return this;
	} 

	public java.util.Date getCreationDate() { 
		return this.creationDate;
	} 

	public void setCreationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
	} 

	public OvhConfig creationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public OvhConfig id(long id) { 
		this.id = id;
		return this;
	} 

	public java.lang.String getEngineVersion() { 
		return this.engineVersion;
	} 

	public void setEngineVersion(java.lang.String engineVersion) { 
		this.engineVersion = engineVersion;
	} 

	public OvhConfig engineVersion(java.lang.String engineVersion) { 
		this.engineVersion = engineVersion;
		return this;
	} 

}
