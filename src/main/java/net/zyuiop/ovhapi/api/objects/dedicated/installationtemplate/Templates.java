package net.zyuiop.ovhapi.api.objects.dedicated.installationtemplate;

/**
 * Available installation templates
 */

public interface Templates { 

	/**
	 * @return This distribution supports installation using the distribution's native kernel instead of the recommended OVH kernel
	 */
	boolean getSupportsDistributionKernel(); 

	/**
	 * @return this template  bit format
	 */
	long getBitFormat(); 

	/**
	 * @return This template name
	 */
	java.lang.String getTemplateName(); 

	/**
	 * @return the default language of this template
	 */
	java.lang.String getDefaultLanguage(); 

	/**
	 * @return category of this template (informative only)
	 */
	java.lang.String getCategory(); 

	/**
	 * @return list of all language available for this template
	 */
	java.lang.String[] getAvailableLanguages(); 

	/**
	 * @return Date of last modification of the base image
	 */
	java.util.Date getLastModification(); 

	/**
	 * @return This distribution is new, and although tested and functional, may still display odd behaviour
	 */
	boolean getBeta(); 

	/**
	 * @return Customizable template properties 
	 */
	net.zyuiop.ovhapi.api.objects.dedicated.TemplateOsProperties getCustomization(); 

	/**
	 * @return information about this template
	 */
	java.lang.String getDescription(); 

	/**
	 * @return the distribution this template is based on
	 */
	java.lang.String getDistribution(); 

	/**
	 * @return This distribution supports the GUID Partition Table (GPT), providing up to 128 partitions that can have more than 2 TB
	 */
	boolean getSupportsGptLabel(); 

	/**
	 * @return is this distribution deprecated
	 */
	boolean getDeprecated(); 

	/**
	 * @return This distribution supports the microsoft SQL server
	 */
	boolean getSupportsSqlServer(); 

	/**
	 * @return list of all filesystems  available for this template
	 */
	java.lang.String[] getFilesystems(); 

	/**
	 * @return This distribution supports Logical Volumes (Linux LVM)
	 */
	boolean getLvmReady(); 

	/**
	 * @return this template family type
	 */
	java.lang.String getFamily(); 

}
