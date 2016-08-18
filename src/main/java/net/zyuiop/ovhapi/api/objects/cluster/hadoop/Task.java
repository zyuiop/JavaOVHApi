package net.zyuiop.ovhapi.api.objects.cluster.hadoop;

/**
 * Operation on a Hadoop Cluster component
 */

public class Task { 

	private long taskId;
	private java.lang.String status;
	private java.lang.String name;

	public Task() {
	}

	public long getTaskId() { 
		return this.taskId;
	} 

	public void setTaskId(long taskId) { 
		this.taskId = taskId;
	} 

	public Task taskId(long taskId) { 
		this.taskId = taskId;
		return this;
	} 

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public Task status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public Task name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

}
