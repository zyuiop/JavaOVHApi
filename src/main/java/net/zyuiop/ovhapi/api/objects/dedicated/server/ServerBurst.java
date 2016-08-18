package net.zyuiop.ovhapi.api.objects.dedicated.server;

/**
 * Server bandwidth burst details
 */

public class ServerBurst { 

	private java.lang.String status;
	private net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue capacity;

	public ServerBurst() {
	}

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public ServerBurst status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue getCapacity() { 
		return this.capacity;
	} 

	public void setCapacity(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue capacity) { 
		this.capacity = capacity;
	} 

	public ServerBurst capacity(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue capacity) { 
		this.capacity = capacity;
		return this;
	} 

}
