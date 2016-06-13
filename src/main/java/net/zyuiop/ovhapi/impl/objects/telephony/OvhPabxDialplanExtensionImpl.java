package net.zyuiop.ovhapi.impl.objects.telephony;

import net.zyuiop.ovhapi.api.objects.telephony.OvhPabxDialplanExtension;
/**
 * Dialplan extension
 */

public class OvhPabxDialplanExtensionImpl implements OvhPabxDialplanExtension { 

	private long position;
	private java.lang.String screenListType;
	private long extensionId;
	private boolean enabled;
	private java.lang.String schedulerCategory;

	public OvhPabxDialplanExtensionImpl() {
	}

	public long getPosition() { 
		return this.position;
	} 

	public void setPosition(long position) { 
		this.position = position;
	} 

	public OvhPabxDialplanExtensionImpl position(long position) { 
		this.position = position;
		return this;
	} 

	public java.lang.String getScreenListType() { 
		return this.screenListType;
	} 

	public void setScreenListType(java.lang.String screenListType) { 
		this.screenListType = screenListType;
	} 

	public OvhPabxDialplanExtensionImpl screenListType(java.lang.String screenListType) { 
		this.screenListType = screenListType;
		return this;
	} 

	public long getExtensionId() { 
		return this.extensionId;
	} 

	public void setExtensionId(long extensionId) { 
		this.extensionId = extensionId;
	} 

	public OvhPabxDialplanExtensionImpl extensionId(long extensionId) { 
		this.extensionId = extensionId;
		return this;
	} 

	public boolean getEnabled() { 
		return this.enabled;
	} 

	public void setEnabled(boolean enabled) { 
		this.enabled = enabled;
	} 

	public OvhPabxDialplanExtensionImpl enabled(boolean enabled) { 
		this.enabled = enabled;
		return this;
	} 

	public java.lang.String getSchedulerCategory() { 
		return this.schedulerCategory;
	} 

	public void setSchedulerCategory(java.lang.String schedulerCategory) { 
		this.schedulerCategory = schedulerCategory;
	} 

	public OvhPabxDialplanExtensionImpl schedulerCategory(java.lang.String schedulerCategory) { 
		this.schedulerCategory = schedulerCategory;
		return this;
	} 

}
