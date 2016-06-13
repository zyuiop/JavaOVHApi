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

	public java.lang.String getLegalform(java.lang.String country) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/legalform";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, false), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.nichandle.CreationRules getCreationRules(java.lang.String country, java.lang.String ovhSubsidiary, java.lang.String ovhCompany, java.lang.String legalform) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/creationRules";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, false), net.zyuiop.ovhapi.api.objects.nichandle.CreationRules.class);
	}

	public java.lang.String getCountries(java.lang.String ovhSubsidiary, java.lang.String ovhCompany) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/countries";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, false), java.lang.String.class);
	}

	public java.lang.String getArea(java.lang.String country) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/area";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, false), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.nichandle.NewAccountAndToken postNewAccount(java.lang.String ovhSubsidiary, java.lang.String ovhCompany, java.lang.String email, java.lang.String country, java.lang.String legalform, java.lang.String firstname, java.lang.String vat, java.lang.String spareEmail, java.lang.String nationalIdentificationNumber, java.lang.String birthDay, java.lang.String area, java.lang.String city, java.lang.String fax, java.lang.String address, java.lang.String companyNationalIdentificationNumber, java.lang.String birthCity, java.lang.String organisation, java.lang.String language, java.lang.String name, java.lang.String sex, java.lang.String phone, java.lang.String zip, java.lang.String corporationType) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0//newAccount";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("ovhSubsidiary", ovhSubsidiary);
		dataMap.put("ovhCompany", ovhCompany);
		dataMap.put("email", email);
		dataMap.put("country", country);
		dataMap.put("legalform", legalform);
		dataMap.put("firstname", firstname);
		dataMap.put("vat", vat);
		dataMap.put("spareEmail", spareEmail);
		dataMap.put("nationalIdentificationNumber", nationalIdentificationNumber);
		dataMap.put("birthDay", birthDay);
		dataMap.put("area", area);
		dataMap.put("city", city);
		dataMap.put("fax", fax);
		dataMap.put("address", address);
		dataMap.put("companyNationalIdentificationNumber", companyNationalIdentificationNumber);
		dataMap.put("birthCity", birthCity);
		dataMap.put("organisation", organisation);
		dataMap.put("language", language);
		dataMap.put("name", name);
		dataMap.put("sex", sex);
		dataMap.put("phone", phone);
		dataMap.put("zip", zip);
		dataMap.put("corporationType", corporationType);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, false), net.zyuiop.ovhapi.api.objects.nichandle.NewAccountAndToken.class);
	}

	public net.zyuiop.ovhapi.api.objects.nichandle.NewAccountAndToken postNewAccount(java.lang.String ovhSubsidiary, java.lang.String ovhCompany, java.lang.String email, java.lang.String country, java.lang.String legalform) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0//newAccount";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("ovhSubsidiary", ovhSubsidiary);
		dataMap.put("ovhCompany", ovhCompany);
		dataMap.put("email", email);
		dataMap.put("country", country);
		dataMap.put("legalform", legalform);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, false), net.zyuiop.ovhapi.api.objects.nichandle.NewAccountAndToken.class);
	}

	public java.lang.String getCorporationType(java.lang.String country) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/corporationType";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, false), java.lang.String.class);
	}

}
