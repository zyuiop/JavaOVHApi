package net.zyuiop.ovhapi.api.objects.ip;

/**
 * Detailed statistics about your traffic
 */

public interface MitigationDetailedStats { 

	/**
	 * @return Traffic out
	 */
	net.zyuiop.ovhapi.api.objects.ip.MitigationTraffic getOut(); 

	/**
	 * @return Used protocol. See RFC5237 for more information
	 */
	long getProtocol(); 

	/**
	 * @return Traffic source port
	 */
	long getSrcPort(); 

	/**
	 * @return Traffic dest port
	 */
	long getDestPort(); 

	/**
	 * @return ICMP protocol type
	 */
	long getIcmpType(); 

	/**
	 * @return ICMP protocol code
	 */
	long getIcmpCode(); 

	/**
	 * @return Traffic in
	 */
	net.zyuiop.ovhapi.api.objects.ip.MitigationTraffic getIn(); 

	/**
	 * @return null
	 */
	boolean getSyn(); 

	/**
	 * @return null
	 */
	boolean getFragments(); 

}
