package net.zyuiop.ovhapi.api.objects.dedicated.server;

/**
 * A structure describing informations about opened sockets on the server
 */

public class RtmConnection { 

	private long uid;
	private java.lang.String ip;
	private java.lang.String cmdline;
	private long port;
	private java.lang.String username;
	private java.lang.String procname;
	private java.lang.String domain;
	private long pid;
	private java.lang.String exe;

	public RtmConnection() {
	}

	public long getUid() { 
		return this.uid;
	} 

	public void setUid(long uid) { 
		this.uid = uid;
	} 

	public RtmConnection uid(long uid) { 
		this.uid = uid;
		return this;
	} 

	public java.lang.String getIp() { 
		return this.ip;
	} 

	public void setIp(java.lang.String ip) { 
		this.ip = ip;
	} 

	public RtmConnection ip(java.lang.String ip) { 
		this.ip = ip;
		return this;
	} 

	public java.lang.String getCmdline() { 
		return this.cmdline;
	} 

	public void setCmdline(java.lang.String cmdline) { 
		this.cmdline = cmdline;
	} 

	public RtmConnection cmdline(java.lang.String cmdline) { 
		this.cmdline = cmdline;
		return this;
	} 

	public long getPort() { 
		return this.port;
	} 

	public void setPort(long port) { 
		this.port = port;
	} 

	public RtmConnection port(long port) { 
		this.port = port;
		return this;
	} 

	public java.lang.String getUsername() { 
		return this.username;
	} 

	public void setUsername(java.lang.String username) { 
		this.username = username;
	} 

	public RtmConnection username(java.lang.String username) { 
		this.username = username;
		return this;
	} 

	public java.lang.String getProcname() { 
		return this.procname;
	} 

	public void setProcname(java.lang.String procname) { 
		this.procname = procname;
	} 

	public RtmConnection procname(java.lang.String procname) { 
		this.procname = procname;
		return this;
	} 

	public java.lang.String getDomain() { 
		return this.domain;
	} 

	public void setDomain(java.lang.String domain) { 
		this.domain = domain;
	} 

	public RtmConnection domain(java.lang.String domain) { 
		this.domain = domain;
		return this;
	} 

	public long getPid() { 
		return this.pid;
	} 

	public void setPid(long pid) { 
		this.pid = pid;
	} 

	public RtmConnection pid(long pid) { 
		this.pid = pid;
		return this;
	} 

	public java.lang.String getExe() { 
		return this.exe;
	} 

	public void setExe(java.lang.String exe) { 
		this.exe = exe;
	} 

	public RtmConnection exe(java.lang.String exe) { 
		this.exe = exe;
		return this;
	} 

}
