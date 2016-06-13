package net.zyuiop.ovhapi.impl.objects.ip;

import net.zyuiop.ovhapi.api.objects.ip.ServiceIp;
/**
 * Your IP linked to service
 */

public class ServiceIpImpl implements ServiceIp { 

	private java.lang.String organisationId;
	private java.lang.String country;
	private net.zyuiop.ovhapi.api.objects.ip.RoutedTo routedTo;
	private java.lang.String ip;
	private boolean canBeTerminated;
	private java.lang.String type;
	private java.lang.String description;

	public ServiceIpImpl() {
	}

	public java.lang.String getOrganisationId() { 
		return this.organisationId;
	} 

	public void setOrganisationId(java.lang.String organisationId) { 
		this.organisationId = organisationId;
	} 

	public ServiceIpImpl organisationId(java.lang.String organisationId) { 
		this.organisationId = organisationId;
		return this;
	} 

	public java.lang.String getCountry() { 
		return this.country;
	} 

	public void setCountry(java.lang.String country) { 
		this.country = country;
	} 

	public ServiceIpImpl country(java.lang.String country) { 
		this.country = country;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.ip.RoutedTo getRoutedTo() { 
		return this.routedTo;
	} 

	public void setRoutedTo(net.zyuiop.ovhapi.api.objects.ip.RoutedTo routedTo) { 
		this.routedTo = routedTo;
	} 

	public ServiceIpImpl routedTo(net.zyuiop.ovhapi.api.objects.ip.RoutedTo routedTo) { 
		this.routedTo = routedTo;
		return this;
	} 

	public java.lang.String getIp() { 
		return this.ip;
	} 

	public void setIp(java.lang.String ip) { 
		this.ip = ip;
	} 

	public ServiceIpImpl ip(java.lang.String ip) { 
		this.ip = ip;
		return this;
	} 

	public boolean getCanBeTerminated() { 
		return this.canBeTerminated;
	} 

	public void setCanBeTerminated(boolean canBeTerminated) { 
		this.canBeTerminated = canBeTerminated;
	} 

	public ServiceIpImpl canBeTerminated(boolean canBeTerminated) { 
		this.canBeTerminated = canBeTerminated;
		return this;
	} 

	public java.lang.String getType() { 
		return this.type;
	} 

	public void setType(java.lang.String type) { 
		this.type = type;
	} 

	public ServiceIpImpl type(java.lang.String type) { 
		this.type = type;
		return this;
	} 

	public java.lang.String getDescription() { 
		return this.description;
	} 

	public void setDescription(java.lang.String description) { 
		this.description = description;
	} 

	public ServiceIpImpl description(java.lang.String description) { 
		this.description = description;
		return this;
	} 

}
