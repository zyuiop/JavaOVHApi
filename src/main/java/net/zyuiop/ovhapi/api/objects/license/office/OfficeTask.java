package net.zyuiop.ovhapi.api.objects.license.office;

/**
 * Office task
 */

public interface OfficeTask { 

	/**
	 * @return Function name
	 */
	java.lang.String getFunction(); 

	/**
	 * @return Task state
	 */
	java.lang.String getStatus(); 

	/**
	 * @return Creation date
	 */
	java.util.Date getTodoDate(); 

	/**
	 * @return Completion date
	 */
	java.util.Date getFinishDate(); 

}
