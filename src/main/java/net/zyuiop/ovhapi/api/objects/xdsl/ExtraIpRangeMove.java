package net.zyuiop.ovhapi.api.objects.xdsl;

/**
 * Informations about the extra IP range during address move
 */

public class ExtraIpRangeMove { 

	private java.lang.String ipRange;
	private java.util.Date date;
	private java.lang.String moveTo;

	public ExtraIpRangeMove() {
	}

	public java.lang.String getIpRange() { 
		return this.ipRange;
	} 

	public void setIpRange(java.lang.String ipRange) { 
		this.ipRange = ipRange;
	} 

	public ExtraIpRangeMove ipRange(java.lang.String ipRange) { 
		this.ipRange = ipRange;
		return this;
	} 

	public java.util.Date getDate() { 
		return this.date;
	} 

	public void setDate(java.util.Date date) { 
		this.date = date;
	} 

	public ExtraIpRangeMove date(java.util.Date date) { 
		this.date = date;
		return this;
	} 

	public java.lang.String getMoveTo() { 
		return this.moveTo;
	} 

	public void setMoveTo(java.lang.String moveTo) { 
		this.moveTo = moveTo;
	} 

	public ExtraIpRangeMove moveTo(java.lang.String moveTo) { 
		this.moveTo = moveTo;
		return this;
	} 

}
