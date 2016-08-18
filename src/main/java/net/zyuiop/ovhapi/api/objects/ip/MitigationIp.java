package net.zyuiop.ovhapi.api.objects.ip;

/**
 * Your IP on mitigation
 */

public class MitigationIp { 

	private java.lang.String ipOnMitigation;
	private boolean auto;
	private boolean permanent;
	private java.lang.String state;

	public MitigationIp() {
	}

	public java.lang.String getIpOnMitigation() { 
		return this.ipOnMitigation;
	} 

	public void setIpOnMitigation(java.lang.String ipOnMitigation) { 
		this.ipOnMitigation = ipOnMitigation;
	} 

	public MitigationIp ipOnMitigation(java.lang.String ipOnMitigation) { 
		this.ipOnMitigation = ipOnMitigation;
		return this;
	} 

	public boolean getAuto() { 
		return this.auto;
	} 

	public void setAuto(boolean auto) { 
		this.auto = auto;
	} 

	public MitigationIp auto(boolean auto) { 
		this.auto = auto;
		return this;
	} 

	public boolean getPermanent() { 
		return this.permanent;
	} 

	public void setPermanent(boolean permanent) { 
		this.permanent = permanent;
	} 

	public MitigationIp permanent(boolean permanent) { 
		this.permanent = permanent;
		return this;
	} 

	public java.lang.String getState() { 
		return this.state;
	} 

	public void setState(java.lang.String state) { 
		this.state = state;
	} 

	public MitigationIp state(java.lang.String state) { 
		this.state = state;
		return this;
	} 

}
