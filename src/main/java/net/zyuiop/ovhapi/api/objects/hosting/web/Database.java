package net.zyuiop.ovhapi.api.objects.hosting.web;

/**
 * Database
 */

public class Database { 

	private net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue quotaSize;
	private net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue quotaUsed;
	private java.lang.String mode;
	private java.lang.String version;
	private java.lang.String guiURL;
	private java.lang.String name;
	private long port;
	private java.lang.String state;
	private java.lang.String user;
	private java.lang.String type;
	private java.lang.String server;
	private java.util.Date lastCheck;

	public Database() {
	}

	public net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue getQuotaSize() { 
		return this.quotaSize;
	} 

	public void setQuotaSize(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue quotaSize) { 
		this.quotaSize = quotaSize;
	} 

	public Database quotaSize(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue quotaSize) { 
		this.quotaSize = quotaSize;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue getQuotaUsed() { 
		return this.quotaUsed;
	} 

	public void setQuotaUsed(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue quotaUsed) { 
		this.quotaUsed = quotaUsed;
	} 

	public Database quotaUsed(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue quotaUsed) { 
		this.quotaUsed = quotaUsed;
		return this;
	} 

	public java.lang.String getMode() { 
		return this.mode;
	} 

	public void setMode(java.lang.String mode) { 
		this.mode = mode;
	} 

	public Database mode(java.lang.String mode) { 
		this.mode = mode;
		return this;
	} 

	public java.lang.String getVersion() { 
		return this.version;
	} 

	public void setVersion(java.lang.String version) { 
		this.version = version;
	} 

	public Database version(java.lang.String version) { 
		this.version = version;
		return this;
	} 

	public java.lang.String getGuiURL() { 
		return this.guiURL;
	} 

	public void setGuiURL(java.lang.String guiURL) { 
		this.guiURL = guiURL;
	} 

	public Database guiURL(java.lang.String guiURL) { 
		this.guiURL = guiURL;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public Database name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public long getPort() { 
		return this.port;
	} 

	public void setPort(long port) { 
		this.port = port;
	} 

	public Database port(long port) { 
		this.port = port;
		return this;
	} 

	public java.lang.String getState() { 
		return this.state;
	} 

	public void setState(java.lang.String state) { 
		this.state = state;
	} 

	public Database state(java.lang.String state) { 
		this.state = state;
		return this;
	} 

	public java.lang.String getUser() { 
		return this.user;
	} 

	public void setUser(java.lang.String user) { 
		this.user = user;
	} 

	public Database user(java.lang.String user) { 
		this.user = user;
		return this;
	} 

	public java.lang.String getType() { 
		return this.type;
	} 

	public void setType(java.lang.String type) { 
		this.type = type;
	} 

	public Database type(java.lang.String type) { 
		this.type = type;
		return this;
	} 

	public java.lang.String getServer() { 
		return this.server;
	} 

	public void setServer(java.lang.String server) { 
		this.server = server;
	} 

	public Database server(java.lang.String server) { 
		this.server = server;
		return this;
	} 

	public java.util.Date getLastCheck() { 
		return this.lastCheck;
	} 

	public void setLastCheck(java.util.Date lastCheck) { 
		this.lastCheck = lastCheck;
	} 

	public Database lastCheck(java.util.Date lastCheck) { 
		this.lastCheck = lastCheck;
		return this;
	} 

}
