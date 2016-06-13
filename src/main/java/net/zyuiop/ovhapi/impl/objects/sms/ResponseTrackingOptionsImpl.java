package net.zyuiop.ovhapi.impl.objects.sms;

import net.zyuiop.ovhapi.api.objects.sms.ResponseTrackingOptions;
/**
 * The tracking media response
 */

public class ResponseTrackingOptionsImpl implements ResponseTrackingOptions { 

	private java.lang.String target;
	private java.lang.String media;

	public ResponseTrackingOptionsImpl() {
	}

	public java.lang.String getTarget() { 
		return this.target;
	} 

	public void setTarget(java.lang.String target) { 
		this.target = target;
	} 

	public ResponseTrackingOptionsImpl target(java.lang.String target) { 
		this.target = target;
		return this;
	} 

	public java.lang.String getMedia() { 
		return this.media;
	} 

	public void setMedia(java.lang.String media) { 
		this.media = media;
	} 

	public ResponseTrackingOptionsImpl media(java.lang.String media) { 
		this.media = media;
		return this;
	} 

}
