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
		String callUrl = "https://api.ovh.com/1.0/" + packName + "/voipLine/options/hardwares";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.pack.xdsl.VoIPHardware.class);
	}

	public java.lang.String getPackNameExchangeOrganizationServices(java.lang.String packName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + packName + "/exchangeOrganization/services";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public void putPackNameServiceInfos(net.zyuiop.ovhapi.api.objects.services.Service param0, java.lang.String packName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + packName + "/serviceInfos";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public java.lang.String getPackNameSubServices(java.lang.String packName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + packName + "/subServices";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getPackNameVoipBillingAccountServices(java.lang.String packName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + packName + "/voipBillingAccount/services";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public void putPackName(net.zyuiop.ovhapi.api.objects.pack.xdsl.PackAdsl param0, java.lang.String packName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + packName + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.pack.xdsl.SiteBuilderDomain getPackNameSiteBuilderFullOptionsDomains(java.lang.String packName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + packName + "/siteBuilderFull/options/domains";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.pack.xdsl.SiteBuilderDomain.class);
	}

	public net.zyuiop.ovhapi.api.objects.pack.xdsl.ExchangeAccountService getPackNameExchangeAccountServicesDomain(java.lang.String packName, java.lang.String domain) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + packName + "/exchangeAccount/services/" + domain + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.pack.xdsl.ExchangeAccountService.class);
	}

	public net.zyuiop.ovhapi.api.objects.pack.xdsl.Service getPackNameSubServicesDomain(java.lang.String packName, java.lang.String domain) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + packName + "/subServices/" + domain + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.pack.xdsl.Service.class);
	}

	public boolean getPackNameExchangeIndividualOptionsIsEmailAvailable(java.lang.String email, java.lang.String packName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + packName + "/exchangeIndividual/options/isEmailAvailable";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), boolean.class);
	}

	public java.lang.String getPackNameDomainServices(java.lang.String packName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + packName + "/domain/services";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.pack.xdsl.ShippingAddress getPackNameShippingAddresses(java.lang.String context, java.lang.String packName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + packName + "/shippingAddresses";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.pack.xdsl.ShippingAddress.class);
	}

	public net.zyuiop.ovhapi.api.objects.pack.xdsl.Task postPackNameVoipEcofaxServices(java.lang.String packName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + packName + "/voipEcofax/services";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.pack.xdsl.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.pack.xdsl.ServiceInformation getPackNameServices(java.lang.String packName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + packName + "/services";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.pack.xdsl.ServiceInformation.class);
	}

	public net.zyuiop.ovhapi.api.objects.pack.xdsl.VoIPLineOrder postPackNameVoipLineServices(java.lang.String hardwareNames, java.lang.String packName, long shippingId, java.lang.String mondialRelayId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + packName + "/voipLine/services";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("hardwareNames", hardwareNames);
		dataMap.put("shippingId", shippingId);
		dataMap.put("mondialRelayId", mondialRelayId);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.pack.xdsl.VoIPLineOrder.class);
	}

	public net.zyuiop.ovhapi.api.objects.pack.xdsl.VoIPLineOrder postPackNameVoipLineServices(java.lang.String hardwareNames, java.lang.String packName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + packName + "/voipLine/services";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("hardwareNames", hardwareNames);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.pack.xdsl.VoIPLineOrder.class);
	}

	public net.zyuiop.ovhapi.api.objects.pack.xdsl.VoipLineService getPackNameVoipLineServicesDomain(java.lang.String packName, java.lang.String domain) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + packName + "/voipLine/services/" + domain + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.pack.xdsl.VoipLineService.class);
	}

	public long postPackNameVoipLineOptionsCustomShippingAddress(java.lang.String zipCode, java.lang.String firstName, java.lang.String cityName, java.lang.String address, java.lang.String lastName, java.lang.String packName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + packName + "/voipLine/options/customShippingAddress";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("zipCode", zipCode);
		dataMap.put("firstName", firstName);
		dataMap.put("cityName", cityName);
		dataMap.put("address", address);
		dataMap.put("lastName", lastName);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long.class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /pack/xdsl/$packName/promotionCode/capabilities
	* Message : Missing identifier.
	*/


	public net.zyuiop.ovhapi.api.objects.pack.xdsl.ResiliationFollowUpDetail postPackNameResiliate(net.zyuiop.ovhapi.api.objects.pack.xdsl.ResiliationSurvey resiliationSurvey, java.lang.String packName, double[] servicesToKeep, java.util.Date resiliationDate) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + packName + "/resiliate";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("resiliationSurvey", resiliationSurvey);
		dataMap.put("servicesToKeep", servicesToKeep);
		dataMap.put("resiliationDate", resiliationDate);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.pack.xdsl.ResiliationFollowUpDetail.class);
	}

	public net.zyuiop.ovhapi.api.objects.pack.xdsl.ResiliationFollowUpDetail postPackNameResiliate(net.zyuiop.ovhapi.api.objects.pack.xdsl.ResiliationSurvey resiliationSurvey, java.lang.String packName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + packName + "/resiliate";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("resiliationSurvey", resiliationSurvey);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.pack.xdsl.ResiliationFollowUpDetail.class);
	}

	public net.zyuiop.ovhapi.api.objects.pack.xdsl.PackAdsl getPackName(java.lang.String packName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + packName + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.pack.xdsl.PackAdsl.class);
	}

	public java.lang.String getPackNameExchangeLiteServices(java.lang.String packName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + packName + "/exchangeLite/services";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public boolean getPackNameCanCancelResiliation(java.lang.String packName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + packName + "/canCancelResiliation";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), boolean.class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /pack/xdsl/$packName/migration/offers
	* Message : Missing identifier.
	*/


	public net.zyuiop.ovhapi.api.objects.pack.xdsl.Task postPackNameExchangeLiteServices(java.lang.String email, java.lang.String password, java.lang.String packName, java.lang.String initials, java.lang.String firstName, java.lang.String lastName, boolean antispam, java.lang.String displayName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + packName + "/exchangeLite/services";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("email", email);
		dataMap.put("password", password);
		dataMap.put("initials", initials);
		dataMap.put("firstName", firstName);
		dataMap.put("lastName", lastName);
		dataMap.put("antispam", antispam);
		dataMap.put("displayName", displayName);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.pack.xdsl.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.pack.xdsl.Task postPackNameExchangeLiteServices(java.lang.String email, java.lang.String password, java.lang.String packName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + packName + "/exchangeLite/services";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("email", email);
		dataMap.put("password", password);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.pack.xdsl.Task.class);
	}

	public java.lang.String getPackNameExchangeIndividualServices(java.lang.String packName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + packName + "/exchangeIndividual/services";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getPackNameSiteBuilderStartServices(java.lang.String packName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + packName + "/siteBuilderStart/services";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.pack.xdsl.UnpackTerms getPackNameSubServicesDomainKeepServiceTerms(java.lang.String packName, java.lang.String domain) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + packName + "/subServices/" + domain + "/keepServiceTerms";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.pack.xdsl.UnpackTerms.class);
	}

	public java.lang.String getPackNameHostedEmailServices(java.lang.String packName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + packName + "/hostedEmail/services";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public long[] getPackNameTasks(java.lang.String packName, java.lang.String function, java.lang.String status) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + packName + "/tasks";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public long[] getPackNameTasks(java.lang.String packName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + packName + "/tasks";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public long[] postPackNameChangeContact(java.lang.String packName, java.lang.String contactAdmin, java.lang.String contactTech, java.lang.String contactBilling) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + packName + "/changeContact";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("contactAdmin", contactAdmin);
		dataMap.put("contactTech", contactTech);
		dataMap.put("contactBilling", contactBilling);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public long[] postPackNameChangeContact(java.lang.String packName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + packName + "/changeContact";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
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
		String callUrl = "https://api.ovh.com/1.0/" + packName + "/serviceInfos";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.services.Service.class);
	}

	public net.zyuiop.ovhapi.api.objects.pack.xdsl.SiteBuilderTemplate getPackNameSiteBuilderStartOptionsTemplates(java.lang.String packName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + packName + "/siteBuilderStart/options/templates";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.pack.xdsl.SiteBuilderTemplate.class);
	}

	public net.zyuiop.ovhapi.api.objects.pack.xdsl.Task postPackNameDomainServices(java.lang.String tld, java.lang.String domain, java.lang.String legalStatus, java.lang.String action, java.lang.String packName, java.lang.String assoPublicationPage, java.lang.String authInfo, java.lang.String birthCountry, java.lang.String lastName, java.lang.String brandOwner, java.lang.String birthCity, java.lang.String firstName, boolean noId, java.lang.String vatNumber, java.lang.String assoDeclaration, java.lang.String birthZipCode, java.lang.String siren, java.lang.String assoPublicationAnnounce, java.lang.String birthDate, java.lang.String corporationName, java.lang.String assoPublication, java.lang.String idNumber, java.lang.String inpi, java.lang.String waldec) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + packName + "/domain/services";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("tld", tld);
		dataMap.put("domain", domain);
		dataMap.put("legalStatus", legalStatus);
		dataMap.put("action", action);
		dataMap.put("assoPublicationPage", assoPublicationPage);
		dataMap.put("authInfo", authInfo);
		dataMap.put("birthCountry", birthCountry);
		dataMap.put("lastName", lastName);
		dataMap.put("brandOwner", brandOwner);
		dataMap.put("birthCity", birthCity);
		dataMap.put("firstName", firstName);
		dataMap.put("noId", noId);
		dataMap.put("vatNumber", vatNumber);
		dataMap.put("assoDeclaration", assoDeclaration);
		dataMap.put("birthZipCode", birthZipCode);
		dataMap.put("siren", siren);
		dataMap.put("assoPublicationAnnounce", assoPublicationAnnounce);
		dataMap.put("birthDate", birthDate);
		dataMap.put("corporationName", corporationName);
		dataMap.put("assoPublication", assoPublication);
		dataMap.put("idNumber", idNumber);
		dataMap.put("inpi", inpi);
		dataMap.put("waldec", waldec);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.pack.xdsl.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.pack.xdsl.Task postPackNameDomainServices(java.lang.String tld, java.lang.String domain, java.lang.String legalStatus, java.lang.String action, java.lang.String packName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + packName + "/domain/services";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("tld", tld);
		dataMap.put("domain", domain);
		dataMap.put("legalStatus", legalStatus);
		dataMap.put("action", action);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.pack.xdsl.Task.class);
	}

	public java.lang.String getPackNameVoipLineServices(java.lang.String packName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + packName + "/voipLine/services";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public void postPackNameCancelResiliation(java.lang.String packName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + packName + "/cancelResiliation";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public java.lang.String getPackNameSiteBuilderFullServices(java.lang.String packName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + packName + "/siteBuilderFull/services";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.pack.xdsl.Task postPackNameMigrationMigrate(boolean acceptContracts, java.lang.String offerName, java.lang.String packName, net.zyuiop.ovhapi.api.objects.pack.xdsl.migration.OfferServiceToDelete subServicesToDelete, net.zyuiop.ovhapi.api.objects.pack.xdsl.migration.OfferOption options, java.lang.String nicShipping, long mondialRelayId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + packName + "/migration/migrate";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("acceptContracts", acceptContracts);
		dataMap.put("offerName", offerName);
		dataMap.put("subServicesToDelete", subServicesToDelete);
		dataMap.put("options", options);
		dataMap.put("nicShipping", nicShipping);
		dataMap.put("mondialRelayId", mondialRelayId);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.pack.xdsl.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.pack.xdsl.Task postPackNameMigrationMigrate(boolean acceptContracts, java.lang.String offerName, java.lang.String packName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + packName + "/migration/migrate";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("acceptContracts", acceptContracts);
		dataMap.put("offerName", offerName);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.pack.xdsl.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.pack.xdsl.ExchangeLiteService getPackNameExchangeLiteServicesDomain(java.lang.String packName, java.lang.String domain) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + packName + "/exchangeLite/services/" + domain + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.pack.xdsl.ExchangeLiteService.class);
	}

	public java.lang.String getPackNameDomainOptionsTlds(java.lang.String packName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + packName + "/domain/options/tlds";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.pack.xdsl.Task postPackNameSiteBuilderStartServices(java.lang.String domain, java.lang.String subdomain, long templateId, java.lang.String packName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + packName + "/siteBuilderStart/services";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("domain", domain);
		dataMap.put("subdomain", subdomain);
		dataMap.put("templateId", templateId);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.pack.xdsl.Task.class);
	}

	public java.lang.String getPackNameVoipEcofaxServices(java.lang.String packName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + packName + "/voipEcofax/services";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.pack.xdsl.Task postPackNamePromotionCodeGenerate(java.lang.String packName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + packName + "/promotionCode/generate";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.pack.xdsl.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.pack.xdsl.Task postPackNameSiteBuilderFullServices(java.lang.String domain, java.lang.String subdomain, long templateId, java.lang.String packName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + packName + "/siteBuilderFull/services";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("domain", domain);
		dataMap.put("subdomain", subdomain);
		dataMap.put("templateId", templateId);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.pack.xdsl.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.pack.xdsl.SiteBuilderDomain getPackNameSiteBuilderStartOptionsDomains(java.lang.String packName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + packName + "/siteBuilderStart/options/domains";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.pack.xdsl.SiteBuilderDomain.class);
	}

	public net.zyuiop.ovhapi.api.objects.pack.xdsl.SiteBuilderTemplate getPackNameSiteBuilderFullOptionsTemplates(java.lang.String packName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + packName + "/siteBuilderFull/options/templates";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.pack.xdsl.SiteBuilderTemplate.class);
	}

	public java.lang.String getPackNameHostedEmailOptionsDomains(java.lang.String packName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + packName + "/hostedEmail/options/domains";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.pack.xdsl.Task postPackNameHostedEmailServices(java.lang.String email, java.lang.String password, java.lang.String packName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + packName + "/hostedEmail/services";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("email", email);
		dataMap.put("password", password);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.pack.xdsl.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.pack.xdsl.ResiliationTerms getPackNameResiliationTerms(java.lang.String packName, java.util.Date resiliationDate) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + packName + "/resiliationTerms";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.pack.xdsl.ResiliationTerms.class);
	}

	public net.zyuiop.ovhapi.api.objects.pack.xdsl.ResiliationTerms getPackNameResiliationTerms(java.lang.String packName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + packName + "/resiliationTerms";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.pack.xdsl.ResiliationTerms.class);
	}

	public net.zyuiop.ovhapi.api.objects.pack.xdsl.Hubic getPackNameHubicServicesDomain(java.lang.String packName, java.lang.String domain) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + packName + "/hubic/services/" + domain + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.pack.xdsl.Hubic.class);
	}

	public net.zyuiop.ovhapi.api.objects.pack.xdsl.Task getPackNameTasksId(java.lang.String packName, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + packName + "/tasks/" + id + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.pack.xdsl.Task.class);
	}

	public java.lang.String getPackNameExchangeAccountServices(java.lang.String packName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + packName + "/exchangeAccount/services";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.pack.xdsl.ResiliationFollowUpDetail getPackNameResiliationFollowUp(java.lang.String packName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + packName + "/resiliationFollowUp";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.pack.xdsl.ResiliationFollowUpDetail.class);
	}

	public net.zyuiop.ovhapi.api.objects.pack.xdsl.ShippingAddress getPackNameVoipLineOptionsShippingAddresses(java.lang.String packName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + packName + "/voipLine/options/shippingAddresses";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.pack.xdsl.ShippingAddress.class);
	}

	public java.lang.String getPackNameExchangeIndividualOptionsDomains(java.lang.String packName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + packName + "/exchangeIndividual/options/domains";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.pack.xdsl.Task postPackNameExchangeIndividualServices(java.lang.String email, java.lang.String password, java.lang.String packName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + packName + "/exchangeIndividual/services";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("email", email);
		dataMap.put("password", password);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.pack.xdsl.Task.class);
	}

	public boolean getPackNameExchangeLiteOptionsIsEmailAvailable(java.lang.String email, java.lang.String packName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + packName + "/exchangeLite/options/isEmailAvailable";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), boolean.class);
	}

	public java.lang.String getPackXdsl() throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0//pack/xdsl";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
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
		String callUrl = "https://api.ovh.com/1.0/" + packName + "/hubic/services";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getPackNameXdslAccessServices(java.lang.String packName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + packName + "/xdslAccess/services";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

}
