package net.zyuiop.ovhapi.api.objects.nichandle;

/**
 * Describe all services impacted by SLA
 */

public interface SlaService { 

	/**
	 * @return SLA plan application
	 */
	java.lang.String getSlaApplication(); 

	/**
	 * @return Impacted service name
	 */
	java.lang.String getServiceName(); 

	/**
	 * @return Service description
	 */
	java.lang.String getDescription(); 

	/**
	 * @return SLA plan description
	 */
	java.lang.String getSlaPlan(); 

}
