package net.zyuiop.ovhapi.api.objects.vrack;

/**
 * vrack dedicated cloud interface
 */

public class DedicatedCloud { 

	private java.lang.String vrack;
	private java.lang.String dedicatedCloud;
	private long vlanId;

	public DedicatedCloud() {
	}

	public java.lang.String getVrack() { 
		return this.vrack;
	} 

	public void setVrack(java.lang.String vrack) { 
		this.vrack = vrack;
	} 

	public DedicatedCloud vrack(java.lang.String vrack) { 
		this.vrack = vrack;
		return this;
	} 

	public java.lang.String getDedicatedCloud() { 
		return this.dedicatedCloud;
	} 

	public void setDedicatedCloud(java.lang.String dedicatedCloud) { 
		this.dedicatedCloud = dedicatedCloud;
	} 

	public DedicatedCloud dedicatedCloud(java.lang.String dedicatedCloud) { 
		this.dedicatedCloud = dedicatedCloud;
		return this;
	} 

	public long getVlanId() { 
		return this.vlanId;
	} 

	public void setVlanId(long vlanId) { 
		this.vlanId = vlanId;
	} 

	public DedicatedCloud vlanId(long vlanId) { 
		this.vlanId = vlanId;
		return this;
	} 

}
