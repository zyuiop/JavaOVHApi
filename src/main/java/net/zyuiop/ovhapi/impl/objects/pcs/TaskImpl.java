package net.zyuiop.ovhapi.impl.objects.pcs;

import net.zyuiop.ovhapi.api.objects.pcs.Task;
/**
 * Operation on a Public Cloud Storage element
 */

public class TaskImpl implements Task { 

	private long progress;
	private long id;
	private java.lang.String type;
	private java.lang.String state;

	public TaskImpl() {
	}

	public long getProgress() { 
		return this.progress;
	} 

	public void setProgress(long progress) { 
		this.progress = progress;
	} 

	public TaskImpl progress(long progress) { 
		this.progress = progress;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public TaskImpl id(long id) { 
		this.id = id;
		return this;
	} 

	public java.lang.String getType() { 
		return this.type;
	} 

	public void setType(java.lang.String type) { 
		this.type = type;
	} 

	public TaskImpl type(java.lang.String type) { 
		this.type = type;
		return this;
	} 

	public java.lang.String getState() { 
		return this.state;
	} 

	public void setState(java.lang.String state) { 
		this.state = state;
	} 

	public TaskImpl state(java.lang.String state) { 
		this.state = state;
		return this;
	} 

}
