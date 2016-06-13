package net.zyuiop.ovhapi.api.objects.nichandle;

/**
 * SLA properties
 */

public interface SlaApply { 

	/**
	 * @return Date of the event that led to SLA
	 */
	java.util.Date getDate(); 

	/**
	 * @return Sla operation name
	 */
	java.lang.String getName(); 

	/**
	 * @return SLA identifier
	 */
	long getId(); 

	/**
	 * @return Description of the SLA operation for this incident
	 */
	java.lang.String getDescription(); 

}
