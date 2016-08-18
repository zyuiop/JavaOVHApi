package net.zyuiop.ovhapi.api.objects.domain;

/**
 * Values of quota account (pop, mailing list, redirection, responder and big pop)
 */

public class DomainQuota { 

	private long responder;
	private long account;
	private long mailingList;
	private long redirection;
	private long alias;

	public DomainQuota() {
	}

	public long getResponder() { 
		return this.responder;
	} 

	public void setResponder(long responder) { 
		this.responder = responder;
	} 

	public DomainQuota responder(long responder) { 
		this.responder = responder;
		return this;
	} 

	public long getAccount() { 
		return this.account;
	} 

	public void setAccount(long account) { 
		this.account = account;
	} 

	public DomainQuota account(long account) { 
		this.account = account;
		return this;
	} 

	public long getMailingList() { 
		return this.mailingList;
	} 

	public void setMailingList(long mailingList) { 
		this.mailingList = mailingList;
	} 

	public DomainQuota mailingList(long mailingList) { 
		this.mailingList = mailingList;
		return this;
	} 

	public long getRedirection() { 
		return this.redirection;
	} 

	public void setRedirection(long redirection) { 
		this.redirection = redirection;
	} 

	public DomainQuota redirection(long redirection) { 
		this.redirection = redirection;
		return this;
	} 

	public long getAlias() { 
		return this.alias;
	} 

	public void setAlias(long alias) { 
		this.alias = alias;
	} 

	public DomainQuota alias(long alias) { 
		this.alias = alias;
		return this;
	} 

}
