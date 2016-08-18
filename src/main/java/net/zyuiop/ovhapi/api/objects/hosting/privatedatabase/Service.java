package net.zyuiop.ovhapi.api.objects.hosting.privatedatabase;

/**
 * Private database
 */

public class Service { 

	private long portFtp;
	private java.lang.String ip;
	private java.lang.String guiURL;
	private java.lang.String hostname;
	private java.lang.String state;
	private java.lang.String hostnameFtp;
	private net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.GraphEndpoint graphEndpoint;
	private java.lang.String displayName;
	private net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue quotaSize;
	private java.lang.String infrastructure;
	private long cpu;
	private net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue quotaUsed;
	private java.lang.String version;
	private java.lang.String serviceName;
	private long port;
	private java.util.Date lastCheck;
	private java.lang.String type;
	private net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue ram;

	public Service() {
	}

	public long getPortFtp() { 
		return this.portFtp;
	} 

	public void setPortFtp(long portFtp) { 
		this.portFtp = portFtp;
	} 

	public Service portFtp(long portFtp) { 
		this.portFtp = portFtp;
		return this;
	} 

	public java.lang.String getIp() { 
		return this.ip;
	} 

	public void setIp(java.lang.String ip) { 
		this.ip = ip;
	} 

	public Service ip(java.lang.String ip) { 
		this.ip = ip;
		return this;
	} 

	public java.lang.String getGuiURL() { 
		return this.guiURL;
	} 

	public void setGuiURL(java.lang.String guiURL) { 
		this.guiURL = guiURL;
	} 

	public Service guiURL(java.lang.String guiURL) { 
		this.guiURL = guiURL;
		return this;
	} 

	public java.lang.String getHostname() { 
		return this.hostname;
	} 

	public void setHostname(java.lang.String hostname) { 
		this.hostname = hostname;
	} 

	public Service hostname(java.lang.String hostname) { 
		this.hostname = hostname;
		return this;
	} 

	public java.lang.String getState() { 
		return this.state;
	} 

	public void setState(java.lang.String state) { 
		this.state = state;
	} 

	public Service state(java.lang.String state) { 
		this.state = state;
		return this;
	} 

	public java.lang.String getHostnameFtp() { 
		return this.hostnameFtp;
	} 

	public void setHostnameFtp(java.lang.String hostnameFtp) { 
		this.hostnameFtp = hostnameFtp;
	} 

	public Service hostnameFtp(java.lang.String hostnameFtp) { 
		this.hostnameFtp = hostnameFtp;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.GraphEndpoint getGraphEndpoint() { 
		return this.graphEndpoint;
	} 

	public void setGraphEndpoint(net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.GraphEndpoint graphEndpoint) { 
		this.graphEndpoint = graphEndpoint;
	} 

	public Service graphEndpoint(net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.GraphEndpoint graphEndpoint) { 
		this.graphEndpoint = graphEndpoint;
		return this;
	} 

	public java.lang.String getDisplayName() { 
		return this.displayName;
	} 

	public void setDisplayName(java.lang.String displayName) { 
		this.displayName = displayName;
	} 

	public Service displayName(java.lang.String displayName) { 
		this.displayName = displayName;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue getQuotaSize() { 
		return this.quotaSize;
	} 

	public void setQuotaSize(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue quotaSize) { 
		this.quotaSize = quotaSize;
	} 

	public Service quotaSize(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue quotaSize) { 
		this.quotaSize = quotaSize;
		return this;
	} 

	public java.lang.String getInfrastructure() { 
		return this.infrastructure;
	} 

	public void setInfrastructure(java.lang.String infrastructure) { 
		this.infrastructure = infrastructure;
	} 

	public Service infrastructure(java.lang.String infrastructure) { 
		this.infrastructure = infrastructure;
		return this;
	} 

	public long getCpu() { 
		return this.cpu;
	} 

	public void setCpu(long cpu) { 
		this.cpu = cpu;
	} 

	public Service cpu(long cpu) { 
		this.cpu = cpu;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue getQuotaUsed() { 
		return this.quotaUsed;
	} 

	public void setQuotaUsed(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue quotaUsed) { 
		this.quotaUsed = quotaUsed;
	} 

	public Service quotaUsed(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue quotaUsed) { 
		this.quotaUsed = quotaUsed;
		return this;
	} 

	public java.lang.String getVersion() { 
		return this.version;
	} 

	public void setVersion(java.lang.String version) { 
		this.version = version;
	} 

	public Service version(java.lang.String version) { 
		this.version = version;
		return this;
	} 

	public java.lang.String getServiceName() { 
		return this.serviceName;
	} 

	public void setServiceName(java.lang.String serviceName) { 
		this.serviceName = serviceName;
	} 

	public Service serviceName(java.lang.String serviceName) { 
		this.serviceName = serviceName;
		return this;
	} 

	public long getPort() { 
		return this.port;
	} 

	public void setPort(long port) { 
		this.port = port;
	} 

	public Service port(long port) { 
		this.port = port;
		return this;
	} 

	public java.util.Date getLastCheck() { 
		return this.lastCheck;
	} 

	public void setLastCheck(java.util.Date lastCheck) { 
		this.lastCheck = lastCheck;
	} 

	public Service lastCheck(java.util.Date lastCheck) { 
		this.lastCheck = lastCheck;
		return this;
	} 

	public java.lang.String getType() { 
		return this.type;
	} 

	public void setType(java.lang.String type) { 
		this.type = type;
	} 

	public Service type(java.lang.String type) { 
		this.type = type;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue getRam() { 
		return this.ram;
	} 

	public void setRam(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue ram) { 
		this.ram = ram;
	} 

	public Service ram(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue ram) { 
		this.ram = ram;
		return this;
	} 

}
