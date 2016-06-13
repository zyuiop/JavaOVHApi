package net.zyuiop.ovhapi.impl.objects.vps.veeam;

import net.zyuiop.ovhapi.api.objects.vps.veeam.RestoredBackup;
/**
 * Currently restored backup
 */

public class RestoredBackupImpl implements RestoredBackup { 

	private net.zyuiop.ovhapi.api.objects.vps.veeam.Infos accessInfos;
	private long restorePointId;
	private java.lang.String state;

	public RestoredBackupImpl() {
	}

	public net.zyuiop.ovhapi.api.objects.vps.veeam.Infos getAccessInfos() { 
		return this.accessInfos;
	} 

	public void setAccessInfos(net.zyuiop.ovhapi.api.objects.vps.veeam.Infos accessInfos) { 
		this.accessInfos = accessInfos;
	} 

	public RestoredBackupImpl accessInfos(net.zyuiop.ovhapi.api.objects.vps.veeam.Infos accessInfos) { 
		this.accessInfos = accessInfos;
		return this;
	} 

	public long getRestorePointId() { 
		return this.restorePointId;
	} 

	public void setRestorePointId(long restorePointId) { 
		this.restorePointId = restorePointId;
	} 

	public RestoredBackupImpl restorePointId(long restorePointId) { 
		this.restorePointId = restorePointId;
		return this;
	} 

	public java.lang.String getState() { 
		return this.state;
	} 

	public void setState(java.lang.String state) { 
		this.state = state;
	} 

	public RestoredBackupImpl state(java.lang.String state) { 
		this.state = state;
		return this;
	} 

}
