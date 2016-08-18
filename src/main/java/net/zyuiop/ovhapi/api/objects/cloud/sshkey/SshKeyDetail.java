package net.zyuiop.ovhapi.api.objects.cloud.sshkey;

/**
 * SshKeyDetail
 */

public class SshKeyDetail { 

	private java.lang.String fingerPrint;
	private java.lang.String[] regions;
	private java.lang.String name;
	private java.lang.String id;
	private java.lang.String publicKey;

	public SshKeyDetail() {
	}

	public java.lang.String getFingerPrint() { 
		return this.fingerPrint;
	} 

	public void setFingerPrint(java.lang.String fingerPrint) { 
		this.fingerPrint = fingerPrint;
	} 

	public SshKeyDetail fingerPrint(java.lang.String fingerPrint) { 
		this.fingerPrint = fingerPrint;
		return this;
	} 

	public java.lang.String[] getRegions() { 
		return this.regions;
	} 

	public void setRegions(java.lang.String[] regions) { 
		this.regions = regions;
	} 

	public SshKeyDetail regions(java.lang.String[] regions) { 
		this.regions = regions;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public SshKeyDetail name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public java.lang.String getId() { 
		return this.id;
	} 

	public void setId(java.lang.String id) { 
		this.id = id;
	} 

	public SshKeyDetail id(java.lang.String id) { 
		this.id = id;
		return this;
	} 

	public java.lang.String getPublicKey() { 
		return this.publicKey;
	} 

	public void setPublicKey(java.lang.String publicKey) { 
		this.publicKey = publicKey;
	} 

	public SshKeyDetail publicKey(java.lang.String publicKey) { 
		this.publicKey = publicKey;
		return this;
	} 

}
