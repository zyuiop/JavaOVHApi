package net.zyuiop.ovhapi.api.objects.complextype;

/**
 * Key and value, with proper key strings
 */

public class SafeKeyValue<T> { 

	private T value;
	private java.lang.String key;

	public SafeKeyValue() {
	}

	public T getValue() { 
		return this.value;
	} 

	public void setValue(T value) { 
		this.value = value;
	} 

	public SafeKeyValue value(T value) { 
		this.value = value;
		return this;
	} 

	public java.lang.String getKey() { 
		return this.key;
	} 

	public void setKey(java.lang.String key) { 
		this.key = key;
	} 

	public SafeKeyValue key(java.lang.String key) { 
		this.key = key;
		return this;
	} 

}
