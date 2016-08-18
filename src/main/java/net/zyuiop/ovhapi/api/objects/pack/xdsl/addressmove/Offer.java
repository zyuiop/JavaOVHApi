package net.zyuiop.ovhapi.api.objects.pack.xdsl.addressmove;

/**
 * An offer
 */

public class Offer { 

	private java.lang.String provider;
	private long syncDownload;
	private java.lang.String offerCode;
	private java.lang.String lineStatus;
	private net.zyuiop.ovhapi.api.objects.xdsl.eligibility.Portability portability;
	private net.zyuiop.ovhapi.api.objects.xdsl.LineSectionLength[] lineSectionsLength;
	private long estimatedUpload;
	private java.lang.String type;
	private net.zyuiop.ovhapi.api.objects.xdsl.eligibility.Address address;
	private net.zyuiop.ovhapi.api.objects.order.Price price;
	private long estimatedDownload;
	private net.zyuiop.ovhapi.api.objects.xdsl.eligibility.MeetingSlots meetingSlots;
	private java.lang.String nra;
	private java.lang.String unbundling;
	private long syncUpload;

	public Offer() {
	}

	public java.lang.String getProvider() { 
		return this.provider;
	} 

	public void setProvider(java.lang.String provider) { 
		this.provider = provider;
	} 

	public Offer provider(java.lang.String provider) { 
		this.provider = provider;
		return this;
	} 

	public long getSyncDownload() { 
		return this.syncDownload;
	} 

	public void setSyncDownload(long syncDownload) { 
		this.syncDownload = syncDownload;
	} 

	public Offer syncDownload(long syncDownload) { 
		this.syncDownload = syncDownload;
		return this;
	} 

	public java.lang.String getOfferCode() { 
		return this.offerCode;
	} 

	public void setOfferCode(java.lang.String offerCode) { 
		this.offerCode = offerCode;
	} 

	public Offer offerCode(java.lang.String offerCode) { 
		this.offerCode = offerCode;
		return this;
	} 

	public java.lang.String getLineStatus() { 
		return this.lineStatus;
	} 

	public void setLineStatus(java.lang.String lineStatus) { 
		this.lineStatus = lineStatus;
	} 

	public Offer lineStatus(java.lang.String lineStatus) { 
		this.lineStatus = lineStatus;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.xdsl.eligibility.Portability getPortability() { 
		return this.portability;
	} 

	public void setPortability(net.zyuiop.ovhapi.api.objects.xdsl.eligibility.Portability portability) { 
		this.portability = portability;
	} 

	public Offer portability(net.zyuiop.ovhapi.api.objects.xdsl.eligibility.Portability portability) { 
		this.portability = portability;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.xdsl.LineSectionLength[] getLineSectionsLength() { 
		return this.lineSectionsLength;
	} 

	public void setLineSectionsLength(net.zyuiop.ovhapi.api.objects.xdsl.LineSectionLength[] lineSectionsLength) { 
		this.lineSectionsLength = lineSectionsLength;
	} 

	public Offer lineSectionsLength(net.zyuiop.ovhapi.api.objects.xdsl.LineSectionLength[] lineSectionsLength) { 
		this.lineSectionsLength = lineSectionsLength;
		return this;
	} 

	public long getEstimatedUpload() { 
		return this.estimatedUpload;
	} 

	public void setEstimatedUpload(long estimatedUpload) { 
		this.estimatedUpload = estimatedUpload;
	} 

	public Offer estimatedUpload(long estimatedUpload) { 
		this.estimatedUpload = estimatedUpload;
		return this;
	} 

	public java.lang.String getType() { 
		return this.type;
	} 

	public void setType(java.lang.String type) { 
		this.type = type;
	} 

	public Offer type(java.lang.String type) { 
		this.type = type;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.xdsl.eligibility.Address getAddress() { 
		return this.address;
	} 

	public void setAddress(net.zyuiop.ovhapi.api.objects.xdsl.eligibility.Address address) { 
		this.address = address;
	} 

	public Offer address(net.zyuiop.ovhapi.api.objects.xdsl.eligibility.Address address) { 
		this.address = address;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.order.Price getPrice() { 
		return this.price;
	} 

	public void setPrice(net.zyuiop.ovhapi.api.objects.order.Price price) { 
		this.price = price;
	} 

	public Offer price(net.zyuiop.ovhapi.api.objects.order.Price price) { 
		this.price = price;
		return this;
	} 

	public long getEstimatedDownload() { 
		return this.estimatedDownload;
	} 

	public void setEstimatedDownload(long estimatedDownload) { 
		this.estimatedDownload = estimatedDownload;
	} 

	public Offer estimatedDownload(long estimatedDownload) { 
		this.estimatedDownload = estimatedDownload;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.xdsl.eligibility.MeetingSlots getMeetingSlots() { 
		return this.meetingSlots;
	} 

	public void setMeetingSlots(net.zyuiop.ovhapi.api.objects.xdsl.eligibility.MeetingSlots meetingSlots) { 
		this.meetingSlots = meetingSlots;
	} 

	public Offer meetingSlots(net.zyuiop.ovhapi.api.objects.xdsl.eligibility.MeetingSlots meetingSlots) { 
		this.meetingSlots = meetingSlots;
		return this;
	} 

	public java.lang.String getNra() { 
		return this.nra;
	} 

	public void setNra(java.lang.String nra) { 
		this.nra = nra;
	} 

	public Offer nra(java.lang.String nra) { 
		this.nra = nra;
		return this;
	} 

	public java.lang.String getUnbundling() { 
		return this.unbundling;
	} 

	public void setUnbundling(java.lang.String unbundling) { 
		this.unbundling = unbundling;
	} 

	public Offer unbundling(java.lang.String unbundling) { 
		this.unbundling = unbundling;
		return this;
	} 

	public long getSyncUpload() { 
		return this.syncUpload;
	} 

	public void setSyncUpload(long syncUpload) { 
		this.syncUpload = syncUpload;
	} 

	public Offer syncUpload(long syncUpload) { 
		this.syncUpload = syncUpload;
		return this;
	} 

}
