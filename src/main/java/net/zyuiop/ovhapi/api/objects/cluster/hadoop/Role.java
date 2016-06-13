package net.zyuiop.ovhapi.api.objects.cluster.hadoop;

/**
 * Role (ie set of Hadoop services) of the Node
 */

public interface Role { 

	/**
	 * @return ID of the Role
	 */
	long getId(); 

	/**
	 * @return Role name
	 */
	java.lang.String getType(); 

}
