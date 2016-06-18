package net.zyuiop.ovhapi.impl.objects.telephony;

import net.zyuiop.ovhapi.api.objects.telephony.FaxCampaignDetail;
/**
 * Detail of a fax campaign
 */

public class FaxCampaignDetailImpl implements FaxCampaignDetail { 

	private java.lang.String[] success;
	private java.lang.String[] failed;
	private java.lang.String[] todo;

	public FaxCampaignDetailImpl() {
	}

	public java.lang.String[] getSuccess() { 
		return this.success;
	} 

	public void setSuccess(java.lang.String[] success) { 
		this.success = success;
	} 

	public FaxCampaignDetailImpl success(java.lang.String[] success) { 
		this.success = success;
		return this;
	} 

	public java.lang.String[] getFailed() { 
		return this.failed;
	} 

	public void setFailed(java.lang.String[] failed) { 
		this.failed = failed;
	} 

	public FaxCampaignDetailImpl failed(java.lang.String[] failed) { 
		this.failed = failed;
		return this;
	} 

	public java.lang.String[] getTodo() { 
		return this.todo;
	} 

	public void setTodo(java.lang.String[] todo) { 
		this.todo = todo;
	} 

	public FaxCampaignDetailImpl todo(java.lang.String[] todo) { 
		this.todo = todo;
		return this;
	} 

}
