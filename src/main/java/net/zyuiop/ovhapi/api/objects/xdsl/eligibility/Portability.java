package net.zyuiop.ovhapi.api.objects.xdsl.eligibility;

/**
 * Eligibility of the portability of the line number
 */

public class Portability { 

	private net.zyuiop.ovhapi.api.objects.xdsl.eligibility.CodeAndMessage[] warnings;
	private boolean underCondition;
	private boolean eligible;
	private net.zyuiop.ovhapi.api.objects.xdsl.eligibility.CodeAndMessage[] comments;

	public Portability() {
	}

	public net.zyuiop.ovhapi.api.objects.xdsl.eligibility.CodeAndMessage[] getWarnings() { 
		return this.warnings;
	} 

	public void setWarnings(net.zyuiop.ovhapi.api.objects.xdsl.eligibility.CodeAndMessage[] warnings) { 
		this.warnings = warnings;
	} 

	public Portability warnings(net.zyuiop.ovhapi.api.objects.xdsl.eligibility.CodeAndMessage[] warnings) { 
		this.warnings = warnings;
		return this;
	} 

	public boolean getUnderCondition() { 
		return this.underCondition;
	} 

	public void setUnderCondition(boolean underCondition) { 
		this.underCondition = underCondition;
	} 

	public Portability underCondition(boolean underCondition) { 
		this.underCondition = underCondition;
		return this;
	} 

	public boolean getEligible() { 
		return this.eligible;
	} 

	public void setEligible(boolean eligible) { 
		this.eligible = eligible;
	} 

	public Portability eligible(boolean eligible) { 
		this.eligible = eligible;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.xdsl.eligibility.CodeAndMessage[] getComments() { 
		return this.comments;
	} 

	public void setComments(net.zyuiop.ovhapi.api.objects.xdsl.eligibility.CodeAndMessage[] comments) { 
		this.comments = comments;
	} 

	public Portability comments(net.zyuiop.ovhapi.api.objects.xdsl.eligibility.CodeAndMessage[] comments) { 
		this.comments = comments;
		return this;
	} 

}
