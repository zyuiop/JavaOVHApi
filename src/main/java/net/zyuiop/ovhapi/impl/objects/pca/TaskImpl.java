package net.zyuiop.ovhapi.impl.objects.pca;

import net.zyuiop.ovhapi.api.objects.pca.Task;
/**
 * cloud archives tasks
 */

public class TaskImpl implements Task { 

	private java.lang.String function;
	private java.lang.String comment;
	private java.lang.String status;
	private java.util.Date todoDate;
	private java.lang.String ipAddress;
	private java.lang.String id;
	private java.lang.String login;

	public TaskImpl() {
	}

	public java.lang.String getFunction() { 
		return this.function;
	} 

	public void setFunction(java.lang.String function) { 
		this.function = function;
	} 

	public TaskImpl function(java.lang.String function) { 
		this.function = function;
		return this;
	} 

	public java.lang.String getComment() { 
		return this.comment;
	} 

	public void setComment(java.lang.String comment) { 
		this.comment = comment;
	} 

	public TaskImpl comment(java.lang.String comment) { 
		this.comment = comment;
		return this;
	} 

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public TaskImpl status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public java.util.Date getTodoDate() { 
		return this.todoDate;
	} 

	public void setTodoDate(java.util.Date todoDate) { 
		this.todoDate = todoDate;
	} 

	public TaskImpl todoDate(java.util.Date todoDate) { 
		this.todoDate = todoDate;
		return this;
	} 

	public java.lang.String getIpAddress() { 
		return this.ipAddress;
	} 

	public void setIpAddress(java.lang.String ipAddress) { 
		this.ipAddress = ipAddress;
	} 

	public TaskImpl ipAddress(java.lang.String ipAddress) { 
		this.ipAddress = ipAddress;
		return this;
	} 

	public java.lang.String getId() { 
		return this.id;
	} 

	public void setId(java.lang.String id) { 
		this.id = id;
	} 

	public TaskImpl id(java.lang.String id) { 
		this.id = id;
		return this;
	} 

	public java.lang.String getLogin() { 
		return this.login;
	} 

	public void setLogin(java.lang.String login) { 
		this.login = login;
	} 

	public TaskImpl login(java.lang.String login) { 
		this.login = login;
		return this;
	} 

}
