package net.zyuiop.ovhapi.api.objects.cloud.pca;

/**
 * State of the request to transfer a PCA offer to Object Storage
 */

public interface TransferState { 

	/**
	 * @return Cloud project id
	 */
	java.lang.String getProjectId(); 

	/**
	 * @return Transfer request date
	 */
	java.util.Date getTransferDate(); 

	/**
	 * @return Agreements pending for approval
	 */
	long[] getAgreements(); 

	/**
	 * @return Transfer state
	 */
	java.lang.String getState(); 

}
