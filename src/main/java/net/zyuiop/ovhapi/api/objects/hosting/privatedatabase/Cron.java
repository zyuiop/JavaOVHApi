package net.zyuiop.ovhapi.api.objects.hosting.privatedatabase;

/**
 * Crons
 */

public class Cron { 

	private java.lang.String email;
	private java.lang.String frequency;
	private java.lang.String databaseName;
	private java.lang.String status;
	private long id;
	private java.lang.String description;
	private java.lang.String command;

	public Cron() {
	}

	public java.lang.String getEmail() { 
		return this.email;
	} 

	public void setEmail(java.lang.String email) { 
		this.email = email;
	} 

	public Cron email(java.lang.String email) { 
		this.email = email;
		return this;
	} 

	public java.lang.String getFrequency() { 
		return this.frequency;
	} 

	public void setFrequency(java.lang.String frequency) { 
		this.frequency = frequency;
	} 

	public Cron frequency(java.lang.String frequency) { 
		this.frequency = frequency;
		return this;
	} 

	public java.lang.String getDatabaseName() { 
		return this.databaseName;
	} 

	public void setDatabaseName(java.lang.String databaseName) { 
		this.databaseName = databaseName;
	} 

	public Cron databaseName(java.lang.String databaseName) { 
		this.databaseName = databaseName;
		return this;
	} 

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public Cron status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public Cron id(long id) { 
		this.id = id;
		return this;
	} 

	public java.lang.String getDescription() { 
		return this.description;
	} 

	public void setDescription(java.lang.String description) { 
		this.description = description;
	} 

	public Cron description(java.lang.String description) { 
		this.description = description;
		return this;
	} 

	public java.lang.String getCommand() { 
		return this.command;
	} 

	public void setCommand(java.lang.String command) { 
		this.command = command;
	} 

	public Cron command(java.lang.String command) { 
		this.command = command;
		return this;
	} 

}
