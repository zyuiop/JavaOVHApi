package net.zyuiop.ovhapi.impl.objects.pack.xdsl.addressmove;

import net.zyuiop.ovhapi.api.objects.pack.xdsl.addressmove.Offer;
/**
 * An offer
 */

public class OfferImpl implements Offer { 

	private java.lang.String provider;
	private long syncDownload;
	private java.lang.String offerCode;
	private java.lang.String lineStatus;
	private net.zyuiop.ovhapi.impl.objects.xdsl.eligibility.PortabilityImpl portability;
	private net.zyuiop.ovhapi.impl.objects.xdsl.LineSectionLengthImpl[] lineSectionsLength;
	private long estimatedUpload;
	private java.lang.String type;
	private net.zyuiop.ovhapi.impl.objects.xdsl.eligibility.AddressImpl address;
	private net.zyuiop.ovhapi.impl.objects.order.PriceImpl price;
	private long estimatedDownload;
	private net.zyuiop.ovhapi.impl.objects.xdsl.eligibility.MeetingSlotsImpl meetingSlots;
	private java.lang.String nra;
	private java.lang.String unbundling;
	private long syncUpload;

	public OfferImpl() {
	}

	public java.lang.String getProvider() { 
		return this.provider;
	} 

	public void setProvider(java.lang.String provider) { 
		this.provider = provider;
	} 

	public OfferImpl provider(java.lang.String provider) { 
		this.provider = provider;
		return this;
	} 

	public long getSyncDownload() { 
		return this.syncDownload;
	} 

	public void setSyncDownload(long syncDownload) { 
		this.syncDownload = syncDownload;
	} 

	public OfferImpl syncDownload(long syncDownload) { 
		this.syncDownload = syncDownload;
		return this;
	} 

	public java.lang.String getOfferCode() { 
		return this.offerCode;
	} 

	public void setOfferCode(java.lang.String offerCode) { 
		this.offerCode = offerCode;
	} 

	public OfferImpl offerCode(java.lang.String offerCode) { 
		this.offerCode = offerCode;
		return this;
	} 

	public java.lang.String getLineStatus() { 
		return this.lineStatus;
	} 

	public void setLineStatus(java.lang.String lineStatus) { 
		this.lineStatus = lineStatus;
	} 

	public OfferImpl lineStatus(java.lang.String lineStatus) { 
		this.lineStatus = lineStatus;
		return this;
	} 

	public net.zyuiop.ovhapi.impl.objects.xdsl.eligibility.PortabilityImpl getPortability() { 
		return this.portability;
	} 

	public void setPortability(net.zyuiop.ovhapi.impl.objects.xdsl.eligibility.PortabilityImpl portability) { 
		this.portability = portability;
	} 

	public OfferImpl portability(net.zyuiop.ovhapi.impl.objects.xdsl.eligibility.PortabilityImpl portability) { 
		this.portability = portability;
		return this;
	} 

	public net.zyuiop.ovhapi.impl.objects.xdsl.LineSectionLengthImpl[] getLineSectionsLength() { 
		return this.lineSectionsLength;
	} 

	public void setLineSectionsLength(net.zyuiop.ovhapi.impl.objects.xdsl.LineSectionLengthImpl[] lineSectionsLength) { 
		this.lineSectionsLength = lineSectionsLength;
	} 

	public OfferImpl lineSectionsLength(net.zyuiop.ovhapi.impl.objects.xdsl.LineSectionLengthImpl[] lineSectionsLength) { 
		this.lineSectionsLength = lineSectionsLength;
		return this;
	} 

	public long getEstimatedUpload() { 
		return this.estimatedUpload;
	} 

	public void setEstimatedUpload(long estimatedUpload) { 
		this.estimatedUpload = estimatedUpload;
	} 

	public OfferImpl estimatedUpload(long estimatedUpload) { 
		this.estimatedUpload = estimatedUpload;
		return this;
	} 

	public java.lang.String getType() { 
		return this.type;
	} 

	public void setType(java.lang.String type) { 
		this.type = type;
	} 

	public OfferImpl type(java.lang.String type) { 
		this.type = type;
		return this;
	} 

	public net.zyuiop.ovhapi.impl.objects.xdsl.eligibility.AddressImpl getAddress() { 
		return this.address;
	} 

	public void setAddress(net.zyuiop.ovhapi.impl.objects.xdsl.eligibility.AddressImpl address) { 
		this.address = address;
	} 

	public OfferImpl address(net.zyuiop.ovhapi.impl.objects.xdsl.eligibility.AddressImpl address) { 
		this.address = address;
		return this;
	} 

	public net.zyuiop.ovhapi.impl.objects.order.PriceImpl getPrice() { 
		return this.price;
	} 

	public void setPrice(net.zyuiop.ovhapi.impl.objects.order.PriceImpl price) { 
		this.price = price;
	} 

	public OfferImpl price(net.zyuiop.ovhapi.impl.objects.order.PriceImpl price) { 
		this.price = price;
		return this;
	} 

	public long getEstimatedDownload() { 
		return this.estimatedDownload;
	} 

	public void setEstimatedDownload(long estimatedDownload) { 
		this.estimatedDownload = estimatedDownload;
	} 

	public OfferImpl estimatedDownload(long estimatedDownload) { 
		this.estimatedDownload = estimatedDownload;
		return this;
	} 

	public net.zyuiop.ovhapi.impl.objects.xdsl.eligibility.MeetingSlotsImpl getMeetingSlots() { 
		return this.meetingSlots;
	} 

	public void setMeetingSlots(net.zyuiop.ovhapi.impl.objects.xdsl.eligibility.MeetingSlotsImpl meetingSlots) { 
		this.meetingSlots = meetingSlots;
	} 

	public OfferImpl meetingSlots(net.zyuiop.ovhapi.impl.objects.xdsl.eligibility.MeetingSlotsImpl meetingSlots) { 
		this.meetingSlots = meetingSlots;
		return this;
	} 

	public java.lang.String getNra() { 
		return this.nra;
	} 

	public void setNra(java.lang.String nra) { 
		this.nra = nra;
	} 

	public OfferImpl nra(java.lang.String nra) { 
		this.nra = nra;
		return this;
	} 

	public java.lang.String getUnbundling() { 
		return this.unbundling;
	} 

	public void setUnbundling(java.lang.String unbundling) { 
		this.unbundling = unbundling;
	} 

	public OfferImpl unbundling(java.lang.String unbundling) { 
		this.unbundling = unbundling;
		return this;
	} 

	public long getSyncUpload() { 
		return this.syncUpload;
	} 

	public void setSyncUpload(long syncUpload) { 
		this.syncUpload = syncUpload;
	} 

	public OfferImpl syncUpload(long syncUpload) { 
		this.syncUpload = syncUpload;
		return this;
	} 

}
