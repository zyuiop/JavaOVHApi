package net.zyuiop.ovhapi.api.objects.pca;

/**
 * cloud archives sessions
 */

public class Session { 

	private java.lang.String name;
	private java.lang.String login;
	private long size;
	private java.lang.String srcIp;
	private java.lang.String state;
	private java.util.Date endDate;
	private java.lang.String id;
	private java.util.Date startDate;

	public Session() {
	}

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public Session name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public java.lang.String getLogin() { 
		return this.login;
	} 

	public void setLogin(java.lang.String login) { 
		this.login = login;
	} 

	public Session login(java.lang.String login) { 
		this.login = login;
		return this;
	} 

	public long getSize() { 
		return this.size;
	} 

	public void setSize(long size) { 
		this.size = size;
	} 

	public Session size(long size) { 
		this.size = size;
		return this;
	} 

	public java.lang.String getSrcIp() { 
		return this.srcIp;
	} 

	public void setSrcIp(java.lang.String srcIp) { 
		this.srcIp = srcIp;
	} 

	public Session srcIp(java.lang.String srcIp) { 
		this.srcIp = srcIp;
		return this;
	} 

	public java.lang.String getState() { 
		return this.state;
	} 

	public void setState(java.lang.String state) { 
		this.state = state;
	} 

	public Session state(java.lang.String state) { 
		this.state = state;
		return this;
	} 

	public java.util.Date getEndDate() { 
		return this.endDate;
	} 

	public void setEndDate(java.util.Date endDate) { 
		this.endDate = endDate;
	} 

	public Session endDate(java.util.Date endDate) { 
		this.endDate = endDate;
		return this;
	} 

	public java.lang.String getId() { 
		return this.id;
	} 

	public void setId(java.lang.String id) { 
		this.id = id;
	} 

	public Session id(java.lang.String id) { 
		this.id = id;
		return this;
	} 

	public java.util.Date getStartDate() { 
		return this.startDate;
	} 

	public void setStartDate(java.util.Date startDate) { 
		this.startDate = startDate;
	} 

	public Session startDate(java.util.Date startDate) { 
		this.startDate = startDate;
		return this;
	} 

}
