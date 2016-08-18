package net.zyuiop.ovhapi.api.objects.dedicated.installationtemplate;

/**
 * Available installation templates
 */

public class Templates { 

	private boolean supportsDistributionKernel;
	private long bitFormat;
	private java.lang.String templateName;
	private java.lang.String defaultLanguage;
	private java.lang.String category;
	private java.lang.String[] availableLanguages;
	private java.util.Date lastModification;
	private boolean beta;
	private net.zyuiop.ovhapi.api.objects.dedicated.TemplateOsProperties customization;
	private java.lang.String description;
	private java.lang.String distribution;
	private boolean supportsGptLabel;
	private boolean deprecated;
	private boolean supportsSqlServer;
	private java.lang.String[] filesystems;
	private boolean lvmReady;
	private java.lang.String family;

	public Templates() {
	}

	public boolean getSupportsDistributionKernel() { 
		return this.supportsDistributionKernel;
	} 

	public void setSupportsDistributionKernel(boolean supportsDistributionKernel) { 
		this.supportsDistributionKernel = supportsDistributionKernel;
	} 

	public Templates supportsDistributionKernel(boolean supportsDistributionKernel) { 
		this.supportsDistributionKernel = supportsDistributionKernel;
		return this;
	} 

	public long getBitFormat() { 
		return this.bitFormat;
	} 

	public void setBitFormat(long bitFormat) { 
		this.bitFormat = bitFormat;
	} 

	public Templates bitFormat(long bitFormat) { 
		this.bitFormat = bitFormat;
		return this;
	} 

	public java.lang.String getTemplateName() { 
		return this.templateName;
	} 

	public void setTemplateName(java.lang.String templateName) { 
		this.templateName = templateName;
	} 

	public Templates templateName(java.lang.String templateName) { 
		this.templateName = templateName;
		return this;
	} 

	public java.lang.String getDefaultLanguage() { 
		return this.defaultLanguage;
	} 

	public void setDefaultLanguage(java.lang.String defaultLanguage) { 
		this.defaultLanguage = defaultLanguage;
	} 

	public Templates defaultLanguage(java.lang.String defaultLanguage) { 
		this.defaultLanguage = defaultLanguage;
		return this;
	} 

	public java.lang.String getCategory() { 
		return this.category;
	} 

	public void setCategory(java.lang.String category) { 
		this.category = category;
	} 

	public Templates category(java.lang.String category) { 
		this.category = category;
		return this;
	} 

	public java.lang.String[] getAvailableLanguages() { 
		return this.availableLanguages;
	} 

	public void setAvailableLanguages(java.lang.String[] availableLanguages) { 
		this.availableLanguages = availableLanguages;
	} 

	public Templates availableLanguages(java.lang.String[] availableLanguages) { 
		this.availableLanguages = availableLanguages;
		return this;
	} 

	public java.util.Date getLastModification() { 
		return this.lastModification;
	} 

	public void setLastModification(java.util.Date lastModification) { 
		this.lastModification = lastModification;
	} 

	public Templates lastModification(java.util.Date lastModification) { 
		this.lastModification = lastModification;
		return this;
	} 

	public boolean getBeta() { 
		return this.beta;
	} 

	public void setBeta(boolean beta) { 
		this.beta = beta;
	} 

	public Templates beta(boolean beta) { 
		this.beta = beta;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.dedicated.TemplateOsProperties getCustomization() { 
		return this.customization;
	} 

	public void setCustomization(net.zyuiop.ovhapi.api.objects.dedicated.TemplateOsProperties customization) { 
		this.customization = customization;
	} 

	public Templates customization(net.zyuiop.ovhapi.api.objects.dedicated.TemplateOsProperties customization) { 
		this.customization = customization;
		return this;
	} 

	public java.lang.String getDescription() { 
		return this.description;
	} 

	public void setDescription(java.lang.String description) { 
		this.description = description;
	} 

	public Templates description(java.lang.String description) { 
		this.description = description;
		return this;
	} 

	public java.lang.String getDistribution() { 
		return this.distribution;
	} 

	public void setDistribution(java.lang.String distribution) { 
		this.distribution = distribution;
	} 

	public Templates distribution(java.lang.String distribution) { 
		this.distribution = distribution;
		return this;
	} 

	public boolean getSupportsGptLabel() { 
		return this.supportsGptLabel;
	} 

	public void setSupportsGptLabel(boolean supportsGptLabel) { 
		this.supportsGptLabel = supportsGptLabel;
	} 

	public Templates supportsGptLabel(boolean supportsGptLabel) { 
		this.supportsGptLabel = supportsGptLabel;
		return this;
	} 

	public boolean getDeprecated() { 
		return this.deprecated;
	} 

	public void setDeprecated(boolean deprecated) { 
		this.deprecated = deprecated;
	} 

	public Templates deprecated(boolean deprecated) { 
		this.deprecated = deprecated;
		return this;
	} 

	public boolean getSupportsSqlServer() { 
		return this.supportsSqlServer;
	} 

	public void setSupportsSqlServer(boolean supportsSqlServer) { 
		this.supportsSqlServer = supportsSqlServer;
	} 

	public Templates supportsSqlServer(boolean supportsSqlServer) { 
		this.supportsSqlServer = supportsSqlServer;
		return this;
	} 

	public java.lang.String[] getFilesystems() { 
		return this.filesystems;
	} 

	public void setFilesystems(java.lang.String[] filesystems) { 
		this.filesystems = filesystems;
	} 

	public Templates filesystems(java.lang.String[] filesystems) { 
		this.filesystems = filesystems;
		return this;
	} 

	public boolean getLvmReady() { 
		return this.lvmReady;
	} 

	public void setLvmReady(boolean lvmReady) { 
		this.lvmReady = lvmReady;
	} 

	public Templates lvmReady(boolean lvmReady) { 
		this.lvmReady = lvmReady;
		return this;
	} 

	public java.lang.String getFamily() { 
		return this.family;
	} 

	public void setFamily(java.lang.String family) { 
		this.family = family;
	} 

	public Templates family(java.lang.String family) { 
		this.family = family;
		return this;
	} 

}
