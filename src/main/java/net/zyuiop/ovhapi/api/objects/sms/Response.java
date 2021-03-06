package net.zyuiop.ovhapi.api.objects.sms;

/**
 * A structure describing how to manage an sms Response
 */

public class Response { 

	private java.lang.String text;
	private java.lang.String cgiUrl;
	private net.zyuiop.ovhapi.api.objects.sms.ResponseTrackingOptions[] trackingOptions;
	private java.lang.String trackingDefaultSmsSender;
	private java.lang.String responseType;

	public Response() {
	}

	public java.lang.String getText() { 
		return this.text;
	} 

	public void setText(java.lang.String text) { 
		this.text = text;
	} 

	public Response text(java.lang.String text) { 
		this.text = text;
		return this;
	} 

	public java.lang.String getCgiUrl() { 
		return this.cgiUrl;
	} 

	public void setCgiUrl(java.lang.String cgiUrl) { 
		this.cgiUrl = cgiUrl;
	} 

	public Response cgiUrl(java.lang.String cgiUrl) { 
		this.cgiUrl = cgiUrl;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.sms.ResponseTrackingOptions[] getTrackingOptions() { 
		return this.trackingOptions;
	} 

	public void setTrackingOptions(net.zyuiop.ovhapi.api.objects.sms.ResponseTrackingOptions[] trackingOptions) { 
		this.trackingOptions = trackingOptions;
	} 

	public Response trackingOptions(net.zyuiop.ovhapi.api.objects.sms.ResponseTrackingOptions[] trackingOptions) { 
		this.trackingOptions = trackingOptions;
		return this;
	} 

	public java.lang.String getTrackingDefaultSmsSender() { 
		return this.trackingDefaultSmsSender;
	} 

	public void setTrackingDefaultSmsSender(java.lang.String trackingDefaultSmsSender) { 
		this.trackingDefaultSmsSender = trackingDefaultSmsSender;
	} 

	public Response trackingDefaultSmsSender(java.lang.String trackingDefaultSmsSender) { 
		this.trackingDefaultSmsSender = trackingDefaultSmsSender;
		return this;
	} 

	public java.lang.String getResponseType() { 
		return this.responseType;
	} 

	public void setResponseType(java.lang.String responseType) { 
		this.responseType = responseType;
	} 

	public Response responseType(java.lang.String responseType) { 
		this.responseType = responseType;
		return this;
	} 

}
