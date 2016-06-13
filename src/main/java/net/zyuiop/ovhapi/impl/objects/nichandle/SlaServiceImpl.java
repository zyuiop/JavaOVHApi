package net.zyuiop.ovhapi.impl.objects.nichandle;

import net.zyuiop.ovhapi.api.objects.nichandle.SlaService;
/**
 * Describe all services impacted by SLA
 */

public class SlaServiceImpl implements SlaService { 

	private java.lang.String slaApplication;
	private java.lang.String serviceName;
	private java.lang.String description;
	private java.lang.String slaPlan;

	public SlaServiceImpl() {
	}

	public java.lang.String getSlaApplication() { 
		return this.slaApplication;
	} 

	public void setSlaApplication(java.lang.String slaApplication) { 
		this.slaApplication = slaApplication;
	} 

	public SlaServiceImpl slaApplication(java.lang.String slaApplication) { 
		this.slaApplication = slaApplication;
		return this;
	} 

	public java.lang.String getServiceName() { 
		return this.serviceName;
	} 

	public void setServiceName(java.lang.String serviceName) { 
		this.serviceName = serviceName;
	} 

	public SlaServiceImpl serviceName(java.lang.String serviceName) { 
		this.serviceName = serviceName;
		return this;
	} 

	public java.lang.String getDescription() { 
		return this.description;
	} 

	public void setDescription(java.lang.String description) { 
		this.description = description;
	} 

	public SlaServiceImpl description(java.lang.String description) { 
		this.description = description;
		return this;
	} 

	public java.lang.String getSlaPlan() { 
		return this.slaPlan;
	} 

	public void setSlaPlan(java.lang.String slaPlan) { 
		this.slaPlan = slaPlan;
	} 

	public SlaServiceImpl slaPlan(java.lang.String slaPlan) { 
		this.slaPlan = slaPlan;
		return this;
	} 

}
