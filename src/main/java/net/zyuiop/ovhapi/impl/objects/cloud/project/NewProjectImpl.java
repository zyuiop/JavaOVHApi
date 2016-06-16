package net.zyuiop.ovhapi.impl.objects.cloud.project;

import net.zyuiop.ovhapi.api.objects.cloud.project.NewProject;
/**
 * New cloud project
 */

public class NewProjectImpl implements NewProject { 

	private long orderId;
	private java.lang.String status;
	private java.lang.String project;
	private net.zyuiop.ovhapi.impl.objects.cloud.project.NewProjectCreditImpl credit;
	private long[] agreements;
	private java.lang.String description;

	public NewProjectImpl() {
	}

	public long getOrderId() { 
		return this.orderId;
	} 

	public void setOrderId(long orderId) { 
		this.orderId = orderId;
	} 

	public NewProjectImpl orderId(long orderId) { 
		this.orderId = orderId;
		return this;
	} 

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public NewProjectImpl status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public java.lang.String getProject() { 
		return this.project;
	} 

	public void setProject(java.lang.String project) { 
		this.project = project;
	} 

	public NewProjectImpl project(java.lang.String project) { 
		this.project = project;
		return this;
	} 

	public net.zyuiop.ovhapi.impl.objects.cloud.project.NewProjectCreditImpl getCredit() { 
		return this.credit;
	} 

	public void setCredit(net.zyuiop.ovhapi.impl.objects.cloud.project.NewProjectCreditImpl credit) { 
		this.credit = credit;
	} 

	public NewProjectImpl credit(net.zyuiop.ovhapi.impl.objects.cloud.project.NewProjectCreditImpl credit) { 
		this.credit = credit;
		return this;
	} 

	public long[] getAgreements() { 
		return this.agreements;
	} 

	public void setAgreements(long[] agreements) { 
		this.agreements = agreements;
	} 

	public NewProjectImpl agreements(long[] agreements) { 
		this.agreements = agreements;
		return this;
	} 

	public java.lang.String getDescription() { 
		return this.description;
	} 

	public void setDescription(java.lang.String description) { 
		this.description = description;
	} 

	public NewProjectImpl description(java.lang.String description) { 
		this.description = description;
		return this;
	} 

}
