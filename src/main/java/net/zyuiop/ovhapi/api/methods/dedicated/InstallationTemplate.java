package net.zyuiop.ovhapi.api.methods.dedicated;

/**
 * A class to interact with OVH's /dedicated/installationTemplate APIs
 */

public interface InstallationTemplate { 



	/**
	 * Partitions defined in this partitioning scheme
	 * Facultative parameters ? false
	 * @param templateName This template name
	 * @param schemeName name of this partitioning scheme
	*/
	java.lang.String[] getTemplateNamePartitionSchemeSchemeNamePartition(java.lang.String templateName, java.lang.String schemeName) throws java.io.IOException;

	/**
	 * Hardware RAIDs defined in this partitioning scheme
	 * Facultative parameters ? false
	 * @param templateName This template name
	 * @param schemeName name of this partitioning scheme
	*/
	java.lang.String[] getTemplateNamePartitionSchemeSchemeNameHardwareRaid(java.lang.String templateName, java.lang.String schemeName) throws java.io.IOException;



	/**
	 * Partitioning schemes available on this template
	 * Facultative parameters ? false
	 * @param templateName This template name
	*/
	java.lang.String[] getTemplateNamePartitionScheme(java.lang.String templateName) throws java.io.IOException;

	/**
	 * OVH operating system installation templates
	 * Facultative parameters ? false
	*/
	java.lang.String[] getDedicatedInstallationTemplate() throws java.io.IOException;

}
