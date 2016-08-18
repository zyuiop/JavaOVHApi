package net.zyuiop.ovhapi.api.objects.agreements;

/**
 * Contract agreement
 */

public class ContractAgreement { 

	private java.lang.String agreed;
	private java.util.Date date;
	private long id;
	private long contractId;

	public ContractAgreement() {
	}

	public java.lang.String getAgreed() { 
		return this.agreed;
	} 

	public void setAgreed(java.lang.String agreed) { 
		this.agreed = agreed;
	} 

	public ContractAgreement agreed(java.lang.String agreed) { 
		this.agreed = agreed;
		return this;
	} 

	public java.util.Date getDate() { 
		return this.date;
	} 

	public void setDate(java.util.Date date) { 
		this.date = date;
	} 

	public ContractAgreement date(java.util.Date date) { 
		this.date = date;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public ContractAgreement id(long id) { 
		this.id = id;
		return this;
	} 

	public long getContractId() { 
		return this.contractId;
	} 

	public void setContractId(long contractId) { 
		this.contractId = contractId;
	} 

	public ContractAgreement contractId(long contractId) { 
		this.contractId = contractId;
		return this;
	} 

}
