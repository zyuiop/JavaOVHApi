package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Screen list
 */

public class ScreenList { 

	private java.lang.String callNumber;
	private java.lang.String status;
	private long id;
	private java.lang.String type;
	private java.lang.String nature;

	public ScreenList() {
	}

	public java.lang.String getCallNumber() { 
		return this.callNumber;
	} 

	public void setCallNumber(java.lang.String callNumber) { 
		this.callNumber = callNumber;
	} 

	public ScreenList callNumber(java.lang.String callNumber) { 
		this.callNumber = callNumber;
		return this;
	} 

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public ScreenList status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public ScreenList id(long id) { 
		this.id = id;
		return this;
	} 

	public java.lang.String getType() { 
		return this.type;
	} 

	public void setType(java.lang.String type) { 
		this.type = type;
	} 

	public ScreenList type(java.lang.String type) { 
		this.type = type;
		return this;
	} 

	public java.lang.String getNature() { 
		return this.nature;
	} 

	public void setNature(java.lang.String nature) { 
		this.nature = nature;
	} 

	public ScreenList nature(java.lang.String nature) { 
		this.nature = nature;
		return this;
	} 

}
