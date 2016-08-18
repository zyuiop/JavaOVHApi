package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Phone book on group
 */

public class PhonebookMaster { 

	private java.lang.String name;
	private java.lang.String bookKey;

	public PhonebookMaster() {
	}

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public PhonebookMaster name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public java.lang.String getBookKey() { 
		return this.bookKey;
	} 

	public void setBookKey(java.lang.String bookKey) { 
		this.bookKey = bookKey;
	} 

	public PhonebookMaster bookKey(java.lang.String bookKey) { 
		this.bookKey = bookKey;
		return this;
	} 

}
