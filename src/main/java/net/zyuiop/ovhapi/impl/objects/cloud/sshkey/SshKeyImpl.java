package net.zyuiop.ovhapi.impl.objects.cloud.sshkey;

import net.zyuiop.ovhapi.api.objects.cloud.sshkey.SshKey;
/**
 * SshKey
 */

public class SshKeyImpl implements SshKey { 

	private java.lang.String regions;
	private java.lang.String name;
	private java.lang.String id;
	private java.lang.String publicKey;

	public SshKeyImpl() {
	}

	public java.lang.String getRegions() { 
		return this.regions;
	} 

	public void setRegions(java.lang.String regions) { 
		this.regions = regions;
	} 

	public SshKeyImpl regions(java.lang.String regions) { 
		this.regions = regions;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public SshKeyImpl name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public java.lang.String getId() { 
		return this.id;
	} 

	public void setId(java.lang.String id) { 
		this.id = id;
	} 

	public SshKeyImpl id(java.lang.String id) { 
		this.id = id;
		return this;
	} 

	public java.lang.String getPublicKey() { 
		return this.publicKey;
	} 

	public void setPublicKey(java.lang.String publicKey) { 
		this.publicKey = publicKey;
	} 

	public SshKeyImpl publicKey(java.lang.String publicKey) { 
		this.publicKey = publicKey;
		return this;
	} 

}
