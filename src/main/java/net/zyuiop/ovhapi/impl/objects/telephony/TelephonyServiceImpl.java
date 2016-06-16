package net.zyuiop.ovhapi.impl.objects.telephony;

import net.zyuiop.ovhapi.api.objects.telephony.TelephonyService;
/**
 * Telephony service
 */

public class TelephonyServiceImpl implements TelephonyService { 

	private java.lang.String featureType;
	private java.lang.String rio;
	private java.lang.String serviceName;
	private net.zyuiop.ovhapi.impl.objects.order.PriceImpl currentOutplan;
	private java.lang.String description;
	private java.lang.String properties;
	private java.lang.String serviceType;
	private long simultaneousLines;
	private java.lang.String offers;

	public TelephonyServiceImpl() {
	}

	public java.lang.String getFeatureType() { 
		return this.featureType;
	} 

	public void setFeatureType(java.lang.String featureType) { 
		this.featureType = featureType;
	} 

	public TelephonyServiceImpl featureType(java.lang.String featureType) { 
		this.featureType = featureType;
		return this;
	} 

	public java.lang.String getRio() { 
		return this.rio;
	} 

	public void setRio(java.lang.String rio) { 
		this.rio = rio;
	} 

	public TelephonyServiceImpl rio(java.lang.String rio) { 
		this.rio = rio;
		return this;
	} 

	public java.lang.String getServiceName() { 
		return this.serviceName;
	} 

	public void setServiceName(java.lang.String serviceName) { 
		this.serviceName = serviceName;
	} 

	public TelephonyServiceImpl serviceName(java.lang.String serviceName) { 
		this.serviceName = serviceName;
		return this;
	} 

	public net.zyuiop.ovhapi.impl.objects.order.PriceImpl getCurrentOutplan() { 
		return this.currentOutplan;
	} 

	public void setCurrentOutplan(net.zyuiop.ovhapi.impl.objects.order.PriceImpl currentOutplan) { 
		this.currentOutplan = currentOutplan;
	} 

	public TelephonyServiceImpl currentOutplan(net.zyuiop.ovhapi.impl.objects.order.PriceImpl currentOutplan) { 
		this.currentOutplan = currentOutplan;
		return this;
	} 

	public java.lang.String getDescription() { 
		return this.description;
	} 

	public void setDescription(java.lang.String description) { 
		this.description = description;
	} 

	public TelephonyServiceImpl description(java.lang.String description) { 
		this.description = description;
		return this;
	} 

	public java.lang.String getProperties() { 
		return this.properties;
	} 

	public void setProperties(java.lang.String properties) { 
		this.properties = properties;
	} 

	public TelephonyServiceImpl properties(java.lang.String properties) { 
		this.properties = properties;
		return this;
	} 

	public java.lang.String getServiceType() { 
		return this.serviceType;
	} 

	public void setServiceType(java.lang.String serviceType) { 
		this.serviceType = serviceType;
	} 

	public TelephonyServiceImpl serviceType(java.lang.String serviceType) { 
		this.serviceType = serviceType;
		return this;
	} 

	public long getSimultaneousLines() { 
		return this.simultaneousLines;
	} 

	public void setSimultaneousLines(long simultaneousLines) { 
		this.simultaneousLines = simultaneousLines;
	} 

	public TelephonyServiceImpl simultaneousLines(long simultaneousLines) { 
		this.simultaneousLines = simultaneousLines;
		return this;
	} 

	public java.lang.String getOffers() { 
		return this.offers;
	} 

	public void setOffers(java.lang.String offers) { 
		this.offers = offers;
	} 

	public TelephonyServiceImpl offers(java.lang.String offers) { 
		this.offers = offers;
		return this;
	} 

}
