package net.zyuiop.ovhapi.impl.objects.telephony;

import net.zyuiop.ovhapi.api.objects.telephony.Phonebook;
/**
 * Phone book
 */

public class PhonebookImpl implements Phonebook { 

	private boolean isReadonly;
	private java.lang.String phoneKey;
	private java.lang.String name;
	private java.lang.String bookKey;

	public PhonebookImpl() {
	}

	public boolean getIsReadonly() { 
		return this.isReadonly;
	} 

	public void setIsReadonly(boolean isReadonly) { 
		this.isReadonly = isReadonly;
	} 

	public PhonebookImpl isReadonly(boolean isReadonly) { 
		this.isReadonly = isReadonly;
		return this;
	} 

	public java.lang.String getPhoneKey() { 
		return this.phoneKey;
	} 

	public void setPhoneKey(java.lang.String phoneKey) { 
		this.phoneKey = phoneKey;
	} 

	public PhonebookImpl phoneKey(java.lang.String phoneKey) { 
		this.phoneKey = phoneKey;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public PhonebookImpl name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public java.lang.String getBookKey() { 
		return this.bookKey;
	} 

	public void setBookKey(java.lang.String bookKey) { 
		this.bookKey = bookKey;
	} 

	public PhonebookImpl bookKey(java.lang.String bookKey) { 
		this.bookKey = bookKey;
		return this;
	} 

}
