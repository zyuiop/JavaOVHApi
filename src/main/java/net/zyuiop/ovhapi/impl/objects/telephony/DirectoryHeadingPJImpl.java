package net.zyuiop.ovhapi.impl.objects.telephony;

import net.zyuiop.ovhapi.api.objects.telephony.DirectoryHeadingPJ;
/**
 * Directory Informations
 */

public class DirectoryHeadingPJImpl implements DirectoryHeadingPJ { 

	private java.lang.String apeDescription;
	private long directoryServiceCode;
	private java.lang.String notification;
	private java.lang.String directoryServiceDescription;
	private java.lang.String apeCode;

	public DirectoryHeadingPJImpl() {
	}

	public java.lang.String getApeDescription() { 
		return this.apeDescription;
	} 

	public void setApeDescription(java.lang.String apeDescription) { 
		this.apeDescription = apeDescription;
	} 

	public DirectoryHeadingPJImpl apeDescription(java.lang.String apeDescription) { 
		this.apeDescription = apeDescription;
		return this;
	} 

	public long getDirectoryServiceCode() { 
		return this.directoryServiceCode;
	} 

	public void setDirectoryServiceCode(long directoryServiceCode) { 
		this.directoryServiceCode = directoryServiceCode;
	} 

	public DirectoryHeadingPJImpl directoryServiceCode(long directoryServiceCode) { 
		this.directoryServiceCode = directoryServiceCode;
		return this;
	} 

	public java.lang.String getNotification() { 
		return this.notification;
	} 

	public void setNotification(java.lang.String notification) { 
		this.notification = notification;
	} 

	public DirectoryHeadingPJImpl notification(java.lang.String notification) { 
		this.notification = notification;
		return this;
	} 

	public java.lang.String getDirectoryServiceDescription() { 
		return this.directoryServiceDescription;
	} 

	public void setDirectoryServiceDescription(java.lang.String directoryServiceDescription) { 
		this.directoryServiceDescription = directoryServiceDescription;
	} 

	public DirectoryHeadingPJImpl directoryServiceDescription(java.lang.String directoryServiceDescription) { 
		this.directoryServiceDescription = directoryServiceDescription;
		return this;
	} 

	public java.lang.String getApeCode() { 
		return this.apeCode;
	} 

	public void setApeCode(java.lang.String apeCode) { 
		this.apeCode = apeCode;
	} 

	public DirectoryHeadingPJImpl apeCode(java.lang.String apeCode) { 
		this.apeCode = apeCode;
		return this;
	} 

}
