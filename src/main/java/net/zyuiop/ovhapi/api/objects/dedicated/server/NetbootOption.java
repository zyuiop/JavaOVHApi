package net.zyuiop.ovhapi.api.objects.dedicated.server;

/**
 * Available boot options
 */

public class NetbootOption { 

	private java.lang.String value;
	private java.lang.String option;

	public NetbootOption() {
	}

	public java.lang.String getValue() { 
		return this.value;
	} 

	public void setValue(java.lang.String value) { 
		this.value = value;
	} 

	public NetbootOption value(java.lang.String value) { 
		this.value = value;
		return this;
	} 

	public java.lang.String getOption() { 
		return this.option;
	} 

	public void setOption(java.lang.String option) { 
		this.option = option;
	} 

	public NetbootOption option(java.lang.String option) { 
		this.option = option;
		return this;
	} 

}
