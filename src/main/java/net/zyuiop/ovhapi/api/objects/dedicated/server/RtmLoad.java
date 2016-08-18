package net.zyuiop.ovhapi.api.objects.dedicated.server;

/**
 * A structure describing informations about server load
 */

public class RtmLoad { 

	private net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue cpu;
	private double loadavg1;
	private double loadavg5;
	private net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue memory;
	private long uptime;
	private double loadavg15;
	private net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue swap;
	private long processRunning;
	private long processCount;

	public RtmLoad() {
	}

	public net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue getCpu() { 
		return this.cpu;
	} 

	public void setCpu(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue cpu) { 
		this.cpu = cpu;
	} 

	public RtmLoad cpu(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue cpu) { 
		this.cpu = cpu;
		return this;
	} 

	public double getLoadavg1() { 
		return this.loadavg1;
	} 

	public void setLoadavg1(double loadavg1) { 
		this.loadavg1 = loadavg1;
	} 

	public RtmLoad loadavg1(double loadavg1) { 
		this.loadavg1 = loadavg1;
		return this;
	} 

	public double getLoadavg5() { 
		return this.loadavg5;
	} 

	public void setLoadavg5(double loadavg5) { 
		this.loadavg5 = loadavg5;
	} 

	public RtmLoad loadavg5(double loadavg5) { 
		this.loadavg5 = loadavg5;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue getMemory() { 
		return this.memory;
	} 

	public void setMemory(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue memory) { 
		this.memory = memory;
	} 

	public RtmLoad memory(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue memory) { 
		this.memory = memory;
		return this;
	} 

	public long getUptime() { 
		return this.uptime;
	} 

	public void setUptime(long uptime) { 
		this.uptime = uptime;
	} 

	public RtmLoad uptime(long uptime) { 
		this.uptime = uptime;
		return this;
	} 

	public double getLoadavg15() { 
		return this.loadavg15;
	} 

	public void setLoadavg15(double loadavg15) { 
		this.loadavg15 = loadavg15;
	} 

	public RtmLoad loadavg15(double loadavg15) { 
		this.loadavg15 = loadavg15;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue getSwap() { 
		return this.swap;
	} 

	public void setSwap(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue swap) { 
		this.swap = swap;
	} 

	public RtmLoad swap(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue swap) { 
		this.swap = swap;
		return this;
	} 

	public long getProcessRunning() { 
		return this.processRunning;
	} 

	public void setProcessRunning(long processRunning) { 
		this.processRunning = processRunning;
	} 

	public RtmLoad processRunning(long processRunning) { 
		this.processRunning = processRunning;
		return this;
	} 

	public long getProcessCount() { 
		return this.processCount;
	} 

	public void setProcessCount(long processCount) { 
		this.processCount = processCount;
	} 

	public RtmLoad processCount(long processCount) { 
		this.processCount = processCount;
		return this;
	} 

}
