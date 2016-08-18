package net.zyuiop.ovhapi.api.objects.vps.ip;

/**
 * Service states for an Ip
 */

public class ServiceStatus { 

	private net.zyuiop.ovhapi.api.objects.vps.ip.ServiceStatusService dns;
	private java.lang.String ping;
	private net.zyuiop.ovhapi.api.objects.vps.ip.ServiceStatusService http;
	private net.zyuiop.ovhapi.api.objects.vps.ip.ServiceStatusService https;
	private net.zyuiop.ovhapi.api.objects.vps.ip.ServiceStatusService smtp;
	private java.lang.String tools;
	private net.zyuiop.ovhapi.api.objects.vps.ip.ServiceStatusService ssh;

	public ServiceStatus() {
	}

	public net.zyuiop.ovhapi.api.objects.vps.ip.ServiceStatusService getDns() { 
		return this.dns;
	} 

	public void setDns(net.zyuiop.ovhapi.api.objects.vps.ip.ServiceStatusService dns) { 
		this.dns = dns;
	} 

	public ServiceStatus dns(net.zyuiop.ovhapi.api.objects.vps.ip.ServiceStatusService dns) { 
		this.dns = dns;
		return this;
	} 

	public java.lang.String getPing() { 
		return this.ping;
	} 

	public void setPing(java.lang.String ping) { 
		this.ping = ping;
	} 

	public ServiceStatus ping(java.lang.String ping) { 
		this.ping = ping;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.vps.ip.ServiceStatusService getHttp() { 
		return this.http;
	} 

	public void setHttp(net.zyuiop.ovhapi.api.objects.vps.ip.ServiceStatusService http) { 
		this.http = http;
	} 

	public ServiceStatus http(net.zyuiop.ovhapi.api.objects.vps.ip.ServiceStatusService http) { 
		this.http = http;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.vps.ip.ServiceStatusService getHttps() { 
		return this.https;
	} 

	public void setHttps(net.zyuiop.ovhapi.api.objects.vps.ip.ServiceStatusService https) { 
		this.https = https;
	} 

	public ServiceStatus https(net.zyuiop.ovhapi.api.objects.vps.ip.ServiceStatusService https) { 
		this.https = https;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.vps.ip.ServiceStatusService getSmtp() { 
		return this.smtp;
	} 

	public void setSmtp(net.zyuiop.ovhapi.api.objects.vps.ip.ServiceStatusService smtp) { 
		this.smtp = smtp;
	} 

	public ServiceStatus smtp(net.zyuiop.ovhapi.api.objects.vps.ip.ServiceStatusService smtp) { 
		this.smtp = smtp;
		return this;
	} 

	public java.lang.String getTools() { 
		return this.tools;
	} 

	public void setTools(java.lang.String tools) { 
		this.tools = tools;
	} 

	public ServiceStatus tools(java.lang.String tools) { 
		this.tools = tools;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.vps.ip.ServiceStatusService getSsh() { 
		return this.ssh;
	} 

	public void setSsh(net.zyuiop.ovhapi.api.objects.vps.ip.ServiceStatusService ssh) { 
		this.ssh = ssh;
	} 

	public ServiceStatus ssh(net.zyuiop.ovhapi.api.objects.vps.ip.ServiceStatusService ssh) { 
		this.ssh = ssh;
		return this;
	} 

}
