package net.zyuiop.ovhapi.api.objects.vps.veeam;

/**
 * A structure describing a Veeam backup's access informations
 */

public class Infos { 

	private java.lang.String smb;
	private java.lang.String nfs;

	public Infos() {
	}

	public java.lang.String getSmb() { 
		return this.smb;
	} 

	public void setSmb(java.lang.String smb) { 
		this.smb = smb;
	} 

	public Infos smb(java.lang.String smb) { 
		this.smb = smb;
		return this;
	} 

	public java.lang.String getNfs() { 
		return this.nfs;
	} 

	public void setNfs(java.lang.String nfs) { 
		this.nfs = nfs;
	} 

	public Infos nfs(java.lang.String nfs) { 
		this.nfs = nfs;
		return this;
	} 

}
