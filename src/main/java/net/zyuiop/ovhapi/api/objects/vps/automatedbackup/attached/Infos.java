package net.zyuiop.ovhapi.api.objects.vps.automatedbackup.attached;

/**
 * A structure describing a backup's access informations
 */

public interface Infos { 

	/**
	 * @return SMB URL of the backup
	 */
	java.lang.String getSmb(); 

	/**
	 * @return NFS URL of the backup
	 */
	java.lang.String getNfs(); 

	/**
	 * @return Additional Disk details
	 */
	java.lang.String getAdditionalDisk(); 

}
