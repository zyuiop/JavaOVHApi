package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * French value added services subject to the RSVA reform (Référentiel des numéros SVA)
 */

public class Rsva { 

	private java.lang.String serviceName;

	public Rsva() {
	}

	public java.lang.String getServiceName() { 
		return this.serviceName;
	} 

	public void setServiceName(java.lang.String serviceName) { 
		this.serviceName = serviceName;
	} 

	public Rsva serviceName(java.lang.String serviceName) { 
		this.serviceName = serviceName;
		return this;
	} 

}
