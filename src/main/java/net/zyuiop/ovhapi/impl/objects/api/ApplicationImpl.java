package net.zyuiop.ovhapi.impl.objects.api;

import net.zyuiop.ovhapi.api.objects.api.Application;
/**
 * API Application
 */

public class ApplicationImpl implements Application { 

	private java.lang.String status;
	private java.lang.String name;
	private long applicationId;
	private java.lang.String description;
	private java.lang.String applicationKey;

	public ApplicationImpl() {
	}

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public ApplicationImpl status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public ApplicationImpl name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public long getApplicationId() { 
		return this.applicationId;
	} 

	public void setApplicationId(long applicationId) { 
		this.applicationId = applicationId;
	} 

	public ApplicationImpl applicationId(long applicationId) { 
		this.applicationId = applicationId;
		return this;
	} 

	public java.lang.String getDescription() { 
		return this.description;
	} 

	public void setDescription(java.lang.String description) { 
		this.description = description;
	} 

	public ApplicationImpl description(java.lang.String description) { 
		this.description = description;
		return this;
	} 

	public java.lang.String getApplicationKey() { 
		return this.applicationKey;
	} 

	public void setApplicationKey(java.lang.String applicationKey) { 
		this.applicationKey = applicationKey;
	} 

	public ApplicationImpl applicationKey(java.lang.String applicationKey) { 
		this.applicationKey = applicationKey;
		return this;
	} 

}
