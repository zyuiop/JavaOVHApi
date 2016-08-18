package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Dialplan rule
 */

public class OvhPabxDialplanExtensionRule { 

	private java.lang.String actionParam;
	private boolean negativeAction;
	private long position;
	private java.lang.String action;
	private long ruleId;

	public OvhPabxDialplanExtensionRule() {
	}

	public java.lang.String getActionParam() { 
		return this.actionParam;
	} 

	public void setActionParam(java.lang.String actionParam) { 
		this.actionParam = actionParam;
	} 

	public OvhPabxDialplanExtensionRule actionParam(java.lang.String actionParam) { 
		this.actionParam = actionParam;
		return this;
	} 

	public boolean getNegativeAction() { 
		return this.negativeAction;
	} 

	public void setNegativeAction(boolean negativeAction) { 
		this.negativeAction = negativeAction;
	} 

	public OvhPabxDialplanExtensionRule negativeAction(boolean negativeAction) { 
		this.negativeAction = negativeAction;
		return this;
	} 

	public long getPosition() { 
		return this.position;
	} 

	public void setPosition(long position) { 
		this.position = position;
	} 

	public OvhPabxDialplanExtensionRule position(long position) { 
		this.position = position;
		return this;
	} 

	public java.lang.String getAction() { 
		return this.action;
	} 

	public void setAction(java.lang.String action) { 
		this.action = action;
	} 

	public OvhPabxDialplanExtensionRule action(java.lang.String action) { 
		this.action = action;
		return this;
	} 

	public long getRuleId() { 
		return this.ruleId;
	} 

	public void setRuleId(long ruleId) { 
		this.ruleId = ruleId;
	} 

	public OvhPabxDialplanExtensionRule ruleId(long ruleId) { 
		this.ruleId = ruleId;
		return this;
	} 

}
