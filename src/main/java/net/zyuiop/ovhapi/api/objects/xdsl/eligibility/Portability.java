package net.zyuiop.ovhapi.api.objects.xdsl.eligibility;

/**
 * Eligibility of the portability of the line number
 */

public interface Portability { 

	/**
	 * @return The special condition(s) of the portability
	 */
	net.zyuiop.ovhapi.api.objects.xdsl.eligibility.CodeAndMessage getWarnings(); 

	/**
	 * @return Whether or not the portability is possible under condition. If true, warningList contains the reason(s)
	 */
	boolean getUnderCondition(); 

	/**
	 * @return Whether or not it is possible to port the line number. If false, commentList contains the reason(s)
	 */
	boolean getEligible(); 

	/**
	 * @return The reason(s) of the negative portability eligibility
	 */
	net.zyuiop.ovhapi.api.objects.xdsl.eligibility.CodeAndMessage getComments(); 

}
