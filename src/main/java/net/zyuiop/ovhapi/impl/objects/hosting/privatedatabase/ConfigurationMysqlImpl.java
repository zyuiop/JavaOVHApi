package net.zyuiop.ovhapi.impl.objects.hosting.privatedatabase;

import net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.ConfigurationMysql;
/**
 * Mysql configuration
 */

public class ConfigurationMysqlImpl implements ConfigurationMysql { 

	private java.lang.String tmpdir;
	private java.util.Date lastUpdate;
	private boolean autoCommit;
	private long innodbBufferPoolSize;
	private long maxAllowedPacket;
	private long maxConnections;
	private boolean skipInnodb;

	public ConfigurationMysqlImpl() {
	}

	public java.lang.String getTmpdir() { 
		return this.tmpdir;
	} 

	public void setTmpdir(java.lang.String tmpdir) { 
		this.tmpdir = tmpdir;
	} 

	public ConfigurationMysqlImpl tmpdir(java.lang.String tmpdir) { 
		this.tmpdir = tmpdir;
		return this;
	} 

	public java.util.Date getLastUpdate() { 
		return this.lastUpdate;
	} 

	public void setLastUpdate(java.util.Date lastUpdate) { 
		this.lastUpdate = lastUpdate;
	} 

	public ConfigurationMysqlImpl lastUpdate(java.util.Date lastUpdate) { 
		this.lastUpdate = lastUpdate;
		return this;
	} 

	public boolean getAutoCommit() { 
		return this.autoCommit;
	} 

	public void setAutoCommit(boolean autoCommit) { 
		this.autoCommit = autoCommit;
	} 

	public ConfigurationMysqlImpl autoCommit(boolean autoCommit) { 
		this.autoCommit = autoCommit;
		return this;
	} 

	public long getInnodbBufferPoolSize() { 
		return this.innodbBufferPoolSize;
	} 

	public void setInnodbBufferPoolSize(long innodbBufferPoolSize) { 
		this.innodbBufferPoolSize = innodbBufferPoolSize;
	} 

	public ConfigurationMysqlImpl innodbBufferPoolSize(long innodbBufferPoolSize) { 
		this.innodbBufferPoolSize = innodbBufferPoolSize;
		return this;
	} 

	public long getMaxAllowedPacket() { 
		return this.maxAllowedPacket;
	} 

	public void setMaxAllowedPacket(long maxAllowedPacket) { 
		this.maxAllowedPacket = maxAllowedPacket;
	} 

	public ConfigurationMysqlImpl maxAllowedPacket(long maxAllowedPacket) { 
		this.maxAllowedPacket = maxAllowedPacket;
		return this;
	} 

	public long getMaxConnections() { 
		return this.maxConnections;
	} 

	public void setMaxConnections(long maxConnections) { 
		this.maxConnections = maxConnections;
	} 

	public ConfigurationMysqlImpl maxConnections(long maxConnections) { 
		this.maxConnections = maxConnections;
		return this;
	} 

	public boolean getSkipInnodb() { 
		return this.skipInnodb;
	} 

	public void setSkipInnodb(boolean skipInnodb) { 
		this.skipInnodb = skipInnodb;
	} 

	public ConfigurationMysqlImpl skipInnodb(boolean skipInnodb) { 
		this.skipInnodb = skipInnodb;
		return this;
	} 

}
