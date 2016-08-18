package net.zyuiop.ovhapi.api.objects.vps.automatedbackup.attached;

/**
 * A structure describing a backup's access informations
 */

public class Infos { 

	private java.lang.String smb;
	private java.lang.String nfs;
	private java.lang.String additionalDisk;

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

	public java.lang.String getAdditionalDisk() { 
		return this.additionalDisk;
	} 

	public void setAdditionalDisk(java.lang.String additionalDisk) { 
		this.additionalDisk = additionalDisk;
	} 

	public Infos additionalDisk(java.lang.String additionalDisk) { 
		this.additionalDisk = additionalDisk;
		return this;
	} 

}
