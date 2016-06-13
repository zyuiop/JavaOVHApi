package net.zyuiop.ovhapi.api.objects.email.exchange;

/**
 * Get shared account quota usage in total available space
 */

public interface SharedAccountQuota { 

	/**
	 * @return currently used space in KB within all shared accounts
	 */
	long getQuotaUsed(); 

	/**
	 * @return space in MB already reserved from the quota limit
	 */
	long getQuotaReserved(); 

	/**
	 * @return total amount of space in MB for shared accounts within organization
	 */
	long getQuotaLimit(); 

}
