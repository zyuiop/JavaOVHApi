package net.zyuiop.ovhapi.api.objects.xdsl;

/**
 * Scheduled action before the next renewal of the service
 */

public class PendingAction { 

	private java.util.Date dateTodo;
	private java.lang.String action;

	public PendingAction() {
	}

	public java.util.Date getDateTodo() { 
		return this.dateTodo;
	} 

	public void setDateTodo(java.util.Date dateTodo) { 
		this.dateTodo = dateTodo;
	} 

	public PendingAction dateTodo(java.util.Date dateTodo) { 
		this.dateTodo = dateTodo;
		return this;
	} 

	public java.lang.String getAction() { 
		return this.action;
	} 

	public void setAction(java.lang.String action) { 
		this.action = action;
	} 

	public PendingAction action(java.lang.String action) { 
		this.action = action;
		return this;
	} 

}
