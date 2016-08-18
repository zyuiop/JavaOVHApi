package net.zyuiop.ovhapi.api.objects.domain.zone;

/**
 * Redirection
 */

public class Redirection { 

	private java.lang.String zone;
	private java.lang.String description;
	private java.lang.String keywords;
	private java.lang.String target;
	private long id;
	private java.lang.String subDomain;
	private java.lang.String type;
	private java.lang.String title;

	public Redirection() {
	}

	public java.lang.String getZone() { 
		return this.zone;
	} 

	public void setZone(java.lang.String zone) { 
		this.zone = zone;
	} 

	public Redirection zone(java.lang.String zone) { 
		this.zone = zone;
		return this;
	} 

	public java.lang.String getDescription() { 
		return this.description;
	} 

	public void setDescription(java.lang.String description) { 
		this.description = description;
	} 

	public Redirection description(java.lang.String description) { 
		this.description = description;
		return this;
	} 

	public java.lang.String getKeywords() { 
		return this.keywords;
	} 

	public void setKeywords(java.lang.String keywords) { 
		this.keywords = keywords;
	} 

	public Redirection keywords(java.lang.String keywords) { 
		this.keywords = keywords;
		return this;
	} 

	public java.lang.String getTarget() { 
		return this.target;
	} 

	public void setTarget(java.lang.String target) { 
		this.target = target;
	} 

	public Redirection target(java.lang.String target) { 
		this.target = target;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public Redirection id(long id) { 
		this.id = id;
		return this;
	} 

	public java.lang.String getSubDomain() { 
		return this.subDomain;
	} 

	public void setSubDomain(java.lang.String subDomain) { 
		this.subDomain = subDomain;
	} 

	public Redirection subDomain(java.lang.String subDomain) { 
		this.subDomain = subDomain;
		return this;
	} 

	public java.lang.String getType() { 
		return this.type;
	} 

	public void setType(java.lang.String type) { 
		this.type = type;
	} 

	public Redirection type(java.lang.String type) { 
		this.type = type;
		return this;
	} 

	public java.lang.String getTitle() { 
		return this.title;
	} 

	public void setTitle(java.lang.String title) { 
		this.title = title;
	} 

	public Redirection title(java.lang.String title) { 
		this.title = title;
		return this;
	} 

}
