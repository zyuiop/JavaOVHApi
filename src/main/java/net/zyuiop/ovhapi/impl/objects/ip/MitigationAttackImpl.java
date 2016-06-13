package net.zyuiop.ovhapi.impl.objects.ip;

import net.zyuiop.ovhapi.api.objects.ip.MitigationAttack;
/**
 * Mitigation attack on your ip
 */

public class MitigationAttackImpl implements MitigationAttack { 

	private java.util.Date endDate;
	private long idAttack;
	private java.lang.String ipAttack;
	private java.util.Date startDate;

	public MitigationAttackImpl() {
	}

	public java.util.Date getEndDate() { 
		return this.endDate;
	} 

	public void setEndDate(java.util.Date endDate) { 
		this.endDate = endDate;
	} 

	public MitigationAttackImpl endDate(java.util.Date endDate) { 
		this.endDate = endDate;
		return this;
	} 

	public long getIdAttack() { 
		return this.idAttack;
	} 

	public void setIdAttack(long idAttack) { 
		this.idAttack = idAttack;
	} 

	public MitigationAttackImpl idAttack(long idAttack) { 
		this.idAttack = idAttack;
		return this;
	} 

	public java.lang.String getIpAttack() { 
		return this.ipAttack;
	} 

	public void setIpAttack(java.lang.String ipAttack) { 
		this.ipAttack = ipAttack;
	} 

	public MitigationAttackImpl ipAttack(java.lang.String ipAttack) { 
		this.ipAttack = ipAttack;
		return this;
	} 

	public java.util.Date getStartDate() { 
		return this.startDate;
	} 

	public void setStartDate(java.util.Date startDate) { 
		this.startDate = startDate;
	} 

	public MitigationAttackImpl startDate(java.util.Date startDate) { 
		this.startDate = startDate;
		return this;
	} 

}
