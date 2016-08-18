package net.zyuiop.ovhapi.api.objects.dedicated;

/**
 * A structure describing properties customizables about this dedicated installation template
 */

public class TemplateOsProperties { 

	private boolean useDistributionKernel;
	private java.lang.String sshKeyName;
	private java.lang.String postInstallationScriptReturn;
	private java.lang.String changeLog;
	private java.lang.String postInstallationScriptLink;
	private long rating;
	private java.lang.String customHostname;

	public TemplateOsProperties() {
	}

	public boolean getUseDistributionKernel() { 
		return this.useDistributionKernel;
	} 

	public void setUseDistributionKernel(boolean useDistributionKernel) { 
		this.useDistributionKernel = useDistributionKernel;
	} 

	public TemplateOsProperties useDistributionKernel(boolean useDistributionKernel) { 
		this.useDistributionKernel = useDistributionKernel;
		return this;
	} 

	public java.lang.String getSshKeyName() { 
		return this.sshKeyName;
	} 

	public void setSshKeyName(java.lang.String sshKeyName) { 
		this.sshKeyName = sshKeyName;
	} 

	public TemplateOsProperties sshKeyName(java.lang.String sshKeyName) { 
		this.sshKeyName = sshKeyName;
		return this;
	} 

	public java.lang.String getPostInstallationScriptReturn() { 
		return this.postInstallationScriptReturn;
	} 

	public void setPostInstallationScriptReturn(java.lang.String postInstallationScriptReturn) { 
		this.postInstallationScriptReturn = postInstallationScriptReturn;
	} 

	public TemplateOsProperties postInstallationScriptReturn(java.lang.String postInstallationScriptReturn) { 
		this.postInstallationScriptReturn = postInstallationScriptReturn;
		return this;
	} 

	public java.lang.String getChangeLog() { 
		return this.changeLog;
	} 

	public void setChangeLog(java.lang.String changeLog) { 
		this.changeLog = changeLog;
	} 

	public TemplateOsProperties changeLog(java.lang.String changeLog) { 
		this.changeLog = changeLog;
		return this;
	} 

	public java.lang.String getPostInstallationScriptLink() { 
		return this.postInstallationScriptLink;
	} 

	public void setPostInstallationScriptLink(java.lang.String postInstallationScriptLink) { 
		this.postInstallationScriptLink = postInstallationScriptLink;
	} 

	public TemplateOsProperties postInstallationScriptLink(java.lang.String postInstallationScriptLink) { 
		this.postInstallationScriptLink = postInstallationScriptLink;
		return this;
	} 

	public long getRating() { 
		return this.rating;
	} 

	public void setRating(long rating) { 
		this.rating = rating;
	} 

	public TemplateOsProperties rating(long rating) { 
		this.rating = rating;
		return this;
	} 

	public java.lang.String getCustomHostname() { 
		return this.customHostname;
	} 

	public void setCustomHostname(java.lang.String customHostname) { 
		this.customHostname = customHostname;
	} 

	public TemplateOsProperties customHostname(java.lang.String customHostname) { 
		this.customHostname = customHostname;
		return this;
	} 

}
