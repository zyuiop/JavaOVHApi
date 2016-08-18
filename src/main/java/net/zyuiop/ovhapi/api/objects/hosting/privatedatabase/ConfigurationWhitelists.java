package net.zyuiop.ovhapi.api.objects.hosting.privatedatabase;

/**
 * Mysql configuration
 */

public class ConfigurationWhitelists { 

	private java.lang.String comment;
	private java.util.Date lastUpdate;
	private java.lang.String ip;
	private boolean service;
	private boolean sftp;

	public ConfigurationWhitelists() {
	}

	public java.lang.String getComment() { 
		return this.comment;
	} 

	public void setComment(java.lang.String comment) { 
		this.comment = comment;
	} 

	public ConfigurationWhitelists comment(java.lang.String comment) { 
		this.comment = comment;
		return this;
	} 

	public java.util.Date getLastUpdate() { 
		return this.lastUpdate;
	} 

	public void setLastUpdate(java.util.Date lastUpdate) { 
		this.lastUpdate = lastUpdate;
	} 

	public ConfigurationWhitelists lastUpdate(java.util.Date lastUpdate) { 
		this.lastUpdate = lastUpdate;
		return this;
	} 

	public java.lang.String getIp() { 
		return this.ip;
	} 

	public void setIp(java.lang.String ip) { 
		this.ip = ip;
	} 

	public ConfigurationWhitelists ip(java.lang.String ip) { 
		this.ip = ip;
		return this;
	} 

	public boolean getService() { 
		return this.service;
	} 

	public void setService(boolean service) { 
		this.service = service;
	} 

	public ConfigurationWhitelists service(boolean service) { 
		this.service = service;
		return this;
	} 

	public boolean getSftp() { 
		return this.sftp;
	} 

	public void setSftp(boolean sftp) { 
		this.sftp = sftp;
	} 

	public ConfigurationWhitelists sftp(boolean sftp) { 
		this.sftp = sftp;
		return this;
	} 

}
