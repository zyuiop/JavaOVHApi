package net.zyuiop.ovhapi.impl.objects.email.domain;

import net.zyuiop.ovhapi.api.objects.email.domain.Subscriber;
/**
 * Subscribers List
 */

public class SubscriberImpl implements Subscriber { 

	private java.lang.String email;
	private java.lang.String domain;
	private java.lang.String mailinglist;

	public SubscriberImpl() {
	}

	public java.lang.String getEmail() { 
		return this.email;
	} 

	public void setEmail(java.lang.String email) { 
		this.email = email;
	} 

	public SubscriberImpl email(java.lang.String email) { 
		this.email = email;
		return this;
	} 

	public java.lang.String getDomain() { 
		return this.domain;
	} 

	public void setDomain(java.lang.String domain) { 
		this.domain = domain;
	} 

	public SubscriberImpl domain(java.lang.String domain) { 
		this.domain = domain;
		return this;
	} 

	public java.lang.String getMailinglist() { 
		return this.mailinglist;
	} 

	public void setMailinglist(java.lang.String mailinglist) { 
		this.mailinglist = mailinglist;
	} 

	public SubscriberImpl mailinglist(java.lang.String mailinglist) { 
		this.mailinglist = mailinglist;
		return this;
	} 

}
