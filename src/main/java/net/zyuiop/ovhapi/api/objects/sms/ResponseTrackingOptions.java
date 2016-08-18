package net.zyuiop.ovhapi.api.objects.sms;

/**
 * The tracking media response
 */

public class ResponseTrackingOptions { 

	private java.lang.String target;
	private java.lang.String media;

	public ResponseTrackingOptions() {
	}

	public java.lang.String getTarget() { 
		return this.target;
	} 

	public void setTarget(java.lang.String target) { 
		this.target = target;
	} 

	public ResponseTrackingOptions target(java.lang.String target) { 
		this.target = target;
		return this;
	} 

	public java.lang.String getMedia() { 
		return this.media;
	} 

	public void setMedia(java.lang.String media) { 
		this.media = media;
	} 

	public ResponseTrackingOptions media(java.lang.String media) { 
		this.media = media;
		return this;
	} 

}
