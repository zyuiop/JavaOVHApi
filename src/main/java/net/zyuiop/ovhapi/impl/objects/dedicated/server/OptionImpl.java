package net.zyuiop.ovhapi.impl.objects.dedicated.server;

import net.zyuiop.ovhapi.api.objects.dedicated.server.Option;
/**
 * Information about the options of a dedicated server
 */

public class OptionImpl implements Option { 

	private java.lang.String option;
	private java.lang.String state;

	public OptionImpl() {
	}

	public java.lang.String getOption() { 
		return this.option;
	} 

	public void setOption(java.lang.String option) { 
		this.option = option;
	} 

	public OptionImpl option(java.lang.String option) { 
		this.option = option;
		return this;
	} 

	public java.lang.String getState() { 
		return this.state;
	} 

	public void setState(java.lang.String state) { 
		this.state = state;
	} 

	public OptionImpl state(java.lang.String state) { 
		this.state = state;
		return this;
	} 

}
