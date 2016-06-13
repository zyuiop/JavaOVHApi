package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Relevant informations of the service detected from the MOS or the signal leg in SIP/MGCP protocol.
 */

public interface DiagnosticReport { 

	/**
	 * @return The level of the diagnostic
	 */
	java.lang.String getLevel(); 

	/**
	 * @return Report of the diagnostic
	 */
	java.lang.String getReport(); 

	/**
	 * @return Identifier of the concerned leg
	 */
	java.lang.String getCallId(); 

	/**
	 * @return Name of the rule detected
	 */
	java.lang.String getName(); 

	/**
	 * @return Typology where the diagnostic arriving from
	 */
	java.lang.String getCategory(); 

	/**
	 * @return Explanation of the diagnostic
	 */
	java.lang.String getDescription(); 

	/**
	 * @return Datetime of the diagnostic
	 */
	java.util.Date getDatetime(); 

}
