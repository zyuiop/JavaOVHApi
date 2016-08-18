package net.zyuiop.ovhapi.api.objects.dedicatedcloud;

/**
 * A structure describing the Resource's new price
 */

public class ResourceNewPrices { 

	private net.zyuiop.ovhapi.api.objects.dedicatedcloud.ResourceNewPricesEntry[] resources;

	public ResourceNewPrices() {
	}

	public net.zyuiop.ovhapi.api.objects.dedicatedcloud.ResourceNewPricesEntry[] getResources() { 
		return this.resources;
	} 

	public void setResources(net.zyuiop.ovhapi.api.objects.dedicatedcloud.ResourceNewPricesEntry[] resources) { 
		this.resources = resources;
	} 

	public ResourceNewPrices resources(net.zyuiop.ovhapi.api.objects.dedicatedcloud.ResourceNewPricesEntry[] resources) { 
		this.resources = resources;
		return this;
	} 

}
