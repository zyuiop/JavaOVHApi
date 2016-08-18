package net.zyuiop.ovhapi.api.objects.dedicated.server;

/**
 * A structure describing informations about installation custom
 */

public class InstallCustom { 

	private boolean noRaid;
	private java.lang.String sshKeyName;
	private java.lang.String language;
	private boolean useSpla;
	private java.lang.String postInstallationScriptLink;
	private java.lang.String customHostname;
	private boolean installSqlServer;
	private java.lang.String postInstallationScriptReturn;
	private boolean useDistribKernel;
	private long softRaidDevices;

	public InstallCustom() {
	}

	public boolean getNoRaid() { 
		return this.noRaid;
	} 

	public void setNoRaid(boolean noRaid) { 
		this.noRaid = noRaid;
	} 

	public InstallCustom noRaid(boolean noRaid) { 
		this.noRaid = noRaid;
		return this;
	} 

	public java.lang.String getSshKeyName() { 
		return this.sshKeyName;
	} 

	public void setSshKeyName(java.lang.String sshKeyName) { 
		this.sshKeyName = sshKeyName;
	} 

	public InstallCustom sshKeyName(java.lang.String sshKeyName) { 
		this.sshKeyName = sshKeyName;
		return this;
	} 

	public java.lang.String getLanguage() { 
		return this.language;
	} 

	public void setLanguage(java.lang.String language) { 
		this.language = language;
	} 

	public InstallCustom language(java.lang.String language) { 
		this.language = language;
		return this;
	} 

	public boolean getUseSpla() { 
		return this.useSpla;
	} 

	public void setUseSpla(boolean useSpla) { 
		this.useSpla = useSpla;
	} 

	public InstallCustom useSpla(boolean useSpla) { 
		this.useSpla = useSpla;
		return this;
	} 

	public java.lang.String getPostInstallationScriptLink() { 
		return this.postInstallationScriptLink;
	} 

	public void setPostInstallationScriptLink(java.lang.String postInstallationScriptLink) { 
		this.postInstallationScriptLink = postInstallationScriptLink;
	} 

	public InstallCustom postInstallationScriptLink(java.lang.String postInstallationScriptLink) { 
		this.postInstallationScriptLink = postInstallationScriptLink;
		return this;
	} 

	public java.lang.String getCustomHostname() { 
		return this.customHostname;
	} 

	public void setCustomHostname(java.lang.String customHostname) { 
		this.customHostname = customHostname;
	} 

	public InstallCustom customHostname(java.lang.String customHostname) { 
		this.customHostname = customHostname;
		return this;
	} 

	public boolean getInstallSqlServer() { 
		return this.installSqlServer;
	} 

	public void setInstallSqlServer(boolean installSqlServer) { 
		this.installSqlServer = installSqlServer;
	} 

	public InstallCustom installSqlServer(boolean installSqlServer) { 
		this.installSqlServer = installSqlServer;
		return this;
	} 

	public java.lang.String getPostInstallationScriptReturn() { 
		return this.postInstallationScriptReturn;
	} 

	public void setPostInstallationScriptReturn(java.lang.String postInstallationScriptReturn) { 
		this.postInstallationScriptReturn = postInstallationScriptReturn;
	} 

	public InstallCustom postInstallationScriptReturn(java.lang.String postInstallationScriptReturn) { 
		this.postInstallationScriptReturn = postInstallationScriptReturn;
		return this;
	} 

	public boolean getUseDistribKernel() { 
		return this.useDistribKernel;
	} 

	public void setUseDistribKernel(boolean useDistribKernel) { 
		this.useDistribKernel = useDistribKernel;
	} 

	public InstallCustom useDistribKernel(boolean useDistribKernel) { 
		this.useDistribKernel = useDistribKernel;
		return this;
	} 

	public long getSoftRaidDevices() { 
		return this.softRaidDevices;
	} 

	public void setSoftRaidDevices(long softRaidDevices) { 
		this.softRaidDevices = softRaidDevices;
	} 

	public InstallCustom softRaidDevices(long softRaidDevices) { 
		this.softRaidDevices = softRaidDevices;
		return this;
	} 

}
