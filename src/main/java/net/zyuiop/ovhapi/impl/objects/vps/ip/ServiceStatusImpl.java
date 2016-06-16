package net.zyuiop.ovhapi.impl.objects.vps.ip;

import net.zyuiop.ovhapi.api.objects.vps.ip.ServiceStatus;
/**
 * Service states for an Ip
 */

public class ServiceStatusImpl implements ServiceStatus { 

	private net.zyuiop.ovhapi.impl.objects.vps.ip.ServiceStatusServiceImpl dns;
	private java.lang.String ping;
	private net.zyuiop.ovhapi.impl.objects.vps.ip.ServiceStatusServiceImpl http;
	private net.zyuiop.ovhapi.impl.objects.vps.ip.ServiceStatusServiceImpl https;
	private net.zyuiop.ovhapi.impl.objects.vps.ip.ServiceStatusServiceImpl smtp;
	private java.lang.String tools;
	private net.zyuiop.ovhapi.impl.objects.vps.ip.ServiceStatusServiceImpl ssh;

	public ServiceStatusImpl() {
	}

	public net.zyuiop.ovhapi.impl.objects.vps.ip.ServiceStatusServiceImpl getDns() { 
		return this.dns;
	} 

	public void setDns(net.zyuiop.ovhapi.impl.objects.vps.ip.ServiceStatusServiceImpl dns) { 
		this.dns = dns;
	} 

	public ServiceStatusImpl dns(net.zyuiop.ovhapi.impl.objects.vps.ip.ServiceStatusServiceImpl dns) { 
		this.dns = dns;
		return this;
	} 

	public java.lang.String getPing() { 
		return this.ping;
	} 

	public void setPing(java.lang.String ping) { 
		this.ping = ping;
	} 

	public ServiceStatusImpl ping(java.lang.String ping) { 
		this.ping = ping;
		return this;
	} 

	public net.zyuiop.ovhapi.impl.objects.vps.ip.ServiceStatusServiceImpl getHttp() { 
		return this.http;
	} 

	public void setHttp(net.zyuiop.ovhapi.impl.objects.vps.ip.ServiceStatusServiceImpl http) { 
		this.http = http;
	} 

	public ServiceStatusImpl http(net.zyuiop.ovhapi.impl.objects.vps.ip.ServiceStatusServiceImpl http) { 
		this.http = http;
		return this;
	} 

	public net.zyuiop.ovhapi.impl.objects.vps.ip.ServiceStatusServiceImpl getHttps() { 
		return this.https;
	} 

	public void setHttps(net.zyuiop.ovhapi.impl.objects.vps.ip.ServiceStatusServiceImpl https) { 
		this.https = https;
	} 

	public ServiceStatusImpl https(net.zyuiop.ovhapi.impl.objects.vps.ip.ServiceStatusServiceImpl https) { 
		this.https = https;
		return this;
	} 

	public net.zyuiop.ovhapi.impl.objects.vps.ip.ServiceStatusServiceImpl getSmtp() { 
		return this.smtp;
	} 

	public void setSmtp(net.zyuiop.ovhapi.impl.objects.vps.ip.ServiceStatusServiceImpl smtp) { 
		this.smtp = smtp;
	} 

	public ServiceStatusImpl smtp(net.zyuiop.ovhapi.impl.objects.vps.ip.ServiceStatusServiceImpl smtp) { 
		this.smtp = smtp;
		return this;
	} 

	public java.lang.String getTools() { 
		return this.tools;
	} 

	public void setTools(java.lang.String tools) { 
		this.tools = tools;
	} 

	public ServiceStatusImpl tools(java.lang.String tools) { 
		this.tools = tools;
		return this;
	} 

	public net.zyuiop.ovhapi.impl.objects.vps.ip.ServiceStatusServiceImpl getSsh() { 
		return this.ssh;
	} 

	public void setSsh(net.zyuiop.ovhapi.impl.objects.vps.ip.ServiceStatusServiceImpl ssh) { 
		this.ssh = ssh;
	} 

	public ServiceStatusImpl ssh(net.zyuiop.ovhapi.impl.objects.vps.ip.ServiceStatusServiceImpl ssh) { 
		this.ssh = ssh;
		return this;
	} 

}
