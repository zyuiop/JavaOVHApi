package net.zyuiop.ovhapi.api.objects.agreements;

/**
 * Contract of service
 */

public class Contract { 

	private java.util.Date date;
	private java.lang.String text;
	private java.lang.String pdf;
	private java.lang.String name;
	private boolean active;

	public Contract() {
	}

	public java.util.Date getDate() { 
		return this.date;
	} 

	public void setDate(java.util.Date date) { 
		this.date = date;
	} 

	public Contract date(java.util.Date date) { 
		this.date = date;
		return this;
	} 

	public java.lang.String getText() { 
		return this.text;
	} 

	public void setText(java.lang.String text) { 
		this.text = text;
	} 

	public Contract text(java.lang.String text) { 
		this.text = text;
		return this;
	} 

	public java.lang.String getPdf() { 
		return this.pdf;
	} 

	public void setPdf(java.lang.String pdf) { 
		this.pdf = pdf;
	} 

	public Contract pdf(java.lang.String pdf) { 
		this.pdf = pdf;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public Contract name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public boolean getActive() { 
		return this.active;
	} 

	public void setActive(boolean active) { 
		this.active = active;
	} 

	public Contract active(boolean active) { 
		this.active = active;
		return this;
	} 

}
