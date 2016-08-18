package net.zyuiop.ovhapi.api.objects.domain;

/**
 * CurrentNameServer
 */

public class CurrentNameServer { 

	private boolean toDelete;
	private java.lang.String ip;
	private boolean isUsed;
	private long id;
	private java.lang.String host;

	public CurrentNameServer() {
	}

	public boolean getToDelete() { 
		return this.toDelete;
	} 

	public void setToDelete(boolean toDelete) { 
		this.toDelete = toDelete;
	} 

	public CurrentNameServer toDelete(boolean toDelete) { 
		this.toDelete = toDelete;
		return this;
	} 

	public java.lang.String getIp() { 
		return this.ip;
	} 

	public void setIp(java.lang.String ip) { 
		this.ip = ip;
	} 

	public CurrentNameServer ip(java.lang.String ip) { 
		this.ip = ip;
		return this;
	} 

	public boolean getIsUsed() { 
		return this.isUsed;
	} 

	public void setIsUsed(boolean isUsed) { 
		this.isUsed = isUsed;
	} 

	public CurrentNameServer isUsed(boolean isUsed) { 
		this.isUsed = isUsed;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public CurrentNameServer id(long id) { 
		this.id = id;
		return this;
	} 

	public java.lang.String getHost() { 
		return this.host;
	} 

	public void setHost(java.lang.String host) { 
		this.host = host;
	} 

	public CurrentNameServer host(java.lang.String host) { 
		this.host = host;
		return this;
	} 

}
