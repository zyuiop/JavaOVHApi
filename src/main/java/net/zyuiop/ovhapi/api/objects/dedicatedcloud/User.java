package net.zyuiop.ovhapi.api.objects.dedicatedcloud;

/**
 * Dedicated Cloud User
 */

public class User { 

	private boolean fullAdminRo;
	private long userId;
	private java.lang.String name;
	private boolean canManageIpFailOvers;
	private java.lang.String state;
	private java.lang.String email;
	private java.lang.String activationState;
	private boolean isEnableManageable;
	private boolean canManageNetwork;

	public User() {
	}

	public boolean getFullAdminRo() { 
		return this.fullAdminRo;
	} 

	public void setFullAdminRo(boolean fullAdminRo) { 
		this.fullAdminRo = fullAdminRo;
	} 

	public User fullAdminRo(boolean fullAdminRo) { 
		this.fullAdminRo = fullAdminRo;
		return this;
	} 

	public long getUserId() { 
		return this.userId;
	} 

	public void setUserId(long userId) { 
		this.userId = userId;
	} 

	public User userId(long userId) { 
		this.userId = userId;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public User name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public boolean getCanManageIpFailOvers() { 
		return this.canManageIpFailOvers;
	} 

	public void setCanManageIpFailOvers(boolean canManageIpFailOvers) { 
		this.canManageIpFailOvers = canManageIpFailOvers;
	} 

	public User canManageIpFailOvers(boolean canManageIpFailOvers) { 
		this.canManageIpFailOvers = canManageIpFailOvers;
		return this;
	} 

	public java.lang.String getState() { 
		return this.state;
	} 

	public void setState(java.lang.String state) { 
		this.state = state;
	} 

	public User state(java.lang.String state) { 
		this.state = state;
		return this;
	} 

	public java.lang.String getEmail() { 
		return this.email;
	} 

	public void setEmail(java.lang.String email) { 
		this.email = email;
	} 

	public User email(java.lang.String email) { 
		this.email = email;
		return this;
	} 

	public java.lang.String getActivationState() { 
		return this.activationState;
	} 

	public void setActivationState(java.lang.String activationState) { 
		this.activationState = activationState;
	} 

	public User activationState(java.lang.String activationState) { 
		this.activationState = activationState;
		return this;
	} 

	public boolean getIsEnableManageable() { 
		return this.isEnableManageable;
	} 

	public void setIsEnableManageable(boolean isEnableManageable) { 
		this.isEnableManageable = isEnableManageable;
	} 

	public User isEnableManageable(boolean isEnableManageable) { 
		this.isEnableManageable = isEnableManageable;
		return this;
	} 

	public boolean getCanManageNetwork() { 
		return this.canManageNetwork;
	} 

	public void setCanManageNetwork(boolean canManageNetwork) { 
		this.canManageNetwork = canManageNetwork;
	} 

	public User canManageNetwork(boolean canManageNetwork) { 
		this.canManageNetwork = canManageNetwork;
		return this;
	} 

}
