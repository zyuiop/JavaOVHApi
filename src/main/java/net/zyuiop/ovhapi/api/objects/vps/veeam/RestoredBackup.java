package net.zyuiop.ovhapi.api.objects.vps.veeam;

/**
 * Currently restored backup
 */

public class RestoredBackup { 

	private net.zyuiop.ovhapi.api.objects.vps.veeam.Infos accessInfos;
	private long restorePointId;
	private java.lang.String state;

	public RestoredBackup() {
	}

	public net.zyuiop.ovhapi.api.objects.vps.veeam.Infos getAccessInfos() { 
		return this.accessInfos;
	} 

	public void setAccessInfos(net.zyuiop.ovhapi.api.objects.vps.veeam.Infos accessInfos) { 
		this.accessInfos = accessInfos;
	} 

	public RestoredBackup accessInfos(net.zyuiop.ovhapi.api.objects.vps.veeam.Infos accessInfos) { 
		this.accessInfos = accessInfos;
		return this;
	} 

	public long getRestorePointId() { 
		return this.restorePointId;
	} 

	public void setRestorePointId(long restorePointId) { 
		this.restorePointId = restorePointId;
	} 

	public RestoredBackup restorePointId(long restorePointId) { 
		this.restorePointId = restorePointId;
		return this;
	} 

	public java.lang.String getState() { 
		return this.state;
	} 

	public void setState(java.lang.String state) { 
		this.state = state;
	} 

	public RestoredBackup state(java.lang.String state) { 
		this.state = state;
		return this;
	} 

}
