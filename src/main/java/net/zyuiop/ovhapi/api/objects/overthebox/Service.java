package net.zyuiop.ovhapi.api.objects.overthebox;

/**
 * Service
 */

public class Service { 

	private net.zyuiop.ovhapi.api.objects.overthebox.GraphEndpoint graphEndpoint;
	private java.lang.String status;
	private java.lang.String serviceName;
	private java.lang.String releaseChannel;
	private java.lang.String customerDescription;

	public Service() {
	}

	public net.zyuiop.ovhapi.api.objects.overthebox.GraphEndpoint getGraphEndpoint() { 
		return this.graphEndpoint;
	} 

	public void setGraphEndpoint(net.zyuiop.ovhapi.api.objects.overthebox.GraphEndpoint graphEndpoint) { 
		this.graphEndpoint = graphEndpoint;
	} 

	public Service graphEndpoint(net.zyuiop.ovhapi.api.objects.overthebox.GraphEndpoint graphEndpoint) { 
		this.graphEndpoint = graphEndpoint;
		return this;
	} 

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public Service status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public java.lang.String getServiceName() { 
		return this.serviceName;
	} 

	public void setServiceName(java.lang.String serviceName) { 
		this.serviceName = serviceName;
	} 

	public Service serviceName(java.lang.String serviceName) { 
		this.serviceName = serviceName;
		return this;
	} 

	public java.lang.String getReleaseChannel() { 
		return this.releaseChannel;
	} 

	public void setReleaseChannel(java.lang.String releaseChannel) { 
		this.releaseChannel = releaseChannel;
	} 

	public Service releaseChannel(java.lang.String releaseChannel) { 
		this.releaseChannel = releaseChannel;
		return this;
	} 

	public java.lang.String getCustomerDescription() { 
		return this.customerDescription;
	} 

	public void setCustomerDescription(java.lang.String customerDescription) { 
		this.customerDescription = customerDescription;
	} 

	public Service customerDescription(java.lang.String customerDescription) { 
		this.customerDescription = customerDescription;
		return this;
	} 

}
