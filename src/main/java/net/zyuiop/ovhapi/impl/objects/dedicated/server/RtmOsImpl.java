package net.zyuiop.ovhapi.impl.objects.dedicated.server;

import net.zyuiop.ovhapi.api.objects.dedicated.server.RtmOs;
/**
 * A structure describing informations about Rtm os
 */

public class RtmOsImpl implements RtmOs { 

	private java.lang.String release;
	private java.lang.String kernelRelease;
	private java.lang.String kernelVersion;

	public RtmOsImpl() {
	}

	public java.lang.String getRelease() { 
		return this.release;
	} 

	public void setRelease(java.lang.String release) { 
		this.release = release;
	} 

	public RtmOsImpl release(java.lang.String release) { 
		this.release = release;
		return this;
	} 

	public java.lang.String getKernelRelease() { 
		return this.kernelRelease;
	} 

	public void setKernelRelease(java.lang.String kernelRelease) { 
		this.kernelRelease = kernelRelease;
	} 

	public RtmOsImpl kernelRelease(java.lang.String kernelRelease) { 
		this.kernelRelease = kernelRelease;
		return this;
	} 

	public java.lang.String getKernelVersion() { 
		return this.kernelVersion;
	} 

	public void setKernelVersion(java.lang.String kernelVersion) { 
		this.kernelVersion = kernelVersion;
	} 

	public RtmOsImpl kernelVersion(java.lang.String kernelVersion) { 
		this.kernelVersion = kernelVersion;
		return this;
	} 

}
