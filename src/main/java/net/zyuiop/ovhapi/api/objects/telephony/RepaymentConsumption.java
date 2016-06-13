package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Call which are repayable
 */

public interface RepaymentConsumption { 

	/**
	 * @return Calling number of the call
	 */
	java.lang.String getCalling(); 

	/**
	 * @return null
	 */
	long getConsumptionId(); 

	/**
	 * @return the Datetime of the start of the call
	 */
	java.util.Date getCreationDatetime(); 

	/**
	 * @return Price repayed with the call
	 */
	double getPrice(); 

	/**
	 * @return Duration of the call
	 */
	long getDuration(); 

	/**
	 * @return Called number of the call
	 */
	java.lang.String getCalled(); 

}
