package net.zyuiop.ovhapi.api.objects.vrack;

/**
 * PublicCloud project in vrack
 */

public class CloudProject { 

	private java.lang.String vrack;
	private java.lang.String project;

	public CloudProject() {
	}

	public java.lang.String getVrack() { 
		return this.vrack;
	} 

	public void setVrack(java.lang.String vrack) { 
		this.vrack = vrack;
	} 

	public CloudProject vrack(java.lang.String vrack) { 
		this.vrack = vrack;
		return this;
	} 

	public java.lang.String getProject() { 
		return this.project;
	} 

	public void setProject(java.lang.String project) { 
		this.project = project;
	} 

	public CloudProject project(java.lang.String project) { 
		this.project = project;
		return this;
	} 

}
