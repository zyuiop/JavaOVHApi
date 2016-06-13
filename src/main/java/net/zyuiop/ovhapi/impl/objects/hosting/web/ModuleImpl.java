package net.zyuiop.ovhapi.impl.objects.hosting.web;

import net.zyuiop.ovhapi.api.objects.hosting.web.Module;
/**
 * Hosting modules installed
 */

public class ModuleImpl implements Module { 

	private java.lang.String language;
	private net.zyuiop.ovhapi.api.objects.hosting.web.module.DependencyType dependencies;
	private java.lang.String path;
	private long moduleId;
	private java.lang.String targetUrl;
	private java.util.Date lastUpdate;
	private java.util.Date creationDate;
	private java.lang.String adminName;
	private long id;
	private java.lang.String adminFolder;

	public ModuleImpl() {
	}

	public java.lang.String getLanguage() { 
		return this.language;
	} 

	public void setLanguage(java.lang.String language) { 
		this.language = language;
	} 

	public ModuleImpl language(java.lang.String language) { 
		this.language = language;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.hosting.web.module.DependencyType getDependencies() { 
		return this.dependencies;
	} 

	public void setDependencies(net.zyuiop.ovhapi.api.objects.hosting.web.module.DependencyType dependencies) { 
		this.dependencies = dependencies;
	} 

	public ModuleImpl dependencies(net.zyuiop.ovhapi.api.objects.hosting.web.module.DependencyType dependencies) { 
		this.dependencies = dependencies;
		return this;
	} 

	public java.lang.String getPath() { 
		return this.path;
	} 

	public void setPath(java.lang.String path) { 
		this.path = path;
	} 

	public ModuleImpl path(java.lang.String path) { 
		this.path = path;
		return this;
	} 

	public long getModuleId() { 
		return this.moduleId;
	} 

	public void setModuleId(long moduleId) { 
		this.moduleId = moduleId;
	} 

	public ModuleImpl moduleId(long moduleId) { 
		this.moduleId = moduleId;
		return this;
	} 

	public java.lang.String getTargetUrl() { 
		return this.targetUrl;
	} 

	public void setTargetUrl(java.lang.String targetUrl) { 
		this.targetUrl = targetUrl;
	} 

	public ModuleImpl targetUrl(java.lang.String targetUrl) { 
		this.targetUrl = targetUrl;
		return this;
	} 

	public java.util.Date getLastUpdate() { 
		return this.lastUpdate;
	} 

	public void setLastUpdate(java.util.Date lastUpdate) { 
		this.lastUpdate = lastUpdate;
	} 

	public ModuleImpl lastUpdate(java.util.Date lastUpdate) { 
		this.lastUpdate = lastUpdate;
		return this;
	} 

	public java.util.Date getCreationDate() { 
		return this.creationDate;
	} 

	public void setCreationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
	} 

	public ModuleImpl creationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
		return this;
	} 

	public java.lang.String getAdminName() { 
		return this.adminName;
	} 

	public void setAdminName(java.lang.String adminName) { 
		this.adminName = adminName;
	} 

	public ModuleImpl adminName(java.lang.String adminName) { 
		this.adminName = adminName;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public ModuleImpl id(long id) { 
		this.id = id;
		return this;
	} 

	public java.lang.String getAdminFolder() { 
		return this.adminFolder;
	} 

	public void setAdminFolder(java.lang.String adminFolder) { 
		this.adminFolder = adminFolder;
	} 

	public ModuleImpl adminFolder(java.lang.String adminFolder) { 
		this.adminFolder = adminFolder;
		return this;
	} 

}
