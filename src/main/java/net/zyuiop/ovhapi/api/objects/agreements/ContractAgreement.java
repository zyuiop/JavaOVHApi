package net.zyuiop.ovhapi.api.objects.agreements;

/**
 * Contract agreement
 */

public interface ContractAgreement { 

	/**
	 * @return State of the agreement
	 */
	java.lang.String getAgreed(); 

	/**
	 * @return Date the agreed contract was effective
	 */
	java.util.Date getDate(); 

	/**
	 * @return Id of the contract
	 */
	long getId(); 

	/**
	 * @return Id of the agreed contract
	 */
	long getContractId(); 

}
