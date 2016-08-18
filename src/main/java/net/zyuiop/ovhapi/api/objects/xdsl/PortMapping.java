package net.zyuiop.ovhapi.api.objects.xdsl;

/**
 * Port Mappings
 */

public class PortMapping { 

	private java.lang.String protocol;
	private long taskId;
	private java.lang.String name;
	private long externalPortStart;
	private long externalPortEnd;
	private java.lang.String description;
	private java.lang.String internalClient;
	private java.lang.String allowedRemoteIp;
	private long internalPort;
	private long id;

	public PortMapping() {
	}

	public java.lang.String getProtocol() { 
		return this.protocol;
	} 

	public void setProtocol(java.lang.String protocol) { 
		this.protocol = protocol;
	} 

	public PortMapping protocol(java.lang.String protocol) { 
		this.protocol = protocol;
		return this;
	} 

	public long getTaskId() { 
		return this.taskId;
	} 

	public void setTaskId(long taskId) { 
		this.taskId = taskId;
	} 

	public PortMapping taskId(long taskId) { 
		this.taskId = taskId;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public PortMapping name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public long getExternalPortStart() { 
		return this.externalPortStart;
	} 

	public void setExternalPortStart(long externalPortStart) { 
		this.externalPortStart = externalPortStart;
	} 

	public PortMapping externalPortStart(long externalPortStart) { 
		this.externalPortStart = externalPortStart;
		return this;
	} 

	public long getExternalPortEnd() { 
		return this.externalPortEnd;
	} 

	public void setExternalPortEnd(long externalPortEnd) { 
		this.externalPortEnd = externalPortEnd;
	} 

	public PortMapping externalPortEnd(long externalPortEnd) { 
		this.externalPortEnd = externalPortEnd;
		return this;
	} 

	public java.lang.String getDescription() { 
		return this.description;
	} 

	public void setDescription(java.lang.String description) { 
		this.description = description;
	} 

	public PortMapping description(java.lang.String description) { 
		this.description = description;
		return this;
	} 

	public java.lang.String getInternalClient() { 
		return this.internalClient;
	} 

	public void setInternalClient(java.lang.String internalClient) { 
		this.internalClient = internalClient;
	} 

	public PortMapping internalClient(java.lang.String internalClient) { 
		this.internalClient = internalClient;
		return this;
	} 

	public java.lang.String getAllowedRemoteIp() { 
		return this.allowedRemoteIp;
	} 

	public void setAllowedRemoteIp(java.lang.String allowedRemoteIp) { 
		this.allowedRemoteIp = allowedRemoteIp;
	} 

	public PortMapping allowedRemoteIp(java.lang.String allowedRemoteIp) { 
		this.allowedRemoteIp = allowedRemoteIp;
		return this;
	} 

	public long getInternalPort() { 
		return this.internalPort;
	} 

	public void setInternalPort(long internalPort) { 
		this.internalPort = internalPort;
	} 

	public PortMapping internalPort(long internalPort) { 
		this.internalPort = internalPort;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public PortMapping id(long id) { 
		this.id = id;
		return this;
	} 

}
