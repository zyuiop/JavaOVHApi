package net.zyuiop.ovhapi.api.objects.supply;

/**
 * Mondial Relay Point Details
 */

public class MondialRelay { 

	private java.lang.String country;
	private double distance;
	private double lat;
	private java.lang.String name;
	private net.zyuiop.ovhapi.api.objects.supply.MondialRelayOpening opening;
	private java.lang.String zipcode;
	private java.lang.String mapUrl;
	private java.lang.String city;
	private java.lang.String pictureUrl;
	private java.lang.String id;
	private java.lang.String address;
	private double lng;
	private net.zyuiop.ovhapi.api.objects.supply.MondialRelayClosingPeriod[] closing;

	public MondialRelay() {
	}

	public java.lang.String getCountry() { 
		return this.country;
	} 

	public void setCountry(java.lang.String country) { 
		this.country = country;
	} 

	public MondialRelay country(java.lang.String country) { 
		this.country = country;
		return this;
	} 

	public double getDistance() { 
		return this.distance;
	} 

	public void setDistance(double distance) { 
		this.distance = distance;
	} 

	public MondialRelay distance(double distance) { 
		this.distance = distance;
		return this;
	} 

	public double getLat() { 
		return this.lat;
	} 

	public void setLat(double lat) { 
		this.lat = lat;
	} 

	public MondialRelay lat(double lat) { 
		this.lat = lat;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public MondialRelay name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.supply.MondialRelayOpening getOpening() { 
		return this.opening;
	} 

	public void setOpening(net.zyuiop.ovhapi.api.objects.supply.MondialRelayOpening opening) { 
		this.opening = opening;
	} 

	public MondialRelay opening(net.zyuiop.ovhapi.api.objects.supply.MondialRelayOpening opening) { 
		this.opening = opening;
		return this;
	} 

	public java.lang.String getZipcode() { 
		return this.zipcode;
	} 

	public void setZipcode(java.lang.String zipcode) { 
		this.zipcode = zipcode;
	} 

	public MondialRelay zipcode(java.lang.String zipcode) { 
		this.zipcode = zipcode;
		return this;
	} 

	public java.lang.String getMapUrl() { 
		return this.mapUrl;
	} 

	public void setMapUrl(java.lang.String mapUrl) { 
		this.mapUrl = mapUrl;
	} 

	public MondialRelay mapUrl(java.lang.String mapUrl) { 
		this.mapUrl = mapUrl;
		return this;
	} 

	public java.lang.String getCity() { 
		return this.city;
	} 

	public void setCity(java.lang.String city) { 
		this.city = city;
	} 

	public MondialRelay city(java.lang.String city) { 
		this.city = city;
		return this;
	} 

	public java.lang.String getPictureUrl() { 
		return this.pictureUrl;
	} 

	public void setPictureUrl(java.lang.String pictureUrl) { 
		this.pictureUrl = pictureUrl;
	} 

	public MondialRelay pictureUrl(java.lang.String pictureUrl) { 
		this.pictureUrl = pictureUrl;
		return this;
	} 

	public java.lang.String getId() { 
		return this.id;
	} 

	public void setId(java.lang.String id) { 
		this.id = id;
	} 

	public MondialRelay id(java.lang.String id) { 
		this.id = id;
		return this;
	} 

	public java.lang.String getAddress() { 
		return this.address;
	} 

	public void setAddress(java.lang.String address) { 
		this.address = address;
	} 

	public MondialRelay address(java.lang.String address) { 
		this.address = address;
		return this;
	} 

	public double getLng() { 
		return this.lng;
	} 

	public void setLng(double lng) { 
		this.lng = lng;
	} 

	public MondialRelay lng(double lng) { 
		this.lng = lng;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.supply.MondialRelayClosingPeriod[] getClosing() { 
		return this.closing;
	} 

	public void setClosing(net.zyuiop.ovhapi.api.objects.supply.MondialRelayClosingPeriod[] closing) { 
		this.closing = closing;
	} 

	public MondialRelay closing(net.zyuiop.ovhapi.api.objects.supply.MondialRelayClosingPeriod[] closing) { 
		this.closing = closing;
		return this;
	} 

}
