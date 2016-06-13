package net.zyuiop.ovhapi.api.objects.license;

/**
 * All versions available for Plesk products
 */

public interface OrderablePleskCompatibilityInfos { 

	/**
	 * @return null
	 */
	java.lang.String getCompliantLanguagePack(); 

	/**
	 * @return null
	 */
	java.lang.String getCompliantAntivirus(); 

	/**
	 * @return null
	 */
	java.lang.String getVersion(); 

	/**
	 * @return null
	 */
	java.lang.String getCompliantApplicationSets(); 

	/**
	 * @return null
	 */
	java.lang.String getPotentialProblems(); 

	/**
	 * @return null
	 */
	boolean getCanHavePowerPack(); 

	/**
	 * @return null
	 */
	java.lang.String getCompliantDomains(); 

	/**
	 * @return null
	 */
	boolean getCanHaveWordpressToolkit(); 

}
