package net.zyuiop.ovhapi.impl.objects.router;

import net.zyuiop.ovhapi.api.objects.router.Router;
/**
 * Router
 */

public class RouterImpl implements Router { 

	private java.lang.String status;
	private java.lang.String name;
	private java.lang.String service;

	public RouterImpl() {
	}

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public RouterImpl status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public RouterImpl name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public java.lang.String getService() { 
		return this.service;
	} 

	public void setService(java.lang.String service) { 
		this.service = service;
	} 

	public RouterImpl service(java.lang.String service) { 
		this.service = service;
		return this;
	} 

}
