package net.zyuiop.ovhapi.api.objects.email.exchange;

/**
 * Exchange task details
 */

public class Task { 

	private java.lang.String function;
	private java.lang.String status;
	private java.util.Date todoDate;
	private java.util.Date finishDate;
	private long id;

	public Task() {
	}

	public java.lang.String getFunction() { 
		return this.function;
	} 

	public void setFunction(java.lang.String function) { 
		this.function = function;
	} 

	public Task function(java.lang.String function) { 
		this.function = function;
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

	public java.util.Date getTodoDate() { 
		return this.todoDate;
	} 

	public void setTodoDate(java.util.Date todoDate) { 
		this.todoDate = todoDate;
	} 

	public Task todoDate(java.util.Date todoDate) { 
		this.todoDate = todoDate;
		return this;
	} 

	public java.util.Date getFinishDate() { 
		return this.finishDate;
	} 

	public void setFinishDate(java.util.Date finishDate) { 
		this.finishDate = finishDate;
	} 

	public Task finishDate(java.util.Date finishDate) { 
		this.finishDate = finishDate;
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

}
