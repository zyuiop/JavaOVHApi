package net.zyuiop.ovhapi.impl.objects.sms;

import net.zyuiop.ovhapi.api.objects.sms.TemplateControl;
/**
 * Sms template for moderation (Needed to send in US country)
 */

public class TemplateControlImpl implements TemplateControl { 

	private java.lang.String comment;
	private java.lang.String status;
	private java.lang.String name;
	private java.lang.String description;
	private java.lang.String activity;
	private java.lang.String message;
	private java.util.Date datetime;

	public TemplateControlImpl() {
	}

	public java.lang.String getComment() { 
		return this.comment;
	} 

	public void setComment(java.lang.String comment) { 
		this.comment = comment;
	} 

	public TemplateControlImpl comment(java.lang.String comment) { 
		this.comment = comment;
		return this;
	} 

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public TemplateControlImpl status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public TemplateControlImpl name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public java.lang.String getDescription() { 
		return this.description;
	} 

	public void setDescription(java.lang.String description) { 
		this.description = description;
	} 

	public TemplateControlImpl description(java.lang.String description) { 
		this.description = description;
		return this;
	} 

	public java.lang.String getActivity() { 
		return this.activity;
	} 

	public void setActivity(java.lang.String activity) { 
		this.activity = activity;
	} 

	public TemplateControlImpl activity(java.lang.String activity) { 
		this.activity = activity;
		return this;
	} 

	public java.lang.String getMessage() { 
		return this.message;
	} 

	public void setMessage(java.lang.String message) { 
		this.message = message;
	} 

	public TemplateControlImpl message(java.lang.String message) { 
		this.message = message;
		return this;
	} 

	public java.util.Date getDatetime() { 
		return this.datetime;
	} 

	public void setDatetime(java.util.Date datetime) { 
		this.datetime = datetime;
	} 

	public TemplateControlImpl datetime(java.util.Date datetime) { 
		this.datetime = datetime;
		return this;
	} 

}
