package net.zyuiop.ovhapi.impl.objects.xdsl;

import net.zyuiop.ovhapi.api.objects.xdsl.PendingAction;
/**
 * Scheduled action before the next renewal of the service
 */

public class PendingActionImpl implements PendingAction { 

	private java.util.Date dateTodo;
	private java.lang.String action;

	public PendingActionImpl() {
	}

	public java.util.Date getDateTodo() { 
		return this.dateTodo;
	} 

	public void setDateTodo(java.util.Date dateTodo) { 
		this.dateTodo = dateTodo;
	} 

	public PendingActionImpl dateTodo(java.util.Date dateTodo) { 
		this.dateTodo = dateTodo;
		return this;
	} 

	public java.lang.String getAction() { 
		return this.action;
	} 

	public void setAction(java.lang.String action) { 
		this.action = action;
	} 

	public PendingActionImpl action(java.lang.String action) { 
		this.action = action;
		return this;
	} 

}
