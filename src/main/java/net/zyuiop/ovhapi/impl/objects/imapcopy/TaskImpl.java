package net.zyuiop.ovhapi.impl.objects.imapcopy;

import net.zyuiop.ovhapi.api.objects.imapcopy.Task;
/**
 * Task of ImapCopy
 */

public class TaskImpl implements Task { 

	private java.util.Date lastUpdate;
	private java.lang.String status;
	private java.util.Date todoDate;
	private java.util.Date finishDate;
	private long id;
	private java.lang.String return;

	public TaskImpl() {
	}

	public java.util.Date getLastUpdate() { 
		return this.lastUpdate;
	} 

	public void setLastUpdate(java.util.Date lastUpdate) { 
		this.lastUpdate = lastUpdate;
	} 

	public TaskImpl lastUpdate(java.util.Date lastUpdate) { 
		this.lastUpdate = lastUpdate;
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

	public java.util.Date getFinishDate() { 
		return this.finishDate;
	} 

	public void setFinishDate(java.util.Date finishDate) { 
		this.finishDate = finishDate;
	} 

	public TaskImpl finishDate(java.util.Date finishDate) { 
		this.finishDate = finishDate;
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

	public java.lang.String getReturn() { 
		return this.return;
	} 

	public void setReturn(java.lang.String return) { 
		this.return = return;
	} 

	public TaskImpl return(java.lang.String return) { 
		this.return = return;
		return this;
	} 

}
