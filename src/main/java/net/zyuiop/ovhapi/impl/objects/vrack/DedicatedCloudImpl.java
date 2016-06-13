package net.zyuiop.ovhapi.impl.objects.vrack;

import net.zyuiop.ovhapi.api.objects.vrack.DedicatedCloud;
/**
 * vrack dedicated cloud interface
 */

public class DedicatedCloudImpl implements DedicatedCloud { 

	private java.lang.String vrack;
	private java.lang.String dedicatedCloud;
	private long vlanId;

	public DedicatedCloudImpl() {
	}

	public java.lang.String getVrack() { 
		return this.vrack;
	} 

	public void setVrack(java.lang.String vrack) { 
		this.vrack = vrack;
	} 

	public DedicatedCloudImpl vrack(java.lang.String vrack) { 
		this.vrack = vrack;
		return this;
	} 

	public java.lang.String getDedicatedCloud() { 
		return this.dedicatedCloud;
	} 

	public void setDedicatedCloud(java.lang.String dedicatedCloud) { 
		this.dedicatedCloud = dedicatedCloud;
	} 

	public DedicatedCloudImpl dedicatedCloud(java.lang.String dedicatedCloud) { 
		this.dedicatedCloud = dedicatedCloud;
		return this;
	} 

	public long getVlanId() { 
		return this.vlanId;
	} 

	public void setVlanId(long vlanId) { 
		this.vlanId = vlanId;
	} 

	public DedicatedCloudImpl vlanId(long vlanId) { 
		this.vlanId = vlanId;
		return this;
	} 

}
