package net.zyuiop.ovhapi.api.objects.nichandle;

/**
 * VIP Status by Universe
 */

public class VipStatus { 

	private boolean web;
	private boolean cloud;
	private boolean dedicated;
	private boolean telecom;

	public VipStatus() {
	}

	public boolean getWeb() { 
		return this.web;
	} 

	public void setWeb(boolean web) { 
		this.web = web;
	} 

	public VipStatus web(boolean web) { 
		this.web = web;
		return this;
	} 

	public boolean getCloud() { 
		return this.cloud;
	} 

	public void setCloud(boolean cloud) { 
		this.cloud = cloud;
	} 

	public VipStatus cloud(boolean cloud) { 
		this.cloud = cloud;
		return this;
	} 

	public boolean getDedicated() { 
		return this.dedicated;
	} 

	public void setDedicated(boolean dedicated) { 
		this.dedicated = dedicated;
	} 

	public VipStatus dedicated(boolean dedicated) { 
		this.dedicated = dedicated;
		return this;
	} 

	public boolean getTelecom() { 
		return this.telecom;
	} 

	public void setTelecom(boolean telecom) { 
		this.telecom = telecom;
	} 

	public VipStatus telecom(boolean telecom) { 
		this.telecom = telecom;
		return this;
	} 

}
