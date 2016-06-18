package net.zyuiop.ovhapi.api.objects.vps;

/**
 * Installation template for a VPS Virtual Machine
 */

public interface Template { 

	/**
	 * @return null
	 */
	long getBitFormat(); 

	/**
	 * @return null
	 */
	java.lang.String getName(); 

	/**
	 * @return null
	 */
	long getId(); 

	/**
	 * @return null
	 */
	java.lang.String getLocale(); 

	/**
	 * @return null
	 */
	java.lang.String[] getAvailableLanguage(); 

	/**
	 * @return null
	 */
	java.lang.String getDistribution(); 

}
