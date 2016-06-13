package net.zyuiop.ovhapi.impl.objects.ip;

import net.zyuiop.ovhapi.api.objects.ip.FirewallIp;
/**
 * Your IP on firewall
 */

public class FirewallIpImpl implements FirewallIp { 

	private java.lang.String ipOnFirewall;
	private boolean enabled;
	private java.lang.String state;

	public FirewallIpImpl() {
	}

	public java.lang.String getIpOnFirewall() { 
		return this.ipOnFirewall;
	} 

	public void setIpOnFirewall(java.lang.String ipOnFirewall) { 
		this.ipOnFirewall = ipOnFirewall;
	} 

	public FirewallIpImpl ipOnFirewall(java.lang.String ipOnFirewall) { 
		this.ipOnFirewall = ipOnFirewall;
		return this;
	} 

	public boolean getEnabled() { 
		return this.enabled;
	} 

	public void setEnabled(boolean enabled) { 
		this.enabled = enabled;
	} 

	public FirewallIpImpl enabled(boolean enabled) { 
		this.enabled = enabled;
		return this;
	} 

	public java.lang.String getState() { 
		return this.state;
	} 

	public void setState(java.lang.String state) { 
		this.state = state;
	} 

	public FirewallIpImpl state(java.lang.String state) { 
		this.state = state;
		return this;
	} 

}
