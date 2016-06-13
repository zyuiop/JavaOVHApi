package net.zyuiop.ovhapi.impl.objects.nichandle;

import net.zyuiop.ovhapi.api.objects.nichandle.SshKey;
/**
 * Customer public SSH key, can be used for rescue netboot or server access after reinstallation
 */

public class SshKeyImpl implements SshKey { 

	private boolean _default;
	private java.lang.String keyName;
	private java.lang.String key;

	public SshKeyImpl() {
	}

	public boolean getDefault() { 
		return this._default;
	} 

	public void setDefault(boolean _default) { 
		this._default = _default;
	} 

	public SshKeyImpl _default(boolean _default) { 
		this._default = _default;
		return this;
	} 

	public java.lang.String getKeyName() { 
		return this.keyName;
	} 

	public void setKeyName(java.lang.String keyName) { 
		this.keyName = keyName;
	} 

	public SshKeyImpl keyName(java.lang.String keyName) { 
		this.keyName = keyName;
		return this;
	} 

	public java.lang.String getKey() { 
		return this.key;
	} 

	public void setKey(java.lang.String key) { 
		this.key = key;
	} 

	public SshKeyImpl key(java.lang.String key) { 
		this.key = key;
		return this;
	} 

}
