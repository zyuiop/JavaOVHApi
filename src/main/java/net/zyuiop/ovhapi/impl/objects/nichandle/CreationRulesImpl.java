package net.zyuiop.ovhapi.impl.objects.nichandle;

import net.zyuiop.ovhapi.api.objects.nichandle.CreationRules;
/**
 * Describe rules foreach field in order to create a nic
 */

public class CreationRulesImpl implements CreationRules { 

	private net.zyuiop.ovhapi.api.objects.nichandle.CreationRule firstname;
	private net.zyuiop.ovhapi.api.objects.nichandle.CreationRule vat;
	private net.zyuiop.ovhapi.api.objects.nichandle.CreationRule area;
	private net.zyuiop.ovhapi.api.objects.nichandle.CreationRule birthDay;
	private net.zyuiop.ovhapi.api.objects.nichandle.CreationRule nationalIdentificationNumber;
	private net.zyuiop.ovhapi.api.objects.nichandle.CreationRule ovhSubsidiary;
	private net.zyuiop.ovhapi.api.objects.nichandle.CreationRule spareEmail;
	private net.zyuiop.ovhapi.api.objects.nichandle.CreationRule ovhCompany;
	private net.zyuiop.ovhapi.api.objects.nichandle.CreationRule email;
	private net.zyuiop.ovhapi.api.objects.nichandle.CreationRule city;
	private net.zyuiop.ovhapi.api.objects.nichandle.CreationRule fax;
	private net.zyuiop.ovhapi.api.objects.nichandle.CreationRule address;
	private net.zyuiop.ovhapi.api.objects.nichandle.CreationRule companyNationalIdentificationNumber;
	private net.zyuiop.ovhapi.api.objects.nichandle.CreationRule birthCity;
	private net.zyuiop.ovhapi.api.objects.nichandle.CreationRule country;
	private net.zyuiop.ovhapi.api.objects.nichandle.CreationRule organisation;
	private net.zyuiop.ovhapi.api.objects.nichandle.CreationRule language;
	private net.zyuiop.ovhapi.api.objects.nichandle.CreationRule name;
	private net.zyuiop.ovhapi.api.objects.nichandle.CreationRule phone;
	private net.zyuiop.ovhapi.api.objects.nichandle.CreationRule sex;
	private net.zyuiop.ovhapi.api.objects.nichandle.CreationRule zip;
	private net.zyuiop.ovhapi.api.objects.nichandle.CreationRule corporationType;
	private net.zyuiop.ovhapi.api.objects.nichandle.CreationRule legalform;

	public CreationRulesImpl() {
	}

	public net.zyuiop.ovhapi.api.objects.nichandle.CreationRule getFirstname() { 
		return this.firstname;
	} 

	public void setFirstname(net.zyuiop.ovhapi.api.objects.nichandle.CreationRule firstname) { 
		this.firstname = firstname;
	} 

