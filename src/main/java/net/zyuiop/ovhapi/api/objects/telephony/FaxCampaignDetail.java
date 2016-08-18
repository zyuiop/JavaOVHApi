package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Detail of a fax campaign
 */

public class FaxCampaignDetail { 

	private java.lang.String[] success;
	private java.lang.String[] failed;
	private java.lang.String[] todo;

	public FaxCampaignDetail() {
	}

	public java.lang.String[] getSuccess() { 
		return this.success;
	} 

	public void setSuccess(java.lang.String[] success) { 
		this.success = success;
	} 

	public FaxCampaignDetail success(java.lang.String[] success) { 
		this.success = success;
		return this;
	} 

	public java.lang.String[] getFailed() { 
		return this.failed;
	} 

	public void setFailed(java.lang.String[] failed) { 
		this.failed = failed;
	} 

	public FaxCampaignDetail failed(java.lang.String[] failed) { 
		this.failed = failed;
		return this;
	} 

	public java.lang.String[] getTodo() { 
		return this.todo;
	} 

	public void setTodo(java.lang.String[] todo) { 
		this.todo = todo;
	} 

	public FaxCampaignDetail todo(java.lang.String[] todo) { 
		this.todo = todo;
		return this;
	} 

}
