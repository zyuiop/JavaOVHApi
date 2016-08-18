package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Plug & Phone function key
 */

public class FunctionKey { 

	private java.lang.String parameter;
	private java.lang.String function;
	private java.lang.String label;
	private java.lang.String _default;
	private java.lang.String type;
	private long keyNum;

	public FunctionKey() {
	}

	public java.lang.String getParameter() { 
		return this.parameter;
	} 

	public void setParameter(java.lang.String parameter) { 
		this.parameter = parameter;
	} 

	public FunctionKey parameter(java.lang.String parameter) { 
		this.parameter = parameter;
		return this;
	} 

	public java.lang.String getFunction() { 
		return this.function;
	} 

	public void setFunction(java.lang.String function) { 
		this.function = function;
	} 

	public FunctionKey function(java.lang.String function) { 
		this.function = function;
		return this;
	} 

	public java.lang.String getLabel() { 
		return this.label;
	} 

	public void setLabel(java.lang.String label) { 
		this.label = label;
	} 

	public FunctionKey label(java.lang.String label) { 
		this.label = label;
		return this;
	} 

	public java.lang.String getDefault() { 
		return this._default;
	} 

	public void setDefault(java.lang.String _default) { 
		this._default = _default;
	} 

	public FunctionKey _default(java.lang.String _default) { 
		this._default = _default;
		return this;
	} 

	public java.lang.String getType() { 
		return this.type;
	} 

	public void setType(java.lang.String type) { 
		this.type = type;
	} 

	public FunctionKey type(java.lang.String type) { 
		this.type = type;
		return this;
	} 

	public long getKeyNum() { 
		return this.keyNum;
	} 

	public void setKeyNum(long keyNum) { 
		this.keyNum = keyNum;
	} 

	public FunctionKey keyNum(long keyNum) { 
		this.keyNum = keyNum;
		return this;
	} 

}
