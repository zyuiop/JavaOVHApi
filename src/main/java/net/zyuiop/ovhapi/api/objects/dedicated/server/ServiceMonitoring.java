package net.zyuiop.ovhapi.api.objects.dedicated.server;

/**
 * Service monitoring details
 */

public class ServiceMonitoring { 

	private long monitoringId;
	private java.lang.String protocol;
	private java.lang.String ip;
	private long port;
	private java.lang.String interval;
	private java.lang.String challengeText;
	private java.lang.String url;
	private boolean enabled;

	public ServiceMonitoring() {
	}

	public long getMonitoringId() { 
		return this.monitoringId;
	} 

	public void setMonitoringId(long monitoringId) { 
		this.monitoringId = monitoringId;
	} 

	public ServiceMonitoring monitoringId(long monitoringId) { 
		this.monitoringId = monitoringId;
		return this;
	} 

	public java.lang.String getProtocol() { 
		return this.protocol;
	} 

	public void setProtocol(java.lang.String protocol) { 
		this.protocol = protocol;
	} 

	public ServiceMonitoring protocol(java.lang.String protocol) { 
		this.protocol = protocol;
		return this;
	} 

	public java.lang.String getIp() { 
		return this.ip;
	} 

	public void setIp(java.lang.String ip) { 
		this.ip = ip;
	} 

	public ServiceMonitoring ip(java.lang.String ip) { 
		this.ip = ip;
		return this;
	} 

	public long getPort() { 
		return this.port;
	} 

	public void setPort(long port) { 
		this.port = port;
	} 

	public ServiceMonitoring port(long port) { 
		this.port = port;
		return this;
	} 

	public java.lang.String getInterval() { 
		return this.interval;
	} 

	public void setInterval(java.lang.String interval) { 
		this.interval = interval;
	} 

	public ServiceMonitoring interval(java.lang.String interval) { 
		this.interval = interval;
		return this;
	} 

	public java.lang.String getChallengeText() { 
		return this.challengeText;
	} 

	public void setChallengeText(java.lang.String challengeText) { 
		this.challengeText = challengeText;
	} 

	public ServiceMonitoring challengeText(java.lang.String challengeText) { 
		this.challengeText = challengeText;
		return this;
	} 

	public java.lang.String getUrl() { 
		return this.url;
	} 

	public void setUrl(java.lang.String url) { 
		this.url = url;
	} 

	public ServiceMonitoring url(java.lang.String url) { 
		this.url = url;
		return this;
	} 

	public boolean getEnabled() { 
		return this.enabled;
	} 

	public void setEnabled(boolean enabled) { 
		this.enabled = enabled;
	} 

	public ServiceMonitoring enabled(boolean enabled) { 
		this.enabled = enabled;
		return this;
	} 

}
