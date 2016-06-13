package net.zyuiop.ovhapi.impl.objects.vrack;

import net.zyuiop.ovhapi.api.objects.vrack.DedicatedServer;
/**
 * vrack dedicated server interfaces
 */

public class DedicatedServerImpl implements DedicatedServer { 

	private java.lang.String vrack;
	private java.lang.String dedicatedServer;

	public DedicatedServerImpl() {
	}

	public java.lang.String getVrack() { 
		return this.vrack;
	} 

	public void setVrack(java.lang.String vrack) { 
		this.vrack = vrack;
	} 

	public DedicatedServerImpl vrack(java.lang.String vrack) { 
		this.vrack = vrack;
		return this;
	} 

	public java.lang.String getDedicatedServer() { 
		return this.dedicatedServer;
	} 

	public void setDedicatedServer(java.lang.String dedicatedServer) { 
		this.dedicatedServer = dedicatedServer;
	} 

	public DedicatedServerImpl dedicatedServer(java.lang.String dedicatedServer) { 
		this.dedicatedServer = dedicatedServer;
		return this;
	} 

}
