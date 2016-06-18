package net.zyuiop.ovhapi.api.objects.pack.xdsl.migration;

/**
 * Sub service to delete
 */

public interface SubServiceToDelete { 

	/**
	 * @return Number of services to be deleted
	 */
	long getNumberToDelete(); 

	/**
	 * @return List of domains of sub services
	 */
	java.lang.String[] getServices(); 

	/**
	 * @return Type of service to be deleted
	 */
	java.lang.String getType(); 

}
