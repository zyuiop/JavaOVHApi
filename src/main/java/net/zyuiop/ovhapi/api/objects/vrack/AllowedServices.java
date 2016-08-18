package net.zyuiop.ovhapi.api.objects.vrack;

/**
 * A structure given all service allowed for this vrack
 */

public class AllowedServices { 

	private java.lang.String[] dedicatedServer;
	private java.lang.String[] dedicatedCloud;
	private java.lang.String[] dedicatedConnect;
	private java.lang.String[] legacyVrack;
	private java.lang.String[] ip;
	private java.lang.String[] cloudProject;

	public AllowedServices() {
	}

	public java.lang.String[] getDedicatedServer() { 
		return this.dedicatedServer;
	} 

	public void setDedicatedServer(java.lang.String[] dedicatedServer) { 
		this.dedicatedServer = dedicatedServer;
	} 

	public AllowedServices dedicatedServer(java.lang.String[] dedicatedServer) { 
		this.dedicatedServer = dedicatedServer;
		return this;
	} 

	public java.lang.String[] getDedicatedCloud() { 
		return this.dedicatedCloud;
	} 

	public void setDedicatedCloud(java.lang.String[] dedicatedCloud) { 
		this.dedicatedCloud = dedicatedCloud;
	} 

	public AllowedServices dedicatedCloud(java.lang.String[] dedicatedCloud) { 
		this.dedicatedCloud = dedicatedCloud;
		return this;
	} 

	public java.lang.String[] getDedicatedConnect() { 
		return this.dedicatedConnect;
	} 

	public void setDedicatedConnect(java.lang.String[] dedicatedConnect) { 
		this.dedicatedConnect = dedicatedConnect;
	} 

	public AllowedServices dedicatedConnect(java.lang.String[] dedicatedConnect) { 
		this.dedicatedConnect = dedicatedConnect;
		return this;
	} 

	public java.lang.String[] getLegacyVrack() { 
		return this.legacyVrack;
	} 

	public void setLegacyVrack(java.lang.String[] legacyVrack) { 
		this.legacyVrack = legacyVrack;
	} 

	public AllowedServices legacyVrack(java.lang.String[] legacyVrack) { 
		this.legacyVrack = legacyVrack;
		return this;
	} 

	public java.lang.String[] getIp() { 
		return this.ip;
	} 

	public void setIp(java.lang.String[] ip) { 
		this.ip = ip;
	} 

	public AllowedServices ip(java.lang.String[] ip) { 
		this.ip = ip;
		return this;
	} 

	public java.lang.String[] getCloudProject() { 
		return this.cloudProject;
	} 

	public void setCloudProject(java.lang.String[] cloudProject) { 
		this.cloudProject = cloudProject;
	} 

	public AllowedServices cloudProject(java.lang.String[] cloudProject) { 
		this.cloudProject = cloudProject;
		return this;
	} 

}
