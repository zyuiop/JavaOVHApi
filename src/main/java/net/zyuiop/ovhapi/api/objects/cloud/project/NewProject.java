package net.zyuiop.ovhapi.api.objects.cloud.project;

/**
 * New cloud project
 */

public interface NewProject { 

	/**
	 * @return Cloud project order id
	 */
	long getOrderId(); 

	/**
	 * @return Project creation status
	 */
	java.lang.String getStatus(); 

	/**
	 * @return Cloud project
	 */
	java.lang.String getProject(); 

	/**
	 * @return Cloud credit
	 */
	net.zyuiop.ovhapi.api.objects.cloud.project.NewProjectCredit getCredit(); 

	/**
	 * @return Agreement to valid
	 */
	long[] getAgreements(); 

	/**
	 * @return Cloud project description
	 */
	java.lang.String getDescription(); 

}
