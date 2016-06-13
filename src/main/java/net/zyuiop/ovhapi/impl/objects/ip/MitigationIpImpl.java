package net.zyuiop.ovhapi.impl.objects.ip;

import net.zyuiop.ovhapi.api.objects.ip.MitigationIp;
/**
 * Your IP on mitigation
 */

public class MitigationIpImpl implements MitigationIp { 

	private java.lang.String ipOnMitigation;
	private boolean auto;
	private boolean permanent;
	private java.lang.String state;

	public MitigationIpImpl() {
	}

	public java.lang.String getIpOnMitigation() { 
		return this.ipOnMitigation;
	} 

	public void setIpOnMitigation(java.lang.String ipOnMitigation) { 
		this.ipOnMitigation = ipOnMitigation;
	} 

	public MitigationIpImpl ipOnMitigation(java.lang.String ipOnMitigation) { 
		this.ipOnMitigation = ipOnMitigation;
		return this;
	} 

	public boolean getAuto() { 
		return this.auto;
	} 

	public void setAuto(boolean auto) { 
		this.auto = auto;
	} 

	public MitigationIpImpl auto(boolean auto) { 
		this.auto = auto;
		return this;
	} 

	public boolean getPermanent() { 
		return this.permanent;
	} 

	public void setPermanent(boolean permanent) { 
		this.permanent = permanent;
	} 

	public MitigationIpImpl permanent(boolean permanent) { 
		this.permanent = permanent;
		return this;
	} 

	public java.lang.String getState() { 
		return this.state;
	} 

	public void setState(java.lang.String state) { 
		this.state = state;
	} 

	public MitigationIpImpl state(java.lang.String state) { 
		this.state = state;
		return this;
	} 

}
