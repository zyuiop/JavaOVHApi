package net.zyuiop.ovhapi.api.objects.pcs;

/**
 * Operation on a Public Cloud Storage element
 */

public class Task { 

	private long progress;
	private long id;
	private java.lang.String type;
	private java.lang.String state;

	public Task() {
	}

	public long getProgress() { 
		return this.progress;
	} 

	public void setProgress(long progress) { 
		this.progress = progress;
	} 

	public Task progress(long progress) { 
		this.progress = progress;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public Task id(long id) { 
		this.id = id;
		return this;
	} 

	public java.lang.String getType() { 
		return this.type;
	} 

	public void setType(java.lang.String type) { 
		this.type = type;
	} 

	public Task type(java.lang.String type) { 
		this.type = type;
		return this;
	} 

	public java.lang.String getState() { 
		return this.state;
	} 

	public void setState(java.lang.String state) { 
		this.state = state;
	} 

	public Task state(java.lang.String state) { 
		this.state = state;
		return this;
	} 

}
