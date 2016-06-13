package net.zyuiop.ovhapi.impl.objects.ip;

import net.zyuiop.ovhapi.api.objects.ip.RoutedTo;
/**
 * Information about routing
 */

public class RoutedToImpl implements RoutedTo { 

	private java.lang.String serviceName;

	public RoutedToImpl() {
	}

	public java.lang.String getServiceName() { 
		return this.serviceName;
	} 

	public void setServiceName(java.lang.String serviceName) { 
		this.serviceName = serviceName;
	} 

	public RoutedToImpl serviceName(java.lang.String serviceName) { 
		this.serviceName = serviceName;
		return this;
	} 

}
