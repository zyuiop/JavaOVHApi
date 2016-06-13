package net.zyuiop.ovhapi.api.objects.dedicated;

/**
 * A structure describing properties customizables about this dedicated installation template
 */

public interface TemplateOsProperties { 

	/**
	 * @return Use the distribution's native kernel instead of the recommended OVH Kernel
	 */
	boolean getUseDistributionKernel(); 

	/**
	 * @return Name of the ssh key that should be installed. Password login will be disabled
	 */
	java.lang.String getSshKeyName(); 

	/**
	 * @return indicate the string returned by your postinstall customisation script on successful execution. Advice: your script should return a unique validation string in case of succes. A good example is "loh1Xee7eo OK OK OK UGh8Ang1Gu
	 */
	java.lang.String getPostInstallationScriptReturn(); 

	/**
	 * @return Template change log details
	 */
	java.lang.String getChangeLog(); 

	/**
	 * @return Indicate the URL where your postinstall customisation script is located
	 */
	java.lang.String getPostInstallationScriptLink(); 

	/**
	 * @return 
	 */
	long getRating(); 

	/**
	 * @return Set up the server using the provided hostname instead of the default hostname
	 */
	java.lang.String getCustomHostname(); 

}
