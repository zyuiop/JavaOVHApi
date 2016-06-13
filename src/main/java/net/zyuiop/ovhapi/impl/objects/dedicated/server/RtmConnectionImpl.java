package net.zyuiop.ovhapi.impl.objects.dedicated.server;

import net.zyuiop.ovhapi.api.objects.dedicated.server.RtmConnection;
/**
 * A structure describing informations about opened sockets on the server
 */

public class RtmConnectionImpl implements RtmConnection { 

	private long uid;
	private java.lang.String ip;
	private java.lang.String cmdline;
	private long port;
	private java.lang.String username;
	private java.lang.String procname;
	private java.lang.String domain;
	private long pid;
	private java.lang.String exe;

	public RtmConnectionImpl() {
	}

	public long getUid() { 
		return this.uid;
	} 

	public void setUid(long uid) { 
		this.uid = uid;
	} 

	public RtmConnectionImpl uid(long uid) { 
		this.uid = uid;
		return this;
	} 

	public java.lang.String getIp() { 
		return this.ip;
	} 

	public void setIp(java.lang.String ip) { 
		this.ip = ip;
	} 

	public RtmConnectionImpl ip(java.lang.String ip) { 
		this.ip = ip;
		return this;
	} 

	public java.lang.String getCmdline() { 
		return this.cmdline;
	} 

	public void setCmdline(java.lang.String cmdline) { 
		this.cmdline = cmdline;
	} 

	public RtmConnectionImpl cmdline(java.lang.String cmdline) { 
		this.cmdline = cmdline;
		return this;
	} 

	public long getPort() { 
		return this.port;
	} 

	public void setPort(long port) { 
		this.port = port;
	} 

	public RtmConnectionImpl port(long port) { 
		this.port = port;
		return this;
	} 

	public java.lang.String getUsername() { 
		return this.username;
	} 

	public void setUsername(java.lang.String username) { 
		this.username = username;
	} 

	public RtmConnectionImpl username(java.lang.String username) { 
		this.username = username;
		return this;
	} 

	public java.lang.String getProcname() { 
		return this.procname;
	} 

	public void setProcname(java.lang.String procname) { 
		this.procname = procname;
	} 

	public RtmConnectionImpl procname(java.lang.String procname) { 
		this.procname = procname;
		return this;
	} 

	public java.lang.String getDomain() { 
		return this.domain;
	} 

	public void setDomain(java.lang.String domain) { 
		this.domain = domain;
	} 

	public RtmConnectionImpl domain(java.lang.String domain) { 
		this.domain = domain;
		return this;
	} 

	public long getPid() { 
		return this.pid;
	} 

	public void setPid(long pid) { 
		this.pid = pid;
	} 

	public RtmConnectionImpl pid(long pid) { 
		this.pid = pid;
		return this;
	} 

	public java.lang.String getExe() { 
		return this.exe;
	} 

	public void setExe(java.lang.String exe) { 
		this.exe = exe;
	} 

	public RtmConnectionImpl exe(java.lang.String exe) { 
		this.exe = exe;
		return this;
	} 

}
