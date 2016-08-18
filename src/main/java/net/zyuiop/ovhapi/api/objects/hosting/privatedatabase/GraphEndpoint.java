package net.zyuiop.ovhapi.api.objects.hosting.privatedatabase;

/**
 * Parameters required to query metrics from OpenTSDB
 */

public class GraphEndpoint { 

	private java.lang.String readToken;
	private java.lang.String host;

	public GraphEndpoint() {
	}

	public java.lang.String getReadToken() { 
		return this.readToken;
	} 

	public void setReadToken(java.lang.String readToken) { 
		this.readToken = readToken;
	} 

	public GraphEndpoint readToken(java.lang.String readToken) { 
		this.readToken = readToken;
		return this;
	} 

	public java.lang.String getHost() { 
		return this.host;
	} 

	public void setHost(java.lang.String host) { 
		this.host = host;
	} 

	public GraphEndpoint host(java.lang.String host) { 
		this.host = host;
		return this;
	} 

}
