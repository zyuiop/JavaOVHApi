package net.zyuiop.ovhapi.api.objects.cloud.pca;

/**
 * Openstack swift credentials for your PCA offer
 */

public interface DownloadCredentials { 

	/**
	 * @return Openstack tenant name
	 */
	java.lang.String getTenantName(); 

	/**
	 * @return Openstack region name
	 */
	java.lang.String getRegion(); 

	/**
	 * @return Openstack swift container name
	 */
	java.lang.String getContainer(); 

	/**
	 * @return Openstack user login
	 */
	java.lang.String getLogin(); 

	/**
	 * @return Openstack tenant id
	 */
	java.lang.String getTenantId(); 

	/**
	 * @return Openstack user password
	 */
	java.lang.String getPassword(); 

	/**
	 * @return Openstack storage URL
	 */
	java.lang.String getStorageEndpoint(); 

	/**
	 * @return Openstack authentication URL
	 */
	java.lang.String getAuthEndpoint(); 

}
