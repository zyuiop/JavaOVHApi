package net.zyuiop.ovhapi.api.objects.vps;

/**
 * Informations about a VPS Veeam backups
 */

public class Veeam { 

	private boolean backup;

	public Veeam() {
	}

	public boolean getBackup() { 
		return this.backup;
	} 

	public void setBackup(boolean backup) { 
		this.backup = backup;
	} 

	public Veeam backup(boolean backup) { 
		this.backup = backup;
		return this;
	} 

}
