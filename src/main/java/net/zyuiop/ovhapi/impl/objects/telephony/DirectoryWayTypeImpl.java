package net.zyuiop.ovhapi.impl.objects.telephony;

import net.zyuiop.ovhapi.api.objects.telephony.DirectoryWayType;
/**
 * Directory way type
 */

public class DirectoryWayTypeImpl implements DirectoryWayType { 

	private java.lang.String abbreviatedName;
	private java.lang.String wayName;

	public DirectoryWayTypeImpl() {
	}

	public java.lang.String getAbbreviatedName() { 
		return this.abbreviatedName;
	} 

	public void setAbbreviatedName(java.lang.String abbreviatedName) { 
		this.abbreviatedName = abbreviatedName;
	} 

	public DirectoryWayTypeImpl abbreviatedName(java.lang.String abbreviatedName) { 
		this.abbreviatedName = abbreviatedName;
		return this;
	} 

	public java.lang.String getWayName() { 
		return this.wayName;
	} 

	public void setWayName(java.lang.String wayName) { 
		this.wayName = wayName;
	} 

	public DirectoryWayTypeImpl wayName(java.lang.String wayName) { 
		this.wayName = wayName;
		return this;
	} 

}
