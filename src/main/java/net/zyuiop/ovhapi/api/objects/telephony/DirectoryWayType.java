package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Directory way type
 */

public class DirectoryWayType { 

	private java.lang.String abbreviatedName;
	private java.lang.String wayName;

	public DirectoryWayType() {
	}

	public java.lang.String getAbbreviatedName() { 
		return this.abbreviatedName;
	} 

	public void setAbbreviatedName(java.lang.String abbreviatedName) { 
		this.abbreviatedName = abbreviatedName;
	} 

	public DirectoryWayType abbreviatedName(java.lang.String abbreviatedName) { 
		this.abbreviatedName = abbreviatedName;
		return this;
	} 

	public java.lang.String getWayName() { 
		return this.wayName;
	} 

	public void setWayName(java.lang.String wayName) { 
		this.wayName = wayName;
	} 

	public DirectoryWayType wayName(java.lang.String wayName) { 
		this.wayName = wayName;
		return this;
	} 

}
