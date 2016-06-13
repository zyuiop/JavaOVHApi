package net.zyuiop.ovhapi.impl.objects.dedicated.server;

import net.zyuiop.ovhapi.api.objects.dedicated.server.InstallTemplate;
/**
 * A structure describing informations about an Installation templates
 */

public class InstallTemplateImpl implements InstallTemplate { 

	private java.lang.String ovh;
	private java.lang.String personal;

	public InstallTemplateImpl() {
	}

	public java.lang.String getOvh() { 
		return this.ovh;
	} 

	public void setOvh(java.lang.String ovh) { 
		this.ovh = ovh;
	} 

	public InstallTemplateImpl ovh(java.lang.String ovh) { 
		this.ovh = ovh;
		return this;
	} 

	public java.lang.String getPersonal() { 
		return this.personal;
	} 

	public void setPersonal(java.lang.String personal) { 
		this.personal = personal;
	} 

	public InstallTemplateImpl personal(java.lang.String personal) { 
		this.personal = personal;
		return this;
	} 

}
