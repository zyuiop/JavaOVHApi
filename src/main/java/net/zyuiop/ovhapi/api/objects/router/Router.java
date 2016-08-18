package net.zyuiop.ovhapi.api.objects.router;

/**
 * Router
 */

public class Router { 

	private java.lang.String status;
	private java.lang.String name;
	private java.lang.String service;

	public Router() {
	}

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public Router status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public Router name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public java.lang.String getService() { 
		return this.service;
	} 

	public void setService(java.lang.String service) { 
		this.service = service;
	} 

	public Router service(java.lang.String service) { 
		this.service = service;
		return this;
	} 

}
