package net.zyuiop.ovhapi.api.objects.xdsl;

/**
 * Information about the physical copper line
 */

public interface Line { 

	/**
	 * @return null
	 */
	java.lang.String getDeconsolidation(); 

	/**
	 * @return Data to identify the line at the concentration point
	 */
	net.zyuiop.ovhapi.api.objects.xdsl.LandlineConcentrationPoint getConcentrationPoint(); 

	/**
	 * @return The number of the line
	 */
	java.lang.String getNumber(); 

	/**
	 * @return Distance in meters from the DSLAM
	 */
	long getDistance(); 

	/**
	 * @return null
	 */
	java.lang.String getFaultRepairTime(); 

	/**
	 * @return True if the line is directly wired on the DSLAM
	 */
	boolean getDirectDistribution(); 

	/**
	 * @return Whether the line number has been ported to OVH, to be used with VoIP service
	 */
	boolean getPortability(); 

	/**
	 * @return Mitigation of the line in dB
	 */
	double getMitigation(); 

	/**
	 * @return Detailed information about the sections between the DSLAM and the telephone jack
	 */
	net.zyuiop.ovhapi.api.objects.xdsl.LineSectionLength getLineSectionsLength(); 

	/**
	 * @return The upload synchronisation on the DSLAM in Kbps
	 */
	double getSyncUp(); 

	/**
	 * @return The download synchronisation on the DSLAM in Kbps
	 */
	double getSyncDown(); 

	/**
	 * @return The number used to place the order. Null if the same as the current number.
	 */
	java.lang.String getOriginalNumber(); 

}
