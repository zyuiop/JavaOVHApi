package net.zyuiop.ovhapi.api.objects.cloud.sshkey;

/**
 * SshKey
 */

public class SshKey { 

	private java.lang.String[] regions;
	private java.lang.String name;
	private java.lang.String id;
	private java.lang.String publicKey;

	public SshKey() {
	}

	public java.lang.String[] getRegions() { 
		return this.regions;
	} 

	public void setRegions(java.lang.String[] regions) { 
		this.regions = regions;
	} 

	public SshKey regions(java.lang.String[] regions) { 
		this.regions = regions;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public SshKey name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public java.lang.String getId() { 
		return this.id;
	} 

	public void setId(java.lang.String id) { 
		this.id = id;
	} 

	public SshKey id(java.lang.String id) { 
		this.id = id;
		return this;
	} 

	public java.lang.String getPublicKey() { 
		return this.publicKey;
	} 

	public void setPublicKey(java.lang.String publicKey) { 
		this.publicKey = publicKey;
	} 

	public SshKey publicKey(java.lang.String publicKey) { 
		this.publicKey = publicKey;
		return this;
	} 

}
