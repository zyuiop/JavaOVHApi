package net.zyuiop.ovhapi.api.objects.sms;

/**
 * A structure describing ptt details
 */

public class PttDetails { 

	private java.lang.String comment;
	private java.lang.String duration;
	private java.lang.String description;

	public PttDetails() {
	}

	public java.lang.String getComment() { 
		return this.comment;
	} 

	public void setComment(java.lang.String comment) { 
		this.comment = comment;
	} 

	public PttDetails comment(java.lang.String comment) { 
		this.comment = comment;
		return this;
	} 

	public java.lang.String getDuration() { 
		return this.duration;
	} 

	public void setDuration(java.lang.String duration) { 
		this.duration = duration;
	} 

	public PttDetails duration(java.lang.String duration) { 
		this.duration = duration;
		return this;
	} 

	public java.lang.String getDescription() { 
		return this.description;
	} 

	public void setDescription(java.lang.String description) { 
		this.description = description;
	} 

	public PttDetails description(java.lang.String description) { 
		this.description = description;
		return this;
	} 

}
