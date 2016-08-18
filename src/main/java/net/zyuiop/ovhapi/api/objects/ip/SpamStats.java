package net.zyuiop.ovhapi.api.objects.ip;

/**
 * Spam statistics about an IP address
 */

public class SpamStats { 

	private long timestamp;
	private long averageSpamscore;
	private net.zyuiop.ovhapi.api.objects.ip.SpamTarget[] detectedSpams;
	private long total;
	private long numberOfSpams;

	public SpamStats() {
	}

	public long getTimestamp() { 
		return this.timestamp;
	} 

	public void setTimestamp(long timestamp) { 
		this.timestamp = timestamp;
	} 

	public SpamStats timestamp(long timestamp) { 
		this.timestamp = timestamp;
		return this;
	} 

	public long getAverageSpamscore() { 
		return this.averageSpamscore;
	} 

	public void setAverageSpamscore(long averageSpamscore) { 
		this.averageSpamscore = averageSpamscore;
	} 

	public SpamStats averageSpamscore(long averageSpamscore) { 
		this.averageSpamscore = averageSpamscore;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.ip.SpamTarget[] getDetectedSpams() { 
		return this.detectedSpams;
	} 

	public void setDetectedSpams(net.zyuiop.ovhapi.api.objects.ip.SpamTarget[] detectedSpams) { 
		this.detectedSpams = detectedSpams;
	} 

	public SpamStats detectedSpams(net.zyuiop.ovhapi.api.objects.ip.SpamTarget[] detectedSpams) { 
		this.detectedSpams = detectedSpams;
		return this;
	} 

	public long getTotal() { 
		return this.total;
	} 

	public void setTotal(long total) { 
		this.total = total;
	} 

	public SpamStats total(long total) { 
		this.total = total;
		return this;
	} 

	public long getNumberOfSpams() { 
		return this.numberOfSpams;
	} 

	public void setNumberOfSpams(long numberOfSpams) { 
		this.numberOfSpams = numberOfSpams;
	} 

	public SpamStats numberOfSpams(long numberOfSpams) { 
		this.numberOfSpams = numberOfSpams;
		return this;
	} 

}
