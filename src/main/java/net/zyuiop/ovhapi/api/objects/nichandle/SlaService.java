package net.zyuiop.ovhapi.api.objects.nichandle;

/**
 * Describe all services impacted by SLA
 */

public class SlaService { 

	private java.lang.String slaApplication;
	private java.lang.String serviceName;
	private java.lang.String description;
	private java.lang.String slaPlan;

	public SlaService() {
	}

	public java.lang.String getSlaApplication() { 
		return this.slaApplication;
	} 

	public void setSlaApplication(java.lang.String slaApplication) { 
		this.slaApplication = slaApplication;
	} 

	public SlaService slaApplication(java.lang.String slaApplication) { 
		this.slaApplication = slaApplication;
		return this;
	} 

	public java.lang.String getServiceName() { 
		return this.serviceName;
	} 

	public void setServiceName(java.lang.String serviceName) { 
		this.serviceName = serviceName;
	} 

	public SlaService serviceName(java.lang.String serviceName) { 
		this.serviceName = serviceName;
		return this;
	} 

	public java.lang.String getDescription() { 
		return this.description;
	} 

	public void setDescription(java.lang.String description) { 
		this.description = description;
	} 

	public SlaService description(java.lang.String description) { 
		this.description = description;
		return this;
	} 

	public java.lang.String getSlaPlan() { 
		return this.slaPlan;
	} 

	public void setSlaPlan(java.lang.String slaPlan) { 
		this.slaPlan = slaPlan;
	} 

	public SlaService slaPlan(java.lang.String slaPlan) { 
		this.slaPlan = slaPlan;
		return this;
	} 

}
