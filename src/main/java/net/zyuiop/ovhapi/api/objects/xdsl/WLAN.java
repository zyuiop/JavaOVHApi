package net.zyuiop.ovhapi.api.objects.xdsl;

/**
 * WLAN Configuration of the Modem
 */

public interface WLAN { 

	/**
	 * @return How the channel is chosen (Auto / Manual)
	 */
	java.lang.String getChannelMode(); 

	/**
	 * @return ID of the ongoing todo (NULL if none)
	 */
	long getTaskId(); 

	/**
	 * @return Hide or show the Wifi
	 */
	boolean getSSIDAdvertisementEnabled(); 

	/**
	 * @return Service Set Identifier of the WLAN interface
	 */
	java.lang.String getSSID(); 

	/**
	 * @return Choice of a channel (When chosen, channelMode is set to Manual)
	 */
	long getChannel(); 

	/**
	 * @return Security (None | WEP | WPA | WPA2 | WPAandWPA2)
	 */
	java.lang.String getSecurityType(); 

	/**
	 * @return WPA or WEP key
	 */
	java.lang.String getSecurityKey(); 

	/**
	 * @return Wifi state
	 */
	boolean getEnabled(); 

	/**
	 * @return Name of the Wifi
	 */
	java.lang.String getWifiName(); 

}
