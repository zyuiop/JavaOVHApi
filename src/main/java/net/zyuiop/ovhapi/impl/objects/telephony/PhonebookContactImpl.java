package net.zyuiop.ovhapi.impl.objects.telephony;

import net.zyuiop.ovhapi.api.objects.telephony.PhonebookContact;
/**
 * Phone book contact
 */

public class PhonebookContactImpl implements PhonebookContact { 

	private java.lang.String workMobile;
	private java.lang.String name;
	private java.lang.String workPhone;
	private java.lang.String surname;
	private java.lang.String homeMobile;
	private java.lang.String group;
	private long id;
	private java.lang.String homePhone;

	public PhonebookContactImpl() {
	}

	public java.lang.String getWorkMobile() { 
		return this.workMobile;
	} 

	public void setWorkMobile(java.lang.String workMobile) { 
		this.workMobile = workMobile;
	} 

	public PhonebookContactImpl workMobile(java.lang.String workMobile) { 
		this.workMobile = workMobile;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public PhonebookContactImpl name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public java.lang.String getWorkPhone() { 
		return this.workPhone;
	} 

	public void setWorkPhone(java.lang.String workPhone) { 
		this.workPhone = workPhone;
	} 

	public PhonebookContactImpl workPhone(java.lang.String workPhone) { 
		this.workPhone = workPhone;
		return this;
	} 

	public java.lang.String getSurname() { 
		return this.surname;
	} 

	public void setSurname(java.lang.String surname) { 
		this.surname = surname;
	} 

	public PhonebookContactImpl surname(java.lang.String surname) { 
		this.surname = surname;
		return this;
	} 

	public java.lang.String getHomeMobile() { 
		return this.homeMobile;
	} 

	public void setHomeMobile(java.lang.String homeMobile) { 
		this.homeMobile = homeMobile;
	} 

	public PhonebookContactImpl homeMobile(java.lang.String homeMobile) { 
		this.homeMobile = homeMobile;
		return this;
	} 

	public java.lang.String getGroup() { 
		return this.group;
	} 

	public void setGroup(java.lang.String group) { 
		this.group = group;
	} 

	public PhonebookContactImpl group(java.lang.String group) { 
		this.group = group;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public PhonebookContactImpl id(long id) { 
		this.id = id;
		return this;
	} 

	public java.lang.String getHomePhone() { 
		return this.homePhone;
	} 

	public void setHomePhone(java.lang.String homePhone) { 
		this.homePhone = homePhone;
	} 

	public PhonebookContactImpl homePhone(java.lang.String homePhone) { 
		this.homePhone = homePhone;
		return this;
	} 

}
