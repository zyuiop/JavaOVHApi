package net.zyuiop.ovhapi.api.objects.imapcopy;

/**
 * Task of ImapCopy
 */

public class Task { 

	private java.util.Date lastUpdate;
	private java.lang.String status;
	private java.util.Date todoDate;
	private java.util.Date finishDate;
	private long id;
	private java.lang.String _return;

	public Task() {
	}

	public java.util.Date getLastUpdate() { 
		return this.lastUpdate;
	} 

	public void setLastUpdate(java.util.Date lastUpdate) { 
		this.lastUpdate = lastUpdate;
	} 

	public Task lastUpdate(java.util.Date lastUpdate) { 
		this.lastUpdate = lastUpdate;
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

	public java.lang.String getReturn() { 
		return this._return;
	} 

	public void setReturn(java.lang.String _return) { 
		this._return = _return;
	} 

	public Task _return(java.lang.String _return) { 
		this._return = _return;
		return this;
	} 

}
