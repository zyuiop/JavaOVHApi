package net.zyuiop.ovhapi.api.objects.dedicated.server;

/**
 * Backup Ftp assigned to this server
 */

public class BackupFtp { 

	private net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue quota;
	private net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue usage;
	private java.lang.String ftpBackupName;
	private java.lang.String type;
	private java.util.Date readOnlyDate;

	public BackupFtp() {
	}

	public net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue getQuota() { 
		return this.quota;
	} 

	public void setQuota(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue quota) { 
		this.quota = quota;
	} 

	public BackupFtp quota(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue quota) { 
		this.quota = quota;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue getUsage() { 
		return this.usage;
	} 

	public void setUsage(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue usage) { 
		this.usage = usage;
	} 

	public BackupFtp usage(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue usage) { 
		this.usage = usage;
		return this;
	} 

	public java.lang.String getFtpBackupName() { 
		return this.ftpBackupName;
	} 

	public void setFtpBackupName(java.lang.String ftpBackupName) { 
		this.ftpBackupName = ftpBackupName;
	} 

	public BackupFtp ftpBackupName(java.lang.String ftpBackupName) { 
		this.ftpBackupName = ftpBackupName;
		return this;
	} 

	public java.lang.String getType() { 
		return this.type;
	} 

	public void setType(java.lang.String type) { 
		this.type = type;
	} 

	public BackupFtp type(java.lang.String type) { 
		this.type = type;
		return this;
	} 

	public java.util.Date getReadOnlyDate() { 
		return this.readOnlyDate;
	} 

	public void setReadOnlyDate(java.util.Date readOnlyDate) { 
		this.readOnlyDate = readOnlyDate;
	} 

	public BackupFtp readOnlyDate(java.util.Date readOnlyDate) { 
		this.readOnlyDate = readOnlyDate;
		return this;
	} 

}
