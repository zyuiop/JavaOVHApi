package net.zyuiop.ovhapi.impl.objects.nichandle;

import net.zyuiop.ovhapi.api.objects.nichandle.Ipxe;
/**
 * Customer IPXE scripts
 */

public class IpxeImpl implements Ipxe { 

	private java.lang.String script;
	private java.lang.String name;

	public IpxeImpl() {
	}

	public java.lang.String getScript() { 
		return this.script;
	} 

	public void setScript(java.lang.String script) { 
		this.script = script;
	} 

	public IpxeImpl script(java.lang.String script) { 
		this.script = script;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public IpxeImpl name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

}
