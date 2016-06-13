package net.zyuiop.ovhapi.impl.objects.dedicated.server;

import net.zyuiop.ovhapi.api.objects.dedicated.server.NetbootOption;
/**
 * Available boot options
 */

public class NetbootOptionImpl implements NetbootOption { 

	private java.lang.String value;
	private java.lang.String option;

	public NetbootOptionImpl() {
	}

	public java.lang.String getValue() { 
		return this.value;
	} 

	public void setValue(java.lang.String value) { 
		this.value = value;
	} 

	public NetbootOptionImpl value(java.lang.String value) { 
		this.value = value;
		return this;
	} 

	public java.lang.String getOption() { 
		return this.option;
	} 

	public void setOption(java.lang.String option) { 
		this.option = option;
	} 

	public NetbootOptionImpl option(java.lang.String option) { 
		this.option = option;
		return this;
	} 

}
