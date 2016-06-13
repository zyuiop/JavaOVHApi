package net.zyuiop.ovhapi.impl.objects.cdn.website;

import net.zyuiop.ovhapi.api.objects.cdn.website.Website;
/**
 * Website CDN
 */

public class WebsiteImpl implements Website { 

	private java.lang.String offer;
	private java.lang.String anycast;
	private java.lang.String service;

	public WebsiteImpl() {
	}

	public java.lang.String getOffer() { 
		return this.offer;
	} 

	public void setOffer(java.lang.String offer) { 
		this.offer = offer;
	} 

	public WebsiteImpl offer(java.lang.String offer) { 
		this.offer = offer;
		return this;
	} 

	public java.lang.String getAnycast() { 
		return this.anycast;
	} 

	public void setAnycast(java.lang.String anycast) { 
		this.anycast = anycast;
	} 

	public WebsiteImpl anycast(java.lang.String anycast) { 
		this.anycast = anycast;
		return this;
	} 

	public java.lang.String getService() { 
		return this.service;
	} 

	public void setService(java.lang.String service) { 
		this.service = service;
	} 

	public WebsiteImpl service(java.lang.String service) { 
		this.service = service;
		return this;
	} 

}
