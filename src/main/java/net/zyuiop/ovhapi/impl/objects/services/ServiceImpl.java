package net.zyuiop.ovhapi.impl.objects.services;

import net.zyuiop.ovhapi.api.objects.services.Service;
/**
 * Details about a Service
 */

public class ServiceImpl implements Service { 

	private java.lang.String status;
	private java.util.Date engagedUpTo;
	private long[] possibleRenewPeriod;
	private java.lang.String contactBilling;
	private net.zyuiop.ovhapi.impl.objects.service.RenewTypeImpl renew;
	private java.lang.String domain;
	private java.util.Date expiration;
	private java.lang.String contactTech;
	private java.lang.String contactAdmin;
	private java.util.Date creation;

	public ServiceImpl() {
	}

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public ServiceImpl status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public java.util.Date getEngagedUpTo() { 
		return this.engagedUpTo;
	} 

	public void setEngagedUpTo(java.util.Date engagedUpTo) { 
		this.engagedUpTo = engagedUpTo;
	} 

	public ServiceImpl engagedUpTo(java.util.Date engagedUpTo) { 
		this.engagedUpTo = engagedUpTo;
		return this;
	} 

	public long[] getPossibleRenewPeriod() { 
		return this.possibleRenewPeriod;
	} 

	public void setPossibleRenewPeriod(long[] possibleRenewPeriod) { 
		this.possibleRenewPeriod = possibleRenewPeriod;
	} 

	public ServiceImpl possibleRenewPeriod(long[] possibleRenewPeriod) { 
		this.possibleRenewPeriod = possibleRenewPeriod;
		return this;
	} 

	public java.lang.String getContactBilling() { 
		return this.contactBilling;
	} 

	public void setContactBilling(java.lang.String contactBilling) { 
		this.contactBilling = contactBilling;
	} 

	public ServiceImpl contactBilling(java.lang.String contactBilling) { 
		this.contactBilling = contactBilling;
		return this;
	} 

	public net.zyuiop.ovhapi.impl.objects.service.RenewTypeImpl getRenew() { 
		return this.renew;
	} 

	public void setRenew(net.zyuiop.ovhapi.impl.objects.service.RenewTypeImpl renew) { 
		this.renew = renew;
	} 

	public ServiceImpl renew(net.zyuiop.ovhapi.impl.objects.service.RenewTypeImpl renew) { 
		this.renew = renew;
		return this;
	} 

	public java.lang.String getDomain() { 
		return this.domain;
	} 

	public void setDomain(java.lang.String domain) { 
		this.domain = domain;
	} 

	public ServiceImpl domain(java.lang.String domain) { 
		this.domain = domain;
		return this;
	} 

	public java.util.Date getExpiration() { 
		return this.expiration;
	} 

	public void setExpiration(java.util.Date expiration) { 
		this.expiration = expiration;
	} 

	public ServiceImpl expiration(java.util.Date expiration) { 
		this.expiration = expiration;
		return this;
	} 

	public java.lang.String getContactTech() { 
		return this.contactTech;
	} 

	public void setContactTech(java.lang.String contactTech) { 
		this.contactTech = contactTech;
	} 

	public ServiceImpl contactTech(java.lang.String contactTech) { 
		this.contactTech = contactTech;
		return this;
	} 

	public java.lang.String getContactAdmin() { 
		return this.contactAdmin;
	} 

	public void setContactAdmin(java.lang.String contactAdmin) { 
		this.contactAdmin = contactAdmin;
	} 

	public ServiceImpl contactAdmin(java.lang.String contactAdmin) { 
		this.contactAdmin = contactAdmin;
		return this;
	} 

	public java.util.Date getCreation() { 
		return this.creation;
	} 

	public void setCreation(java.util.Date creation) { 
		this.creation = creation;
	} 

	public ServiceImpl creation(java.util.Date creation) { 
		this.creation = creation;
		return this;
	} 

}
