package net.zyuiop.ovhapi.api.objects.hosting.web.database;

/**
 * Database Available and Default version
 */

public class AvailableVersionStruct { 

	private java.lang.String _default;
	private java.lang.String[] list;

	public AvailableVersionStruct() {
	}

	public java.lang.String getDefault() { 
		return this._default;
	} 

	public void setDefault(java.lang.String _default) { 
		this._default = _default;
	} 

	public AvailableVersionStruct _default(java.lang.String _default) { 
		this._default = _default;
		return this;
	} 

	public java.lang.String[] getList() { 
		return this.list;
	} 

	public void setList(java.lang.String[] list) { 
		this.list = list;
	} 

	public AvailableVersionStruct list(java.lang.String[] list) { 
		this.list = list;
		return this;
	} 

}
