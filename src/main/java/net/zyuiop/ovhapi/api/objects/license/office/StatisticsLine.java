package net.zyuiop.ovhapi.api.objects.license.office;

/**
 * License usage statistics line.
 */

public class StatisticsLine { 

	private long endOfDayCount;
	private java.lang.String licenceType;
	private long peakCount;

	public StatisticsLine() {
	}

	public long getEndOfDayCount() { 
		return this.endOfDayCount;
	} 

	public void setEndOfDayCount(long endOfDayCount) { 
		this.endOfDayCount = endOfDayCount;
	} 

	public StatisticsLine endOfDayCount(long endOfDayCount) { 
		this.endOfDayCount = endOfDayCount;
		return this;
	} 

	public java.lang.String getLicenceType() { 
		return this.licenceType;
	} 

	public void setLicenceType(java.lang.String licenceType) { 
		this.licenceType = licenceType;
	} 

	public StatisticsLine licenceType(java.lang.String licenceType) { 
		this.licenceType = licenceType;
		return this;
	} 

	public long getPeakCount() { 
		return this.peakCount;
	} 

	public void setPeakCount(long peakCount) { 
		this.peakCount = peakCount;
	} 

	public StatisticsLine peakCount(long peakCount) { 
		this.peakCount = peakCount;
		return this;
	} 

}
