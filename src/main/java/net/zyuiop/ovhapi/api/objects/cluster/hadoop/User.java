package net.zyuiop.ovhapi.api.objects.cluster.hadoop;

/**
 * User allowed to access interfaces on your cluster
 */

public class User { 

	private boolean clouderaManager;
	private boolean hue;
	private boolean httpFrontend;
	private java.lang.String username;

	public User() {
	}

	public boolean getClouderaManager() { 
		return this.clouderaManager;
	} 

	public void setClouderaManager(boolean clouderaManager) { 
		this.clouderaManager = clouderaManager;
	} 

	public User clouderaManager(boolean clouderaManager) { 
		this.clouderaManager = clouderaManager;
		return this;
	} 

	public boolean getHue() { 
		return this.hue;
	} 

	public void setHue(boolean hue) { 
		this.hue = hue;
	} 

	public User hue(boolean hue) { 
		this.hue = hue;
		return this;
	} 

	public boolean getHttpFrontend() { 
		return this.httpFrontend;
	} 

	public void setHttpFrontend(boolean httpFrontend) { 
		this.httpFrontend = httpFrontend;
	} 

	public User httpFrontend(boolean httpFrontend) { 
		this.httpFrontend = httpFrontend;
		return this;
	} 

	public java.lang.String getUsername() { 
		return this.username;
	} 

	public void setUsername(java.lang.String username) { 
		this.username = username;
	} 

	public User username(java.lang.String username) { 
		this.username = username;
		return this;
	} 

}
