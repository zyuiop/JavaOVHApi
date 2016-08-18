package net.zyuiop.ovhapi.api.objects.domain;

/**
 * Structure of imapCopy
 */

public class DomainMlOptionsStruct { 

	private boolean subscribeByModerator;
	private boolean usersPostOnly;
	private boolean moderatorMessage;

	public DomainMlOptionsStruct() {
	}

	public boolean getSubscribeByModerator() { 
		return this.subscribeByModerator;
	} 

	public void setSubscribeByModerator(boolean subscribeByModerator) { 
		this.subscribeByModerator = subscribeByModerator;
	} 

	public DomainMlOptionsStruct subscribeByModerator(boolean subscribeByModerator) { 
		this.subscribeByModerator = subscribeByModerator;
		return this;
	} 

	public boolean getUsersPostOnly() { 
		return this.usersPostOnly;
	} 

	public void setUsersPostOnly(boolean usersPostOnly) { 
		this.usersPostOnly = usersPostOnly;
	} 

	public DomainMlOptionsStruct usersPostOnly(boolean usersPostOnly) { 
		this.usersPostOnly = usersPostOnly;
		return this;
	} 

	public boolean getModeratorMessage() { 
		return this.moderatorMessage;
	} 

	public void setModeratorMessage(boolean moderatorMessage) { 
		this.moderatorMessage = moderatorMessage;
	} 

	public DomainMlOptionsStruct moderatorMessage(boolean moderatorMessage) { 
		this.moderatorMessage = moderatorMessage;
		return this;
	} 

}
