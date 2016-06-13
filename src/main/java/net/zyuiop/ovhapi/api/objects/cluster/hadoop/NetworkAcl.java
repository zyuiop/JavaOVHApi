package net.zyuiop.ovhapi.api.objects.cluster.hadoop;

/**
 * ACL for allowing ip blocks to access to your cluster
 */

public interface NetworkAcl { 

	/**
	 * @return IP Block to allow
	 */
	java.lang.String getBlock(); 

	/**
	 * @return description of this ACL
	 */
	java.lang.String getDescription(); 

	/**
	 * @return State of the NetworkAcl.
	 */
	java.lang.String getState(); 

}
