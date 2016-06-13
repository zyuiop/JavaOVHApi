package net.zyuiop.ovhapi.impl.objects.contact;

import net.zyuiop.ovhapi.api.objects.contact.Contact;
/**
 * Representation of a Contact
 */

public class ContactImpl implements Contact { 

	private java.lang.String organisationName;
	private java.lang.String vat;
	private java.util.Date birthDay;
	private java.lang.String nationalIdentificationNumber;
	private java.lang.String spareEmail;
	private java.lang.String email;
	private java.lang.String fax;
	private java.lang.String cellPhone;
	private java.lang.String birthCountry;
	private net.zyuiop.ovhapi.api.objects.contact.Address address;
	private long id;
	private java.lang.String lastName;
	private java.lang.String companyNationalIdentificationNumber;
	private java.lang.String gender;
	private java.lang.String birthCity;
	private java.lang.String firstName;
	private java.lang.String language;
	private java.lang.String organisationType;
	private java.lang.String legalForm;
	private java.lang.String phone;
	private java.lang.String birthZip;
	private java.lang.String nationality;

	public ContactImpl() {
	}

	public java.lang.String getOrganisationName() { 
		return this.organisationName;
	} 

	public void setOrganisationName(java.lang.String organisationName) { 
		this.organisationName = organisationName;
	} 

	public ContactImpl organisationName(java.lang.String organisationName) { 
		this.organisationName = organisationName;
		return this;
	} 

	public java.lang.String getVat() { 
		return this.vat;
	} 

	public void setVat(java.lang.String vat) { 
		this.vat = vat;
	} 

	public ContactImpl vat(java.lang.String vat) { 
		this.vat = vat;
		return this;
	} 

	public java.util.Date getBirthDay() { 
		return this.birthDay;
	} 

	public void setBirthDay(java.util.Date birthDay) { 
		this.birthDay = birthDay;
	} 

	public ContactImpl birthDay(java.util.Date birthDay) { 
		this.birthDay = birthDay;
		return this;
	} 

	public java.lang.String getNationalIdentificationNumber() { 
		return this.nationalIdentificationNumber;
	} 

	public void setNationalIdentificationNumber(java.lang.String nationalIdentificationNumber) { 
		this.nationalIdentificationNumber = nationalIdentificationNumber;
	} 

	public ContactImpl nationalIdentificationNumber(java.lang.String nationalIdentificationNumber) { 
		this.nationalIdentificationNumber = nationalIdentificationNumber;
		return this;
	} 

	public java.lang.String getSpareEmail() { 
		return this.spareEmail;
	} 

	public void setSpareEmail(java.lang.String spareEmail) { 
		this.spareEmail = spareEmail;
	} 

	public ContactImpl spareEmail(java.lang.String spareEmail) { 
		this.spareEmail = spareEmail;
		return this;
	} 

	public java.lang.String getEmail() { 
		return this.email;
	} 

	public void setEmail(java.lang.String email) { 
		this.email = email;
	} 

	public ContactImpl email(java.lang.String email) { 
		this.email = email;
		return this;
	} 

	public java.lang.String getFax() { 
		return this.fax;
	} 

	public void setFax(java.lang.String fax) { 
		this.fax = fax;
	} 

	public ContactImpl fax(java.lang.String fax) { 
		this.fax = fax;
		return this;
	} 

	public java.lang.String getCellPhone() { 
		return this.cellPhone;
	} 

	public void setCellPhone(java.lang.String cellPhone) { 
		this.cellPhone = cellPhone;
	} 

	public ContactImpl cellPhone(java.lang.String cellPhone) { 
		this.cellPhone = cellPhone;
		return this;
	} 

	public java.lang.String getBirthCountry() { 
		return this.birthCountry;
	} 

	public void setBirthCountry(java.lang.String birthCountry) { 
		this.birthCountry = birthCountry;
	} 

