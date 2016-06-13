package net.zyuiop.ovhapi.impl.objects.telephony;

import net.zyuiop.ovhapi.api.objects.telephony.Scheduler;
/**
 * Scheduler capable services
 */

public class SchedulerImpl implements Scheduler { 

	private java.lang.String timeZone;
	private java.lang.String serviceName;

	public SchedulerImpl() {
	}

	public java.lang.String getTimeZone() { 
		return this.timeZone;
	} 

	public void setTimeZone(java.lang.String timeZone) { 
		this.timeZone = timeZone;
	} 

	public SchedulerImpl timeZone(java.lang.String timeZone) { 
		this.timeZone = timeZone;
		return this;
	} 

	public java.lang.String getServiceName() { 
		return this.serviceName;
	} 

	public void setServiceName(java.lang.String serviceName) { 
		this.serviceName = serviceName;
	} 

	public SchedulerImpl serviceName(java.lang.String serviceName) { 
		this.serviceName = serviceName;
		return this;
	} 

}
