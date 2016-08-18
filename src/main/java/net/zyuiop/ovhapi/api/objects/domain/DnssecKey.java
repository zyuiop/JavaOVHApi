package net.zyuiop.ovhapi.api.objects.domain;

/**
 * Domain's DNSSEC Key
 */

public class DnssecKey { 

	private long algorithm;
	private long flags;
	private java.lang.String status;
	private long id;
	private long tag;
	private java.lang.String publicKey;

	public DnssecKey() {
	}

	public long getAlgorithm() { 
		return this.algorithm;
	} 

	public void setAlgorithm(long algorithm) { 
		this.algorithm = algorithm;
	} 

	public DnssecKey algorithm(long algorithm) { 
		this.algorithm = algorithm;
		return this;
	} 

	public long getFlags() { 
		return this.flags;
	} 

	public void setFlags(long flags) { 
		this.flags = flags;
	} 

	public DnssecKey flags(long flags) { 
		this.flags = flags;
		return this;
	} 

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public DnssecKey status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public DnssecKey id(long id) { 
		this.id = id;
		return this;
	} 

	public long getTag() { 
		return this.tag;
	} 

	public void setTag(long tag) { 
		this.tag = tag;
	} 

	public DnssecKey tag(long tag) { 
		this.tag = tag;
		return this;
	} 

	public java.lang.String getPublicKey() { 
		return this.publicKey;
	} 

	public void setPublicKey(java.lang.String publicKey) { 
		this.publicKey = publicKey;
	} 

	public DnssecKey publicKey(java.lang.String publicKey) { 
		this.publicKey = publicKey;
		return this;
	} 

}
