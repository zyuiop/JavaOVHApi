package net.zyuiop.ovhapi.impl.objects.dedicatedcloud;

import net.zyuiop.ovhapi.api.objects.dedicatedcloud.Capabilities;
/**
 * The features available in your Dedicated Cloud
 */

public class CapabilitiesImpl implements Capabilities { 

	private java.lang.String backupStatus;
	private java.lang.String nexus1000vStatus;
	private boolean canAddUser;
	private java.lang.String fullAdminRoUserStatus;
	private java.lang.String addRessourceRightStatus;
	private java.lang.String userAccessPolicyStatus;
	private boolean upgradable;

	public CapabilitiesImpl() {
	}

	public java.lang.String getBackupStatus() { 
		return this.backupStatus;
	} 

	public void setBackupStatus(java.lang.String backupStatus) { 
		this.backupStatus = backupStatus;
	} 

	public CapabilitiesImpl backupStatus(java.lang.String backupStatus) { 
		this.backupStatus = backupStatus;
		return this;
	} 

	public java.lang.String getNexus1000vStatus() { 
		return this.nexus1000vStatus;
	} 

	public void setNexus1000vStatus(java.lang.String nexus1000vStatus) { 
		this.nexus1000vStatus = nexus1000vStatus;
	} 

	public CapabilitiesImpl nexus1000vStatus(java.lang.String nexus1000vStatus) { 
		this.nexus1000vStatus = nexus1000vStatus;
		return this;
	} 

	public boolean getCanAddUser() { 
		return this.canAddUser;
	} 

	public void setCanAddUser(boolean canAddUser) { 
		this.canAddUser = canAddUser;
	} 

	public CapabilitiesImpl canAddUser(boolean canAddUser) { 
		this.canAddUser = canAddUser;
		return this;
	} 

	public java.lang.String getFullAdminRoUserStatus() { 
		return this.fullAdminRoUserStatus;
	} 

	public void setFullAdminRoUserStatus(java.lang.String fullAdminRoUserStatus) { 
		this.fullAdminRoUserStatus = fullAdminRoUserStatus;
	} 

	public CapabilitiesImpl fullAdminRoUserStatus(java.lang.String fullAdminRoUserStatus) { 
		this.fullAdminRoUserStatus = fullAdminRoUserStatus;
		return this;
	} 

	public java.lang.String getAddRessourceRightStatus() { 
		return this.addRessourceRightStatus;
	} 

	public void setAddRessourceRightStatus(java.lang.String addRessourceRightStatus) { 
		this.addRessourceRightStatus = addRessourceRightStatus;
	} 

	public CapabilitiesImpl addRessourceRightStatus(java.lang.String addRessourceRightStatus) { 
		this.addRessourceRightStatus = addRessourceRightStatus;
		return this;
	} 

	public java.lang.String getUserAccessPolicyStatus() { 
		return this.userAccessPolicyStatus;
	} 

	public void setUserAccessPolicyStatus(java.lang.String userAccessPolicyStatus) { 
		this.userAccessPolicyStatus = userAccessPolicyStatus;
	} 

	public CapabilitiesImpl userAccessPolicyStatus(java.lang.String userAccessPolicyStatus) { 
		this.userAccessPolicyStatus = userAccessPolicyStatus;
		return this;
	} 

	public boolean getUpgradable() { 
		return this.upgradable;
	} 

	public void setUpgradable(boolean upgradable) { 
		this.upgradable = upgradable;
	} 

	public CapabilitiesImpl upgradable(boolean upgradable) { 
		this.upgradable = upgradable;
		return this;
	} 

}
