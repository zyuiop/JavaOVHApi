package net.zyuiop.ovhapi.api.objects.dedicated.server;

/**
 * A structure describing informations about server cpu
 */

public class RtmCpu { 

	private long core;
	private net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue freq;
	private java.lang.String name;
	private net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue cache;

	public RtmCpu() {
	}

	public long getCore() { 
		return this.core;
	} 

	public void setCore(long core) { 
		this.core = core;
	} 

	public RtmCpu core(long core) { 
		this.core = core;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue getFreq() { 
		return this.freq;
	} 

	public void setFreq(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue freq) { 
		this.freq = freq;
	} 

	public RtmCpu freq(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue freq) { 
		this.freq = freq;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public RtmCpu name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue getCache() { 
		return this.cache;
	} 

	public void setCache(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue cache) { 
		this.cache = cache;
	} 

	public RtmCpu cache(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue cache) { 
		this.cache = cache;
		return this;
	} 

}
