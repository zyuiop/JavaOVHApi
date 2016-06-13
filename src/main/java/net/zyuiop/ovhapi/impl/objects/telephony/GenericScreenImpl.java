package net.zyuiop.ovhapi.impl.objects.telephony;

import net.zyuiop.ovhapi.api.objects.telephony.GenericScreen;
/**
 * Time conditions capable services
 */

public class GenericScreenImpl implements GenericScreen { 

	private java.lang.String serviceName;

	public GenericScreenImpl() {
	}

	public java.lang.String getServiceName() { 
		return this.serviceName;
	} 

	public void setServiceName(java.lang.String serviceName) { 
		this.serviceName = serviceName;
	} 

	public GenericScreenImpl serviceName(java.lang.String serviceName) { 
		this.serviceName = serviceName;
		return this;
	} 

}
