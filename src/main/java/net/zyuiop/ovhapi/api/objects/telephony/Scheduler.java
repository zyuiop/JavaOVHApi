package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Scheduler capable services
 */

public class Scheduler { 

	private java.lang.String timeZone;
	private java.lang.String serviceName;

	public Scheduler() {
	}

	public java.lang.String getTimeZone() { 
		return this.timeZone;
	} 

	public void setTimeZone(java.lang.String timeZone) { 
		this.timeZone = timeZone;
	} 

	public Scheduler timeZone(java.lang.String timeZone) { 
		this.timeZone = timeZone;
		return this;
	} 

	public java.lang.String getServiceName() { 
		return this.serviceName;
	} 

	public void setServiceName(java.lang.String serviceName) { 
		this.serviceName = serviceName;
	} 

	public Scheduler serviceName(java.lang.String serviceName) { 
		this.serviceName = serviceName;
		return this;
	} 

}
