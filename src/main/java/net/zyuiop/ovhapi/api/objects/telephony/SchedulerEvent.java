package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Scheduled event
 */

public class SchedulerEvent { 

	private java.lang.String uid;
	private java.util.Date dateStart;
	private java.lang.String title;
	private java.util.Date dateEnd;
	private java.lang.String categories;
	private java.lang.String description;

	public SchedulerEvent() {
	}

	public java.lang.String getUid() { 
		return this.uid;
	} 

	public void setUid(java.lang.String uid) { 
		this.uid = uid;
	} 

	public SchedulerEvent uid(java.lang.String uid) { 
		this.uid = uid;
		return this;
	} 

	public java.util.Date getDateStart() { 
		return this.dateStart;
	} 

	public void setDateStart(java.util.Date dateStart) { 
		this.dateStart = dateStart;
	} 

	public SchedulerEvent dateStart(java.util.Date dateStart) { 
		this.dateStart = dateStart;
		return this;
	} 

	public java.lang.String getTitle() { 
		return this.title;
	} 

	public void setTitle(java.lang.String title) { 
		this.title = title;
	} 

	public SchedulerEvent title(java.lang.String title) { 
		this.title = title;
		return this;
	} 

	public java.util.Date getDateEnd() { 
		return this.dateEnd;
	} 

	public void setDateEnd(java.util.Date dateEnd) { 
		this.dateEnd = dateEnd;
	} 

	public SchedulerEvent dateEnd(java.util.Date dateEnd) { 
		this.dateEnd = dateEnd;
		return this;
	} 

	public java.lang.String getCategories() { 
		return this.categories;
	} 

	public void setCategories(java.lang.String categories) { 
		this.categories = categories;
	} 

	public SchedulerEvent categories(java.lang.String categories) { 
		this.categories = categories;
		return this;
	} 

	public java.lang.String getDescription() { 
		return this.description;
	} 

	public void setDescription(java.lang.String description) { 
		this.description = description;
	} 

	public SchedulerEvent description(java.lang.String description) { 
		this.description = description;
		return this;
	} 

}