	public ContactImpl birthCountry(java.lang.String birthCountry) { 
		this.birthCountry = birthCountry;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.contact.Address getAddress() { 
		return this.address;
	} 

	public void setAddress(net.zyuiop.ovhapi.api.objects.contact.Address address) { 
		this.address = address;
	} 

	public ContactImpl address(net.zyuiop.ovhapi.api.objects.contact.Address address) { 
		this.address = address;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public ContactImpl id(long id) { 
		this.id = id;
		return this;
	} 

	public java.lang.String getLastName() { 
		return this.lastName;
	} 

	public void setLastName(java.lang.String lastName) { 
		this.lastName = lastName;
	} 

	public ContactImpl lastName(java.lang.String lastName) { 
		this.lastName = lastName;
		return this;
	} 

	public java.lang.String getCompanyNationalIdentificationNumber() { 
		return this.companyNationalIdentificationNumber;
	} 

	public void setCompanyNationalIdentificationNumber(java.lang.String companyNationalIdentificationNumber) { 
		this.companyNationalIdentificationNumber = companyNationalIdentificationNumber;
	} 

	public ContactImpl companyNationalIdentificationNumber(java.lang.String companyNationalIdentificationNumber) { 
		this.companyNationalIdentificationNumber = companyNationalIdentificationNumber;
		return this;
	} 

	public java.lang.String getGender() { 
		return this.gender;
	} 

	public void setGender(java.lang.String gender) { 
		this.gender = gender;
	} 

	public ContactImpl gender(java.lang.String gender) { 
		this.gender = gender;
		return this;
	} 

	public java.lang.String getBirthCity() { 
		return this.birthCity;
	} 

	public void setBirthCity(java.lang.String birthCity) { 
		this.birthCity = birthCity;
	} 

	public ContactImpl birthCity(java.lang.String birthCity) { 
		this.birthCity = birthCity;
		return this;
	} 

	public java.lang.String getFirstName() { 
		return this.firstName;
	} 

	public void setFirstName(java.lang.String firstName) { 
		this.firstName = firstName;
	} 

	public ContactImpl firstName(java.lang.String firstName) { 
		this.firstName = firstName;
		return this;
	} 

	public java.lang.String getLanguage() { 
		return this.language;
	} 

	public void setLanguage(java.lang.String language) { 
		this.language = language;
	} 

	public ContactImpl language(java.lang.String language) { 
		this.language = language;
		return this;
	} 

	public java.lang.String getOrganisationType() { 
		return this.organisationType;
	} 

	public void setOrganisationType(java.lang.String organisationType) { 
		this.organisationType = organisationType;
	} 

	public ContactImpl organisationType(java.lang.String organisationType) { 
		this.organisationType = organisationType;
		return this;
	} 

	public java.lang.String getLegalForm() { 
		return this.legalForm;
	} 

	public void setLegalForm(java.lang.String legalForm) { 
		this.legalForm = legalForm;
	} 

	public ContactImpl legalForm(java.lang.String legalForm) { 
		this.legalForm = legalForm;
		return this;
	} 

	public java.lang.String getPhone() { 
		return this.phone;
	} 

	public void setPhone(java.lang.String phone) { 
		this.phone = phone;
	} 

	public ContactImpl phone(java.lang.String phone) { 
		this.phone = phone;
		return this;
	} 

	public java.lang.String getBirthZip() { 
		return this.birthZip;
	} 

	public void setBirthZip(java.lang.String birthZip) { 
		this.birthZip = birthZip;
	} 

	public ContactImpl birthZip(java.lang.String birthZip) { 
		this.birthZip = birthZip;
		return this;
	} 

	public java.lang.String getNationality() { 
		return this.nationality;
	} 

	public void setNationality(java.lang.String nationality) { 
		this.nationality = nationality;
	} 

	public ContactImpl nationality(java.lang.String nationality) { 
		this.nationality = nationality;
		return this;
	} 

}
