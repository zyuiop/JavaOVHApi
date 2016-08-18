package net.zyuiop.ovhapi.api.objects.ip;

/**
 * Information about routing
 */

public class RoutedTo { 

	private java.lang.String serviceName;

	public RoutedTo() {
	}

	public java.lang.String getServiceName() { 
		return this.serviceName;
	} 

	public void setServiceName(java.lang.String serviceName) { 
		this.serviceName = serviceName;
	} 

	public RoutedTo serviceName(java.lang.String serviceName) { 
		this.serviceName = serviceName;
		return this;
	} 

}
