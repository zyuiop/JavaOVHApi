package net.zyuiop.ovhapi.api.methods.dedicated;

/**
 * A class to interact with OVH's /dedicated/installationTemplate APIs
 */

public interface InstallationTemplate { 

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param templateName This template name
	 * @param schemeName name of this partitioning scheme
	*/
	net.zyuiop.ovhapi.api.objects.dedicated.installationtemplate.TemplatePartitioningSchemes getTemplateNamePartitionSchemeSchemeName(java.lang.String templateName, java.lang.String schemeName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param templateName This template name
	*/
	net.zyuiop.ovhapi.api.objects.dedicated.installationtemplate.Templates getTemplateName(java.lang.String templateName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param templateName This template name
	 * @param schemeName name of this partitioning scheme
	 * @param name Hardware RAID name
	*/
	net.zyuiop.ovhapi.api.objects.dedicated.installationtemplate.HardwareRaid getTemplateNamePartitionSchemeSchemeNameHardwareRaidName(java.lang.String templateName, java.lang.String schemeName, java.lang.String name) throws java.io.IOException;

	/**
	 * Hardware RAIDs defined in this partitioning scheme
	 * Facultative parameters ? false
	 * @param templateName This template name
	 * @param schemeName name of this partitioning scheme
	*/
	java.lang.String[] getTemplateNamePartitionSchemeSchemeNameHardwareRaid(java.lang.String templateName, java.lang.String schemeName) throws java.io.IOException;

	/**
	 * Partitions defined in this partitioning scheme
	 * Facultative parameters ? false
	 * @param templateName This template name
	 * @param schemeName name of this partitioning scheme
	*/
	java.lang.String[] getTemplateNamePartitionSchemeSchemeNamePartition(java.lang.String templateName, java.lang.String schemeName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param templateName This template name
	 * @param schemeName name of this partitioning scheme
	 * @param mountpoint partition mount point
	*/
	net.zyuiop.ovhapi.api.objects.dedicated.installationtemplate.TemplatePartitions getTemplateNamePartitionSchemeSchemeNamePartitionMountpoint(java.lang.String templateName, java.lang.String schemeName, java.lang.String mountpoint) throws java.io.IOException;

	/**
	 * OVH operating system installation templates
	 * Facultative parameters ? false
	*/
	java.lang.String[] getDedicatedInstallationTemplate() throws java.io.IOException;

	/**
	 * Partitioning schemes available on this template
	 * Facultative parameters ? false
	 * @param templateName This template name
	*/
	java.lang.String[] getTemplateNamePartitionScheme(java.lang.String templateName) throws java.io.IOException;

}
