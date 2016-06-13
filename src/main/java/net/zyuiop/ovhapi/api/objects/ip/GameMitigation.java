package net.zyuiop.ovhapi.api.objects.ip;

/**
 * GAME Anti-DDoS
 */

public interface GameMitigation { 

	/**
	 * @return Firewall mode : in UDP, only allow traffic matching your rules (as well as established traffic). If not enabled, traffic to ports not defined in your rules will be permited. TCP traffic is unaffected by this.
	 */
	boolean getFirewallModeEnabled(); 

	/**
	 * @return null
	 */
	java.lang.String getIpOnGame(); 

	/**
	 * @return null
	 */
	java.lang.String getState(); 

}
