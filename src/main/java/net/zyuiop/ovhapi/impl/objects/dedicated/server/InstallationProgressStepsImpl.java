package net.zyuiop.ovhapi.impl.objects.dedicated.server;

import net.zyuiop.ovhapi.api.objects.dedicated.server.InstallationProgressSteps;
/**
 * A structure describing informations about this dedicated server installation steps
 */

public class InstallationProgressStepsImpl implements InstallationProgressSteps { 

	private java.lang.String comment;
	private java.lang.String status;
	private java.lang.String error;

	public InstallationProgressStepsImpl() {
	}

	public java.lang.String getComment() { 
		return this.comment;
	} 

	public void setComment(java.lang.String comment) { 
		this.comment = comment;
	} 

	public InstallationProgressStepsImpl comment(java.lang.String comment) { 
		this.comment = comment;
		return this;
	} 

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public InstallationProgressStepsImpl status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public java.lang.String getError() { 
		return this.error;
	} 

	public void setError(java.lang.String error) { 
		this.error = error;
	} 

	public InstallationProgressStepsImpl error(java.lang.String error) { 
		this.error = error;
		return this;
	} 

}
