package net.zyuiop.ovhapi.api.objects.overthebox;

/**
 * All the infos needed to connect yourself to your OTB
 */

public class RemoteAccessConnectionInfos { 

	private java.lang.String ip;
	private long port;

	public RemoteAccessConnectionInfos() {
	}

	public java.lang.String getIp() { 
		return this.ip;
	} 

	public void setIp(java.lang.String ip) { 
		this.ip = ip;
	} 

	public RemoteAccessConnectionInfos ip(java.lang.String ip) { 
		this.ip = ip;
		return this;
	} 

	public long getPort() { 
		return this.port;
	} 

	public void setPort(long port) { 
		this.port = port;
	} 

	public RemoteAccessConnectionInfos port(long port) { 
		this.port = port;
		return this;
	} 

}
