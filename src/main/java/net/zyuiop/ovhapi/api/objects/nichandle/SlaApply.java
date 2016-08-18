package net.zyuiop.ovhapi.api.objects.nichandle;

/**
 * SLA properties
 */

public class SlaApply { 

	private java.util.Date date;
	private java.lang.String name;
	private long id;
	private java.lang.String description;

	public SlaApply() {
	}

	public java.util.Date getDate() { 
		return this.date;
	} 

	public void setDate(java.util.Date date) { 
		this.date = date;
	} 

	public SlaApply date(java.util.Date date) { 
		this.date = date;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public SlaApply name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public SlaApply id(long id) { 
		this.id = id;
		return this;
	} 

	public java.lang.String getDescription() { 
		return this.description;
	} 

	public void setDescription(java.lang.String description) { 
		this.description = description;
	} 

	public SlaApply description(java.lang.String description) { 
		this.description = description;
		return this;
	} 

}
