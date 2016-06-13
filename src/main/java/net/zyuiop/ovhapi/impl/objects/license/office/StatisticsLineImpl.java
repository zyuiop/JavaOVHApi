package net.zyuiop.ovhapi.impl.objects.license.office;

import net.zyuiop.ovhapi.api.objects.license.office.StatisticsLine;
/**
 * License usage statistics line.
 */

public class StatisticsLineImpl implements StatisticsLine { 

	private long endOfDayCount;
	private java.lang.String licenceType;
	private long peakCount;

	public StatisticsLineImpl() {
	}

	public long getEndOfDayCount() { 
		return this.endOfDayCount;
	} 

	public void setEndOfDayCount(long endOfDayCount) { 
		this.endOfDayCount = endOfDayCount;
	} 

	public StatisticsLineImpl endOfDayCount(long endOfDayCount) { 
		this.endOfDayCount = endOfDayCount;
		return this;
	} 

	public java.lang.String getLicenceType() { 
		return this.licenceType;
	} 

	public void setLicenceType(java.lang.String licenceType) { 
		this.licenceType = licenceType;
	} 

	public StatisticsLineImpl licenceType(java.lang.String licenceType) { 
		this.licenceType = licenceType;
		return this;
	} 

	public long getPeakCount() { 
		return this.peakCount;
	} 

	public void setPeakCount(long peakCount) { 
		this.peakCount = peakCount;
	} 

	public StatisticsLineImpl peakCount(long peakCount) { 
		this.peakCount = peakCount;
		return this;
	} 

}
