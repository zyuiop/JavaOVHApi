package net.zyuiop.ovhapi.impl.objects.nichandle;

import net.zyuiop.ovhapi.api.objects.nichandle.VipStatus;
/**
 * VIP Status by Universe
 */

public class VipStatusImpl implements VipStatus { 

	private boolean web;
	private boolean cloud;
	private boolean dedicated;
	private boolean telecom;

	public VipStatusImpl() {
	}

	public boolean getWeb() { 
		return this.web;
	} 

	public void setWeb(boolean web) { 
		this.web = web;
	} 

	public VipStatusImpl web(boolean web) { 
		this.web = web;
		return this;
	} 

	public boolean getCloud() { 
		return this.cloud;
	} 

	public void setCloud(boolean cloud) { 
		this.cloud = cloud;
	} 

	public VipStatusImpl cloud(boolean cloud) { 
		this.cloud = cloud;
		return this;
	} 

	public boolean getDedicated() { 
		return this.dedicated;
	} 

	public void setDedicated(boolean dedicated) { 
		this.dedicated = dedicated;
	} 

	public VipStatusImpl dedicated(boolean dedicated) { 
		this.dedicated = dedicated;
		return this;
	} 

	public boolean getTelecom() { 
		return this.telecom;
	} 

	public void setTelecom(boolean telecom) { 
		this.telecom = telecom;
	} 

	public VipStatusImpl telecom(boolean telecom) { 
		this.telecom = telecom;
		return this;
	} 

}
