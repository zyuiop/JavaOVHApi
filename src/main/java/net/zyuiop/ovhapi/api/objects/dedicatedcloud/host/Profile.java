package net.zyuiop.ovhapi.api.objects.dedicatedcloud.host;

/**
 * A Host profile
 */

public class Profile { 

	private java.lang.String core;
	private net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue cpu;
	private java.lang.String name;
	private net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue ram;

	public Profile() {
	}

	public java.lang.String getCore() { 
		return this.core;
	} 

	public void setCore(java.lang.String core) { 
		this.core = core;
	} 

	public Profile core(java.lang.String core) { 
		this.core = core;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue getCpu() { 
		return this.cpu;
	} 

	public void setCpu(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue cpu) { 
		this.cpu = cpu;
	} 

	public Profile cpu(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue cpu) { 
		this.cpu = cpu;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public Profile name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue getRam() { 
		return this.ram;
	} 

	public void setRam(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue ram) { 
		this.ram = ram;
	} 

	public Profile ram(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue ram) { 
		this.ram = ram;
		return this;
	} 

}
