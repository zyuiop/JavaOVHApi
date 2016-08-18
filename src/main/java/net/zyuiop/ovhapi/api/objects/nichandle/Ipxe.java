package net.zyuiop.ovhapi.api.objects.nichandle;

/**
 * Customer IPXE scripts
 */

public class Ipxe { 

	private java.lang.String script;
	private java.lang.String name;

	public Ipxe() {
	}

	public java.lang.String getScript() { 
		return this.script;
	} 

	public void setScript(java.lang.String script) { 
		this.script = script;
	} 

	public Ipxe script(java.lang.String script) { 
		this.script = script;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public Ipxe name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

}
