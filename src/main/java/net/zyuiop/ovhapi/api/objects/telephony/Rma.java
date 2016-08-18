package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Current Return Merchandise Authorisation
 */

public class Rma { 

	private java.util.Date terminationDatetime;
	private java.lang.String status;
	private java.lang.String newMerchandise;
	private net.zyuiop.ovhapi.api.objects.telephony.Contact shippingContact;
	private java.lang.String offerTypeNew;
	private java.lang.String equipmentReference;
	private java.util.Date creationDatetime;
	private java.lang.String type;
	private java.lang.String id;
	private java.lang.String offerTypeOld;
	private java.util.Date receptionDatetime;

	public Rma() {
	}

	public java.util.Date getTerminationDatetime() { 
		return this.terminationDatetime;
	} 

	public void setTerminationDatetime(java.util.Date terminationDatetime) { 
		this.terminationDatetime = terminationDatetime;
	} 

	public Rma terminationDatetime(java.util.Date terminationDatetime) { 
		this.terminationDatetime = terminationDatetime;
		return this;
	} 

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public Rma status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public java.lang.String getNewMerchandise() { 
		return this.newMerchandise;
	} 

	public void setNewMerchandise(java.lang.String newMerchandise) { 
		this.newMerchandise = newMerchandise;
	} 

	public Rma newMerchandise(java.lang.String newMerchandise) { 
		this.newMerchandise = newMerchandise;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.telephony.Contact getShippingContact() { 
		return this.shippingContact;
	} 

	public void setShippingContact(net.zyuiop.ovhapi.api.objects.telephony.Contact shippingContact) { 
		this.shippingContact = shippingContact;
	} 

	public Rma shippingContact(net.zyuiop.ovhapi.api.objects.telephony.Contact shippingContact) { 
		this.shippingContact = shippingContact;
		return this;
	} 

	public java.lang.String getOfferTypeNew() { 
		return this.offerTypeNew;
	} 

	public void setOfferTypeNew(java.lang.String offerTypeNew) { 
		this.offerTypeNew = offerTypeNew;
	} 

	public Rma offerTypeNew(java.lang.String offerTypeNew) { 
		this.offerTypeNew = offerTypeNew;
		return this;
	} 

	public java.lang.String getEquipmentReference() { 
		return this.equipmentReference;
	} 

	public void setEquipmentReference(java.lang.String equipmentReference) { 
		this.equipmentReference = equipmentReference;
	} 

	public Rma equipmentReference(java.lang.String equipmentReference) { 
		this.equipmentReference = equipmentReference;
		return this;
	} 

	public java.util.Date getCreationDatetime() { 
		return this.creationDatetime;
	} 

	public void setCreationDatetime(java.util.Date creationDatetime) { 
		this.creationDatetime = creationDatetime;
	} 

	public Rma creationDatetime(java.util.Date creationDatetime) { 
		this.creationDatetime = creationDatetime;
		return this;
	} 

	public java.lang.String getType() { 
		return this.type;
	} 

	public void setType(java.lang.String type) { 
		this.type = type;
	} 

	public Rma type(java.lang.String type) { 
		this.type = type;
		return this;
	} 

	public java.lang.String getId() { 
		return this.id;
	} 

	public void setId(java.lang.String id) { 
		this.id = id;
	} 

	public Rma id(java.lang.String id) { 
		this.id = id;
		return this;
	} 

	public java.lang.String getOfferTypeOld() { 
		return this.offerTypeOld;
	} 

	public void setOfferTypeOld(java.lang.String offerTypeOld) { 
		this.offerTypeOld = offerTypeOld;
	} 

	public Rma offerTypeOld(java.lang.String offerTypeOld) { 
		this.offerTypeOld = offerTypeOld;
		return this;
	} 

	public java.util.Date getReceptionDatetime() { 
		return this.receptionDatetime;
	} 

	public void setReceptionDatetime(java.util.Date receptionDatetime) { 
		this.receptionDatetime = receptionDatetime;
	} 

	public Rma receptionDatetime(java.util.Date receptionDatetime) { 
		this.receptionDatetime = receptionDatetime;
		return this;
	} 

}
