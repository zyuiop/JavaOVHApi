package net.zyuiop.ovhapi.impl.objects.dedicated.installationtemplate;

import net.zyuiop.ovhapi.api.objects.dedicated.installationtemplate.TemplatePartitioningSchemes;
/**
 * Partitioning schemes available on this template
 */

public class TemplatePartitioningSchemesImpl implements TemplatePartitioningSchemes { 

	private long priority;
	private java.lang.String name;

	public TemplatePartitioningSchemesImpl() {
	}

	public long getPriority() { 
		return this.priority;
	} 

	public void setPriority(long priority) { 
		this.priority = priority;
	} 

	public TemplatePartitioningSchemesImpl priority(long priority) { 
		this.priority = priority;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public TemplatePartitioningSchemesImpl name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

}
