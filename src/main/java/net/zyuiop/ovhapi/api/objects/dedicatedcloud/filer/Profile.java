package net.zyuiop.ovhapi.api.objects.dedicatedcloud.filer;

/**
 * A Filer profile
 */

public class Profile { 

	private java.lang.String fullName;
	private java.lang.String name;
	private net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue size;

	public Profile() {
	}

	public java.lang.String getFullName() { 
		return this.fullName;
	} 

	public void setFullName(java.lang.String fullName) { 
		this.fullName = fullName;
	} 

	public Profile fullName(java.lang.String fullName) { 
		this.fullName = fullName;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public Profile name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue getSize() { 
		return this.size;
	} 

	public void setSize(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue size) { 
		this.size = size;
	} 

	public Profile size(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue size) { 
		this.size = size;
		return this;
	} 

}
