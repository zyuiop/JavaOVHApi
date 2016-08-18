package net.zyuiop.ovhapi.api.objects.dnssec;

/**
 * Key type
 */

public class Key { 

	private long algorithm;
	private long flags;
	private long tag;
	private java.lang.String publicKey;

	public Key() {
	}

	public long getAlgorithm() { 
		return this.algorithm;
	} 

	public void setAlgorithm(long algorithm) { 
		this.algorithm = algorithm;
	} 

	public Key algorithm(long algorithm) { 
		this.algorithm = algorithm;
		return this;
	} 

	public long getFlags() { 
		return this.flags;
	} 

	public void setFlags(long flags) { 
		this.flags = flags;
	} 

	public Key flags(long flags) { 
		this.flags = flags;
		return this;
	} 

	public long getTag() { 
		return this.tag;
	} 

	public void setTag(long tag) { 
		this.tag = tag;
	} 

	public Key tag(long tag) { 
		this.tag = tag;
		return this;
	} 

	public java.lang.String getPublicKey() { 
		return this.publicKey;
	} 

	public void setPublicKey(java.lang.String publicKey) { 
		this.publicKey = publicKey;
	} 

	public Key publicKey(java.lang.String publicKey) { 
		this.publicKey = publicKey;
		return this;
	} 

}
