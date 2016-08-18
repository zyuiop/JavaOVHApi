package net.zyuiop.ovhapi.api.objects.dedicated.server;

/**
 * A structure describing informations about this dedicated server installation steps
 */

public class InstallationProgressSteps { 

	private java.lang.String comment;
	private java.lang.String status;
	private java.lang.String error;

	public InstallationProgressSteps() {
	}

	public java.lang.String getComment() { 
		return this.comment;
	} 

	public void setComment(java.lang.String comment) { 
		this.comment = comment;
	} 

	public InstallationProgressSteps comment(java.lang.String comment) { 
		this.comment = comment;
		return this;
	} 

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public InstallationProgressSteps status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public java.lang.String getError() { 
		return this.error;
	} 

	public void setError(java.lang.String error) { 
		this.error = error;
	} 

	public InstallationProgressSteps error(java.lang.String error) { 
		this.error = error;
		return this;
	} 

}
