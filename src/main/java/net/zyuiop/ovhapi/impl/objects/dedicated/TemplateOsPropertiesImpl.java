package net.zyuiop.ovhapi.impl.objects.dedicated;

import net.zyuiop.ovhapi.api.objects.dedicated.TemplateOsProperties;
/**
 * A structure describing properties customizables about this dedicated installation template
 */

public class TemplateOsPropertiesImpl implements TemplateOsProperties { 

	private boolean useDistributionKernel;
	private java.lang.String sshKeyName;
	private java.lang.String postInstallationScriptReturn;
	private java.lang.String changeLog;
	private java.lang.String postInstallationScriptLink;
	private long rating;
	private java.lang.String customHostname;

	public TemplateOsPropertiesImpl() {
	}

	public boolean getUseDistributionKernel() { 
		return this.useDistributionKernel;
	} 

	public void setUseDistributionKernel(boolean useDistributionKernel) { 
		this.useDistributionKernel = useDistributionKernel;
	} 

	public TemplateOsPropertiesImpl useDistributionKernel(boolean useDistributionKernel) { 
		this.useDistributionKernel = useDistributionKernel;
		return this;
	} 

	public java.lang.String getSshKeyName() { 
		return this.sshKeyName;
	} 

	public void setSshKeyName(java.lang.String sshKeyName) { 
		this.sshKeyName = sshKeyName;
	} 

	public TemplateOsPropertiesImpl sshKeyName(java.lang.String sshKeyName) { 
		this.sshKeyName = sshKeyName;
		return this;
	} 

	public java.lang.String getPostInstallationScriptReturn() { 
		return this.postInstallationScriptReturn;
	} 

	public void setPostInstallationScriptReturn(java.lang.String postInstallationScriptReturn) { 
		this.postInstallationScriptReturn = postInstallationScriptReturn;
	} 

	public TemplateOsPropertiesImpl postInstallationScriptReturn(java.lang.String postInstallationScriptReturn) { 
		this.postInstallationScriptReturn = postInstallationScriptReturn;
		return this;
	} 

	public java.lang.String getChangeLog() { 
		return this.changeLog;
	} 

	public void setChangeLog(java.lang.String changeLog) { 
		this.changeLog = changeLog;
	} 

	public TemplateOsPropertiesImpl changeLog(java.lang.String changeLog) { 
		this.changeLog = changeLog;
		return this;
	} 

	public java.lang.String getPostInstallationScriptLink() { 
		return this.postInstallationScriptLink;
	} 

	public void setPostInstallationScriptLink(java.lang.String postInstallationScriptLink) { 
		this.postInstallationScriptLink = postInstallationScriptLink;
	} 

	public TemplateOsPropertiesImpl postInstallationScriptLink(java.lang.String postInstallationScriptLink) { 
		this.postInstallationScriptLink = postInstallationScriptLink;
		return this;
	} 

	public long getRating() { 
		return this.rating;
	} 

	public void setRating(long rating) { 
		this.rating = rating;
	} 

	public TemplateOsPropertiesImpl rating(long rating) { 
		this.rating = rating;
		return this;
	} 

	public java.lang.String getCustomHostname() { 
		return this.customHostname;
	} 

	public void setCustomHostname(java.lang.String customHostname) { 
		this.customHostname = customHostname;
	} 

	public TemplateOsPropertiesImpl customHostname(java.lang.String customHostname) { 
		this.customHostname = customHostname;
		return this;
	} 

}
