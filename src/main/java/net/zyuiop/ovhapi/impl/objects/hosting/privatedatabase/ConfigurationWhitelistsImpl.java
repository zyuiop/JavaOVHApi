package net.zyuiop.ovhapi.impl.objects.hosting.privatedatabase;

import net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.ConfigurationWhitelists;
/**
 * Mysql configuration
 */

public class ConfigurationWhitelistsImpl implements ConfigurationWhitelists { 

	private java.lang.String comment;
	private java.util.Date lastUpdate;
	private java.lang.String ip;
	private boolean service;
	private boolean sftp;

	public ConfigurationWhitelistsImpl() {
	}

	public java.lang.String getComment() { 
		return this.comment;
	} 

	public void setComment(java.lang.String comment) { 
		this.comment = comment;
	} 

	public ConfigurationWhitelistsImpl comment(java.lang.String comment) { 
		this.comment = comment;
		return this;
	} 

	public java.util.Date getLastUpdate() { 
		return this.lastUpdate;
	} 

	public void setLastUpdate(java.util.Date lastUpdate) { 
		this.lastUpdate = lastUpdate;
	} 

	public ConfigurationWhitelistsImpl lastUpdate(java.util.Date lastUpdate) { 
		this.lastUpdate = lastUpdate;
		return this;
	} 

	public java.lang.String getIp() { 
		return this.ip;
	} 

	public void setIp(java.lang.String ip) { 
		this.ip = ip;
	} 

	public ConfigurationWhitelistsImpl ip(java.lang.String ip) { 
		this.ip = ip;
		return this;
	} 

	public boolean getService() { 
		return this.service;
	} 

	public void setService(boolean service) { 
		this.service = service;
	} 

	public ConfigurationWhitelistsImpl service(boolean service) { 
		this.service = service;
		return this;
	} 

	public boolean getSftp() { 
		return this.sftp;
	} 

	public void setSftp(boolean sftp) { 
		this.sftp = sftp;
	} 

	public ConfigurationWhitelistsImpl sftp(boolean sftp) { 
		this.sftp = sftp;
		return this;
	} 

}
