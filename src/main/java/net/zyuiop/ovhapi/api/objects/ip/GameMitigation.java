package net.zyuiop.ovhapi.api.objects.ip;

/**
 * GAME Anti-DDoS
 */

public class GameMitigation { 

	private boolean firewallModeEnabled;
	private java.lang.String ipOnGame;
	private java.lang.String state;

	public GameMitigation() {
	}

	public boolean getFirewallModeEnabled() { 
		return this.firewallModeEnabled;
	} 

	public void setFirewallModeEnabled(boolean firewallModeEnabled) { 
		this.firewallModeEnabled = firewallModeEnabled;
	} 

	public GameMitigation firewallModeEnabled(boolean firewallModeEnabled) { 
		this.firewallModeEnabled = firewallModeEnabled;
		return this;
	} 

	public java.lang.String getIpOnGame() { 
		return this.ipOnGame;
	} 

	public void setIpOnGame(java.lang.String ipOnGame) { 
		this.ipOnGame = ipOnGame;
	} 

	public GameMitigation ipOnGame(java.lang.String ipOnGame) { 
		this.ipOnGame = ipOnGame;
		return this;
	} 

	public java.lang.String getState() { 
		return this.state;
	} 

	public void setState(java.lang.String state) { 
		this.state = state;
	} 

	public GameMitigation state(java.lang.String state) { 
		this.state = state;
		return this;
	} 

}
