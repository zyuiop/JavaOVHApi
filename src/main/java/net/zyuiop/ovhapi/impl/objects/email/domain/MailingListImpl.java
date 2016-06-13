package net.zyuiop.ovhapi.impl.objects.email.domain;

import net.zyuiop.ovhapi.api.objects.email.domain.MailingList;
/**
 * Mailing List
 */

public class MailingListImpl implements MailingList { 

	private java.lang.String language;
	private net.zyuiop.ovhapi.api.objects.domain.DomainMlOptionsStruct options;
	private java.lang.String name;
	private java.lang.String ownerEmail;
	private java.lang.String replyTo;
	private long id;
	private java.util.Date nbSubscribersUpdateDate;
	private long nbSubscribers;

	public MailingListImpl() {
	}

	public java.lang.String getLanguage() { 
		return this.language;
	} 

	public void setLanguage(java.lang.String language) { 
		this.language = language;
	} 

	public MailingListImpl language(java.lang.String language) { 
		this.language = language;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.domain.DomainMlOptionsStruct getOptions() { 
		return this.options;
	} 

	public void setOptions(net.zyuiop.ovhapi.api.objects.domain.DomainMlOptionsStruct options) { 
		this.options = options;
	} 

	public MailingListImpl options(net.zyuiop.ovhapi.api.objects.domain.DomainMlOptionsStruct options) { 
		this.options = options;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public MailingListImpl name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public java.lang.String getOwnerEmail() { 
		return this.ownerEmail;
	} 

	public void setOwnerEmail(java.lang.String ownerEmail) { 
		this.ownerEmail = ownerEmail;
	} 

	public MailingListImpl ownerEmail(java.lang.String ownerEmail) { 
		this.ownerEmail = ownerEmail;
		return this;
	} 

	public java.lang.String getReplyTo() { 
		return this.replyTo;
	} 

	public void setReplyTo(java.lang.String replyTo) { 
		this.replyTo = replyTo;
	} 

	public MailingListImpl replyTo(java.lang.String replyTo) { 
		this.replyTo = replyTo;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public MailingListImpl id(long id) { 
		this.id = id;
		return this;
	} 

	public java.util.Date getNbSubscribersUpdateDate() { 
		return this.nbSubscribersUpdateDate;
	} 

	public void setNbSubscribersUpdateDate(java.util.Date nbSubscribersUpdateDate) { 
		this.nbSubscribersUpdateDate = nbSubscribersUpdateDate;
	} 

	public MailingListImpl nbSubscribersUpdateDate(java.util.Date nbSubscribersUpdateDate) { 
		this.nbSubscribersUpdateDate = nbSubscribersUpdateDate;
		return this;
	} 

	public long getNbSubscribers() { 
		return this.nbSubscribers;
	} 

	public void setNbSubscribers(long nbSubscribers) { 
		this.nbSubscribers = nbSubscribers;
	} 

	public MailingListImpl nbSubscribers(long nbSubscribers) { 
		this.nbSubscribers = nbSubscribers;
		return this;
	} 

}
