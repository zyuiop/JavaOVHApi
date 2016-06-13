package net.zyuiop.ovhapi.api.objects.vps;

/**
 * Informations about a VPS Veeam backups
 */

public interface Veeam { 

	/**
	 * @return Backup state
	 */
	boolean getBackup(); 

}
