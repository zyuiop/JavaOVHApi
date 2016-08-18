package net.zyuiop.ovhapi.api.objects.cloud.instance;

/**
 * RescueAdminPassword
 */

public class RescueAdminPassword { 

	private java.lang.String adminPassword;

	public RescueAdminPassword() {
	}

	public java.lang.String getAdminPassword() { 
		return this.adminPassword;
	} 

	public void setAdminPassword(java.lang.String adminPassword) { 
		this.adminPassword = adminPassword;
	} 

	public RescueAdminPassword adminPassword(java.lang.String adminPassword) { 
		this.adminPassword = adminPassword;
		return this;
	} 

}
