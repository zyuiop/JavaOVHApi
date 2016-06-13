package net.zyuiop.ovhapi.impl.objects.sms;

import net.zyuiop.ovhapi.api.objects.sms.PttDetails;
/**
 * A structure describing ptt details
 */

public class PttDetailsImpl implements PttDetails { 

	private java.lang.String comment;
	private java.lang.String duration;
	private java.lang.String description;

	public PttDetailsImpl() {
	}

	public java.lang.String getComment() { 
		return this.comment;
	} 

	public void setComment(java.lang.String comment) { 
		this.comment = comment;
	} 

	public PttDetailsImpl comment(java.lang.String comment) { 
		this.comment = comment;
		return this;
	} 

	public java.lang.String getDuration() { 
		return this.duration;
	} 

	public void setDuration(java.lang.String duration) { 
		this.duration = duration;
	} 

	public PttDetailsImpl duration(java.lang.String duration) { 
		this.duration = duration;
		return this;
	} 

	public java.lang.String getDescription() { 
		return this.description;
	} 

	public void setDescription(java.lang.String description) { 
		this.description = description;
	} 

	public PttDetailsImpl description(java.lang.String description) { 
		this.description = description;
		return this;
	} 

}
