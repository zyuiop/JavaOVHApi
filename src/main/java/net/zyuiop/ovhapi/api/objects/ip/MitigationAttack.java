package net.zyuiop.ovhapi.api.objects.ip;

/**
 * Mitigation attack on your ip
 */

public interface MitigationAttack { 

	/**
	 * @return End of the attack
	 */
	java.util.Date getEndDate(); 

	/**
	 * @return Internal id of your attack
	 */
	long getIdAttack(); 

	/**
	 * @return Your ip
	 */
	java.lang.String getIpAttack(); 

	/**
	 * @return Start of the attack
	 */
	java.util.Date getStartDate(); 

}
