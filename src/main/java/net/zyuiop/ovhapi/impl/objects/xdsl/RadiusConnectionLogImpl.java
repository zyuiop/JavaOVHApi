package net.zyuiop.ovhapi.impl.objects.xdsl;

import net.zyuiop.ovhapi.api.objects.xdsl.RadiusConnectionLog;
/**
 * Log entry of an auth attempt to the radius server
 */

public class RadiusConnectionLogImpl implements RadiusConnectionLog { 

	private java.util.Date date;
	private java.lang.String login;
	private java.lang.String state;
	private java.lang.String message;

	public RadiusConnectionLogImpl() {
	}

	public java.util.Date getDate() { 
		return this.date;
	} 

	public void setDate(java.util.Date date) { 
		this.date = date;
	} 

	public RadiusConnectionLogImpl date(java.util.Date date) { 
		this.date = date;
		return this;
	} 

	public java.lang.String getLogin() { 
		return this.login;
	} 

	public void setLogin(java.lang.String login) { 
		this.login = login;
	} 

	public RadiusConnectionLogImpl login(java.lang.String login) { 
		this.login = login;
		return this;
	} 

	public java.lang.String getState() { 
		return this.state;
	} 

	public void setState(java.lang.String state) { 
		this.state = state;
	} 

	public RadiusConnectionLogImpl state(java.lang.String state) { 
		this.state = state;
		return this;
	} 

	public java.lang.String getMessage() { 
		return this.message;
	} 

	public void setMessage(java.lang.String message) { 
		this.message = message;
	} 

	public RadiusConnectionLogImpl message(java.lang.String message) { 
		this.message = message;
		return this;
	} 

}
