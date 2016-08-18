package net.zyuiop.ovhapi.api.objects.cloud.project;

/**
 * Usage information on your project
 */

public class ProjectUsage { 

	private net.zyuiop.ovhapi.api.objects.cloud.project.CurrentUsage current;

	public ProjectUsage() {
	}

	public net.zyuiop.ovhapi.api.objects.cloud.project.CurrentUsage getCurrent() { 
		return this.current;
	} 

	public void setCurrent(net.zyuiop.ovhapi.api.objects.cloud.project.CurrentUsage current) { 
		this.current = current;
	} 

	public ProjectUsage current(net.zyuiop.ovhapi.api.objects.cloud.project.CurrentUsage current) { 
		this.current = current;
		return this;
	} 

}
