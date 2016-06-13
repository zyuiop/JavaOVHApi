package net.zyuiop.ovhapi.impl.objects.telephony;

import net.zyuiop.ovhapi.api.objects.telephony.FaxCampaign;
/**
 * Fax campaigns
 */

public class FaxCampaignImpl implements FaxCampaign { 

	private long countFailed;
	private java.lang.String status;
	private java.lang.String name;
	private java.util.Date dateEnd;
	private long countTotal;
	private long countSuccess;
	private java.lang.String reference;
	private java.util.Date dateStart;
	private long id;

	public FaxCampaignImpl() {
	}

	public long getCountFailed() { 
		return this.countFailed;
	} 

	public void setCountFailed(long countFailed) { 
		this.countFailed = countFailed;
	} 

	public FaxCampaignImpl countFailed(long countFailed) { 
		this.countFailed = countFailed;
		return this;
	} 

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public FaxCampaignImpl status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public FaxCampaignImpl name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public java.util.Date getDateEnd() { 
		return this.dateEnd;
	} 

	public void setDateEnd(java.util.Date dateEnd) { 
		this.dateEnd = dateEnd;
	} 

	public FaxCampaignImpl dateEnd(java.util.Date dateEnd) { 
		this.dateEnd = dateEnd;
		return this;
	} 

	public long getCountTotal() { 
		return this.countTotal;
	} 

	public void setCountTotal(long countTotal) { 
		this.countTotal = countTotal;
	} 

	public FaxCampaignImpl countTotal(long countTotal) { 
		this.countTotal = countTotal;
		return this;
	} 

	public long getCountSuccess() { 
		return this.countSuccess;
	} 

	public void setCountSuccess(long countSuccess) { 
		this.countSuccess = countSuccess;
	} 

	public FaxCampaignImpl countSuccess(long countSuccess) { 
		this.countSuccess = countSuccess;
		return this;
	} 

	public java.lang.String getReference() { 
		return this.reference;
	} 

	public void setReference(java.lang.String reference) { 
		this.reference = reference;
	} 

	public FaxCampaignImpl reference(java.lang.String reference) { 
		this.reference = reference;
		return this;
	} 

	public java.util.Date getDateStart() { 
		return this.dateStart;
	} 

	public void setDateStart(java.util.Date dateStart) { 
		this.dateStart = dateStart;
	} 

	public FaxCampaignImpl dateStart(java.util.Date dateStart) { 
		this.dateStart = dateStart;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public FaxCampaignImpl id(long id) { 
		this.id = id;
		return this;
	} 

}
