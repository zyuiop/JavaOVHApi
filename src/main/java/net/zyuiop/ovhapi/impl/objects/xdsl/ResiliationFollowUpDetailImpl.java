package net.zyuiop.ovhapi.impl.objects.xdsl;

import net.zyuiop.ovhapi.api.objects.xdsl.ResiliationFollowUpDetail;
/**
 * Details about the resiliation
 */

public class ResiliationFollowUpDetailImpl implements ResiliationFollowUpDetail { 

	private java.lang.String status;
	private java.util.Date dateTodo;
	private boolean needModemReturn;
	private java.util.Date registrationDate;

	public ResiliationFollowUpDetailImpl() {
	}

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public ResiliationFollowUpDetailImpl status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public java.util.Date getDateTodo() { 
		return this.dateTodo;
	} 

	public void setDateTodo(java.util.Date dateTodo) { 
		this.dateTodo = dateTodo;
	} 

	public ResiliationFollowUpDetailImpl dateTodo(java.util.Date dateTodo) { 
		this.dateTodo = dateTodo;
		return this;
	} 

	public boolean getNeedModemReturn() { 
		return this.needModemReturn;
	} 

	public void setNeedModemReturn(boolean needModemReturn) { 
		this.needModemReturn = needModemReturn;
	} 

	public ResiliationFollowUpDetailImpl needModemReturn(boolean needModemReturn) { 
		this.needModemReturn = needModemReturn;
		return this;
	} 

	public java.util.Date getRegistrationDate() { 
		return this.registrationDate;
	} 

	public void setRegistrationDate(java.util.Date registrationDate) { 
		this.registrationDate = registrationDate;
	} 

	public ResiliationFollowUpDetailImpl registrationDate(java.util.Date registrationDate) { 
		this.registrationDate = registrationDate;
		return this;
	} 

}
