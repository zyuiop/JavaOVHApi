package net.zyuiop.ovhapi.api.objects.router;

/**
 * Virtual Private Network
 */

public class Vpn { 

	private java.lang.String clientIp;
	private java.lang.String serverPrivNet;
	private java.lang.String clientPrivNet;
	private java.lang.String serverIp;
	private long id;

	public Vpn() {
	}

	public java.lang.String getClientIp() { 
		return this.clientIp;
	} 

	public void setClientIp(java.lang.String clientIp) { 
		this.clientIp = clientIp;
	} 

	public Vpn clientIp(java.lang.String clientIp) { 
		this.clientIp = clientIp;
		return this;
	} 

	public java.lang.String getServerPrivNet() { 
		return this.serverPrivNet;
	} 

	public void setServerPrivNet(java.lang.String serverPrivNet) { 
		this.serverPrivNet = serverPrivNet;
	} 

	public Vpn serverPrivNet(java.lang.String serverPrivNet) { 
		this.serverPrivNet = serverPrivNet;
		return this;
	} 

	public java.lang.String getClientPrivNet() { 
		return this.clientPrivNet;
	} 

	public void setClientPrivNet(java.lang.String clientPrivNet) { 
		this.clientPrivNet = clientPrivNet;
	} 

	public Vpn clientPrivNet(java.lang.String clientPrivNet) { 
		this.clientPrivNet = clientPrivNet;
		return this;
	} 

	public java.lang.String getServerIp() { 
		return this.serverIp;
	} 

	public void setServerIp(java.lang.String serverIp) { 
		this.serverIp = serverIp;
	} 

	public Vpn serverIp(java.lang.String serverIp) { 
		this.serverIp = serverIp;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public Vpn id(long id) { 
		this.id = id;
		return this;
	} 

}
