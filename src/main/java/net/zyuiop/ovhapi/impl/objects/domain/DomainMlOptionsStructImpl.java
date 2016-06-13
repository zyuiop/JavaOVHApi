package net.zyuiop.ovhapi.impl.objects.domain;

import net.zyuiop.ovhapi.api.objects.domain.DomainMlOptionsStruct;
/**
 * Structure of imapCopy
 */

public class DomainMlOptionsStructImpl implements DomainMlOptionsStruct { 

	private boolean subscribeByModerator;
	private boolean usersPostOnly;
	private boolean moderatorMessage;

	public DomainMlOptionsStructImpl() {
	}

	public boolean getSubscribeByModerator() { 
		return this.subscribeByModerator;
	} 

	public void setSubscribeByModerator(boolean subscribeByModerator) { 
		this.subscribeByModerator = subscribeByModerator;
	} 

	public DomainMlOptionsStructImpl subscribeByModerator(boolean subscribeByModerator) { 
		this.subscribeByModerator = subscribeByModerator;
		return this;
	} 

	public boolean getUsersPostOnly() { 
		return this.usersPostOnly;
	} 

	public void setUsersPostOnly(boolean usersPostOnly) { 
		this.usersPostOnly = usersPostOnly;
	} 

	public DomainMlOptionsStructImpl usersPostOnly(boolean usersPostOnly) { 
		this.usersPostOnly = usersPostOnly;
		return this;
	} 

	public boolean getModeratorMessage() { 
		return this.moderatorMessage;
	} 

	public void setModeratorMessage(boolean moderatorMessage) { 
		this.moderatorMessage = moderatorMessage;
	} 

	public DomainMlOptionsStructImpl moderatorMessage(boolean moderatorMessage) { 
		this.moderatorMessage = moderatorMessage;
		return this;
	} 

}
