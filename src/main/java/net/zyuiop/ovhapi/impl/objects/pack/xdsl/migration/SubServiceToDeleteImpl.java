package net.zyuiop.ovhapi.impl.objects.pack.xdsl.migration;

import net.zyuiop.ovhapi.api.objects.pack.xdsl.migration.SubServiceToDelete;
/**
 * Sub service to delete
 */

public class SubServiceToDeleteImpl implements SubServiceToDelete { 

	private long numberToDelete;
	private java.lang.String[] services;
	private java.lang.String type;

	public SubServiceToDeleteImpl() {
	}

	public long getNumberToDelete() { 
		return this.numberToDelete;
	} 

	public void setNumberToDelete(long numberToDelete) { 
		this.numberToDelete = numberToDelete;
	} 

	public SubServiceToDeleteImpl numberToDelete(long numberToDelete) { 
		this.numberToDelete = numberToDelete;
		return this;
	} 

	public java.lang.String[] getServices() { 
		return this.services;
	} 

	public void setServices(java.lang.String[] services) { 
		this.services = services;
	} 

	public SubServiceToDeleteImpl services(java.lang.String[] services) { 
		this.services = services;
		return this;
	} 

	public java.lang.String getType() { 
		return this.type;
	} 

	public void setType(java.lang.String type) { 
		this.type = type;
	} 

	public SubServiceToDeleteImpl type(java.lang.String type) { 
		this.type = type;
		return this;
	} 

}
