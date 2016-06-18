package net.zyuiop.ovhapi.impl.objects.xdsl;

import net.zyuiop.ovhapi.api.objects.xdsl.Incident;
/**
 * Detected incident
 */

public class IncidentImpl implements Incident { 

	private long taskId;
	private java.lang.String[] departments;
	private java.util.Date creationDate;
	private java.lang.String comment;
	private java.util.Date endDate;
	private long id;
	private java.lang.String[] nra;
	private java.lang.String[] operators;

	public IncidentImpl() {
	}

	public long getTaskId() { 
		return this.taskId;
	} 

	public void setTaskId(long taskId) { 
		this.taskId = taskId;
	} 

	public IncidentImpl taskId(long taskId) { 
		this.taskId = taskId;
		return this;
	} 

	public java.lang.String[] getDepartments() { 
		return this.departments;
	} 

	public void setDepartments(java.lang.String[] departments) { 
		this.departments = departments;
	} 

	public IncidentImpl departments(java.lang.String[] departments) { 
		this.departments = departments;
		return this;
	} 

	public java.util.Date getCreationDate() { 
		return this.creationDate;
	} 

	public void setCreationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
	} 

	public IncidentImpl creationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
		return this;
	} 

	public java.lang.String getComment() { 
		return this.comment;
	} 

	public void setComment(java.lang.String comment) { 
		this.comment = comment;
	} 

	public IncidentImpl comment(java.lang.String comment) { 
		this.comment = comment;
		return this;
	} 

	public java.util.Date getEndDate() { 
		return this.endDate;
	} 

	public void setEndDate(java.util.Date endDate) { 
		this.endDate = endDate;
	} 

	public IncidentImpl endDate(java.util.Date endDate) { 
		this.endDate = endDate;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public IncidentImpl id(long id) { 
		this.id = id;
		return this;
	} 

	public java.lang.String[] getNra() { 
		return this.nra;
	} 

	public void setNra(java.lang.String[] nra) { 
		this.nra = nra;
	} 

	public IncidentImpl nra(java.lang.String[] nra) { 
		this.nra = nra;
		return this;
	} 

	public java.lang.String[] getOperators() { 
		return this.operators;
	} 

	public void setOperators(java.lang.String[] operators) { 
		this.operators = operators;
	} 

	public IncidentImpl operators(java.lang.String[] operators) { 
		this.operators = operators;
		return this;
	} 

}
