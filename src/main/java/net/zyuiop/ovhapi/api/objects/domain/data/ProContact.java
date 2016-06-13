package net.zyuiop.ovhapi.api.objects.domain.data;

/**
 * Representation of an .pro Contact Resource
 */

public interface ProContact { 

	/**
	 * @return License number given by the authority
	 */
	java.lang.String getLicenseNumber(); 

	/**
	 * @return Description of your job
	 */
	java.lang.String getJobDescription(); 

	/**
	 * @return Website of the authority that certify your profesional status
	 */
	java.lang.String getAuthorityWebsite(); 

	/**
	 * @return .pro Contact ID
	 */
	long getId(); 

	/**
	 * @return Authority that certify your profesional status
	 */
	java.lang.String getAuthority(); 

}