	public CreationRulesImpl firstname(net.zyuiop.ovhapi.api.objects.nichandle.CreationRule firstname) { 
		this.firstname = firstname;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.nichandle.CreationRule getVat() { 
		return this.vat;
	} 

	public void setVat(net.zyuiop.ovhapi.api.objects.nichandle.CreationRule vat) { 
		this.vat = vat;
	} 

	public CreationRulesImpl vat(net.zyuiop.ovhapi.api.objects.nichandle.CreationRule vat) { 
		this.vat = vat;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.nichandle.CreationRule getArea() { 
		return this.area;
	} 

	public void setArea(net.zyuiop.ovhapi.api.objects.nichandle.CreationRule area) { 
		this.area = area;
	} 

	public CreationRulesImpl area(net.zyuiop.ovhapi.api.objects.nichandle.CreationRule area) { 
		this.area = area;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.nichandle.CreationRule getBirthDay() { 
		return this.birthDay;
	} 

	public void setBirthDay(net.zyuiop.ovhapi.api.objects.nichandle.CreationRule birthDay) { 
		this.birthDay = birthDay;
	} 

	public CreationRulesImpl birthDay(net.zyuiop.ovhapi.api.objects.nichandle.CreationRule birthDay) { 
		this.birthDay = birthDay;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.nichandle.CreationRule getNationalIdentificationNumber() { 
		return this.nationalIdentificationNumber;
	} 

	public void setNationalIdentificationNumber(net.zyuiop.ovhapi.api.objects.nichandle.CreationRule nationalIdentificationNumber) { 
		this.nationalIdentificationNumber = nationalIdentificationNumber;
	} 

	public CreationRulesImpl nationalIdentificationNumber(net.zyuiop.ovhapi.api.objects.nichandle.CreationRule nationalIdentificationNumber) { 
		this.nationalIdentificationNumber = nationalIdentificationNumber;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.nichandle.CreationRule getOvhSubsidiary() { 
		return this.ovhSubsidiary;
	} 

	public void setOvhSubsidiary(net.zyuiop.ovhapi.api.objects.nichandle.CreationRule ovhSubsidiary) { 
		this.ovhSubsidiary = ovhSubsidiary;
	} 

	public CreationRulesImpl ovhSubsidiary(net.zyuiop.ovhapi.api.objects.nichandle.CreationRule ovhSubsidiary) { 
		this.ovhSubsidiary = ovhSubsidiary;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.nichandle.CreationRule getSpareEmail() { 
		return this.spareEmail;
	} 

	public void setSpareEmail(net.zyuiop.ovhapi.api.objects.nichandle.CreationRule spareEmail) { 
		this.spareEmail = spareEmail;
	} 

	public CreationRulesImpl spareEmail(net.zyuiop.ovhapi.api.objects.nichandle.CreationRule spareEmail) { 
		this.spareEmail = spareEmail;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.nichandle.CreationRule getOvhCompany() { 
		return this.ovhCompany;
	} 

	public void setOvhCompany(net.zyuiop.ovhapi.api.objects.nichandle.CreationRule ovhCompany) { 
		this.ovhCompany = ovhCompany;
	} 

	public CreationRulesImpl ovhCompany(net.zyuiop.ovhapi.api.objects.nichandle.CreationRule ovhCompany) { 
		this.ovhCompany = ovhCompany;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.nichandle.CreationRule getEmail() { 
		return this.email;
	} 

	public void setEmail(net.zyuiop.ovhapi.api.objects.nichandle.CreationRule email) { 
		this.email = email;
	} 

	public CreationRulesImpl email(net.zyuiop.ovhapi.api.objects.nichandle.CreationRule email) { 
		this.email = email;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.nichandle.CreationRule getCity() { 
		return this.city;
	} 

	public void setCity(net.zyuiop.ovhapi.api.objects.nichandle.CreationRule city) { 
		this.city = city;
	} 

	public CreationRulesImpl city(net.zyuiop.ovhapi.api.objects.nichandle.CreationRule city) { 
		this.city = city;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.nichandle.CreationRule getFax() { 
		return this.fax;
	} 

	public void setFax(net.zyuiop.ovhapi.api.objects.nichandle.CreationRule fax) { 
		this.fax = fax;
	} 

	public CreationRulesImpl fax(net.zyuiop.ovhapi.api.objects.nichandle.CreationRule fax) { 
		this.fax = fax;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.nichandle.CreationRule getAddress() { 
		return this.address;
	} 

	public void setAddress(net.zyuiop.ovhapi.api.objects.nichandle.CreationRule address) { 
		this.address = address;
	} 

	public CreationRulesImpl address(net.zyuiop.ovhapi.api.objects.nichandle.CreationRule address) { 
		this.address = address;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.nichandle.CreationRule getCompanyNationalIdentificationNumber() { 
		return this.companyNationalIdentificationNumber;
	} 

	public void setCompanyNationalIdentificationNumber(net.zyuiop.ovhapi.api.objects.nichandle.CreationRule companyNationalIdentificationNumber) { 
		this.companyNationalIdentificationNumber = companyNationalIdentificationNumber;
	} 

	public CreationRulesImpl companyNationalIdentificationNumber(net.zyuiop.ovhapi.api.objects.nichandle.CreationRule companyNationalIdentificationNumber) { 
		this.companyNationalIdentificationNumber = companyNationalIdentificationNumber;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.nichandle.CreationRule getBirthCity() { 
		return this.birthCity;
	} 

	public void setBirthCity(net.zyuiop.ovhapi.api.objects.nichandle.CreationRule birthCity) { 
		this.birthCity = birthCity;
	} 

	public CreationRulesImpl birthCity(net.zyuiop.ovhapi.api.objects.nichandle.CreationRule birthCity) { 
		this.birthCity = birthCity;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.nichandle.CreationRule getCountry() { 
		return this.country;
	} 

	public void setCountry(net.zyuiop.ovhapi.api.objects.nichandle.CreationRule country) { 
		this.country = country;
	} 

	public CreationRulesImpl country(net.zyuiop.ovhapi.api.objects.nichandle.CreationRule country) { 
		this.country = country;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.nichandle.CreationRule getOrganisation() { 
		return this.organisation;
	} 

	public void setOrganisation(net.zyuiop.ovhapi.api.objects.nichandle.CreationRule organisation) { 
		this.organisation = organisation;
	} 

	public CreationRulesImpl organisation(net.zyuiop.ovhapi.api.objects.nichandle.CreationRule organisation) { 
		this.organisation = organisation;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.nichandle.CreationRule getLanguage() { 
		return this.language;
	} 

	public void setLanguage(net.zyuiop.ovhapi.api.objects.nichandle.CreationRule language) { 
		this.language = language;
	} 

	public CreationRulesImpl language(net.zyuiop.ovhapi.api.objects.nichandle.CreationRule language) { 
		this.language = language;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.nichandle.CreationRule getName() { 
		return this.name;
	} 

	public void setName(net.zyuiop.ovhapi.api.objects.nichandle.CreationRule name) { 
		this.name = name;
	} 

	public CreationRulesImpl name(net.zyuiop.ovhapi.api.objects.nichandle.CreationRule name) { 
		this.name = name;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.nichandle.CreationRule getPhone() { 
		return this.phone;
	} 

	public void setPhone(net.zyuiop.ovhapi.api.objects.nichandle.CreationRule phone) { 
		this.phone = phone;
	} 

	public CreationRulesImpl phone(net.zyuiop.ovhapi.api.objects.nichandle.CreationRule phone) { 
		this.phone = phone;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.nichandle.CreationRule getSex() { 
		return this.sex;
	} 

	public void setSex(net.zyuiop.ovhapi.api.objects.nichandle.CreationRule sex) { 
		this.sex = sex;
	} 

	public CreationRulesImpl sex(net.zyuiop.ovhapi.api.objects.nichandle.CreationRule sex) { 
		this.sex = sex;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.nichandle.CreationRule getZip() { 
		return this.zip;
	} 

	public void setZip(net.zyuiop.ovhapi.api.objects.nichandle.CreationRule zip) { 
		this.zip = zip;
	} 

	public CreationRulesImpl zip(net.zyuiop.ovhapi.api.objects.nichandle.CreationRule zip) { 
		this.zip = zip;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.nichandle.CreationRule getCorporationType() { 
		return this.corporationType;
	} 

	public void setCorporationType(net.zyuiop.ovhapi.api.objects.nichandle.CreationRule corporationType) { 
		this.corporationType = corporationType;
	} 

	public CreationRulesImpl corporationType(net.zyuiop.ovhapi.api.objects.nichandle.CreationRule corporationType) { 
		this.corporationType = corporationType;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.nichandle.CreationRule getLegalform() { 
		return this.legalform;
	} 

	public void setLegalform(net.zyuiop.ovhapi.api.objects.nichandle.CreationRule legalform) { 
		this.legalform = legalform;
	} 

	public CreationRulesImpl legalform(net.zyuiop.ovhapi.api.objects.nichandle.CreationRule legalform) { 
		this.legalform = legalform;
		return this;
	} 

}
