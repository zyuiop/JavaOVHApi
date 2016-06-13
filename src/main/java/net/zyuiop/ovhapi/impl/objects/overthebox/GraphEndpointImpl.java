package net.zyuiop.ovhapi.impl.objects.overthebox;

import net.zyuiop.ovhapi.api.objects.overthebox.GraphEndpoint;
/**
 * Parameters required to query metrics from OpenTSDB
 */

public class GraphEndpointImpl implements GraphEndpoint { 

	private java.lang.String readToken;
	private java.lang.String host;

	public GraphEndpointImpl() {
	}

	public java.lang.String getReadToken() { 
		return this.readToken;
	} 

	public void setReadToken(java.lang.String readToken) { 
		this.readToken = readToken;
	} 

	public GraphEndpointImpl readToken(java.lang.String readToken) { 
		this.readToken = readToken;
		return this;
	} 

	public java.lang.String getHost() { 
		return this.host;
	} 

	public void setHost(java.lang.String host) { 
		this.host = host;
	} 

	public GraphEndpointImpl host(java.lang.String host) { 
		this.host = host;
		return this;
	} 

}
