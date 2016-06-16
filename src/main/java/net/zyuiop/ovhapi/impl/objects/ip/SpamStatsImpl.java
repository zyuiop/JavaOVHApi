package net.zyuiop.ovhapi.impl.objects.ip;

import net.zyuiop.ovhapi.api.objects.ip.SpamStats;
/**
 * Spam statistics about an IP address
 */

public class SpamStatsImpl implements SpamStats { 

	private long timestamp;
	private long averageSpamscore;
	private net.zyuiop.ovhapi.impl.objects.ip.SpamTargetImpl detectedSpams;
	private long total;
	private long numberOfSpams;

	public SpamStatsImpl() {
	}

	public long getTimestamp() { 
		return this.timestamp;
	} 

	public void setTimestamp(long timestamp) { 
		this.timestamp = timestamp;
	} 

	public SpamStatsImpl timestamp(long timestamp) { 
		this.timestamp = timestamp;
		return this;
	} 

	public long getAverageSpamscore() { 
		return this.averageSpamscore;
	} 

	public void setAverageSpamscore(long averageSpamscore) { 
		this.averageSpamscore = averageSpamscore;
	} 

	public SpamStatsImpl averageSpamscore(long averageSpamscore) { 
		this.averageSpamscore = averageSpamscore;
		return this;
	} 

	public net.zyuiop.ovhapi.impl.objects.ip.SpamTargetImpl getDetectedSpams() { 
		return this.detectedSpams;
	} 

	public void setDetectedSpams(net.zyuiop.ovhapi.impl.objects.ip.SpamTargetImpl detectedSpams) { 
		this.detectedSpams = detectedSpams;
	} 

	public SpamStatsImpl detectedSpams(net.zyuiop.ovhapi.impl.objects.ip.SpamTargetImpl detectedSpams) { 
		this.detectedSpams = detectedSpams;
		return this;
	} 

	public long getTotal() { 
		return this.total;
	} 

	public void setTotal(long total) { 
		this.total = total;
	} 

	public SpamStatsImpl total(long total) { 
		this.total = total;
		return this;
	} 

	public long getNumberOfSpams() { 
		return this.numberOfSpams;
	} 

	public void setNumberOfSpams(long numberOfSpams) { 
		this.numberOfSpams = numberOfSpams;
	} 

	public SpamStatsImpl numberOfSpams(long numberOfSpams) { 
		this.numberOfSpams = numberOfSpams;
		return this;
	} 

}
