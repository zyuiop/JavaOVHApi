package net.zyuiop.ovhapi.impl.objects.vps;

import net.zyuiop.ovhapi.api.objects.vps.Veeam;
/**
 * Informations about a VPS Veeam backups
 */

public class VeeamImpl implements Veeam { 

	private boolean backup;

	public VeeamImpl() {
	}

	public boolean getBackup() { 
		return this.backup;
	} 

	public void setBackup(boolean backup) { 
		this.backup = backup;
	} 

	public VeeamImpl backup(boolean backup) { 
		this.backup = backup;
		return this;
	} 

}
