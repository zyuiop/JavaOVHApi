package net.zyuiop.ovhapi.api.objects.vps;

/**
 * Backup your VPS
 */

public class AutomatedBackup { 

	private java.lang.String state;
	private java.lang.String schedule;

	public AutomatedBackup() {
	}

	public java.lang.String getState() { 
		return this.state;
	} 

	public void setState(java.lang.String state) { 
		this.state = state;
	} 

	public AutomatedBackup state(java.lang.String state) { 
		this.state = state;
		return this;
	} 

	public java.lang.String getSchedule() { 
		return this.schedule;
	} 

	public void setSchedule(java.lang.String schedule) { 
		this.schedule = schedule;
	} 

	public AutomatedBackup schedule(java.lang.String schedule) { 
		this.schedule = schedule;
		return this;
	} 

}
