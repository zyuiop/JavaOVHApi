package net.zyuiop.ovhapi.api.objects.dedicated.server;

/**
 * Information about the options of a dedicated server
 */

public class Option { 

	private java.lang.String option;
	private java.lang.String state;

	public Option() {
	}

	public java.lang.String getOption() { 
		return this.option;
	} 

	public void setOption(java.lang.String option) { 
		this.option = option;
	} 

	public Option option(java.lang.String option) { 
		this.option = option;
		return this;
	} 

	public java.lang.String getState() { 
		return this.state;
	} 

	public void setState(java.lang.String state) { 
		this.state = state;
	} 

	public Option state(java.lang.String state) { 
		this.state = state;
		return this;
	} 

}
