package net.zyuiop.ovhapi.api.objects.email.exchange;

/**
 * Get public folder quota usage in total available space
 */

public interface PublicFolderQuota { 

	/**
	 * @return currently used space in MB within all public folders
	 */
	long getQuotaUsed(); 

	/**
	 * @return space in MB already reserved from the quota limit
	 */
	long getQuotaReserved(); 

	/**
	 * @return total amount of space in MB for public folders within organization
	 */
	long getQuotaLimit(); 

}
