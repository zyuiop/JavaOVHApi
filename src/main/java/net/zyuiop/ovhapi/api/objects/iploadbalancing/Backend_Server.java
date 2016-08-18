package net.zyuiop.ovhapi.api.objects.iploadbalancing;

/**
 * Backend_Server
 */

public class Backend_Server { 

	private long backendId;
	private boolean ssl;
	private java.lang.String cookie;
	private java.lang.String proxyProtocolVersion;
	private long serverId;
	private java.lang.String chain;
	private long weight;
	private long id;
	private boolean probe;
	private boolean backup;

	public Backend_Server() {
	}

	public long getBackendId() { 
		return this.backendId;
	} 

	public void setBackendId(long backendId) { 
		this.backendId = backendId;
	} 

	public Backend_Server backendId(long backendId) { 
		this.backendId = backendId;
		return this;
	} 

	public boolean getSsl() { 
		return this.ssl;
	} 

	public void setSsl(boolean ssl) { 
		this.ssl = ssl;
	} 

	public Backend_Server ssl(boolean ssl) { 
		this.ssl = ssl;
		return this;
	} 

	public java.lang.String getCookie() { 
		return this.cookie;
	} 

	public void setCookie(java.lang.String cookie) { 
		this.cookie = cookie;
	} 

	public Backend_Server cookie(java.lang.String cookie) { 
		this.cookie = cookie;
		return this;
	} 

	public java.lang.String getProxyProtocolVersion() { 
		return this.proxyProtocolVersion;
	} 

	public void setProxyProtocolVersion(java.lang.String proxyProtocolVersion) { 
		this.proxyProtocolVersion = proxyProtocolVersion;
	} 

	public Backend_Server proxyProtocolVersion(java.lang.String proxyProtocolVersion) { 
		this.proxyProtocolVersion = proxyProtocolVersion;
		return this;
	} 

	public long getServerId() { 
		return this.serverId;
	} 

	public void setServerId(long serverId) { 
		this.serverId = serverId;
	} 

	public Backend_Server serverId(long serverId) { 
		this.serverId = serverId;
		return this;
	} 

	public java.lang.String getChain() { 
		return this.chain;
	} 

	public void setChain(java.lang.String chain) { 
		this.chain = chain;
	} 

	public Backend_Server chain(java.lang.String chain) { 
		this.chain = chain;
		return this;
	} 

	public long getWeight() { 
		return this.weight;
	} 

	public void setWeight(long weight) { 
		this.weight = weight;
	} 

	public Backend_Server weight(long weight) { 
		this.weight = weight;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public Backend_Server id(long id) { 
		this.id = id;
		return this;
	} 

	public boolean getProbe() { 
		return this.probe;
	} 

	public void setProbe(boolean probe) { 
		this.probe = probe;
	} 

	public Backend_Server probe(boolean probe) { 
		this.probe = probe;
		return this;
	} 

	public boolean getBackup() { 
		return this.backup;
	} 

	public void setBackup(boolean backup) { 
		this.backup = backup;
	} 

	public Backend_Server backup(boolean backup) { 
		this.backup = backup;
		return this;
	} 

}
