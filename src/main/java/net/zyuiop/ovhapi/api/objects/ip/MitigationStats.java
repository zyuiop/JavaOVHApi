package net.zyuiop.ovhapi.api.objects.ip;

/**
 * Traffic statistics in and out on a mitigated ip
 */

public interface MitigationStats { 

	/**
	 * @return Traffic out
	 */
	net.zyuiop.ovhapi.api.objects.ip.MitigationTraffic getOut(); 

	/**
	 * @return Traffic timestamp
	 */
	long getTimestamp(); 

	/**
	 * @return Traffic in
	 */
	net.zyuiop.ovhapi.api.objects.ip.MitigationTraffic getIn(); 

}
