package net.zyuiop.ovhapi.impl.objects.agreements;

import net.zyuiop.ovhapi.api.objects.agreements.ContractAgreement;
/**
 * Contract agreement
 */

public class ContractAgreementImpl implements ContractAgreement { 

	private java.lang.String agreed;
	private java.util.Date date;
	private long id;
	private long contractId;

	public ContractAgreementImpl() {
	}

	public java.lang.String getAgreed() { 
		return this.agreed;
	} 

	public void setAgreed(java.lang.String agreed) { 
		this.agreed = agreed;
	} 

	public ContractAgreementImpl agreed(java.lang.String agreed) { 
		this.agreed = agreed;
		return this;
	} 

	public java.util.Date getDate() { 
		return this.date;
	} 

	public void setDate(java.util.Date date) { 
		this.date = date;
	} 

	public ContractAgreementImpl date(java.util.Date date) { 
		this.date = date;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public ContractAgreementImpl id(long id) { 
		this.id = id;
		return this;
	} 

	public long getContractId() { 
		return this.contractId;
	} 

	public void setContractId(long contractId) { 
		this.contractId = contractId;
	} 

	public ContractAgreementImpl contractId(long contractId) { 
		this.contractId = contractId;
		return this;
	} 

}
