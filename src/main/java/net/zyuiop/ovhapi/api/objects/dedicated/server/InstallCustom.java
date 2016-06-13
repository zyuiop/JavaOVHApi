package net.zyuiop.ovhapi.api.objects.dedicated.server;

/**
 * A structure describing informations about installation custom
 */

public interface InstallCustom { 

	/**
	 * @return true if you want to install only on the first disk
	 */
	boolean getNoRaid(); 

	/**
	 * @return The name of ssh key to install
	 */
	java.lang.String getSshKeyName(); 

	/**
	 * @return install language for ovh install choice
	 */
	java.lang.String getLanguage(); 

	/**
	 * @return true if you want to install windows with your spla license
	 */
	boolean getUseSpla(); 

	/**
	 * @return the url to your custom install script
	 */
	java.lang.String getPostInstallationScriptLink(); 

	/**
	 * @return Personnal hostname to use in server reinstallation
	 */
	java.lang.String getCustomHostname(); 

	/**
	 * @return true if you want to install windows with sql feature
	 */
	boolean getInstallSqlServer(); 

	/**
	 * @return  the return of your script if everythings ok. Advice: your script should return a unique validation string in case of succes. A good example is "loh1Xee7eo OK OK OK UGh8Ang1Gu
	 */
	java.lang.String getPostInstallationScriptReturn(); 

	/**
	 * @return true if you want to install with distrib kernel
	 */
	boolean getUseDistribKernel(); 

	/**
	 * @return Number of devices to use for system's software RAID
	 */
	long getSoftRaidDevices(); 

}
