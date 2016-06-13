package net.zyuiop.ovhapi.api.objects.dedicatedcloud;

/**
 * A structure describing the current password policy for your Dedicated Cloud
 */

public interface PasswordPolicy { 

	/**
	 * @return Minimum lenght of the password
	 */
	long getMinLength(); 

	/**
	 * @return Whether or not a lowercase letter (a-z) is mandatory in the password
	 */
	boolean getLowercaseLetterMandatory(); 

	/**
	 * @return List of denied characters in the password
	 */
	java.lang.String getDeniedChars(); 

	/**
	 * @return Whether or not an uppercase letter (A-Z) is mandatory in the password
	 */
	boolean getUppercaseLetterMandatory(); 

	/**
	 * @return Whether or not a digit (0-9) is mandatory in the password
	 */
	boolean getDigitMandatory(); 

	/**
	 * @return Maximum lenght of the password
	 */
	long getMaxLength(); 

	/**
	 * @return Whether or not a special character (\W or _) is mandatory in the password
	 */
	boolean getSpecialMandatory(); 

	/**
	 * @return Whether or not a letter (a-z or A-Z) is mandatory in the password
	 */
	boolean getLetterMandatory(); 

}
