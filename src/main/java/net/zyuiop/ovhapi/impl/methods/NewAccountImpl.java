package net.zyuiop.ovhapi.impl.methods;

import net.zyuiop.ovhapi.api.methods.NewAccount;
import com.google.gson.Gson;
import net.zyuiop.ovhapi.api.OVHApiMethod;
import java.util.HashMap;
import java.util.Map;
import net.zyuiop.ovhapi.impl.OVHRawCalls;
import java.net.URL;
public class NewAccountImpl implements NewAccount { 

	private final OVHRawCalls client;

	public NewAccountImpl(OVHRawCalls client) { 
		this.client = client;
	}

	public java.lang.String[] getLegalform(java.lang.String country) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/newAccount/legalform";
		String __data = "?";
		__data += "country=" + country;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, false), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.nichandle.CreationRules getCreationRules(java.lang.String country, java.lang.String ovhSubsidiary, java.lang.String ovhCompany, java.lang.String legalform) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/newAccount/creationRules";
		String __data = "?";
		__data += "country=" + country;
		__data += "ovhSubsidiary=" + ovhSubsidiary;
		__data += "ovhCompany=" + ovhCompany;
		__data += "legalform=" + legalform;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, false), net.zyuiop.ovhapi.impl.objects.nichandle.CreationRulesImpl.class);
	}

	public java.lang.String[] getCountries(java.lang.String ovhSubsidiary, java.lang.String ovhCompany) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/newAccount/countries";
		String __data = "?";
		__data += "ovhSubsidiary=" + ovhSubsidiary;
		__data += "ovhCompany=" + ovhCompany;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, false), java.lang.String[].class);
	}

	public java.lang.String[] getArea(java.lang.String country) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/newAccount/area";
		String __data = "?";
		__data += "country=" + country;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, false), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.nichandle.NewAccountAndToken postNewAccount(java.lang.String ovhSubsidiary, java.lang.String ovhCompany, java.lang.String email, java.lang.String country, java.lang.String legalform, java.lang.String firstname, java.lang.String vat, java.lang.String spareEmail, java.lang.String nationalIdentificationNumber, java.lang.String birthDay, java.lang.String area, java.lang.String city, java.lang.String fax, java.lang.String address, java.lang.String companyNationalIdentificationNumber, java.lang.String birthCity, java.lang.String organisation, java.lang.String language, java.lang.String name, java.lang.String sex, java.lang.String phone, java.lang.String zip, java.lang.String corporationType) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/newAccount/newAccount";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("ovhSubsidiary", ovhSubsidiary);
		__dataMap.put("ovhCompany", ovhCompany);
		__dataMap.put("email", email);
		__dataMap.put("country", country);
		__dataMap.put("legalform", legalform);
		__dataMap.put("firstname", firstname);
		__dataMap.put("vat", vat);
		__dataMap.put("spareEmail", spareEmail);
		__dataMap.put("nationalIdentificationNumber", nationalIdentificationNumber);
		__dataMap.put("birthDay", birthDay);
		__dataMap.put("area", area);
		__dataMap.put("city", city);
		__dataMap.put("fax", fax);
		__dataMap.put("address", address);
		__dataMap.put("companyNationalIdentificationNumber", companyNationalIdentificationNumber);
		__dataMap.put("birthCity", birthCity);
		__dataMap.put("organisation", organisation);
		__dataMap.put("language", language);
		__dataMap.put("name", name);
		__dataMap.put("sex", sex);
		__dataMap.put("phone", phone);
		__dataMap.put("zip", zip);
		__dataMap.put("corporationType", corporationType);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, false), net.zyuiop.ovhapi.impl.objects.nichandle.NewAccountAndTokenImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.nichandle.NewAccountAndToken postNewAccount(java.lang.String ovhSubsidiary, java.lang.String ovhCompany, java.lang.String email, java.lang.String country, java.lang.String legalform) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/newAccount/newAccount";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("ovhSubsidiary", ovhSubsidiary);
		__dataMap.put("ovhCompany", ovhCompany);
		__dataMap.put("email", email);
		__dataMap.put("country", country);
		__dataMap.put("legalform", legalform);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, false), net.zyuiop.ovhapi.impl.objects.nichandle.NewAccountAndTokenImpl.class);
	}

	public java.lang.String[] getCorporationType(java.lang.String country) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/newAccount/corporationType";
		String __data = "?";
		__data += "country=" + country;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, false), java.lang.String[].class);
	}

}
