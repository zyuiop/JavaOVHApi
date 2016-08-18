package net.zyuiop.ovhapi.api.objects.dedicated.housing;

/**
 * A structure describing the Bay`s link information
 */

public class LinkInfo { 

	private java.lang.String port;
	private java.lang.String router;

	public LinkInfo() {
	}

	public java.lang.String getPort() { 
		return this.port;
	} 

	public void setPort(java.lang.String port) { 
		this.port = port;
	} 

	public LinkInfo port(java.lang.String port) { 
		this.port = port;
		return this;
	} 

	public java.lang.String getRouter() { 
		return this.router;
	} 

	public void setRouter(java.lang.String router) { 
		this.router = router;
	} 

	public LinkInfo router(java.lang.String router) { 
		this.router = router;
		return this;
	} 

}
