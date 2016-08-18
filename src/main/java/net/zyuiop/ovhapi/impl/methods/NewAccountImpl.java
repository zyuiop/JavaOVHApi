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


	/*
	* Method creation failed.
	* Involved method : POST > /newAccount
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /newAccount
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /newAccount/creationRules
	* Message : Missing identifier.
	*/


	public java.lang.String[] getCorporationType(java.lang.String country) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/newAccount/corporationType";
		String __data = "?";
		__data += "country=" + country;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, false), java.lang.String[].class);
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

	public java.lang.String[] getLegalform(java.lang.String country) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/newAccount/legalform";
		String __data = "?";
		__data += "country=" + country;
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

}
