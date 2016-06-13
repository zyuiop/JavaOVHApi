package net.zyuiop.ovhapi.impl.objects.dedicatedcloud;

import net.zyuiop.ovhapi.api.objects.dedicatedcloud.PasswordPolicy;
/**
 * A structure describing the current password policy for your Dedicated Cloud
 */

public class PasswordPolicyImpl implements PasswordPolicy { 

	private long minLength;
	private boolean lowercaseLetterMandatory;
	private java.lang.String deniedChars;
	private boolean uppercaseLetterMandatory;
	private boolean digitMandatory;
	private long maxLength;
	private boolean specialMandatory;
	private boolean letterMandatory;

	public PasswordPolicyImpl() {
	}

	public long getMinLength() { 
		return this.minLength;
	} 

	public void setMinLength(long minLength) { 
		this.minLength = minLength;
	} 

	public PasswordPolicyImpl minLength(long minLength) { 
		this.minLength = minLength;
		return this;
	} 

	public boolean getLowercaseLetterMandatory() { 
		return this.lowercaseLetterMandatory;
	} 

	public void setLowercaseLetterMandatory(boolean lowercaseLetterMandatory) { 
		this.lowercaseLetterMandatory = lowercaseLetterMandatory;
	} 

	public PasswordPolicyImpl lowercaseLetterMandatory(boolean lowercaseLetterMandatory) { 
		this.lowercaseLetterMandatory = lowercaseLetterMandatory;
		return this;
	} 

	public java.lang.String getDeniedChars() { 
		return this.deniedChars;
	} 

	public void setDeniedChars(java.lang.String deniedChars) { 
		this.deniedChars = deniedChars;
	} 

	public PasswordPolicyImpl deniedChars(java.lang.String deniedChars) { 
		this.deniedChars = deniedChars;
		return this;
	} 

	public boolean getUppercaseLetterMandatory() { 
		return this.uppercaseLetterMandatory;
	} 

	public void setUppercaseLetterMandatory(boolean uppercaseLetterMandatory) { 
		this.uppercaseLetterMandatory = uppercaseLetterMandatory;
	} 

	public PasswordPolicyImpl uppercaseLetterMandatory(boolean uppercaseLetterMandatory) { 
		this.uppercaseLetterMandatory = uppercaseLetterMandatory;
		return this;
	} 

	public boolean getDigitMandatory() { 
		return this.digitMandatory;
	} 

	public void setDigitMandatory(boolean digitMandatory) { 
		this.digitMandatory = digitMandatory;
	} 

	public PasswordPolicyImpl digitMandatory(boolean digitMandatory) { 
		this.digitMandatory = digitMandatory;
		return this;
	} 

	public long getMaxLength() { 
		return this.maxLength;
	} 

	public void setMaxLength(long maxLength) { 
		this.maxLength = maxLength;
	} 

	public PasswordPolicyImpl maxLength(long maxLength) { 
		this.maxLength = maxLength;
		return this;
	} 

	public boolean getSpecialMandatory() { 
		return this.specialMandatory;
	} 

	public void setSpecialMandatory(boolean specialMandatory) { 
		this.specialMandatory = specialMandatory;
	} 

	public PasswordPolicyImpl specialMandatory(boolean specialMandatory) { 
		this.specialMandatory = specialMandatory;
		return this;
	} 

	public boolean getLetterMandatory() { 
		return this.letterMandatory;
	} 

	public void setLetterMandatory(boolean letterMandatory) { 
		this.letterMandatory = letterMandatory;
	} 

	public PasswordPolicyImpl letterMandatory(boolean letterMandatory) { 
		this.letterMandatory = letterMandatory;
		return this;
	} 

}
