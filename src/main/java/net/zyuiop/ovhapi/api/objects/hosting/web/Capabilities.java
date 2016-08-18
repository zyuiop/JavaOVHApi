package net.zyuiop.ovhapi.api.objects.hosting.web;

/**
 * Struct which describs an offer
 */

public class Capabilities { 

	private net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue traffic;
	private boolean moduleOneClick;
	private net.zyuiop.ovhapi.api.objects.hosting.web.database.CreationDatabaseCapabilities[] privateDatabases;
	private long extraUsers;
	private net.zyuiop.ovhapi.api.objects.hosting.web.database.CreationDatabaseCapabilities[] databases;
	private boolean ssh;
	private long sitesRecommended;
	private long attachedDomains;
	private boolean crontab;

	public Capabilities() {
	}

	public net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue getTraffic() { 
		return this.traffic;
	} 

	public void setTraffic(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue traffic) { 
		this.traffic = traffic;
	} 

	public Capabilities traffic(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue traffic) { 
		this.traffic = traffic;
		return this;
	} 

	public boolean getModuleOneClick() { 
		return this.moduleOneClick;
	} 

	public void setModuleOneClick(boolean moduleOneClick) { 
		this.moduleOneClick = moduleOneClick;
	} 

	public Capabilities moduleOneClick(boolean moduleOneClick) { 
		this.moduleOneClick = moduleOneClick;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.hosting.web.database.CreationDatabaseCapabilities[] getPrivateDatabases() { 
		return this.privateDatabases;
	} 

	public void setPrivateDatabases(net.zyuiop.ovhapi.api.objects.hosting.web.database.CreationDatabaseCapabilities[] privateDatabases) { 
		this.privateDatabases = privateDatabases;
	} 

	public Capabilities privateDatabases(net.zyuiop.ovhapi.api.objects.hosting.web.database.CreationDatabaseCapabilities[] privateDatabases) { 
		this.privateDatabases = privateDatabases;
		return this;
	} 

	public long getExtraUsers() { 
		return this.extraUsers;
	} 

	public void setExtraUsers(long extraUsers) { 
		this.extraUsers = extraUsers;
	} 

	public Capabilities extraUsers(long extraUsers) { 
		this.extraUsers = extraUsers;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.hosting.web.database.CreationDatabaseCapabilities[] getDatabases() { 
		return this.databases;
	} 

	public void setDatabases(net.zyuiop.ovhapi.api.objects.hosting.web.database.CreationDatabaseCapabilities[] databases) { 
		this.databases = databases;
	} 

	public Capabilities databases(net.zyuiop.ovhapi.api.objects.hosting.web.database.CreationDatabaseCapabilities[] databases) { 
		this.databases = databases;
		return this;
	} 

	public boolean getSsh() { 
		return this.ssh;
	} 

	public void setSsh(boolean ssh) { 
		this.ssh = ssh;
	} 

	public Capabilities ssh(boolean ssh) { 
		this.ssh = ssh;
		return this;
	} 

	public long getSitesRecommended() { 
		return this.sitesRecommended;
	} 

	public void setSitesRecommended(long sitesRecommended) { 
		this.sitesRecommended = sitesRecommended;
	} 

	public Capabilities sitesRecommended(long sitesRecommended) { 
		this.sitesRecommended = sitesRecommended;
		return this;
	} 

	public long getAttachedDomains() { 
		return this.attachedDomains;
	} 

	public void setAttachedDomains(long attachedDomains) { 
		this.attachedDomains = attachedDomains;
	} 

	public Capabilities attachedDomains(long attachedDomains) { 
		this.attachedDomains = attachedDomains;
		return this;
	} 

	public boolean getCrontab() { 
		return this.crontab;
	} 

	public void setCrontab(boolean crontab) { 
		this.crontab = crontab;
	} 

	public Capabilities crontab(boolean crontab) { 
		this.crontab = crontab;
		return this;
	} 

}
