package net.zyuiop.ovhapi.impl.objects.hosting.web.database;

import net.zyuiop.ovhapi.api.objects.hosting.web.database.AvailableVersionStruct;
/**
 * Database Available and Default version
 */

public class AvailableVersionStructImpl implements AvailableVersionStruct { 

	private java.lang.String _default;
	private java.lang.String[] list;

	public AvailableVersionStructImpl() {
	}

	public java.lang.String getDefault() { 
		return this._default;
	} 

	public void setDefault(java.lang.String _default) { 
		this._default = _default;
	} 

	public AvailableVersionStructImpl _default(java.lang.String _default) { 
		this._default = _default;
		return this;
	} 

	public java.lang.String[] getList() { 
		return this.list;
	} 

	public void setList(java.lang.String[] list) { 
		this.list = list;
	} 

	public AvailableVersionStructImpl list(java.lang.String[] list) { 
		this.list = list;
		return this;
	} 

}
