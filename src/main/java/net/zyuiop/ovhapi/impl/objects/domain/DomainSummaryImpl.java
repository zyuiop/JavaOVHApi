package net.zyuiop.ovhapi.impl.objects.domain;

import net.zyuiop.ovhapi.api.objects.domain.DomainSummary;
/**
 * Values of number account (account, mailing list, redirection and responder)
 */

public class DomainSummaryImpl implements DomainSummary { 

	private long responder;
	private long account;
	private long mailingList;
	private long redirection;

	public DomainSummaryImpl() {
	}

	public long getResponder() { 
		return this.responder;
	} 

	public void setResponder(long responder) { 
		this.responder = responder;
	} 

	public DomainSummaryImpl responder(long responder) { 
		this.responder = responder;
		return this;
	} 

	public long getAccount() { 
		return this.account;
	} 

	public void setAccount(long account) { 
		this.account = account;
	} 

	public DomainSummaryImpl account(long account) { 
		this.account = account;
		return this;
	} 

	public long getMailingList() { 
		return this.mailingList;
	} 

	public void setMailingList(long mailingList) { 
		this.mailingList = mailingList;
	} 

	public DomainSummaryImpl mailingList(long mailingList) { 
		this.mailingList = mailingList;
		return this;
	} 

	public long getRedirection() { 
		return this.redirection;
	} 

	public void setRedirection(long redirection) { 
		this.redirection = redirection;
	} 

	public DomainSummaryImpl redirection(long redirection) { 
		this.redirection = redirection;
		return this;
	} 

}
