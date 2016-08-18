package net.zyuiop.ovhapi.api.objects.email.exchange;

/**
 * External contact for this exchange service
 */

public class ExchangeExternalContact { 

	private java.lang.String initials;
	private java.lang.String firstName;
	private boolean hiddenFromGAL;
	private java.lang.String organization2010;
	private java.lang.String state;
	private java.util.Date creationDate;
	private long id;
	private java.lang.String lastName;
	private long taskPendingId;
	private java.lang.String externalEmailAddress;
	private java.lang.String displayName;

	public ExchangeExternalContact() {
	}

	public java.lang.String getInitials() { 
		return this.initials;
	} 

	public void setInitials(java.lang.String initials) { 
		this.initials = initials;
	} 

	public ExchangeExternalContact initials(java.lang.String initials) { 
		this.initials = initials;
		return this;
	} 

	public java.lang.String getFirstName() { 
		return this.firstName;
	} 

	public void setFirstName(java.lang.String firstName) { 
		this.firstName = firstName;
	} 

	public ExchangeExternalContact firstName(java.lang.String firstName) { 
		this.firstName = firstName;
		return this;
	} 

	public boolean getHiddenFromGAL() { 
		return this.hiddenFromGAL;
	} 

	public void setHiddenFromGAL(boolean hiddenFromGAL) { 
		this.hiddenFromGAL = hiddenFromGAL;
	} 

	public ExchangeExternalContact hiddenFromGAL(boolean hiddenFromGAL) { 
		this.hiddenFromGAL = hiddenFromGAL;
		return this;
	} 

	public java.lang.String getOrganization2010() { 
		return this.organization2010;
	} 

	public void setOrganization2010(java.lang.String organization2010) { 
		this.organization2010 = organization2010;
	} 

	public ExchangeExternalContact organization2010(java.lang.String organization2010) { 
		this.organization2010 = organization2010;
		return this;
	} 

	public java.lang.String getState() { 
		return this.state;
	} 

	public void setState(java.lang.String state) { 
		this.state = state;
	} 

	public ExchangeExternalContact state(java.lang.String state) { 
		this.state = state;
		return this;
	} 

	public java.util.Date getCreationDate() { 
		return this.creationDate;
	} 

	public void setCreationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
	} 

	public ExchangeExternalContact creationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public ExchangeExternalContact id(long id) { 
		this.id = id;
		return this;
	} 

	public java.lang.String getLastName() { 
		return this.lastName;
	} 

	public void setLastName(java.lang.String lastName) { 
		this.lastName = lastName;
	} 

	public ExchangeExternalContact lastName(java.lang.String lastName) { 
		this.lastName = lastName;
		return this;
	} 

	public long getTaskPendingId() { 
		return this.taskPendingId;
	} 

	public void setTaskPendingId(long taskPendingId) { 
		this.taskPendingId = taskPendingId;
	} 

	public ExchangeExternalContact taskPendingId(long taskPendingId) { 
		this.taskPendingId = taskPendingId;
		return this;
	} 

	public java.lang.String getExternalEmailAddress() { 
		return this.externalEmailAddress;
	} 

	public void setExternalEmailAddress(java.lang.String externalEmailAddress) { 
		this.externalEmailAddress = externalEmailAddress;
	} 

	public ExchangeExternalContact externalEmailAddress(java.lang.String externalEmailAddress) { 
		this.externalEmailAddress = externalEmailAddress;
		return this;
	} 

	public java.lang.String getDisplayName() { 
		return this.displayName;
	} 

	public void setDisplayName(java.lang.String displayName) { 
		this.displayName = displayName;
	} 

	public ExchangeExternalContact displayName(java.lang.String displayName) { 
		this.displayName = displayName;
		return this;
	} 

}
