package net.zyuiop.ovhapi.api.objects.pca;

/**
 * Cloud Archives Account
 */

public class Account { 

	private java.lang.String domain;
	private java.lang.String password;
	private java.lang.String sshkey;
	private java.lang.String login;
	private java.lang.String host;

	public Account() {
	}

	public java.lang.String getDomain() { 
		return this.domain;
	} 

	public void setDomain(java.lang.String domain) { 
		this.domain = domain;
	} 

	public Account domain(java.lang.String domain) { 
		this.domain = domain;
		return this;
	} 

	public java.lang.String getPassword() { 
		return this.password;
	} 

	public void setPassword(java.lang.String password) { 
		this.password = password;
	} 

	public Account password(java.lang.String password) { 
		this.password = password;
		return this;
	} 

	public java.lang.String getSshkey() { 
		return this.sshkey;
	} 

	public void setSshkey(java.lang.String sshkey) { 
		this.sshkey = sshkey;
	} 

	public Account sshkey(java.lang.String sshkey) { 
		this.sshkey = sshkey;
		return this;
	} 

	public java.lang.String getLogin() { 
		return this.login;
	} 

	public void setLogin(java.lang.String login) { 
		this.login = login;
	} 

	public Account login(java.lang.String login) { 
		this.login = login;
		return this;
	} 

	public java.lang.String getHost() { 
		return this.host;
	} 

	public void setHost(java.lang.String host) { 
		this.host = host;
	} 

	public Account host(java.lang.String host) { 
		this.host = host;
		return this;
	} 

}
