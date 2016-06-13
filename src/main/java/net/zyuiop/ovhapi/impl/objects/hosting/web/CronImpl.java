package net.zyuiop.ovhapi.impl.objects.hosting.web;

import net.zyuiop.ovhapi.api.objects.hosting.web.Cron;
/**
 * Hosting crons
 */

public class CronImpl implements Cron { 

	private java.lang.String email;
	private java.lang.String frequency;
	private java.lang.String language;
	private java.lang.String status;
	private long id;
	private java.lang.String description;
	private java.lang.String command;

	public CronImpl() {
	}

	public java.lang.String getEmail() { 
		return this.email;
	} 

	public void setEmail(java.lang.String email) { 
		this.email = email;
	} 

	public CronImpl email(java.lang.String email) { 
		this.email = email;
		return this;
	} 

	public java.lang.String getFrequency() { 
		return this.frequency;
	} 

	public void setFrequency(java.lang.String frequency) { 
		this.frequency = frequency;
	} 

	public CronImpl frequency(java.lang.String frequency) { 
		this.frequency = frequency;
		return this;
	} 

	public java.lang.String getLanguage() { 
		return this.language;
	} 

	public void setLanguage(java.lang.String language) { 
		this.language = language;
	} 

	public CronImpl language(java.lang.String language) { 
		this.language = language;
		return this;
	} 

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public CronImpl status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public CronImpl id(long id) { 
		this.id = id;
		return this;
	} 

	public java.lang.String getDescription() { 
		return this.description;
	} 

	public void setDescription(java.lang.String description) { 
		this.description = description;
	} 

	public CronImpl description(java.lang.String description) { 
		this.description = description;
		return this;
	} 

	public java.lang.String getCommand() { 
		return this.command;
	} 

	public void setCommand(java.lang.String command) { 
		this.command = command;
	} 

	public CronImpl command(java.lang.String command) { 
		this.command = command;
		return this;
	} 

}
