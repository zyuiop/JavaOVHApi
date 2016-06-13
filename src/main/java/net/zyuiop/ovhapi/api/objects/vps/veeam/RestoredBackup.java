package net.zyuiop.ovhapi.api.objects.vps.veeam;

/**
 * Currently restored backup
 */

public interface RestoredBackup { 

	/**
	 * @return Backup access informations
	 */
	net.zyuiop.ovhapi.api.objects.vps.veeam.Infos getAccessInfos(); 

	/**
	 * @return The restore point id
	 */
	long getRestorePointId(); 

	/**
	 * @return The restored backup state
	 */
	java.lang.String getState(); 

}
