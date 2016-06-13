package net.zyuiop.ovhapi.api.objects.xdsl;

/**
 * Infos about a Landline at the concentration point
 */

public interface LandlineConcentrationPoint { 

	/**
	 * @return Identifier of the head of the cable from the MDF
	 */
	java.lang.String getLineHead(); 

	/**
	 * @return Identifier of the pair at the lineHead's lineInitialSection
	 */
	long getLineInitialSectionPair(); 

	/**
	 * @return Identifier of the section at the lineHead
	 */
	long getLineInitialSection(); 

}
