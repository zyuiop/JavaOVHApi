package net.zyuiop.ovhapi.impl.objects.dedicated.housing;

import net.zyuiop.ovhapi.api.objects.dedicated.housing.LinkInfo;
/**
 * A structure describing the Bay`s link information
 */

public class LinkInfoImpl implements LinkInfo { 

	private java.lang.String port;
	private java.lang.String router;

	public LinkInfoImpl() {
	}

	public java.lang.String getPort() { 
		return this.port;
	} 

	public void setPort(java.lang.String port) { 
		this.port = port;
	} 

	public LinkInfoImpl port(java.lang.String port) { 
		this.port = port;
		return this;
	} 

	public java.lang.String getRouter() { 
		return this.router;
	} 

	public void setRouter(java.lang.String router) { 
		this.router = router;
	} 

	public LinkInfoImpl router(java.lang.String router) { 
		this.router = router;
		return this;
	} 

}
