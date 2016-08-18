package net.zyuiop.ovhapi.api.objects.license.office;

/**
 * Office task
 */

public class OfficeTask { 

	private java.lang.String function;
	private java.lang.String status;
	private java.util.Date todoDate;
	private java.util.Date finishDate;

	public OfficeTask() {
	}

	public java.lang.String getFunction() { 
		return this.function;
	} 

	public void setFunction(java.lang.String function) { 
		this.function = function;
	} 

	public OfficeTask function(java.lang.String function) { 
		this.function = function;
		return this;
	} 

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public OfficeTask status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public java.util.Date getTodoDate() { 
		return this.todoDate;
	} 

	public void setTodoDate(java.util.Date todoDate) { 
		this.todoDate = todoDate;
	} 

	public OfficeTask todoDate(java.util.Date todoDate) { 
		this.todoDate = todoDate;
		return this;
	} 

	public java.util.Date getFinishDate() { 
		return this.finishDate;
	} 

	public void setFinishDate(java.util.Date finishDate) { 
		this.finishDate = finishDate;
	} 

	public OfficeTask finishDate(java.util.Date finishDate) { 
		this.finishDate = finishDate;
		return this;
	} 

}
