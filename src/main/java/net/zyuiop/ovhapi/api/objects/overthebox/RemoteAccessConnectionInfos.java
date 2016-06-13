package net.zyuiop.ovhapi.api.objects.overthebox;

/**
 * All the infos needed to connect yourself to your OTB
 */

public interface RemoteAccessConnectionInfos { 

	/**
	 * @return IP to connect to when accessing the device remotely
	 */
	java.lang.String getIp(); 

	/**
	 * @return Port to connect to when accessing the device remotely
	 */
	long getPort(); 

}
