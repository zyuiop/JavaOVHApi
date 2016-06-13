package net.zyuiop.ovhapi.impl.objects.overthebox;

import net.zyuiop.ovhapi.api.objects.overthebox.RemoteAccessConnectionInfos;
/**
 * All the infos needed to connect yourself to your OTB
 */

public class RemoteAccessConnectionInfosImpl implements RemoteAccessConnectionInfos { 

	private java.lang.String ip;
	private long port;

	public RemoteAccessConnectionInfosImpl() {
	}

	public java.lang.String getIp() { 
		return this.ip;
	} 

	public void setIp(java.lang.String ip) { 
		this.ip = ip;
	} 

	public RemoteAccessConnectionInfosImpl ip(java.lang.String ip) { 
		this.ip = ip;
		return this;
	} 

	public long getPort() { 
		return this.port;
	} 

	public void setPort(long port) { 
		this.port = port;
	} 

	public RemoteAccessConnectionInfosImpl port(long port) { 
		this.port = port;
		return this;
	} 

}
