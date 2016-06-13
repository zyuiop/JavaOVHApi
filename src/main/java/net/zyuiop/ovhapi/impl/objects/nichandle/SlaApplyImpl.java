package net.zyuiop.ovhapi.impl.objects.nichandle;

import net.zyuiop.ovhapi.api.objects.nichandle.SlaApply;
/**
 * SLA properties
 */

public class SlaApplyImpl implements SlaApply { 

	private java.util.Date date;
	private java.lang.String name;
	private long id;
	private java.lang.String description;

	public SlaApplyImpl() {
	}

	public java.util.Date getDate() { 
		return this.date;
	} 

	public void setDate(java.util.Date date) { 
		this.date = date;
	} 

	public SlaApplyImpl date(java.util.Date date) { 
		this.date = date;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public SlaApplyImpl name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public SlaApplyImpl id(long id) { 
		this.id = id;
		return this;
	} 

	public java.lang.String getDescription() { 
		return this.description;
	} 

	public void setDescription(java.lang.String description) { 
		this.description = description;
	} 

	public SlaApplyImpl description(java.lang.String description) { 
		this.description = description;
		return this;
	} 

}
