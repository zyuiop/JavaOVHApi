package net.zyuiop.ovhapi.impl.objects.vps.veeam;

import net.zyuiop.ovhapi.api.objects.vps.veeam.Infos;
/**
 * A structure describing a Veeam backup's access informations
 */

public class InfosImpl implements Infos { 

	private java.lang.String smb;
	private java.lang.String nfs;

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

}
