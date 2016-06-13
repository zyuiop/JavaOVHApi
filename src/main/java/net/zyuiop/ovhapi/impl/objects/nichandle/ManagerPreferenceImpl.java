package net.zyuiop.ovhapi.impl.objects.nichandle;

import net.zyuiop.ovhapi.api.objects.nichandle.ManagerPreference;
/**
 * Manager preference
 */

public class ManagerPreferenceImpl implements ManagerPreference { 

	private java.lang.String value;
	private java.lang.String key;

	public ManagerPreferenceImpl() {
	}

	public java.lang.String getValue() { 
		return this.value;
	} 

	public void setValue(java.lang.String value) { 
		this.value = value;
	} 

	public ManagerPreferenceImpl value(java.lang.String value) { 
		this.value = value;
		return this;
	} 

	public java.lang.String getKey() { 
		return this.key;
	} 

	public void setKey(java.lang.String key) { 
		this.key = key;
	} 

	public ManagerPreferenceImpl key(java.lang.String key) { 
		this.key = key;
		return this;
	} 

}
