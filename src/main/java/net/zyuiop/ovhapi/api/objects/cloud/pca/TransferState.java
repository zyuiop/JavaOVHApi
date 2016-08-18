package net.zyuiop.ovhapi.api.objects.cloud.pca;

/**
 * State of the request to transfer a PCA offer to Object Storage
 */

public class TransferState { 

	private java.lang.String projectId;
	private java.util.Date transferDate;
	private long[] agreements;
	private java.lang.String state;

	public TransferState() {
	}

	public java.lang.String getProjectId() { 
		return this.projectId;
	} 

	public void setProjectId(java.lang.String projectId) { 
		this.projectId = projectId;
	} 

	public TransferState projectId(java.lang.String projectId) { 
		this.projectId = projectId;
		return this;
	} 

	public java.util.Date getTransferDate() { 
		return this.transferDate;
	} 

	public void setTransferDate(java.util.Date transferDate) { 
		this.transferDate = transferDate;
	} 

	public TransferState transferDate(java.util.Date transferDate) { 
		this.transferDate = transferDate;
		return this;
	} 

	public long[] getAgreements() { 
		return this.agreements;
	} 

	public void setAgreements(long[] agreements) { 
		this.agreements = agreements;
	} 

	public TransferState agreements(long[] agreements) { 
		this.agreements = agreements;
		return this;
	} 

	public java.lang.String getState() { 
		return this.state;
	} 

	public void setState(java.lang.String state) { 
		this.state = state;
	} 

	public TransferState state(java.lang.String state) { 
		this.state = state;
		return this;
	} 

}
