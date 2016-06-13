package net.zyuiop.ovhapi.impl.objects.pack.xdsl;

import net.zyuiop.ovhapi.api.objects.pack.xdsl.ServiceInformation;
/**
 * Informations about a service
 */

public class ServiceInformationImpl implements ServiceInformation { 

	private java.lang.String name;
	private long used;
	private long inCreation;
	private long total;

	public ServiceInformationImpl() {
	}

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public ServiceInformationImpl name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public long getUsed() { 
		return this.used;
	} 

	public void setUsed(long used) { 
		this.used = used;
	} 

	public ServiceInformationImpl used(long used) { 
		this.used = used;
		return this;
	} 

	public long getInCreation() { 
		return this.inCreation;
	} 

	public void setInCreation(long inCreation) { 
		this.inCreation = inCreation;
	} 

	public ServiceInformationImpl inCreation(long inCreation) { 
		this.inCreation = inCreation;
		return this;
	} 

	public long getTotal() { 
		return this.total;
	} 

	public void setTotal(long total) { 
		this.total = total;
	} 

	public ServiceInformationImpl total(long total) { 
		this.total = total;
		return this;
	} 

}
