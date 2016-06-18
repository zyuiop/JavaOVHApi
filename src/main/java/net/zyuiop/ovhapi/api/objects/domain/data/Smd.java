package net.zyuiop.ovhapi.api.objects.domain.data;

/**
 * Representation of a SMD Resource file
 */

public interface Smd { 

	/**
	 * @return Date when information about SMD file aren't valid anymore
	 */
	java.util.Date getNotAfter(); 

	/**
	 * @return SMD file ID
	 */
	long getId(); 

	/**
	 * @return SMD file content
	 */
	java.lang.String getData(); 

	/**
	 * @return Date before when information about SMD file aren't valid yet
	 */
	java.util.Date getNotBefore(); 

	/**
	 * @return TMCH Internal identifier
	 */
	java.lang.String getSmdId(); 

	/**
	 * @return List of the labels that are protected with that SMD file
	 */
	net.zyuiop.ovhapi.api.objects.domain.data.SmdLabel[] getProtectedLabels(); 

}
