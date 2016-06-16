package net.zyuiop.ovhapi.impl.objects.xdsl.eligibility;

import net.zyuiop.ovhapi.api.objects.xdsl.eligibility.Portability;
/**
 * Eligibility of the portability of the line number
 */

public class PortabilityImpl implements Portability { 

	private net.zyuiop.ovhapi.impl.objects.xdsl.eligibility.CodeAndMessageImpl warnings;
	private boolean underCondition;
	private boolean eligible;
	private net.zyuiop.ovhapi.impl.objects.xdsl.eligibility.CodeAndMessageImpl comments;

	public PortabilityImpl() {
	}

	public net.zyuiop.ovhapi.impl.objects.xdsl.eligibility.CodeAndMessageImpl getWarnings() { 
		return this.warnings;
	} 

	public void setWarnings(net.zyuiop.ovhapi.impl.objects.xdsl.eligibility.CodeAndMessageImpl warnings) { 
		this.warnings = warnings;
	} 

	public PortabilityImpl warnings(net.zyuiop.ovhapi.impl.objects.xdsl.eligibility.CodeAndMessageImpl warnings) { 
		this.warnings = warnings;
		return this;
	} 

	public boolean getUnderCondition() { 
		return this.underCondition;
	} 

	public void setUnderCondition(boolean underCondition) { 
		this.underCondition = underCondition;
	} 

	public PortabilityImpl underCondition(boolean underCondition) { 
		this.underCondition = underCondition;
		return this;
	} 

	public boolean getEligible() { 
		return this.eligible;
	} 

	public void setEligible(boolean eligible) { 
		this.eligible = eligible;
	} 

	public PortabilityImpl eligible(boolean eligible) { 
		this.eligible = eligible;
		return this;
	} 

	public net.zyuiop.ovhapi.impl.objects.xdsl.eligibility.CodeAndMessageImpl getComments() { 
		return this.comments;
	} 

	public void setComments(net.zyuiop.ovhapi.impl.objects.xdsl.eligibility.CodeAndMessageImpl comments) { 
		this.comments = comments;
	} 

	public PortabilityImpl comments(net.zyuiop.ovhapi.impl.objects.xdsl.eligibility.CodeAndMessageImpl comments) { 
		this.comments = comments;
		return this;
	} 

}
