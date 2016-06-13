package net.zyuiop.ovhapi.api.objects.dedicated.installationtemplate;

/**
 * Partitioning schemes available on this template
 */

public interface TemplatePartitioningSchemes { 

	/**
	 * @return on a reinstall, if a partitioning scheme is not specified, the one with the higher priority will be used by default, among all the compatible partitioning schemes (given the underlying hardware specifications)
	 */
	long getPriority(); 

	/**
	 * @return name of this partitioning scheme
	 */
	java.lang.String getName(); 

}
