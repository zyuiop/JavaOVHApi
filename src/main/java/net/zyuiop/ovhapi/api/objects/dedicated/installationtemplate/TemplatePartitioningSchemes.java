package net.zyuiop.ovhapi.api.objects.dedicated.installationtemplate;

/**
 * Partitioning schemes available on this template
 */

public class TemplatePartitioningSchemes { 

	private long priority;
	private java.lang.String name;

	public TemplatePartitioningSchemes() {
	}

	public long getPriority() { 
		return this.priority;
	} 

	public void setPriority(long priority) { 
		this.priority = priority;
	} 

	public TemplatePartitioningSchemes priority(long priority) { 
		this.priority = priority;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public TemplatePartitioningSchemes name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

}
