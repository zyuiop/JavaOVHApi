package net.zyuiop.ovhapi.impl.objects.hosting.web;

import net.zyuiop.ovhapi.api.objects.hosting.web.User;
/**
 * Hosting users
 */

public class UserImpl implements User { 

	private java.lang.String sshState;
	private java.lang.String home;
	private java.lang.String iisRemoteRights;
	private boolean isPrimaryAccount;
	private java.lang.String login;
	private java.lang.String state;
	private java.lang.String webDavRights;

	public UserImpl() {
	}

	public java.lang.String getSshState() { 
		return this.sshState;
	} 

	public void setSshState(java.lang.String sshState) { 
		this.sshState = sshState;
	} 

	public UserImpl sshState(java.lang.String sshState) { 
		this.sshState = sshState;
		return this;
	} 

	public java.lang.String getHome() { 
		return this.home;
	} 

	public void setHome(java.lang.String home) { 
		this.home = home;
	} 

	public UserImpl home(java.lang.String home) { 
		this.home = home;
		return this;
	} 

	public java.lang.String getIisRemoteRights() { 
		return this.iisRemoteRights;
	} 

	public void setIisRemoteRights(java.lang.String iisRemoteRights) { 
		this.iisRemoteRights = iisRemoteRights;
	} 

	public UserImpl iisRemoteRights(java.lang.String iisRemoteRights) { 
		this.iisRemoteRights = iisRemoteRights;
		return this;
	} 

	public boolean getIsPrimaryAccount() { 
		return this.isPrimaryAccount;
	} 

	public void setIsPrimaryAccount(boolean isPrimaryAccount) { 
		this.isPrimaryAccount = isPrimaryAccount;
	} 

	public UserImpl isPrimaryAccount(boolean isPrimaryAccount) { 
		this.isPrimaryAccount = isPrimaryAccount;
		return this;
	} 

	public java.lang.String getLogin() { 
		return this.login;
	} 

	public void setLogin(java.lang.String login) { 
		this.login = login;
	} 

	public UserImpl login(java.lang.String login) { 
		this.login = login;
		return this;
	} 

	public java.lang.String getState() { 
		return this.state;
	} 

	public void setState(java.lang.String state) { 
		this.state = state;
	} 

	public UserImpl state(java.lang.String state) { 
		this.state = state;
		return this;
	} 

	public java.lang.String getWebDavRights() { 
		return this.webDavRights;
	} 

	public void setWebDavRights(java.lang.String webDavRights) { 
		this.webDavRights = webDavRights;
	} 

	public UserImpl webDavRights(java.lang.String webDavRights) { 
		this.webDavRights = webDavRights;
		return this;
	} 

}
