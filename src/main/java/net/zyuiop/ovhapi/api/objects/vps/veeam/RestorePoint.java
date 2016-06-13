package net.zyuiop.ovhapi.api.objects.vps.veeam;

/**
 * Informations about a VPS Veeam restore points
 */

public interface RestorePoint { 

	/**
	 * @return The restore point's creation time
	 */
	java.util.Date getCreationTime(); 

	/**
	 * @return The restore point's id
	 */
	long getId(); 

}
