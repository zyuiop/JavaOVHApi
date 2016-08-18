package net.zyuiop.ovhapi.api.objects.hosting.web;

/**
 * A module specifically packaged for OVH
 */

public class ModuleList { 

	private java.lang.String[] language;
	private boolean latest;
	private java.lang.String version;
	private java.lang.String name;
	private boolean active;
	private java.lang.String adminNameType;
	private java.lang.String author;
	private java.lang.String branch;
	private long[] upgradeFrom;
	private net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue size;
	private java.lang.String[] keywords;
	private long id;
	private net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue languageRequirement;

	public ModuleList() {
	}

	public java.lang.String[] getLanguage() { 
		return this.language;
	} 

	public void setLanguage(java.lang.String[] language) { 
		this.language = language;
	} 

	public ModuleList language(java.lang.String[] language) { 
		this.language = language;
		return this;
	} 

	public boolean getLatest() { 
		return this.latest;
	} 

	public void setLatest(boolean latest) { 
		this.latest = latest;
	} 

	public ModuleList latest(boolean latest) { 
		this.latest = latest;
		return this;
	} 

	public java.lang.String getVersion() { 
		return this.version;
	} 

	public void setVersion(java.lang.String version) { 
		this.version = version;
	} 

	public ModuleList version(java.lang.String version) { 
		this.version = version;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public ModuleList name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public boolean getActive() { 
		return this.active;
	} 

	public void setActive(boolean active) { 
		this.active = active;
	} 

	public ModuleList active(boolean active) { 
		this.active = active;
		return this;
	} 

	public java.lang.String getAdminNameType() { 
		return this.adminNameType;
	} 

	public void setAdminNameType(java.lang.String adminNameType) { 
		this.adminNameType = adminNameType;
	} 

	public ModuleList adminNameType(java.lang.String adminNameType) { 
		this.adminNameType = adminNameType;
		return this;
	} 

	public java.lang.String getAuthor() { 
		return this.author;
	} 

	public void setAuthor(java.lang.String author) { 
		this.author = author;
	} 

	public ModuleList author(java.lang.String author) { 
		this.author = author;
		return this;
	} 

	public java.lang.String getBranch() { 
		return this.branch;
	} 

	public void setBranch(java.lang.String branch) { 
		this.branch = branch;
	} 

	public ModuleList branch(java.lang.String branch) { 
		this.branch = branch;
		return this;
	} 

	public long[] getUpgradeFrom() { 
		return this.upgradeFrom;
	} 

	public void setUpgradeFrom(long[] upgradeFrom) { 
		this.upgradeFrom = upgradeFrom;
	} 

	public ModuleList upgradeFrom(long[] upgradeFrom) { 
		this.upgradeFrom = upgradeFrom;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue getSize() { 
		return this.size;
	} 

	public void setSize(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue size) { 
		this.size = size;
	} 

	public ModuleList size(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue size) { 
		this.size = size;
		return this;
	} 

	public java.lang.String[] getKeywords() { 
		return this.keywords;
	} 

	public void setKeywords(java.lang.String[] keywords) { 
		this.keywords = keywords;
	} 

	public ModuleList keywords(java.lang.String[] keywords) { 
		this.keywords = keywords;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public ModuleList id(long id) { 
		this.id = id;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue getLanguageRequirement() { 
		return this.languageRequirement;
	} 

	public void setLanguageRequirement(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue languageRequirement) { 
		this.languageRequirement = languageRequirement;
	} 

	public ModuleList languageRequirement(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue languageRequirement) { 
		this.languageRequirement = languageRequirement;
		return this;
	} 

}
