package net.zyuiop.ovhapi.api.objects.iploadbalancing;

/**
 * Backend
 */

public interface Backend { 

	/**
	 * @return Zone of you backend.
	 */
	java.lang.String getZone(); 

	/**
	 * @return Backend name
	 */
	java.lang.String getName(); 

	/**
	 * @return Port attached to your backend. Inherited from frontend if null
	 */
	long getPort(); 

	/**
	 * @return Stickiness type. No stickyness if null
	 */
	java.lang.String getStickiness(); 

	/**
	 * @return Load balancing algorithm. 'roundrobin' if null
	 */
	java.lang.String getBalance(); 

	/**
	 * @return Id of your backend
	 */
	long getId(); 

	/**
	 * @return Type of your backend
	 */
	java.lang.String getType(); 

	/**
	 * @return Probe type. 'tcp' if null
	 */
	java.lang.String getProbe(); 

}
