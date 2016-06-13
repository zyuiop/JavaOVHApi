package net.zyuiop.ovhapi.impl.objects.pca;

import net.zyuiop.ovhapi.api.objects.pca.Account;
/**
 * Cloud Archives Account
 */

public class AccountImpl implements Account { 

	private java.lang.String domain;
	private java.lang.String password;
	private java.lang.String sshkey;
	private java.lang.String login;
	private java.lang.String host;

	public AccountImpl() {
	}

	public java.lang.String getDomain() { 
		return this.domain;
	} 

	public void setDomain(java.lang.String domain) { 
		this.domain = domain;
	} 

	public AccountImpl domain(java.lang.String domain) { 
		this.domain = domain;
		return this;
	} 

	public java.lang.String getPassword() { 
		return this.password;
	} 

	public void setPassword(java.lang.String password) { 
		this.password = password;
	} 

	public AccountImpl password(java.lang.String password) { 
		this.password = password;
		return this;
	} 

	public java.lang.String getSshkey() { 
		return this.sshkey;
	} 

	public void setSshkey(java.lang.String sshkey) { 
		this.sshkey = sshkey;
	} 

	public AccountImpl sshkey(java.lang.String sshkey) { 
		this.sshkey = sshkey;
		return this;
	} 

	public java.lang.String getLogin() { 
		return this.login;
	} 

	public void setLogin(java.lang.String login) { 
		this.login = login;
	} 

	public AccountImpl login(java.lang.String login) { 
		this.login = login;
		return this;
	} 

	public java.lang.String getHost() { 
		return this.host;
	} 

	public void setHost(java.lang.String host) { 
		this.host = host;
	} 

	public AccountImpl host(java.lang.String host) { 
		this.host = host;
		return this;
	} 

}
