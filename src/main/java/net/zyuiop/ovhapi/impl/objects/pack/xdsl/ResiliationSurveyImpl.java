package net.zyuiop.ovhapi.impl.objects.pack.xdsl;

import net.zyuiop.ovhapi.api.objects.pack.xdsl.ResiliationSurvey;
/**
 * Information about the reason for the resiliation
 */

public class ResiliationSurveyImpl implements ResiliationSurvey { 

	private java.lang.String comment;
	private java.lang.String type;

	public ResiliationSurveyImpl() {
	}

	public java.lang.String getComment() { 
		return this.comment;
	} 

	public void setComment(java.lang.String comment) { 
		this.comment = comment;
	} 

	public ResiliationSurveyImpl comment(java.lang.String comment) { 
		this.comment = comment;
		return this;
	} 

	public java.lang.String getType() { 
		return this.type;
	} 

	public void setType(java.lang.String type) { 
		this.type = type;
	} 

	public ResiliationSurveyImpl type(java.lang.String type) { 
		this.type = type;
		return this;
	} 

}
