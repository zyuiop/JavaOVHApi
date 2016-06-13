package net.zyuiop.ovhapi.impl.objects.cloud.instance;

import net.zyuiop.ovhapi.api.objects.cloud.instance.RescueAdminPassword;
/**
 * RescueAdminPassword
 */

public class RescueAdminPasswordImpl implements RescueAdminPassword { 

	private java.lang.String adminPassword;

	public RescueAdminPasswordImpl() {
	}

	public java.lang.String getAdminPassword() { 
		return this.adminPassword;
	} 

	public void setAdminPassword(java.lang.String adminPassword) { 
		this.adminPassword = adminPassword;
	} 

	public RescueAdminPasswordImpl adminPassword(java.lang.String adminPassword) { 
		this.adminPassword = adminPassword;
		return this;
	} 

}
