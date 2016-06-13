package net.zyuiop.ovhapi.api.objects.vps.veeam;

/**
 * A structure describing a Veeam backup's access informations
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

}
