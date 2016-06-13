package net.zyuiop.ovhapi.impl.objects.telephony;

import net.zyuiop.ovhapi.api.objects.telephony.EasyMiniPabxHuntingAgent;
/**
 * Easy/Mini PABX agent
 */

public class EasyMiniPabxHuntingAgentImpl implements EasyMiniPabxHuntingAgent { 

	private java.lang.String agentNumber;
	private long noReplyTimer;
	private boolean logged;
	private long position;

	public EasyMiniPabxHuntingAgentImpl() {
	}

	public java.lang.String getAgentNumber() { 
		return this.agentNumber;
	} 

	public void setAgentNumber(java.lang.String agentNumber) { 
		this.agentNumber = agentNumber;
	} 

	public EasyMiniPabxHuntingAgentImpl agentNumber(java.lang.String agentNumber) { 
		this.agentNumber = agentNumber;
		return this;
	} 

	public long getNoReplyTimer() { 
		return this.noReplyTimer;
	} 

	public void setNoReplyTimer(long noReplyTimer) { 
		this.noReplyTimer = noReplyTimer;
	} 

	public EasyMiniPabxHuntingAgentImpl noReplyTimer(long noReplyTimer) { 
		this.noReplyTimer = noReplyTimer;
		return this;
	} 

	public boolean getLogged() { 
		return this.logged;
	} 

	public void setLogged(boolean logged) { 
		this.logged = logged;
	} 

	public EasyMiniPabxHuntingAgentImpl logged(boolean logged) { 
		this.logged = logged;
		return this;
	} 

	public long getPosition() { 
		return this.position;
	} 

	public void setPosition(long position) { 
		this.position = position;
	} 

	public EasyMiniPabxHuntingAgentImpl position(long position) { 
		this.position = position;
		return this;
	} 

}
