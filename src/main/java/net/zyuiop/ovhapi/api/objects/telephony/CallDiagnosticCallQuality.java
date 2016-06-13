package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Call diagnostic analyze structure on metric performance values
 */

public interface CallDiagnosticCallQuality { 

	/**
	 * @return Codec used in this direction flow
	 */
	java.lang.String getCodec(); 

	/**
	 * @return Destination port
	 */
	long getPortDst(); 

	/**
	 * @return Call identifier of the sip signal leg
	 */
	java.lang.String getCallId(); 

	/**
	 * @return Variation in the delay of received packets. Smaller is better and less is more
	 */
	double getMaxJitter(); 

	/**
	 * @return The ip address destination
	 */
	java.lang.String getIpDst(); 

	/**
	 * @return The number of packet sent in the given direction flow
	 */
	long getPackets(); 

	/**
	 * @return The max delay between two packet in the given direction flow
	 */
	double getMaxDelay(); 

	/**
	 * @return The port source
	 */
	long getPortSrc(); 

	/**
	 * @return Number of packet RTP lost in the direction flow
	 */
	long getRtpLost(); 

	/**
	 * @return Identifier of the metric performance value
	 */
	long getFlowId(); 

	/**
	 * @return The creation timestamp of the given direction flow
	 */
	java.util.Date getTimestamp(); 

	/**
	 * @return The ip address source
	 */
	java.lang.String getIpSrc(); 

	/**
	 * @return Mean Opinion Score expressed in one number, from 1 to 5, 1 being the worst and 5 the best.
	 */
	long getMos(); 

}
