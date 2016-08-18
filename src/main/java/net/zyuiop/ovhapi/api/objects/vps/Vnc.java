package net.zyuiop.ovhapi.api.objects.vps;

/**
 * A VNC connection informations
 */

public class Vnc { 

	private java.lang.String password;
	private long port;
	private java.lang.String host;

	public Vnc() {
	}

	public java.lang.String getPassword() { 
		return this.password;
	} 

	public void setPassword(java.lang.String password) { 
		this.password = password;
	} 

	public Vnc password(java.lang.String password) { 
		this.password = password;
		return this;
	} 

	public long getPort() { 
		return this.port;
	} 

	public void setPort(long port) { 
		this.port = port;
	} 

	public Vnc port(long port) { 
		this.port = port;
		return this;
	} 

	public java.lang.String getHost() { 
		return this.host;
	} 

	public void setHost(java.lang.String host) { 
		this.host = host;
	} 

	public Vnc host(java.lang.String host) { 
		this.host = host;
		return this;
	} 

}
