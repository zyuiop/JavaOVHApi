package net.zyuiop.ovhapi.api.objects.hosting.privatedatabase;

/**
 * Mysql configuration
 */

public class ConfigurationMysql { 

	private java.lang.String tmpdir;
	private java.util.Date lastUpdate;
	private boolean autoCommit;
	private long innodbBufferPoolSize;
	private long maxAllowedPacket;
	private long maxConnections;
	private boolean skipInnodb;

	public ConfigurationMysql() {
	}

	public java.lang.String getTmpdir() { 
		return this.tmpdir;
	} 

	public void setTmpdir(java.lang.String tmpdir) { 
		this.tmpdir = tmpdir;
	} 

	public ConfigurationMysql tmpdir(java.lang.String tmpdir) { 
		this.tmpdir = tmpdir;
		return this;
	} 

	public java.util.Date getLastUpdate() { 
		return this.lastUpdate;
	} 

	public void setLastUpdate(java.util.Date lastUpdate) { 
		this.lastUpdate = lastUpdate;
	} 

	public ConfigurationMysql lastUpdate(java.util.Date lastUpdate) { 
		this.lastUpdate = lastUpdate;
		return this;
	} 

	public boolean getAutoCommit() { 
		return this.autoCommit;
	} 

	public void setAutoCommit(boolean autoCommit) { 
		this.autoCommit = autoCommit;
	} 

	public ConfigurationMysql autoCommit(boolean autoCommit) { 
		this.autoCommit = autoCommit;
		return this;
	} 

	public long getInnodbBufferPoolSize() { 
		return this.innodbBufferPoolSize;
	} 

	public void setInnodbBufferPoolSize(long innodbBufferPoolSize) { 
		this.innodbBufferPoolSize = innodbBufferPoolSize;
	} 

	public ConfigurationMysql innodbBufferPoolSize(long innodbBufferPoolSize) { 
		this.innodbBufferPoolSize = innodbBufferPoolSize;
		return this;
	} 

	public long getMaxAllowedPacket() { 
		return this.maxAllowedPacket;
	} 

	public void setMaxAllowedPacket(long maxAllowedPacket) { 
		this.maxAllowedPacket = maxAllowedPacket;
	} 

	public ConfigurationMysql maxAllowedPacket(long maxAllowedPacket) { 
		this.maxAllowedPacket = maxAllowedPacket;
		return this;
	} 

	public long getMaxConnections() { 
		return this.maxConnections;
	} 

	public void setMaxConnections(long maxConnections) { 
		this.maxConnections = maxConnections;
	} 

	public ConfigurationMysql maxConnections(long maxConnections) { 
		this.maxConnections = maxConnections;
		return this;
	} 

	public boolean getSkipInnodb() { 
		return this.skipInnodb;
	} 

	public void setSkipInnodb(boolean skipInnodb) { 
		this.skipInnodb = skipInnodb;
	} 

	public ConfigurationMysql skipInnodb(boolean skipInnodb) { 
		this.skipInnodb = skipInnodb;
		return this;
	} 

}
