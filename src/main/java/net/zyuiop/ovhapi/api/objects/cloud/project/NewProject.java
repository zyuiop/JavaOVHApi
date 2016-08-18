package net.zyuiop.ovhapi.api.objects.cloud.project;

/**
 * New cloud project
 */

public class NewProject { 

	private long orderId;
	private java.lang.String status;
	private java.lang.String project;
	private net.zyuiop.ovhapi.api.objects.cloud.project.NewProjectCredit credit;
	private long[] agreements;
	private java.lang.String description;

	public NewProject() {
	}

	public long getOrderId() { 
		return this.orderId;
	} 

	public void setOrderId(long orderId) { 
		this.orderId = orderId;
	} 

	public NewProject orderId(long orderId) { 
		this.orderId = orderId;
		return this;
	} 

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public NewProject status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public java.lang.String getProject() { 
		return this.project;
	} 

	public void setProject(java.lang.String project) { 
		this.project = project;
	} 

	public NewProject project(java.lang.String project) { 
		this.project = project;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.cloud.project.NewProjectCredit getCredit() { 
		return this.credit;
	} 

	public void setCredit(net.zyuiop.ovhapi.api.objects.cloud.project.NewProjectCredit credit) { 
		this.credit = credit;
	} 

	public NewProject credit(net.zyuiop.ovhapi.api.objects.cloud.project.NewProjectCredit credit) { 
		this.credit = credit;
		return this;
	} 

	public long[] getAgreements() { 
		return this.agreements;
	} 

	public void setAgreements(long[] agreements) { 
		this.agreements = agreements;
	} 

	public NewProject agreements(long[] agreements) { 
		this.agreements = agreements;
		return this;
	} 

	public java.lang.String getDescription() { 
		return this.description;
	} 

	public void setDescription(java.lang.String description) { 
		this.description = description;
	} 

	public NewProject description(java.lang.String description) { 
		this.description = description;
		return this;
	} 

}
