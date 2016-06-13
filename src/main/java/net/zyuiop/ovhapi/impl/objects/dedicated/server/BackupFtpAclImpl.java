package net.zyuiop.ovhapi.impl.objects.dedicated.server;

import net.zyuiop.ovhapi.api.objects.dedicated.server.BackupFtpAcl;
/**
 * Backup Ftp ACL for this server and Backup Ftp
 */

public class BackupFtpAclImpl implements BackupFtpAcl { 

	private java.lang.String ipBlock;
	private boolean ftp;
	private java.util.Date lastUpdate;
	private boolean nfs;
	private boolean isApplied;
	private boolean cifs;

	public BackupFtpAclImpl() {
	}

	public java.lang.String getIpBlock() { 
		return this.ipBlock;
	} 

	public void setIpBlock(java.lang.String ipBlock) { 
		this.ipBlock = ipBlock;
	} 

	public BackupFtpAclImpl ipBlock(java.lang.String ipBlock) { 
		this.ipBlock = ipBlock;
		return this;
	} 

	public boolean getFtp() { 
		return this.ftp;
	} 

	public void setFtp(boolean ftp) { 
		this.ftp = ftp;
	} 

	public BackupFtpAclImpl ftp(boolean ftp) { 
		this.ftp = ftp;
		return this;
	} 

	public java.util.Date getLastUpdate() { 
		return this.lastUpdate;
	} 

	public void setLastUpdate(java.util.Date lastUpdate) { 
		this.lastUpdate = lastUpdate;
	} 

	public BackupFtpAclImpl lastUpdate(java.util.Date lastUpdate) { 
		this.lastUpdate = lastUpdate;
		return this;
	} 

	public boolean getNfs() { 
		return this.nfs;
	} 

	public void setNfs(boolean nfs) { 
		this.nfs = nfs;
	} 

	public BackupFtpAclImpl nfs(boolean nfs) { 
		this.nfs = nfs;
		return this;
	} 

	public boolean getIsApplied() { 
		return this.isApplied;
	} 

	public void setIsApplied(boolean isApplied) { 
		this.isApplied = isApplied;
	} 

	public BackupFtpAclImpl isApplied(boolean isApplied) { 
		this.isApplied = isApplied;
		return this;
	} 

	public boolean getCifs() { 
		return this.cifs;
	} 

	public void setCifs(boolean cifs) { 
		this.cifs = cifs;
	} 

	public BackupFtpAclImpl cifs(boolean cifs) { 
		this.cifs = cifs;
		return this;
	} 

}
