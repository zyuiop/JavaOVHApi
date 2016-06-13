package net.zyuiop.ovhapi.impl.objects.ip;

import net.zyuiop.ovhapi.api.objects.ip.FirewallNetworkRule;
/**
 * Rule on ip
 */

public class FirewallNetworkRuleImpl implements FirewallNetworkRule { 

	private java.lang.String protocol;
	private java.lang.String source;
	private java.lang.String destinationPort;
	private long sequence;
	private java.lang.String destination;
	private java.lang.String rule;
	private java.lang.String sourcePort;
	private java.lang.String state;
	private java.lang.String tcpOption;
	private java.util.Date creationDate;
	private java.lang.String action;
	private boolean fragments;

	public FirewallNetworkRuleImpl() {
	}

	public java.lang.String getProtocol() { 
		return this.protocol;
	} 

	public void setProtocol(java.lang.String protocol) { 
		this.protocol = protocol;
	} 

	public FirewallNetworkRuleImpl protocol(java.lang.String protocol) { 
		this.protocol = protocol;
		return this;
	} 

	public java.lang.String getSource() { 
		return this.source;
	} 

	public void setSource(java.lang.String source) { 
		this.source = source;
	} 

	public FirewallNetworkRuleImpl source(java.lang.String source) { 
		this.source = source;
		return this;
	} 

	public java.lang.String getDestinationPort() { 
		return this.destinationPort;
	} 

	public void setDestinationPort(java.lang.String destinationPort) { 
		this.destinationPort = destinationPort;
	} 

	public FirewallNetworkRuleImpl destinationPort(java.lang.String destinationPort) { 
		this.destinationPort = destinationPort;
		return this;
	} 

	public long getSequence() { 
		return this.sequence;
	} 

	public void setSequence(long sequence) { 
		this.sequence = sequence;
	} 

	public FirewallNetworkRuleImpl sequence(long sequence) { 
		this.sequence = sequence;
		return this;
	} 

	public java.lang.String getDestination() { 
		return this.destination;
	} 

	public void setDestination(java.lang.String destination) { 
		this.destination = destination;
	} 

	public FirewallNetworkRuleImpl destination(java.lang.String destination) { 
		this.destination = destination;
		return this;
	} 

	public java.lang.String getRule() { 
		return this.rule;
	} 

	public void setRule(java.lang.String rule) { 
		this.rule = rule;
	} 

	public FirewallNetworkRuleImpl rule(java.lang.String rule) { 
		this.rule = rule;
		return this;
	} 

	public java.lang.String getSourcePort() { 
		return this.sourcePort;
	} 

	public void setSourcePort(java.lang.String sourcePort) { 
		this.sourcePort = sourcePort;
	} 

	public FirewallNetworkRuleImpl sourcePort(java.lang.String sourcePort) { 
		this.sourcePort = sourcePort;
		return this;
	} 

	public java.lang.String getState() { 
		return this.state;
	} 

	public void setState(java.lang.String state) { 
		this.state = state;
	} 

	public FirewallNetworkRuleImpl state(java.lang.String state) { 
		this.state = state;
		return this;
	} 

	public java.lang.String getTcpOption() { 
		return this.tcpOption;
	} 

	public void setTcpOption(java.lang.String tcpOption) { 
		this.tcpOption = tcpOption;
	} 

	public FirewallNetworkRuleImpl tcpOption(java.lang.String tcpOption) { 
		this.tcpOption = tcpOption;
		return this;
	} 

	public java.util.Date getCreationDate() { 
		return this.creationDate;
	} 

	public void setCreationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
	} 

	public FirewallNetworkRuleImpl creationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
		return this;
	} 

	public java.lang.String getAction() { 
		return this.action;
	} 

	public void setAction(java.lang.String action) { 
		this.action = action;
	} 

	public FirewallNetworkRuleImpl action(java.lang.String action) { 
		this.action = action;
		return this;
	} 

	public boolean getFragments() { 
		return this.fragments;
	} 

	public void setFragments(boolean fragments) { 
		this.fragments = fragments;
	} 

	public FirewallNetworkRuleImpl fragments(boolean fragments) { 
		this.fragments = fragments;
		return this;
	} 

}
