package net.zyuiop.ovhapi.api.objects.domain.data;

/**
 * Representation of a protected label
 */

public interface SmdLabel { 

	/**
	 * @return Label that is protected
	 */
	java.lang.String getLabel(); 

	/**
	 * @return Trademark associated to the protected label
	 */
	java.lang.String getTrademark(); 

}
