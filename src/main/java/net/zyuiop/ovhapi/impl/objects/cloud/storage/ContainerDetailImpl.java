package net.zyuiop.ovhapi.impl.objects.cloud.storage;

import net.zyuiop.ovhapi.api.objects.cloud.storage.ContainerDetail;
/**
 * ContainerDetail
 */

public class ContainerDetailImpl implements ContainerDetail { 

	private net.zyuiop.ovhapi.impl.objects.cloud.storage.ContainerObjectImpl objects;
	private long storedBytes;
	private java.lang.String name;
	private boolean _public;
	private java.lang.String region;
	private long storedObjects;
	private java.lang.String staticUrl;

	public ContainerDetailImpl() {
	}

	public net.zyuiop.ovhapi.impl.objects.cloud.storage.ContainerObjectImpl getObjects() { 
		return this.objects;
	} 

	public void setObjects(net.zyuiop.ovhapi.impl.objects.cloud.storage.ContainerObjectImpl objects) { 
		this.objects = objects;
	} 

	public ContainerDetailImpl objects(net.zyuiop.ovhapi.impl.objects.cloud.storage.ContainerObjectImpl objects) { 
		this.objects = objects;
		return this;
	} 

	public long getStoredBytes() { 
		return this.storedBytes;
	} 

	public void setStoredBytes(long storedBytes) { 
		this.storedBytes = storedBytes;
	} 

	public ContainerDetailImpl storedBytes(long storedBytes) { 
		this.storedBytes = storedBytes;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public ContainerDetailImpl name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public boolean getPublic() { 
		return this._public;
	} 

	public void setPublic(boolean _public) { 
		this._public = _public;
	} 

	public ContainerDetailImpl _public(boolean _public) { 
		this._public = _public;
		return this;
	} 

	public java.lang.String getRegion() { 
		return this.region;
	} 

	public void setRegion(java.lang.String region) { 
		this.region = region;
	} 

	public ContainerDetailImpl region(java.lang.String region) { 
		this.region = region;
		return this;
	} 

	public long getStoredObjects() { 
		return this.storedObjects;
	} 

	public void setStoredObjects(long storedObjects) { 
		this.storedObjects = storedObjects;
	} 

	public ContainerDetailImpl storedObjects(long storedObjects) { 
		this.storedObjects = storedObjects;
		return this;
	} 

	public java.lang.String getStaticUrl() { 
		return this.staticUrl;
	} 

	public void setStaticUrl(java.lang.String staticUrl) { 
		this.staticUrl = staticUrl;
	} 

	public ContainerDetailImpl staticUrl(java.lang.String staticUrl) { 
		this.staticUrl = staticUrl;
		return this;
	} 

}
