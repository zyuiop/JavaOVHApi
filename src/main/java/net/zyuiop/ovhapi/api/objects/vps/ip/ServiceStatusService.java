package net.zyuiop.ovhapi.api.objects.vps.ip;

/**
 * Port and state of a service on an IP
 */

public class ServiceStatusService { 

	private long port;
	private java.lang.String state;

	public ServiceStatusService() {
	}

	public long getPort() { 
		return this.port;
	} 

	public void setPort(long port) { 
		this.port = port;
	} 

	public ServiceStatusService port(long port) { 
		this.port = port;
		return this;
	} 

	public java.lang.String getState() { 
		return this.state;
	} 

	public void setState(java.lang.String state) { 
		this.state = state;
	} 

	public ServiceStatusService state(java.lang.String state) { 
		this.state = state;
		return this;
	} 

}
