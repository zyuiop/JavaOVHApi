package net.zyuiop.ovhapi.api.objects.xdsl;

/**
 * Log entry of an auth attempt to the radius server
 */

public class RadiusConnectionLog { 

	private java.util.Date date;
	private java.lang.String login;
	private java.lang.String state;
	private java.lang.String message;

	public RadiusConnectionLog() {
	}

	public java.util.Date getDate() { 
		return this.date;
	} 

	public void setDate(java.util.Date date) { 
		this.date = date;
	} 

	public RadiusConnectionLog date(java.util.Date date) { 
		this.date = date;
		return this;
	} 

	public java.lang.String getLogin() { 
		return this.login;
	} 

	public void setLogin(java.lang.String login) { 
		this.login = login;
	} 

	public RadiusConnectionLog login(java.lang.String login) { 
		this.login = login;
		return this;
	} 

	public java.lang.String getState() { 
		return this.state;
	} 

	public void setState(java.lang.String state) { 
		this.state = state;
	} 

	public RadiusConnectionLog state(java.lang.String state) { 
		this.state = state;
		return this;
	} 

	public java.lang.String getMessage() { 
		return this.message;
	} 

	public void setMessage(java.lang.String message) { 
		this.message = message;
	} 

	public RadiusConnectionLog message(java.lang.String message) { 
		this.message = message;
		return this;
	} 

}
