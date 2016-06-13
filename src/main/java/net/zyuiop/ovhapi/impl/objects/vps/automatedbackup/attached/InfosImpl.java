package net.zyuiop.ovhapi.impl.objects.vps.automatedbackup.attached;

import net.zyuiop.ovhapi.api.objects.vps.automatedbackup.attached.Infos;
/**
 * A structure describing a backup's access informations
 */

public class InfosImpl implements Infos { 

	private java.lang.String smb;
	private java.lang.String nfs;
	private java.lang.String additionalDisk;

	public InfosImpl() {
	}

	public java.lang.String getSmb() { 
		return this.smb;
	} 

	public void setSmb(java.lang.String smb) { 
		this.smb = smb;
	} 

	public InfosImpl smb(java.lang.String smb) { 
		this.smb = smb;
		return this;
	} 

	public java.lang.String getNfs() { 
		return this.nfs;
	} 

	public void setNfs(java.lang.String nfs) { 
		this.nfs = nfs;
	} 

	public InfosImpl nfs(java.lang.String nfs) { 
		this.nfs = nfs;
		return this;
	} 

	public java.lang.String getAdditionalDisk() { 
		return this.additionalDisk;
	} 

	public void setAdditionalDisk(java.lang.String additionalDisk) { 
		this.additionalDisk = additionalDisk;
	} 

	public InfosImpl additionalDisk(java.lang.String additionalDisk) { 
		this.additionalDisk = additionalDisk;
		return this;
	} 

}
