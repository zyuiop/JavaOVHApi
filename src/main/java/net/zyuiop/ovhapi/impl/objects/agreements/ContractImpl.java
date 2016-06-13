package net.zyuiop.ovhapi.impl.objects.agreements;

import net.zyuiop.ovhapi.api.objects.agreements.Contract;
/**
 * Contract of service
 */

public class ContractImpl implements Contract { 

	private java.util.Date date;
	private java.lang.String text;
	private java.lang.String pdf;
	private java.lang.String name;
	private boolean active;

	public ContractImpl() {
	}

	public java.util.Date getDate() { 
		return this.date;
	} 

	public void setDate(java.util.Date date) { 
		this.date = date;
	} 

	public ContractImpl date(java.util.Date date) { 
		this.date = date;
		return this;
	} 

	public java.lang.String getText() { 
		return this.text;
	} 

	public void setText(java.lang.String text) { 
		this.text = text;
	} 

	public ContractImpl text(java.lang.String text) { 
		this.text = text;
		return this;
	} 

	public java.lang.String getPdf() { 
		return this.pdf;
	} 

	public void setPdf(java.lang.String pdf) { 
		this.pdf = pdf;
	} 

	public ContractImpl pdf(java.lang.String pdf) { 
		this.pdf = pdf;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public ContractImpl name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public boolean getActive() { 
		return this.active;
	} 

	public void setActive(boolean active) { 
		this.active = active;
	} 

	public ContractImpl active(boolean active) { 
		this.active = active;
		return this;
	} 

}
