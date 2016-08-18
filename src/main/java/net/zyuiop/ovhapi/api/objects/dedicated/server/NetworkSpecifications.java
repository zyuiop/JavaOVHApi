package net.zyuiop.ovhapi.api.objects.dedicated.server;

/**
 * A structure describing network informations about this dedicated server
 */

public class NetworkSpecifications { 

	private net.zyuiop.ovhapi.api.objects.dedicated.server.TrafficDetails traffic;
	private net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue connection;
	private net.zyuiop.ovhapi.api.objects.dedicated.server.BandwidthDetails bandwidth;

	public NetworkSpecifications() {
	}

	public net.zyuiop.ovhapi.api.objects.dedicated.server.TrafficDetails getTraffic() { 
		return this.traffic;
	} 

	public void setTraffic(net.zyuiop.ovhapi.api.objects.dedicated.server.TrafficDetails traffic) { 
		this.traffic = traffic;
	} 

	public NetworkSpecifications traffic(net.zyuiop.ovhapi.api.objects.dedicated.server.TrafficDetails traffic) { 
		this.traffic = traffic;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue getConnection() { 
		return this.connection;
	} 

	public void setConnection(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue connection) { 
		this.connection = connection;
	} 

	public NetworkSpecifications connection(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue connection) { 
		this.connection = connection;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.dedicated.server.BandwidthDetails getBandwidth() { 
		return this.bandwidth;
	} 

	public void setBandwidth(net.zyuiop.ovhapi.api.objects.dedicated.server.BandwidthDetails bandwidth) { 
		this.bandwidth = bandwidth;
	} 

	public NetworkSpecifications bandwidth(net.zyuiop.ovhapi.api.objects.dedicated.server.BandwidthDetails bandwidth) { 
		this.bandwidth = bandwidth;
		return this;
	} 

}
