package net.zyuiop.ovhapi.api.objects.dedicated.server;

/**
 * A structure describing informations about an Installation templates
 */

public class InstallTemplate { 

	private java.lang.String[] ovh;
	private java.lang.String[] personal;

	public InstallTemplate() {
	}

	public java.lang.String[] getOvh() { 
		return this.ovh;
	} 

	public void setOvh(java.lang.String[] ovh) { 
		this.ovh = ovh;
	} 

	public InstallTemplate ovh(java.lang.String[] ovh) { 
		this.ovh = ovh;
		return this;
	} 

	public java.lang.String[] getPersonal() { 
		return this.personal;
	} 

	public void setPersonal(java.lang.String[] personal) { 
		this.personal = personal;
	} 

	public InstallTemplate personal(java.lang.String[] personal) { 
		this.personal = personal;
		return this;
	} 

}
