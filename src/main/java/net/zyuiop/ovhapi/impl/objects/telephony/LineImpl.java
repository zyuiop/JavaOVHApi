package net.zyuiop.ovhapi.impl.objects.telephony;

import net.zyuiop.ovhapi.api.objects.telephony.Line;
/**
 * Line service
 */

public class LineImpl implements Line { 

	private java.lang.String serviceType;
	private java.lang.String[] offers;
	private long simultaneousLines;
	private java.lang.String serviceName;
	private java.lang.String description;

	public LineImpl() {
	}

	public java.lang.String getServiceType() { 
		return this.serviceType;
	} 

	public void setServiceType(java.lang.String serviceType) { 
		this.serviceType = serviceType;
	} 

	public LineImpl serviceType(java.lang.String serviceType) { 
		this.serviceType = serviceType;
		return this;
	} 

	public java.lang.String[] getOffers() { 
		return this.offers;
	} 

	public void setOffers(java.lang.String[] offers) { 
		this.offers = offers;
	} 

	public LineImpl offers(java.lang.String[] offers) { 
		this.offers = offers;
		return this;
	} 

	public long getSimultaneousLines() { 
		return this.simultaneousLines;
	} 

	public void setSimultaneousLines(long simultaneousLines) { 
		this.simultaneousLines = simultaneousLines;
	} 

	public LineImpl simultaneousLines(long simultaneousLines) { 
		this.simultaneousLines = simultaneousLines;
		return this;
	} 

	public java.lang.String getServiceName() { 
		return this.serviceName;
	} 

	public void setServiceName(java.lang.String serviceName) { 
		this.serviceName = serviceName;
	} 

	public LineImpl serviceName(java.lang.String serviceName) { 
		this.serviceName = serviceName;
		return this;
	} 

	public java.lang.String getDescription() { 
		return this.description;
	} 

	public void setDescription(java.lang.String description) { 
		this.description = description;
	} 

	public LineImpl description(java.lang.String description) { 
		this.description = description;
		return this;
	} 

}
