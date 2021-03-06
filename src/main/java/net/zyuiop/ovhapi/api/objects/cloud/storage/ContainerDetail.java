package net.zyuiop.ovhapi.api.objects.cloud.storage;

/**
 * ContainerDetail
 */

public class ContainerDetail { 

	private net.zyuiop.ovhapi.api.objects.cloud.storage.ContainerObject[] objects;
	private long storedBytes;
	private java.lang.String name;
	private boolean _public;
	private java.lang.String region;
	private long storedObjects;
	private java.lang.String staticUrl;

	public ContainerDetail() {
	}

	public net.zyuiop.ovhapi.api.objects.cloud.storage.ContainerObject[] getObjects() { 
		return this.objects;
	} 

	public void setObjects(net.zyuiop.ovhapi.api.objects.cloud.storage.ContainerObject[] objects) { 
		this.objects = objects;
	} 

	public ContainerDetail objects(net.zyuiop.ovhapi.api.objects.cloud.storage.ContainerObject[] objects) { 
		this.objects = objects;
		return this;
	} 

	public long getStoredBytes() { 
		return this.storedBytes;
	} 

	public void setStoredBytes(long storedBytes) { 
		this.storedBytes = storedBytes;
	} 

	public ContainerDetail storedBytes(long storedBytes) { 
		this.storedBytes = storedBytes;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public ContainerDetail name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public boolean getPublic() { 
		return this._public;
	} 

	public void setPublic(boolean _public) { 
		this._public = _public;
	} 

	public ContainerDetail _public(boolean _public) { 
		this._public = _public;
		return this;
	} 

	public java.lang.String getRegion() { 
		return this.region;
	} 

	public void setRegion(java.lang.String region) { 
		this.region = region;
	} 

	public ContainerDetail region(java.lang.String region) { 
		this.region = region;
		return this;
	} 

	public long getStoredObjects() { 
		return this.storedObjects;
	} 

	public void setStoredObjects(long storedObjects) { 
		this.storedObjects = storedObjects;
	} 

	public ContainerDetail storedObjects(long storedObjects) { 
		this.storedObjects = storedObjects;
		return this;
	} 

	public java.lang.String getStaticUrl() { 
		return this.staticUrl;
	} 

	public void setStaticUrl(java.lang.String staticUrl) { 
		this.staticUrl = staticUrl;
	} 

	public ContainerDetail staticUrl(java.lang.String staticUrl) { 
		this.staticUrl = staticUrl;
		return this;
	} 

}
