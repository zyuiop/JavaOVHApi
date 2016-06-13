package net.zyuiop.ovhapi.impl.objects.vrack;

import net.zyuiop.ovhapi.api.objects.vrack.AllowedServices;
/**
 * A structure given all service allowed for this vrack
 */

public class AllowedServicesImpl implements AllowedServices { 

	private java.lang.String dedicatedServer;
	private java.lang.String dedicatedCloud;
	private java.lang.String dedicatedConnect;
	private java.lang.String legacyVrack;
	private java.lang.String ip;
	private java.lang.String cloudProject;

	public AllowedServicesImpl() {
	}

	public java.lang.String getDedicatedServer() { 
		return this.dedicatedServer;
	} 

	public void setDedicatedServer(java.lang.String dedicatedServer) { 
		this.dedicatedServer = dedicatedServer;
	} 

	public AllowedServicesImpl dedicatedServer(java.lang.String dedicatedServer) { 
		this.dedicatedServer = dedicatedServer;
		return this;
	} 

	public java.lang.String getDedicatedCloud() { 
		return this.dedicatedCloud;
	} 

	public void setDedicatedCloud(java.lang.String dedicatedCloud) { 
		this.dedicatedCloud = dedicatedCloud;
	} 

	public AllowedServicesImpl dedicatedCloud(java.lang.String dedicatedCloud) { 
		this.dedicatedCloud = dedicatedCloud;
		return this;
	} 

	public java.lang.String getDedicatedConnect() { 
		return this.dedicatedConnect;
	} 

	public void setDedicatedConnect(java.lang.String dedicatedConnect) { 
		this.dedicatedConnect = dedicatedConnect;
	} 

	public AllowedServicesImpl dedicatedConnect(java.lang.String dedicatedConnect) { 
		this.dedicatedConnect = dedicatedConnect;
		return this;
	} 

	public java.lang.String getLegacyVrack() { 
		return this.legacyVrack;
	} 

	public void setLegacyVrack(java.lang.String legacyVrack) { 
		this.legacyVrack = legacyVrack;
	} 

	public AllowedServicesImpl legacyVrack(java.lang.String legacyVrack) { 
		this.legacyVrack = legacyVrack;
		return this;
	} 

	public java.lang.String getIp() { 
		return this.ip;
	} 

	public void setIp(java.lang.String ip) { 
		this.ip = ip;
	} 

	public AllowedServicesImpl ip(java.lang.String ip) { 
		this.ip = ip;
		return this;
	} 

	public java.lang.String getCloudProject() { 
		return this.cloudProject;
	} 

	public void setCloudProject(java.lang.String cloudProject) { 
		this.cloudProject = cloudProject;
	} 

	public AllowedServicesImpl cloudProject(java.lang.String cloudProject) { 
		this.cloudProject = cloudProject;
		return this;
	} 

}
