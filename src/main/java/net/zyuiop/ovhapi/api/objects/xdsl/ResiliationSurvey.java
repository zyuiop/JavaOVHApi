package net.zyuiop.ovhapi.api.objects.xdsl;

/**
 * Information about the reason for the resiliation
 */

public class ResiliationSurvey { 

	private java.lang.String comment;
	private java.lang.String type;

	public ResiliationSurvey() {
	}

	public java.lang.String getComment() { 
		return this.comment;
	} 

	public void setComment(java.lang.String comment) { 
		this.comment = comment;
	} 

	public ResiliationSurvey comment(java.lang.String comment) { 
		this.comment = comment;
		return this;
	} 

	public java.lang.String getType() { 
		return this.type;
	} 

	public void setType(java.lang.String type) { 
		this.type = type;
	} 

	public ResiliationSurvey type(java.lang.String type) { 
		this.type = type;
		return this;
	} 

}
