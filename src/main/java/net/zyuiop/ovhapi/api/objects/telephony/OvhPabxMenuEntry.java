package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * IVR menu entry
 */

public class OvhPabxMenuEntry { 

	private long entryId;
	private java.lang.String actionParam;
	private long position;
	private java.lang.String action;
	private java.lang.String dtmf;

	public OvhPabxMenuEntry() {
	}

	public long getEntryId() { 
		return this.entryId;
	} 

	public void setEntryId(long entryId) { 
		this.entryId = entryId;
	} 

	public OvhPabxMenuEntry entryId(long entryId) { 
		this.entryId = entryId;
		return this;
	} 

	public java.lang.String getActionParam() { 
		return this.actionParam;
	} 

	public void setActionParam(java.lang.String actionParam) { 
		this.actionParam = actionParam;
	} 

	public OvhPabxMenuEntry actionParam(java.lang.String actionParam) { 
		this.actionParam = actionParam;
		return this;
	} 

	public long getPosition() { 
		return this.position;
	} 

	public void setPosition(long position) { 
		this.position = position;
	} 

	public OvhPabxMenuEntry position(long position) { 
		this.position = position;
		return this;
	} 

	public java.lang.String getAction() { 
		return this.action;
	} 

	public void setAction(java.lang.String action) { 
		this.action = action;
	} 

	public OvhPabxMenuEntry action(java.lang.String action) { 
		this.action = action;
		return this;
	} 

	public java.lang.String getDtmf() { 
		return this.dtmf;
	} 

	public void setDtmf(java.lang.String dtmf) { 
		this.dtmf = dtmf;
	} 

	public OvhPabxMenuEntry dtmf(java.lang.String dtmf) { 
		this.dtmf = dtmf;
		return this;
	} 

}
