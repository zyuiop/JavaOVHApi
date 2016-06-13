package net.zyuiop.ovhapi.impl.objects.telephony;

import net.zyuiop.ovhapi.api.objects.telephony.PhonebookMaster;
/**
 * Phone book on group
 */

public class PhonebookMasterImpl implements PhonebookMaster { 

	private java.lang.String name;
	private java.lang.String bookKey;

	public PhonebookMasterImpl() {
	}

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public PhonebookMasterImpl name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public java.lang.String getBookKey() { 
		return this.bookKey;
	} 

	public void setBookKey(java.lang.String bookKey) { 
		this.bookKey = bookKey;
	} 

	public PhonebookMasterImpl bookKey(java.lang.String bookKey) { 
		this.bookKey = bookKey;
		return this;
	} 

}
