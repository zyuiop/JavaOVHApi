package net.zyuiop.ovhapi.impl.objects.complextype;

import net.zyuiop.ovhapi.api.objects.complextype.SafeKeyValue;
/**
 * Key and value, with proper key strings
 */

public class SafeKeyValueImpl<T> implements SafeKeyValue<T> { 

	private T value;
	private java.lang.String key;

	public SafeKeyValueImpl() {
	}

	public T getValue() { 
		return this.value;
	} 

	public void setValue(T value) { 
		this.value = value;
	} 

	public SafeKeyValueImpl value(T value) { 
		this.value = value;
		return this;
	} 

	public java.lang.String getKey() { 
		return this.key;
	} 

	public void setKey(java.lang.String key) { 
		this.key = key;
	} 

	public SafeKeyValueImpl key(java.lang.String key) { 
		this.key = key;
		return this;
	} 

}
