package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Time conditions capable services
 */

public class GenericScreen { 

	private java.lang.String serviceName;

	public GenericScreen() {
	}

	public java.lang.String getServiceName() { 
		return this.serviceName;
	} 

	public void setServiceName(java.lang.String serviceName) { 
		this.serviceName = serviceName;
	} 

	public GenericScreen serviceName(java.lang.String serviceName) { 
		this.serviceName = serviceName;
		return this;
	} 

}
