package net.zyuiop.ovhapi.api.objects.overthebox;

/**
 * A device for registration
 */

public interface DeviceForRegistration { 

	/**
	 * @return Whether or not this device is actived
	 */
	boolean getActivated(); 

	/**
	 * @return null
	 */
	java.lang.String getDeviceId(); 

	/**
	 * @return The last time this device was seen on the provisionning servers
	 */
	java.util.Date getLastSeen(); 

}
