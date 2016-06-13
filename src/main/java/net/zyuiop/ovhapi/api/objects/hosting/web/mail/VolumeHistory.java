package net.zyuiop.ovhapi.api.objects.hosting.web.mail;

/**
 * The volume history type
 */

public interface VolumeHistory { 

	/**
	 * @return The volume history size
	 */
	long getVolume(); 

	/**
	 * @return The datetime of this volume history point
	 */
	java.util.Date getDate(); 

}
