package net.zyuiop.ovhapi.api.objects.dedicated.server;

/**
 * A structure describing informations about Rtm os
 */

public class RtmOs { 

	private java.lang.String release;
	private java.lang.String kernelRelease;
	private java.lang.String kernelVersion;

	public RtmOs() {
	}

	public java.lang.String getRelease() { 
		return this.release;
	} 

	public void setRelease(java.lang.String release) { 
		this.release = release;
	} 

	public RtmOs release(java.lang.String release) { 
		this.release = release;
		return this;
	} 

	public java.lang.String getKernelRelease() { 
		return this.kernelRelease;
	} 

	public void setKernelRelease(java.lang.String kernelRelease) { 
		this.kernelRelease = kernelRelease;
	} 

	public RtmOs kernelRelease(java.lang.String kernelRelease) { 
		this.kernelRelease = kernelRelease;
		return this;
	} 

	public java.lang.String getKernelVersion() { 
		return this.kernelVersion;
	} 

	public void setKernelVersion(java.lang.String kernelVersion) { 
		this.kernelVersion = kernelVersion;
	} 

	public RtmOs kernelVersion(java.lang.String kernelVersion) { 
		this.kernelVersion = kernelVersion;
		return this;
	} 

}
