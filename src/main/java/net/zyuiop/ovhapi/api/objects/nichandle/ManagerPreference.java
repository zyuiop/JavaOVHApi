package net.zyuiop.ovhapi.api.objects.nichandle;

/**
 * Manager preference
 */

public class ManagerPreference { 

	private java.lang.String value;
	private java.lang.String key;

	public ManagerPreference() {
	}

	public java.lang.String getValue() { 
		return this.value;
	} 

	public void setValue(java.lang.String value) { 
		this.value = value;
	} 

	public ManagerPreference value(java.lang.String value) { 
		this.value = value;
		return this;
	} 

	public java.lang.String getKey() { 
		return this.key;
	} 

	public void setKey(java.lang.String key) { 
		this.key = key;
	} 

	public ManagerPreference key(java.lang.String key) { 
		this.key = key;
		return this;
	} 

}
