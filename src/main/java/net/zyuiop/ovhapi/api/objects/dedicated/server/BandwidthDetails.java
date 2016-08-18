package net.zyuiop.ovhapi.api.objects.dedicated.server;

/**
 * A structure describing bandwidth informations about this dedicated server
 */

public class BandwidthDetails { 

	private net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue OvhToInternet;
	private net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue OvhToOvh;
	private java.lang.String type;
	private net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue InternetToOvh;

	public BandwidthDetails() {
	}

	public net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue getOvhToInternet() { 
		return this.OvhToInternet;
	} 

	public void setOvhToInternet(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue OvhToInternet) { 
		this.OvhToInternet = OvhToInternet;
	} 

	public BandwidthDetails OvhToInternet(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue OvhToInternet) { 
		this.OvhToInternet = OvhToInternet;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue getOvhToOvh() { 
		return this.OvhToOvh;
	} 

	public void setOvhToOvh(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue OvhToOvh) { 
		this.OvhToOvh = OvhToOvh;
	} 

	public BandwidthDetails OvhToOvh(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue OvhToOvh) { 
		this.OvhToOvh = OvhToOvh;
		return this;
	} 

	public java.lang.String getType() { 
		return this.type;
	} 

	public void setType(java.lang.String type) { 
		this.type = type;
	} 

	public BandwidthDetails type(java.lang.String type) { 
		this.type = type;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue getInternetToOvh() { 
		return this.InternetToOvh;
	} 

	public void setInternetToOvh(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue InternetToOvh) { 
		this.InternetToOvh = InternetToOvh;
	} 

	public BandwidthDetails InternetToOvh(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue InternetToOvh) { 
		this.InternetToOvh = InternetToOvh;
		return this;
	} 

}
