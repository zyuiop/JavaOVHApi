package net.zyuiop.ovhapi.api.objects.cloud.storage;

/**
 * Container
 */

public class Container { 

	private long storedBytes;
	private java.lang.String name;
	private java.lang.String region;
	private java.lang.String id;
	private long storedObjects;

	public Container() {
	}

	public long getStoredBytes() { 
		return this.storedBytes;
	} 

	public void setStoredBytes(long storedBytes) { 
		this.storedBytes = storedBytes;
	} 

	public Container storedBytes(long storedBytes) { 
		this.storedBytes = storedBytes;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public Container name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public java.lang.String getRegion() { 
		return this.region;
	} 

	public void setRegion(java.lang.String region) { 
		this.region = region;
	} 

	public Container region(java.lang.String region) { 
		this.region = region;
		return this;
	} 

	public java.lang.String getId() { 
		return this.id;
	} 

	public void setId(java.lang.String id) { 
		this.id = id;
	} 

	public Container id(java.lang.String id) { 
		this.id = id;
		return this;
	} 

	public long getStoredObjects() { 
		return this.storedObjects;
	} 

	public void setStoredObjects(long storedObjects) { 
		this.storedObjects = storedObjects;
	} 

	public Container storedObjects(long storedObjects) { 
		this.storedObjects = storedObjects;
		return this;
	} 

}
