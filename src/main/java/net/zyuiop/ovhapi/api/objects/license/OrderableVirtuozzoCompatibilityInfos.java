package net.zyuiop.ovhapi.api.objects.license;

/**
 * All versions available for Virtuozzo products
 */

public interface OrderableVirtuozzoCompatibilityInfos { 

	/**
	 * @return null
	 */
	java.lang.String getVersion(); 

	/**
	 * @return null
	 */
	java.lang.String[] getCompliantContainers(); 

	/**
	 * @return null
	 */
	java.lang.String[] getPotentialProblems(); 

}
