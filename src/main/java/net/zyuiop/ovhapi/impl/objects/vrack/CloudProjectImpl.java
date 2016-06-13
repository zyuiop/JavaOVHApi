package net.zyuiop.ovhapi.impl.objects.vrack;

import net.zyuiop.ovhapi.api.objects.vrack.CloudProject;
/**
 * PublicCloud project in vrack
 */

public class CloudProjectImpl implements CloudProject { 

	private java.lang.String vrack;
	private java.lang.String project;

	public CloudProjectImpl() {
	}

	public java.lang.String getVrack() { 
		return this.vrack;
	} 

	public void setVrack(java.lang.String vrack) { 
		this.vrack = vrack;
	} 

	public CloudProjectImpl vrack(java.lang.String vrack) { 
		this.vrack = vrack;
		return this;
	} 

	public java.lang.String getProject() { 
		return this.project;
	} 

	public void setProject(java.lang.String project) { 
		this.project = project;
	} 

	public CloudProjectImpl project(java.lang.String project) { 
		this.project = project;
		return this;
	} 

}
