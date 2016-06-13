package net.zyuiop.ovhapi.api.objects.dedicated.server;

/**
 * Backup Ftp ACL for this server and Backup Ftp
 */

public interface BackupFtpAcl { 

	/**
	 * @return The IP Block specific to this ACL
	 */
	java.lang.String getIpBlock(); 

	/**
	 * @return Wether to allow the FTP protocol for this ACL
	 */
	boolean getFtp(); 

	/**
	 * @return Date of the last object modification
	 */
	java.util.Date getLastUpdate(); 

	/**
	 * @return Wether to allow the NFS protocol for this ACL
	 */
	boolean getNfs(); 

	/**
	 * @return Whether the rule has been applied on the Backup Ftp
	 */
	boolean getIsApplied(); 

	/**
	 * @return Wether to allow the CIFS (SMB) protocol for this ACL
	 */
	boolean getCifs(); 

}
