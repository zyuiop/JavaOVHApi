package net.zyuiop.ovhapi.api.objects.dedicated.server;

/**
 * A structure describing informations about RTM
 */

public class RtmCommandSize { 

	private net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue memory;
	private java.lang.String command;

	public RtmCommandSize() {
	}

	public net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue getMemory() { 
		return this.memory;
	} 

	public void setMemory(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue memory) { 
		this.memory = memory;
	} 

	public RtmCommandSize memory(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue memory) { 
		this.memory = memory;
		return this;
	} 

	public java.lang.String getCommand() { 
		return this.command;
	} 

	public void setCommand(java.lang.String command) { 
		this.command = command;
	} 

	public RtmCommandSize command(java.lang.String command) { 
		this.command = command;
		return this;
	} 

}
