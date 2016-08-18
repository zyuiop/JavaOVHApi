package net.zyuiop.ovhapi.api.objects.ip;

/**
 * Rule on ip:ports
 */

public class GameMitigationRule { 

	private java.lang.String protocol;
	private net.zyuiop.ovhapi.api.objects.complextype.Range ports;
	private long id;
	private java.lang.String state;

	public GameMitigationRule() {
	}

	public java.lang.String getProtocol() { 
		return this.protocol;
	} 

	public void setProtocol(java.lang.String protocol) { 
		this.protocol = protocol;
	} 

	public GameMitigationRule protocol(java.lang.String protocol) { 
		this.protocol = protocol;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.complextype.Range getPorts() { 
		return this.ports;
	} 

	public void setPorts(net.zyuiop.ovhapi.api.objects.complextype.Range ports) { 
		this.ports = ports;
	} 

	public GameMitigationRule ports(net.zyuiop.ovhapi.api.objects.complextype.Range ports) { 
		this.ports = ports;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public GameMitigationRule id(long id) { 
		this.id = id;
		return this;
	} 

	public java.lang.String getState() { 
		return this.state;
	} 

	public void setState(java.lang.String state) { 
		this.state = state;
	} 

	public GameMitigationRule state(java.lang.String state) { 
		this.state = state;
		return this;
	} 

}
