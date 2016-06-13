package net.zyuiop.ovhapi.impl.objects.email.exchange;

import net.zyuiop.ovhapi.api.objects.email.exchange.ExchangeServiceAuthorizedIp;
/**
 * Get authorized IPs for POP, IMAP and webmail
 */

public class ExchangeServiceAuthorizedIpImpl implements ExchangeServiceAuthorizedIp { 

	private java.util.Date creationDate;
	private java.lang.String ip;
	private java.lang.String status;

	public ExchangeServiceAuthorizedIpImpl() {
	}

	public java.util.Date getCreationDate() { 
		return this.creationDate;
	} 

	public void setCreationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
	} 

	public ExchangeServiceAuthorizedIpImpl creationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
		return this;
	} 

	public java.lang.String getIp() { 
		return this.ip;
	} 

	public void setIp(java.lang.String ip) { 
		this.ip = ip;
	} 

	public ExchangeServiceAuthorizedIpImpl ip(java.lang.String ip) { 
		this.ip = ip;
		return this;
	} 

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public ExchangeServiceAuthorizedIpImpl status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

}
