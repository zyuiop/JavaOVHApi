package net.zyuiop.ovhapi.impl.objects.telephony;

import net.zyuiop.ovhapi.api.objects.telephony.Rsva;
/**
 * French value added services subject to the RSVA reform (Référentiel des numéros SVA)
 */

public class RsvaImpl implements Rsva { 

	private java.lang.String serviceName;

	public RsvaImpl() {
	}

	public java.lang.String getServiceName() { 
		return this.serviceName;
	} 

	public void setServiceName(java.lang.String serviceName) { 
		this.serviceName = serviceName;
	} 

	public RsvaImpl serviceName(java.lang.String serviceName) { 
		this.serviceName = serviceName;
		return this;
	} 

}
