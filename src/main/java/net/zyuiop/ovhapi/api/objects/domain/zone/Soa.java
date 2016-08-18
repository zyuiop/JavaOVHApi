package net.zyuiop.ovhapi.api.objects.domain.zone;

/**
 * Zone Start Of Authority
 */

public class Soa { 

	private java.lang.String email;
	private long nxDomainTtl;
	private long refresh;
	private long ttl;
	private long serial;
	private java.lang.String server;
	private long expire;

	public Soa() {
	}

	public java.lang.String getEmail() { 
		return this.email;
	} 

	public void setEmail(java.lang.String email) { 
		this.email = email;
	} 

	public Soa email(java.lang.String email) { 
		this.email = email;
		return this;
	} 

	public long getNxDomainTtl() { 
		return this.nxDomainTtl;
	} 

	public void setNxDomainTtl(long nxDomainTtl) { 
		this.nxDomainTtl = nxDomainTtl;
	} 

	public Soa nxDomainTtl(long nxDomainTtl) { 
		this.nxDomainTtl = nxDomainTtl;
		return this;
	} 

	public long getRefresh() { 
		return this.refresh;
	} 

	public void setRefresh(long refresh) { 
		this.refresh = refresh;
	} 

	public Soa refresh(long refresh) { 
		this.refresh = refresh;
		return this;
	} 

	public long getTtl() { 
		return this.ttl;
	} 

	public void setTtl(long ttl) { 
		this.ttl = ttl;
	} 

	public Soa ttl(long ttl) { 
		this.ttl = ttl;
		return this;
	} 

	public long getSerial() { 
		return this.serial;
	} 

	public void setSerial(long serial) { 
		this.serial = serial;
	} 

	public Soa serial(long serial) { 
		this.serial = serial;
		return this;
	} 

	public java.lang.String getServer() { 
		return this.server;
	} 

	public void setServer(java.lang.String server) { 
		this.server = server;
	} 

	public Soa server(java.lang.String server) { 
		this.server = server;
		return this;
	} 

	public long getExpire() { 
		return this.expire;
	} 

	public void setExpire(long expire) { 
		this.expire = expire;
	} 

	public Soa expire(long expire) { 
		this.expire = expire;
		return this;
	} 

}
