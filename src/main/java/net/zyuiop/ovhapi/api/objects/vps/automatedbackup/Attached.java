package net.zyuiop.ovhapi.api.objects.vps.automatedbackup;

/**
 * A backup attached to your VPS
 */

public class Attached { 

	private net.zyuiop.ovhapi.api.objects.vps.automatedbackup.attached.Infos access;
	private java.util.Date restorePoint;

	public Attached() {
	}

	public net.zyuiop.ovhapi.api.objects.vps.automatedbackup.attached.Infos getAccess() { 
		return this.access;
	} 

	public void setAccess(net.zyuiop.ovhapi.api.objects.vps.automatedbackup.attached.Infos access) { 
		this.access = access;
	} 

	public Attached access(net.zyuiop.ovhapi.api.objects.vps.automatedbackup.attached.Infos access) { 
		this.access = access;
		return this;
	} 

	public java.util.Date getRestorePoint() { 
		return this.restorePoint;
	} 

	public void setRestorePoint(java.util.Date restorePoint) { 
		this.restorePoint = restorePoint;
	} 

	public Attached restorePoint(java.util.Date restorePoint) { 
		this.restorePoint = restorePoint;
		return this;
	} 

}
