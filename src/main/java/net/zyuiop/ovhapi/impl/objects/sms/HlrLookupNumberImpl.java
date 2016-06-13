package net.zyuiop.ovhapi.impl.objects.sms;

import net.zyuiop.ovhapi.api.objects.sms.HlrLookupNumber;
/**
 * Home Location Register informations. Give informations about a given cellular phone.
 */

public class HlrLookupNumberImpl implements HlrLookupNumber { 

	private boolean roaming;
	private boolean ported;
	private boolean reachable;
	private java.lang.String status;
	private java.util.Date datetime;
	private boolean valid;
	private java.lang.String operatorCode;
	private long id;

	public HlrLookupNumberImpl() {
	}

	public boolean getRoaming() { 
		return this.roaming;
	} 

	public void setRoaming(boolean roaming) { 
		this.roaming = roaming;
	} 

	public HlrLookupNumberImpl roaming(boolean roaming) { 
		this.roaming = roaming;
		return this;
	} 

	public boolean getPorted() { 
		return this.ported;
	} 

	public void setPorted(boolean ported) { 
		this.ported = ported;
	} 

	public HlrLookupNumberImpl ported(boolean ported) { 
		this.ported = ported;
		return this;
	} 

	public boolean getReachable() { 
		return this.reachable;
	} 

	public void setReachable(boolean reachable) { 
		this.reachable = reachable;
	} 

	public HlrLookupNumberImpl reachable(boolean reachable) { 
		this.reachable = reachable;
		return this;
	} 

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public HlrLookupNumberImpl status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public java.util.Date getDatetime() { 
		return this.datetime;
	} 

	public void setDatetime(java.util.Date datetime) { 
		this.datetime = datetime;
	} 

	public HlrLookupNumberImpl datetime(java.util.Date datetime) { 
		this.datetime = datetime;
		return this;
	} 

	public boolean getValid() { 
		return this.valid;
	} 

	public void setValid(boolean valid) { 
		this.valid = valid;
	} 

	public HlrLookupNumberImpl valid(boolean valid) { 
		this.valid = valid;
		return this;
	} 

	public java.lang.String getOperatorCode() { 
		return this.operatorCode;
	} 

	public void setOperatorCode(java.lang.String operatorCode) { 
		this.operatorCode = operatorCode;
	} 

	public HlrLookupNumberImpl operatorCode(java.lang.String operatorCode) { 
		this.operatorCode = operatorCode;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public HlrLookupNumberImpl id(long id) { 
		this.id = id;
		return this;
	} 

}
