package net.zyuiop.ovhapi.impl.methods.pack;

import net.zyuiop.ovhapi.api.methods.pack.Xdsl;
import com.google.gson.Gson;
import net.zyuiop.ovhapi.api.OVHApiMethod;
import java.util.HashMap;
import java.util.Map;
import net.zyuiop.ovhapi.impl.OVHRawCalls;
import java.net.URL;
public class XdslImpl implements Xdsl { 

	private final OVHRawCalls client;

	public XdslImpl(OVHRawCalls client) { 
		this.client = client;
	}


	/*
	* Method creation failed.
	* Involved method : POST > /pack/xdsl/$packName/addressMove/move
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /pack/xdsl/$packName/addressMove/move
	* Message : Missing identifier.
	*/


	public long[] getPackNameTasks(java.lang.String packName, java.lang.String function, java.lang.String status) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/pack/xdsl/" + packName + "/tasks";
		String __data = "?";
		__data += "packName=" + packName;
		__data += "function=" + function;
		__data += "status=" + status;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getPackNameTasks(java.lang.String packName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/pack/xdsl/" + packName + "/tasks";
		String __data = "?";
		__data += "packName=" + packName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /pack/xdsl/$packName/domain/services
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /pack/xdsl/$packName/domain/services
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /pack/xdsl/$packName/migration/migrate
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /pack/xdsl/$packName/migration/migrate
	* Message : Missing identifier.
	*/


	public java.lang.String[] getPackNameSiteBuilderFullServices(java.lang.String packName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/pack/xdsl/" + packName + "/siteBuilderFull/services";
		String __data = "?";
		__data += "packName=" + packName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /pack/xdsl/$packName/addressMove/eligibility
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /pack/xdsl/$packName/addressMove/eligibility
	* Message : Missing identifier.
	*/


	public java.lang.String[] getPackXdsl() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/pack/xdsl/pack/xdsl";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /pack/xdsl/$packName/voipLine/options/hardwares
	* Message : Missing identifier.
	*/


	public java.lang.String[] getPackNameExchangeOrganizationServices(java.lang.String packName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/pack/xdsl/" + packName + "/exchangeOrganization/services";
		String __data = "?";
		__data += "packName=" + packName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /pack/xdsl/$packName/exchangeAccount/services/$domain
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /pack/xdsl/$packName/exchangeLite/services/$domain
	* Message : Missing identifier.
	*/


	public java.lang.String[] getPackNameExchangeAccountServices(java.lang.String packName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/pack/xdsl/" + packName + "/exchangeAccount/services";
		String __data = "?";
		__data += "packName=" + packName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /pack/xdsl/$packName/voipEcofax/services
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /pack/xdsl/$packName/siteBuilderStart/options/templates
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /pack/xdsl/$packName/tasks/$id
	* Message : Missing identifier.
	*/


	public java.lang.String[] getPackNameExchangeLiteServices(java.lang.String packName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/pack/xdsl/" + packName + "/exchangeLite/services";
		String __data = "?";
		__data += "packName=" + packName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /pack/xdsl/$packName/shippingAddresses
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /pack/xdsl/$packName/migration/offers
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /pack/xdsl/$packName/siteBuilderFull/services
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /pack/xdsl/$packName/voipLine/services/$domain
	* Message : Missing identifier.
	*/


	public boolean getPackNameCanCancelResiliation(java.lang.String packName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/pack/xdsl/" + packName + "/canCancelResiliation";
		String __data = "?";
		__data += "packName=" + packName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), boolean.class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /pack/xdsl/$packName/exchangeLite/services
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /pack/xdsl/$packName/exchangeLite/services
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /pack/xdsl/$packName/serviceInfos
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /pack/xdsl/$packName/resiliationTerms
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /pack/xdsl/$packName/resiliationTerms
	* Message : Missing identifier.
	*/


	public long postPackNameVoipLineOptionsCustomShippingAddress(java.lang.String zipCode, java.lang.String firstName, java.lang.String cityName, java.lang.String address, java.lang.String lastName, java.lang.String packName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/pack/xdsl/" + packName + "/voipLine/options/customShippingAddress";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("zipCode", zipCode);
		__dataMap.put("firstName", firstName);
		__dataMap.put("cityName", cityName);
		__dataMap.put("address", address);
		__dataMap.put("lastName", lastName);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long.class);
	}


	/*
	* Method creation failed.
	* Involved method : PUT > /pack/xdsl/$packName
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /pack/xdsl/$packName/siteBuilderStart/services
	* Message : Missing identifier.
	*/


	public java.lang.String[] getPackNameSubServices(java.lang.String packName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/pack/xdsl/" + packName + "/subServices";
		String __data = "?";
		__data += "packName=" + packName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getPackNameExchangeIndividualServices(java.lang.String packName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/pack/xdsl/" + packName + "/exchangeIndividual/services";
		String __data = "?";
		__data += "packName=" + packName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public long[] postPackNameChangeContact(java.lang.String packName, java.lang.String contactAdmin, java.lang.String contactTech, java.lang.String contactBilling) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/pack/xdsl/" + packName + "/changeContact";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("contactAdmin", contactAdmin);
		__dataMap.put("contactTech", contactTech);
		__dataMap.put("contactBilling", contactBilling);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] postPackNameChangeContact(java.lang.String packName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/pack/xdsl/" + packName + "/changeContact";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public java.lang.String[] getPackNameExchangeIndividualOptionsDomains(java.lang.String packName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/pack/xdsl/" + packName + "/exchangeIndividual/options/domains";
		String __data = "?";
		__data += "packName=" + packName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /pack/xdsl/$packName/exchangeIndividual/services
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /pack/xdsl/$packName/hostedEmail/services
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /pack/xdsl/$packName/services
	* Message : Missing identifier.
	*/


	public boolean getPackNameExchangeLiteOptionsIsEmailAvailable(java.lang.String email, java.lang.String packName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/pack/xdsl/" + packName + "/exchangeLite/options/isEmailAvailable";
		String __data = "?";
		__data += "email=" + email;
		__data += "packName=" + packName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), boolean.class);
	}


	/*
	* Method creation failed.
	* Involved method : PUT > /pack/xdsl/$packName/serviceInfos
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /pack/xdsl/$packName/subServices/$domain/keepServiceTerms
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /pack/xdsl/$packName
	* Message : Missing identifier.
	*/


	public java.lang.String[] getPackNameHubicServices(java.lang.String packName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/pack/xdsl/" + packName + "/hubic/services";
		String __data = "?";
		__data += "packName=" + packName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /pack/xdsl/$packName/subServices/$domain
	* Message : Missing identifier.
	*/


	public boolean getPackNameExchangeIndividualOptionsIsEmailAvailable(java.lang.String email, java.lang.String packName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/pack/xdsl/" + packName + "/exchangeIndividual/options/isEmailAvailable";
		String __data = "?";
		__data += "email=" + email;
		__data += "packName=" + packName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), boolean.class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /pack/xdsl/$packName/siteBuilderStart/options/domains
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /pack/xdsl/$packName/resiliate
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /pack/xdsl/$packName/resiliate
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /pack/xdsl/$packName/voipLine/options/shippingAddresses
	* Message : Missing identifier.
	*/


	public java.lang.String[] getPackNameVoipLineServices(java.lang.String packName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/pack/xdsl/" + packName + "/voipLine/services";
		String __data = "?";
		__data += "packName=" + packName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getPackNameVoipEcofaxServices(java.lang.String packName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/pack/xdsl/" + packName + "/voipEcofax/services";
		String __data = "?";
		__data += "packName=" + packName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getPackNameHostedEmailServices(java.lang.String packName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/pack/xdsl/" + packName + "/hostedEmail/services";
		String __data = "?";
		__data += "packName=" + packName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getPackNameXdslAccessServices(java.lang.String packName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/pack/xdsl/" + packName + "/xdslAccess/services";
		String __data = "?";
		__data += "packName=" + packName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getPackNameHostedEmailOptionsDomains(java.lang.String packName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/pack/xdsl/" + packName + "/hostedEmail/options/domains";
		String __data = "?";
		__data += "packName=" + packName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getPackNameVoipBillingAccountServices(java.lang.String packName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/pack/xdsl/" + packName + "/voipBillingAccount/services";
		String __data = "?";
		__data += "packName=" + packName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /pack/xdsl/$packName/siteBuilderFull/options/domains
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /pack/xdsl/$packName/promotionCode/capabilities
	* Message : Missing identifier.
	*/


	public java.lang.String[] getPackNameDomainServices(java.lang.String packName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/pack/xdsl/" + packName + "/domain/services";
		String __data = "?";
		__data += "packName=" + packName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /pack/xdsl/$packName/siteBuilderFull/options/templates
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /pack/xdsl/$packName/hubic/services/$domain
	* Message : Missing identifier.
	*/


	public java.lang.String[] getPackNameDomainOptionsTlds(java.lang.String packName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/pack/xdsl/" + packName + "/domain/options/tlds";
		String __data = "?";
		__data += "packName=" + packName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public void postPackNameCancelResiliation(java.lang.String packName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/pack/xdsl/" + packName + "/cancelResiliation";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /pack/xdsl/$packName/voipLine/services
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /pack/xdsl/$packName/voipLine/services
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /pack/xdsl/$packName/promotionCode/generate
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /pack/xdsl/$packName/resiliationFollowUp
	* Message : Missing identifier.
	*/


	public java.lang.String[] getPackNameSiteBuilderStartServices(java.lang.String packName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/pack/xdsl/" + packName + "/siteBuilderStart/services";
		String __data = "?";
		__data += "packName=" + packName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

}
