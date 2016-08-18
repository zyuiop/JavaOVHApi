package net.zyuiop.ovhapi.api.objects.sms;

/**
 * Home Location Register informations. Give informations about a given cellular phone.
 */

public class HlrLookupNumber { 

	private boolean roaming;
	private boolean ported;
	private boolean reachable;
	private java.lang.String status;
	private java.util.Date datetime;
	private boolean valid;
	private java.lang.String operatorCode;
	private long id;

	public HlrLookupNumber() {
	}

	public boolean getRoaming() { 
		return this.roaming;
	} 

	public void setRoaming(boolean roaming) { 
		this.roaming = roaming;
	} 

	public HlrLookupNumber roaming(boolean roaming) { 
		this.roaming = roaming;
		return this;
	} 

	public boolean getPorted() { 
		return this.ported;
	} 

	public void setPorted(boolean ported) { 
		this.ported = ported;
	} 

	public HlrLookupNumber ported(boolean ported) { 
		this.ported = ported;
		return this;
	} 

	public boolean getReachable() { 
		return this.reachable;
	} 

	public void setReachable(boolean reachable) { 
		this.reachable = reachable;
	} 

	public HlrLookupNumber reachable(boolean reachable) { 
		this.reachable = reachable;
		return this;
	} 

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public HlrLookupNumber status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public java.util.Date getDatetime() { 
		return this.datetime;
	} 

	public void setDatetime(java.util.Date datetime) { 
		this.datetime = datetime;
	} 

	public HlrLookupNumber datetime(java.util.Date datetime) { 
		this.datetime = datetime;
		return this;
	} 

	public boolean getValid() { 
		return this.valid;
	} 

	public void setValid(boolean valid) { 
		this.valid = valid;
	} 

	public HlrLookupNumber valid(boolean valid) { 
		this.valid = valid;
		return this;
	} 

	public java.lang.String getOperatorCode() { 
		return this.operatorCode;
	} 

	public void setOperatorCode(java.lang.String operatorCode) { 
		this.operatorCode = operatorCode;
	} 

	public HlrLookupNumber operatorCode(java.lang.String operatorCode) { 
		this.operatorCode = operatorCode;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public HlrLookupNumber id(long id) { 
		this.id = id;
		return this;
	} 

}
