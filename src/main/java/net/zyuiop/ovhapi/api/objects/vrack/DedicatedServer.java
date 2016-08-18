package net.zyuiop.ovhapi.api.objects.vrack;

/**
 * vrack dedicated server interfaces
 */

public class DedicatedServer { 

	private java.lang.String vrack;
	private java.lang.String dedicatedServer;

	public DedicatedServer() {
	}

	public java.lang.String getVrack() { 
		return this.vrack;
	} 

	public void setVrack(java.lang.String vrack) { 
		this.vrack = vrack;
	} 

	public DedicatedServer vrack(java.lang.String vrack) { 
		this.vrack = vrack;
		return this;
	} 

	public java.lang.String getDedicatedServer() { 
		return this.dedicatedServer;
	} 

	public void setDedicatedServer(java.lang.String dedicatedServer) { 
		this.dedicatedServer = dedicatedServer;
	} 

	public DedicatedServer dedicatedServer(java.lang.String dedicatedServer) { 
		this.dedicatedServer = dedicatedServer;
		return this;
	} 

}
