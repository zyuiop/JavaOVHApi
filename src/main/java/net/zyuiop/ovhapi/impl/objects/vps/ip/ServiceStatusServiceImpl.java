package net.zyuiop.ovhapi.impl.objects.vps.ip;

import net.zyuiop.ovhapi.api.objects.vps.ip.ServiceStatusService;
/**
 * Port and state of a service on an IP
 */

public class ServiceStatusServiceImpl implements ServiceStatusService { 

	private long port;
	private java.lang.String state;

	public ServiceStatusServiceImpl() {
	}

	public long getPort() { 
		return this.port;
	} 

	public void setPort(long port) { 
		this.port = port;
	} 

	public ServiceStatusServiceImpl port(long port) { 
		this.port = port;
		return this;
	} 

	public java.lang.String getState() { 
		return this.state;
	} 

	public void setState(java.lang.String state) { 
		this.state = state;
	} 

	public ServiceStatusServiceImpl state(java.lang.String state) { 
		this.state = state;
		return this;
	} 

}
