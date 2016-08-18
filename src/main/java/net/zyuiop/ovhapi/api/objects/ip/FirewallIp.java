package net.zyuiop.ovhapi.api.objects.ip;

/**
 * Your IP on firewall
 */

public class FirewallIp { 

	private java.lang.String ipOnFirewall;
	private boolean enabled;
	private java.lang.String state;

	public FirewallIp() {
	}

	public java.lang.String getIpOnFirewall() { 
		return this.ipOnFirewall;
	} 

	public void setIpOnFirewall(java.lang.String ipOnFirewall) { 
		this.ipOnFirewall = ipOnFirewall;
	} 

	public FirewallIp ipOnFirewall(java.lang.String ipOnFirewall) { 
		this.ipOnFirewall = ipOnFirewall;
		return this;
	} 

	public boolean getEnabled() { 
		return this.enabled;
	} 

	public void setEnabled(boolean enabled) { 
		this.enabled = enabled;
	} 

	public FirewallIp enabled(boolean enabled) { 
		this.enabled = enabled;
		return this;
	} 

	public java.lang.String getState() { 
		return this.state;
	} 

	public void setState(java.lang.String state) { 
		this.state = state;
	} 

	public FirewallIp state(java.lang.String state) { 
		this.state = state;
		return this;
	} 

}
