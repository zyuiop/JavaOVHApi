package net.zyuiop.ovhapi.api.objects.cdnanycast;

/**
 * CDN Pop
 */

public class Pop { 

	private java.lang.String city;
	private java.lang.String comment;
	private java.lang.String status;
	private java.lang.String name;

	public Pop() {
	}

	public java.lang.String getCity() { 
		return this.city;
	} 

	public void setCity(java.lang.String city) { 
		this.city = city;
	} 

	public Pop city(java.lang.String city) { 
		this.city = city;
		return this;
	} 

	public java.lang.String getComment() { 
		return this.comment;
	} 

	public void setComment(java.lang.String comment) { 
		this.comment = comment;
	} 

	public Pop comment(java.lang.String comment) { 
		this.comment = comment;
		return this;
	} 

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public Pop status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public Pop name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

}
