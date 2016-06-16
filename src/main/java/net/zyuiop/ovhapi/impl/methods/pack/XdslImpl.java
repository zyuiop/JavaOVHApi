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

	public net.zyuiop.ovhapi.api.objects.pack.xdsl.VoIPHardware getPackNameVoipLineOptionsHardwares(java.lang.String packName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/pack/xdsl/" + packName + "/voipLine/options/hardwares";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.pack.xdsl.VoIPHardwareImpl.class);
	}

	public java.lang.String getPackNameExchangeOrganizationServices(java.lang.String packName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/pack/xdsl/" + packName + "/exchangeOrganization/services";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public void putPackNameServiceInfos(net.zyuiop.ovhapi.api.objects.services.Service param0, java.lang.String packName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/pack/xdsl/" + packName + "/serviceInfos";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("null", null);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public java.lang.String getPackNameSubServices(java.lang.String packName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/pack/xdsl/" + packName + "/subServices";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public java.lang.String getPackNameVoipBillingAccountServices(java.lang.String packName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/pack/xdsl/" + packName + "/voipBillingAccount/services";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public void putPackName(net.zyuiop.ovhapi.api.objects.pack.xdsl.PackAdsl param0, java.lang.String packName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/pack/xdsl/" + packName + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("null", null);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.pack.xdsl.SiteBuilderDomain getPackNameSiteBuilderFullOptionsDomains(java.lang.String packName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/pack/xdsl/" + packName + "/siteBuilderFull/options/domains";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.pack.xdsl.SiteBuilderDomainImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.pack.xdsl.ExchangeAccountService getPackNameExchangeAccountServicesDomain(java.lang.String packName, java.lang.String domain) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/pack/xdsl/" + packName + "/exchangeAccount/services/" + domain + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.pack.xdsl.ExchangeAccountServiceImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.pack.xdsl.Service getPackNameSubServicesDomain(java.lang.String packName, java.lang.String domain) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/pack/xdsl/" + packName + "/subServices/" + domain + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.pack.xdsl.ServiceImpl.class);
	}

	public boolean getPackNameExchangeIndividualOptionsIsEmailAvailable(java.lang.String email, java.lang.String packName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/pack/xdsl/" + packName + "/exchangeIndividual/options/isEmailAvailable";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), boolean.class);
	}

	public java.lang.String getPackNameDomainServices(java.lang.String packName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/pack/xdsl/" + packName + "/domain/services";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.pack.xdsl.ShippingAddress getPackNameShippingAddresses(java.lang.String context, java.lang.String packName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/pack/xdsl/" + packName + "/shippingAddresses";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.pack.xdsl.ShippingAddressImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.pack.xdsl.Task postPackNameVoipEcofaxServices(java.lang.String packName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/pack/xdsl/" + packName + "/voipEcofax/services";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.pack.xdsl.TaskImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.pack.xdsl.ServiceInformation getPackNameServices(java.lang.String packName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/pack/xdsl/" + packName + "/services";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.pack.xdsl.ServiceInformationImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.pack.xdsl.VoIPLineOrder postPackNameVoipLineServices(java.lang.String hardwareNames, java.lang.String packName, long shippingId, java.lang.String mondialRelayId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/pack/xdsl/" + packName + "/voipLine/services";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("hardwareNames", hardwareNames);
		__dataMap.put("shippingId", shippingId);
		__dataMap.put("mondialRelayId", mondialRelayId);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.pack.xdsl.VoIPLineOrderImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.pack.xdsl.VoIPLineOrder postPackNameVoipLineServices(java.lang.String hardwareNames, java.lang.String packName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/pack/xdsl/" + packName + "/voipLine/services";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("hardwareNames", hardwareNames);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.pack.xdsl.VoIPLineOrderImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.pack.xdsl.VoipLineService getPackNameVoipLineServicesDomain(java.lang.String packName, java.lang.String domain) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/pack/xdsl/" + packName + "/voipLine/services/" + domain + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.pack.xdsl.VoipLineServiceImpl.class);
	}

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
	* Involved method : GET > /pack/xdsl/$packName/promotionCode/capabilities
	* Message : Missing identifier.
	*/


	public net.zyuiop.ovhapi.api.objects.pack.xdsl.ResiliationFollowUpDetail postPackNameResiliate(net.zyuiop.ovhapi.api.objects.pack.xdsl.ResiliationSurvey resiliationSurvey, java.lang.String packName, double[] servicesToKeep, java.util.Date resiliationDate) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/pack/xdsl/" + packName + "/resiliate";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("resiliationSurvey", resiliationSurvey);
		__dataMap.put("servicesToKeep", servicesToKeep);
		__dataMap.put("resiliationDate", resiliationDate);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.pack.xdsl.ResiliationFollowUpDetailImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.pack.xdsl.ResiliationFollowUpDetail postPackNameResiliate(net.zyuiop.ovhapi.api.objects.pack.xdsl.ResiliationSurvey resiliationSurvey, java.lang.String packName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/pack/xdsl/" + packName + "/resiliate";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("resiliationSurvey", resiliationSurvey);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.pack.xdsl.ResiliationFollowUpDetailImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.pack.xdsl.PackAdsl getPackName(java.lang.String packName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/pack/xdsl/" + packName + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.pack.xdsl.PackAdslImpl.class);
	}

	public java.lang.String getPackNameExchangeLiteServices(java.lang.String packName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/pack/xdsl/" + packName + "/exchangeLite/services";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public boolean getPackNameCanCancelResiliation(java.lang.String packName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/pack/xdsl/" + packName + "/canCancelResiliation";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), boolean.class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /pack/xdsl/$packName/migration/offers
	* Message : Missing identifier.
	*/


	public net.zyuiop.ovhapi.api.objects.pack.xdsl.Task postPackNameExchangeLiteServices(java.lang.String email, java.lang.String password, java.lang.String packName, java.lang.String initials, java.lang.String firstName, java.lang.String lastName, boolean antispam, java.lang.String displayName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/pack/xdsl/" + packName + "/exchangeLite/services";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("email", email);
		__dataMap.put("password", password);
		__dataMap.put("initials", initials);
		__dataMap.put("firstName", firstName);
		__dataMap.put("lastName", lastName);
		__dataMap.put("antispam", antispam);
		__dataMap.put("displayName", displayName);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.pack.xdsl.TaskImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.pack.xdsl.Task postPackNameExchangeLiteServices(java.lang.String email, java.lang.String password, java.lang.String packName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/pack/xdsl/" + packName + "/exchangeLite/services";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("email", email);
		__dataMap.put("password", password);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.pack.xdsl.TaskImpl.class);
	}

	public java.lang.String getPackNameExchangeIndividualServices(java.lang.String packName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/pack/xdsl/" + packName + "/exchangeIndividual/services";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public java.lang.String getPackNameSiteBuilderStartServices(java.lang.String packName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/pack/xdsl/" + packName + "/siteBuilderStart/services";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.pack.xdsl.UnpackTerms getPackNameSubServicesDomainKeepServiceTerms(java.lang.String packName, java.lang.String domain) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/pack/xdsl/" + packName + "/subServices/" + domain + "/keepServiceTerms";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.pack.xdsl.UnpackTermsImpl.class);
	}

	public java.lang.String getPackNameHostedEmailServices(java.lang.String packName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/pack/xdsl/" + packName + "/hostedEmail/services";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public long[] getPackNameTasks(java.lang.String packName, java.lang.String function, java.lang.String status) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/pack/xdsl/" + packName + "/tasks";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getPackNameTasks(java.lang.String packName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/pack/xdsl/" + packName + "/tasks";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
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


	public net.zyuiop.ovhapi.api.objects.services.Service getPackNameServiceInfos(java.lang.String packName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/pack/xdsl/" + packName + "/serviceInfos";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.services.ServiceImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.pack.xdsl.SiteBuilderTemplate getPackNameSiteBuilderStartOptionsTemplates(java.lang.String packName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/pack/xdsl/" + packName + "/siteBuilderStart/options/templates";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.pack.xdsl.SiteBuilderTemplateImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.pack.xdsl.Task postPackNameDomainServices(java.lang.String tld, java.lang.String domain, java.lang.String legalStatus, java.lang.String action, java.lang.String packName, java.lang.String assoPublicationPage, java.lang.String authInfo, java.lang.String birthCountry, java.lang.String lastName, java.lang.String brandOwner, java.lang.String birthCity, java.lang.String firstName, boolean noId, java.lang.String vatNumber, java.lang.String assoDeclaration, java.lang.String birthZipCode, java.lang.String siren, java.lang.String assoPublicationAnnounce, java.lang.String birthDate, java.lang.String corporationName, java.lang.String assoPublication, java.lang.String idNumber, java.lang.String inpi, java.lang.String waldec) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/pack/xdsl/" + packName + "/domain/services";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("tld", tld);
		__dataMap.put("domain", domain);
		__dataMap.put("legalStatus", legalStatus);
		__dataMap.put("action", action);
		__dataMap.put("assoPublicationPage", assoPublicationPage);
		__dataMap.put("authInfo", authInfo);
		__dataMap.put("birthCountry", birthCountry);
		__dataMap.put("lastName", lastName);
		__dataMap.put("brandOwner", brandOwner);
		__dataMap.put("birthCity", birthCity);
		__dataMap.put("firstName", firstName);
		__dataMap.put("noId", noId);
		__dataMap.put("vatNumber", vatNumber);
		__dataMap.put("assoDeclaration", assoDeclaration);
		__dataMap.put("birthZipCode", birthZipCode);
		__dataMap.put("siren", siren);
		__dataMap.put("assoPublicationAnnounce", assoPublicationAnnounce);
		__dataMap.put("birthDate", birthDate);
		__dataMap.put("corporationName", corporationName);
		__dataMap.put("assoPublication", assoPublication);
		__dataMap.put("idNumber", idNumber);
		__dataMap.put("inpi", inpi);
		__dataMap.put("waldec", waldec);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.pack.xdsl.TaskImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.pack.xdsl.Task postPackNameDomainServices(java.lang.String tld, java.lang.String domain, java.lang.String legalStatus, java.lang.String action, java.lang.String packName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/pack/xdsl/" + packName + "/domain/services";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("tld", tld);
		__dataMap.put("domain", domain);
		__dataMap.put("legalStatus", legalStatus);
		__dataMap.put("action", action);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.pack.xdsl.TaskImpl.class);
	}

	public java.lang.String getPackNameVoipLineServices(java.lang.String packName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/pack/xdsl/" + packName + "/voipLine/services";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public void postPackNameCancelResiliation(java.lang.String packName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/pack/xdsl/" + packName + "/cancelResiliation";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public java.lang.String getPackNameSiteBuilderFullServices(java.lang.String packName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/pack/xdsl/" + packName + "/siteBuilderFull/services";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.pack.xdsl.Task postPackNameMigrationMigrate(boolean acceptContracts, java.lang.String offerName, java.lang.String packName, net.zyuiop.ovhapi.api.objects.pack.xdsl.migration.OfferServiceToDelete subServicesToDelete, net.zyuiop.ovhapi.api.objects.pack.xdsl.migration.OfferOption options, java.lang.String nicShipping, long mondialRelayId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/pack/xdsl/" + packName + "/migration/migrate";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("acceptContracts", acceptContracts);
		__dataMap.put("offerName", offerName);
		__dataMap.put("subServicesToDelete", subServicesToDelete);
		__dataMap.put("options", options);
		__dataMap.put("nicShipping", nicShipping);
		__dataMap.put("mondialRelayId", mondialRelayId);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.pack.xdsl.TaskImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.pack.xdsl.Task postPackNameMigrationMigrate(boolean acceptContracts, java.lang.String offerName, java.lang.String packName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/pack/xdsl/" + packName + "/migration/migrate";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("acceptContracts", acceptContracts);
		__dataMap.put("offerName", offerName);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.pack.xdsl.TaskImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.pack.xdsl.ExchangeLiteService getPackNameExchangeLiteServicesDomain(java.lang.String packName, java.lang.String domain) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/pack/xdsl/" + packName + "/exchangeLite/services/" + domain + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.pack.xdsl.ExchangeLiteServiceImpl.class);
	}

	public java.lang.String getPackNameDomainOptionsTlds(java.lang.String packName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/pack/xdsl/" + packName + "/domain/options/tlds";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.pack.xdsl.Task postPackNameSiteBuilderStartServices(java.lang.String domain, java.lang.String subdomain, long templateId, java.lang.String packName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/pack/xdsl/" + packName + "/siteBuilderStart/services";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("domain", domain);
		__dataMap.put("subdomain", subdomain);
		__dataMap.put("templateId", templateId);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.pack.xdsl.TaskImpl.class);
	}

	public java.lang.String getPackNameVoipEcofaxServices(java.lang.String packName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/pack/xdsl/" + packName + "/voipEcofax/services";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.pack.xdsl.Task postPackNamePromotionCodeGenerate(java.lang.String packName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/pack/xdsl/" + packName + "/promotionCode/generate";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.pack.xdsl.TaskImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.pack.xdsl.Task postPackNameSiteBuilderFullServices(java.lang.String domain, java.lang.String subdomain, long templateId, java.lang.String packName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/pack/xdsl/" + packName + "/siteBuilderFull/services";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("domain", domain);
		__dataMap.put("subdomain", subdomain);
		__dataMap.put("templateId", templateId);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.pack.xdsl.TaskImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.pack.xdsl.SiteBuilderDomain getPackNameSiteBuilderStartOptionsDomains(java.lang.String packName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/pack/xdsl/" + packName + "/siteBuilderStart/options/domains";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.pack.xdsl.SiteBuilderDomainImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.pack.xdsl.SiteBuilderTemplate getPackNameSiteBuilderFullOptionsTemplates(java.lang.String packName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/pack/xdsl/" + packName + "/siteBuilderFull/options/templates";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.pack.xdsl.SiteBuilderTemplateImpl.class);
	}

	public java.lang.String getPackNameHostedEmailOptionsDomains(java.lang.String packName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/pack/xdsl/" + packName + "/hostedEmail/options/domains";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.pack.xdsl.Task postPackNameHostedEmailServices(java.lang.String email, java.lang.String password, java.lang.String packName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/pack/xdsl/" + packName + "/hostedEmail/services";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("email", email);
		__dataMap.put("password", password);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.pack.xdsl.TaskImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.pack.xdsl.ResiliationTerms getPackNameResiliationTerms(java.lang.String packName, java.util.Date resiliationDate) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/pack/xdsl/" + packName + "/resiliationTerms";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.pack.xdsl.ResiliationTermsImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.pack.xdsl.ResiliationTerms getPackNameResiliationTerms(java.lang.String packName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/pack/xdsl/" + packName + "/resiliationTerms";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.pack.xdsl.ResiliationTermsImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.pack.xdsl.Hubic getPackNameHubicServicesDomain(java.lang.String packName, java.lang.String domain) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/pack/xdsl/" + packName + "/hubic/services/" + domain + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.pack.xdsl.HubicImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.pack.xdsl.Task getPackNameTasksId(java.lang.String packName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/pack/xdsl/" + packName + "/tasks/" + id + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.pack.xdsl.TaskImpl.class);
	}

	public java.lang.String getPackNameExchangeAccountServices(java.lang.String packName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/pack/xdsl/" + packName + "/exchangeAccount/services";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.pack.xdsl.ResiliationFollowUpDetail getPackNameResiliationFollowUp(java.lang.String packName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/pack/xdsl/" + packName + "/resiliationFollowUp";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.pack.xdsl.ResiliationFollowUpDetailImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.pack.xdsl.ShippingAddress getPackNameVoipLineOptionsShippingAddresses(java.lang.String packName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/pack/xdsl/" + packName + "/voipLine/options/shippingAddresses";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.pack.xdsl.ShippingAddressImpl.class);
	}

	public java.lang.String getPackNameExchangeIndividualOptionsDomains(java.lang.String packName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/pack/xdsl/" + packName + "/exchangeIndividual/options/domains";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.pack.xdsl.Task postPackNameExchangeIndividualServices(java.lang.String email, java.lang.String password, java.lang.String packName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/pack/xdsl/" + packName + "/exchangeIndividual/services";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("email", email);
		__dataMap.put("password", password);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.pack.xdsl.TaskImpl.class);
	}

	public boolean getPackNameExchangeLiteOptionsIsEmailAvailable(java.lang.String email, java.lang.String packName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/pack/xdsl/" + packName + "/exchangeLite/options/isEmailAvailable";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), boolean.class);
	}

	public java.lang.String getPackXdsl() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/pack/xdsl/pack/xdsl";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
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


	public java.lang.String getPackNameHubicServices(java.lang.String packName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/pack/xdsl/" + packName + "/hubic/services";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public java.lang.String getPackNameXdslAccessServices(java.lang.String packName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/pack/xdsl/" + packName + "/xdslAccess/services";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

}
