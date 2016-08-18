package net.zyuiop.ovhapi.api.objects.zone;

/**
 * Zone status
 */

public class Status { 

	private java.lang.String[] warnings;
	private java.lang.String[] errors;
	private boolean isDeployed;

	public Status() {
	}

	public java.lang.String[] getWarnings() { 
		return this.warnings;
	} 

	public void setWarnings(java.lang.String[] warnings) { 
		this.warnings = warnings;
	} 

	public Status warnings(java.lang.String[] warnings) { 
		this.warnings = warnings;
		return this;
	} 

	public java.lang.String[] getErrors() { 
		return this.errors;
	} 

	public void setErrors(java.lang.String[] errors) { 
		this.errors = errors;
	} 

	public Status errors(java.lang.String[] errors) { 
		this.errors = errors;
		return this;
	} 

	public boolean getIsDeployed() { 
		return this.isDeployed;
	} 

	public void setIsDeployed(boolean isDeployed) { 
		this.isDeployed = isDeployed;
	} 

	public Status isDeployed(boolean isDeployed) { 
		this.isDeployed = isDeployed;
		return this;
	} 

}
