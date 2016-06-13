package net.zyuiop.ovhapi.impl.objects.dedicated.server;

import net.zyuiop.ovhapi.api.objects.dedicated.server.Firewall;
/**
 * Firewall attached to this server
 */

public class FirewallImpl implements Firewall { 

	private java.lang.String firewall;
	private java.lang.String mode;
	private java.lang.String ip;
	private java.lang.String model;
	private boolean enabled;

	public FirewallImpl() {
	}

	public java.lang.String getFirewall() { 
		return this.firewall;
	} 

	public void setFirewall(java.lang.String firewall) { 
		this.firewall = firewall;
	} 

	public FirewallImpl firewall(java.lang.String firewall) { 
		this.firewall = firewall;
		return this;
	} 

	public java.lang.String getMode() { 
		return this.mode;
	} 

	public void setMode(java.lang.String mode) { 
		this.mode = mode;
	} 

	public FirewallImpl mode(java.lang.String mode) { 
		this.mode = mode;
		return this;
	} 

	public java.lang.String getIp() { 
		return this.ip;
	} 

	public void setIp(java.lang.String ip) { 
		this.ip = ip;
	} 

	public FirewallImpl ip(java.lang.String ip) { 
		this.ip = ip;
		return this;
	} 

	public java.lang.String getModel() { 
		return this.model;
	} 

	public void setModel(java.lang.String model) { 
		this.model = model;
	} 

	public FirewallImpl model(java.lang.String model) { 
		this.model = model;
		return this;
	} 

	public boolean getEnabled() { 
		return this.enabled;
	} 

	public void setEnabled(boolean enabled) { 
		this.enabled = enabled;
	} 

	public FirewallImpl enabled(boolean enabled) { 
		this.enabled = enabled;
		return this;
	} 

}
