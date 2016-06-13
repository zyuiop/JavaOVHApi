package net.zyuiop.ovhapi.impl.objects.dedicated.server;

import net.zyuiop.ovhapi.api.objects.dedicated.server.ServiceMonitoring;
/**
 * Service monitoring details
 */

public class ServiceMonitoringImpl implements ServiceMonitoring { 

	private long monitoringId;
	private java.lang.String protocol;
	private java.lang.String ip;
	private long port;
	private java.lang.String interval;
	private java.lang.String challengeText;
	private java.lang.String url;
	private boolean enabled;

	public ServiceMonitoringImpl() {
	}

	public long getMonitoringId() { 
		return this.monitoringId;
	} 

	public void setMonitoringId(long monitoringId) { 
		this.monitoringId = monitoringId;
	} 

	public ServiceMonitoringImpl monitoringId(long monitoringId) { 
		this.monitoringId = monitoringId;
		return this;
	} 

	public java.lang.String getProtocol() { 
		return this.protocol;
	} 

	public void setProtocol(java.lang.String protocol) { 
		this.protocol = protocol;
	} 

	public ServiceMonitoringImpl protocol(java.lang.String protocol) { 
		this.protocol = protocol;
		return this;
	} 

	public java.lang.String getIp() { 
		return this.ip;
	} 

	public void setIp(java.lang.String ip) { 
		this.ip = ip;
	} 

	public ServiceMonitoringImpl ip(java.lang.String ip) { 
		this.ip = ip;
		return this;
	} 

	public long getPort() { 
		return this.port;
	} 

	public void setPort(long port) { 
		this.port = port;
	} 

	public ServiceMonitoringImpl port(long port) { 
		this.port = port;
		return this;
	} 

	public java.lang.String getInterval() { 
		return this.interval;
	} 

	public void setInterval(java.lang.String interval) { 
		this.interval = interval;
	} 

	public ServiceMonitoringImpl interval(java.lang.String interval) { 
		this.interval = interval;
		return this;
	} 

	public java.lang.String getChallengeText() { 
		return this.challengeText;
	} 

	public void setChallengeText(java.lang.String challengeText) { 
		this.challengeText = challengeText;
	} 

	public ServiceMonitoringImpl challengeText(java.lang.String challengeText) { 
		this.challengeText = challengeText;
		return this;
	} 

	public java.lang.String getUrl() { 
		return this.url;
	} 

	public void setUrl(java.lang.String url) { 
		this.url = url;
	} 

	public ServiceMonitoringImpl url(java.lang.String url) { 
		this.url = url;
		return this;
	} 

	public boolean getEnabled() { 
		return this.enabled;
	} 

	public void setEnabled(boolean enabled) { 
		this.enabled = enabled;
	} 

	public ServiceMonitoringImpl enabled(boolean enabled) { 
		this.enabled = enabled;
		return this;
	} 

}
