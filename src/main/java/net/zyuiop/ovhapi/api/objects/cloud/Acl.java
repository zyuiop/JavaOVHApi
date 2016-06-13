package net.zyuiop.ovhapi.api.objects.cloud;

/**
 * Cloud ACL
 */

public interface Acl { 

	/**
	 * @return OVH customer unique identifier
	 */
	java.lang.String getAccountId(); 

	/**
	 * @return ACL type
	 */
	java.lang.String getType(); 

}
