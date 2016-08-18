package net.zyuiop.ovhapi.impl.methods.email;

import net.zyuiop.ovhapi.api.methods.email.Exchange;
import com.google.gson.Gson;
import net.zyuiop.ovhapi.api.OVHApiMethod;
import java.util.HashMap;
import java.util.Map;
import net.zyuiop.ovhapi.impl.OVHRawCalls;
import java.net.URL;
public class ExchangeImpl implements Exchange { 

	private final OVHRawCalls client;

	public ExchangeImpl(OVHRawCalls client) { 
		this.client = client;
	}


	/*
	* Method creation failed.
	* Involved method : DELETE > /email/exchange/$organizationName/service/$exchangeService/sharedAccount/$sharedEmailAddress
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /email/exchange/$organizationName/service/$exchangeService/resourceAccount/$resourceEmailAddress
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /email/exchange/$organizationName/service/$exchangeService/sharedAccount/$sharedEmailAddress
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /email/exchange/$organizationName/service/$exchangeService/protocol/activeSyncMailNotification/$notifiedAccountId
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /email/exchange/$organizationName/service/$exchangeService/resourceAccount
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /email/exchange/$organizationName/service/$exchangeService/resourceAccount
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : DELETE > /email/exchange/$organizationName/service/$exchangeService/publicFolder/$path/permission/$allowedAccountId
	* Message : Missing identifier.
	*/


	public java.lang.String[] getOrganizationNameServiceExchangeServiceAccount(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String primaryEmailAddress, java.lang.String accountLicense, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/account";
		String __data = "?";
		__data += "organizationName=" + organizationName;
		__data += "exchangeService=" + exchangeService;
		__data += "primaryEmailAddress=" + primaryEmailAddress;
		__data += "accountLicense=" + accountLicense;
		__data += "id=" + id;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getOrganizationNameServiceExchangeServiceAccount(java.lang.String organizationName, java.lang.String exchangeService) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/account";
		String __data = "?";
		__data += "organizationName=" + organizationName;
		__data += "exchangeService=" + exchangeService;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /email/exchange/$organizationName/service/$exchangeService/updateDeviceList
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /email/exchange/$organizationName/service/$exchangeService/serviceInfos
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /email/exchange/$organizationName/service/$exchangeService/account/$primaryEmailAddress/tasks/$id
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : DELETE > /email/exchange/$organizationName/service/$exchangeService/resourceAccount/$resourceEmailAddress/delegate/$allowedAccountId
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /email/exchange/$organizationName/service/$exchangeService/publicFolderQuota
	* Message : Missing identifier.
	*/


	public long[] getOrganizationNameServiceExchangeServiceAccountPrimaryEmailAddressFullAccess(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String primaryEmailAddress) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/account/" + primaryEmailAddress + "/fullAccess";
		String __data = "?";
		__data += "organizationName=" + organizationName;
		__data += "exchangeService=" + exchangeService;
		__data += "primaryEmailAddress=" + primaryEmailAddress;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /email/exchange/$organizationName/service/$exchangeService/domain/$domainName
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /email/exchange/$organizationName/service/$exchangeService/account/$primaryEmailAddress
	* Message : Missing identifier.
	*/


	public long[] getOrganizationNameServiceExchangeServiceSharedAccountSharedEmailAddressSendAs(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String sharedEmailAddress) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/sharedAccount/" + sharedEmailAddress + "/sendAs";
		String __data = "?";
		__data += "organizationName=" + organizationName;
		__data += "exchangeService=" + exchangeService;
		__data += "sharedEmailAddress=" + sharedEmailAddress;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : DELETE > /email/exchange/$organizationName/service/$exchangeService/mailingList/$mailingListAddress/manager/account/$managerAccountId
	* Message : Missing identifier.
	*/


	public java.lang.String[] getOrganizationNameServiceExchangeServiceSharedAccount(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String sharedEmailAddress) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/sharedAccount";
		String __data = "?";
		__data += "organizationName=" + organizationName;
		__data += "exchangeService=" + exchangeService;
		__data += "sharedEmailAddress=" + sharedEmailAddress;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getOrganizationNameServiceExchangeServiceSharedAccount(java.lang.String organizationName, java.lang.String exchangeService) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/sharedAccount";
		String __data = "?";
		__data += "organizationName=" + organizationName;
		__data += "exchangeService=" + exchangeService;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /email/exchange/$organizationName/service/$exchangeService/domain
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /email/exchange/$organizationName/service/$exchangeService/domain
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /email/exchange/$organizationName/service/$exchangeService/account/$primaryEmailAddress/sendAs
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /email/exchange/$organizationName/service/$exchangeService
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /email/exchange/$organizationName/service/$exchangeService/device/$identity
	* Message : Missing identifier.
	*/


	public long[] getOrganizationNameServiceExchangeServiceProtocolActiveSyncMailNotification(java.lang.String organizationName, java.lang.String exchangeService) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/protocol/activeSyncMailNotification";
		String __data = "?";
		__data += "organizationName=" + organizationName;
		__data += "exchangeService=" + exchangeService;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /email/exchange/$organizationName/service/$exchangeService/outlookAvailability
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /email/exchange/$organizationName/service/$exchangeService/outlookAvailability
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /email/exchange/$organizationName/service/$exchangeService/sharedAccount/$sharedEmailAddress
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : DELETE > /email/exchange/$organizationName/service/$exchangeService/account/$primaryEmailAddress/export
	* Message : Missing identifier.
	*/


	public java.lang.String[] getEmailExchange() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/email/exchange";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getOrganizationNameServiceExchangeServiceDomain(java.lang.String organizationName, java.lang.String exchangeService, boolean main, java.lang.String state) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/domain";
		String __data = "?";
		__data += "organizationName=" + organizationName;
		__data += "exchangeService=" + exchangeService;
		__data += "main=" + main;
		__data += "state=" + state;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getOrganizationNameServiceExchangeServiceDomain(java.lang.String organizationName, java.lang.String exchangeService) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/domain";
		String __data = "?";
		__data += "organizationName=" + organizationName;
		__data += "exchangeService=" + exchangeService;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /email/exchange/$organizationName/service/$exchangeService/publicFolder
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /email/exchange/$organizationName/service/$exchangeService/publicFolder
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /email/exchange/$organizationName/service/$exchangeService/publicFolder/$path/permission/$allowedAccountId
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /email/exchange/$organizationName/service/$exchangeService/publicFolder/$path
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /email/exchange/$organizationName/service/$exchangeService/externalContact/$externalEmailAddress
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : DELETE > /email/exchange/$organizationName/service/$exchangeService/sharedAccount/$sharedEmailAddress/fullAccess/$allowedAccountId
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /email/exchange/$organizationName/service/$exchangeService/account/$primaryEmailAddress
	* Message : Missing identifier.
	*/


	public long[] getOrganizationNameServiceExchangeServiceAccountPrimaryEmailAddressSendAs(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String primaryEmailAddress) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/account/" + primaryEmailAddress + "/sendAs";
		String __data = "?";
		__data += "organizationName=" + organizationName;
		__data += "exchangeService=" + exchangeService;
		__data += "primaryEmailAddress=" + primaryEmailAddress;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getOrganizationNameServiceExchangeServiceResourceAccountResourceEmailAddressDelegate(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String resourceEmailAddress) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/resourceAccount/" + resourceEmailAddress + "/delegate";
		String __data = "?";
		__data += "organizationName=" + organizationName;
		__data += "exchangeService=" + exchangeService;
		__data += "resourceEmailAddress=" + resourceEmailAddress;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /email/exchange/$organizationName/service/$exchangeService/mailingList/$mailingListAddress/member/contact
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /email/exchange/$organizationName/service/$exchangeService/mailingList/$mailingListAddress/member/contact
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : DELETE > /email/exchange/$organizationName/service/$exchangeService/sharedAccount/$sharedEmailAddress/sendAs/$allowedAccountId
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /email/exchange/$organizationName/service/$exchangeService/account/$primaryEmailAddress/outlookURL
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /email/exchange/$organizationName/service/$exchangeService/account
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /email/exchange/$organizationName/service/$exchangeService/account
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /email/exchange/$organizationName/service/$exchangeService/domain/$domainName
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : DELETE > /email/exchange/$organizationName/service/$exchangeService/domain/$domainName
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /email/exchange/$organizationName/service/$exchangeService/mailingList/$mailingListAddress/sendAs
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /email/exchange/$organizationName/service/$exchangeService/device/$identity
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /email/exchange/$organizationName/service/$exchangeService/mailingList/$mailingListAddress/member/contact/$memberContactId
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /email/exchange/$organizationName/service/$exchangeService/license
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /email/exchange/$organizationName/service/$exchangeService/license
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : DELETE > /email/exchange/$organizationName/service/$exchangeService/account/$primaryEmailAddress/sendAs/$allowedAccountId
	* Message : Missing identifier.
	*/


	public java.lang.String[] getOrganizationNameServiceExchangeServicePublicFolder(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String path) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/publicFolder";
		String __data = "?";
		__data += "organizationName=" + organizationName;
		__data += "exchangeService=" + exchangeService;
		__data += "path=" + path;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getOrganizationNameServiceExchangeServicePublicFolder(java.lang.String organizationName, java.lang.String exchangeService) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/publicFolder";
		String __data = "?";
		__data += "organizationName=" + organizationName;
		__data += "exchangeService=" + exchangeService;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public long[] getOrganizationNameServiceExchangeServiceMailingListMailingListAddressMemberAccount(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String mailingListAddress) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/mailingList/" + mailingListAddress + "/member/account";
		String __data = "?";
		__data += "organizationName=" + organizationName;
		__data += "exchangeService=" + exchangeService;
		__data += "mailingListAddress=" + mailingListAddress;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /email/exchange/$organizationName/service/$exchangeService/sharedAccount/$sharedEmailAddress/sendAs/$allowedAccountId
	* Message : Missing identifier.
	*/


	public java.lang.String[] getOrganizationNameService(java.lang.String organizationName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service";
		String __data = "?";
		__data += "organizationName=" + organizationName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : DELETE > /email/exchange/$organizationName/service/$exchangeService/mailingList/$mailingListAddress
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /email/exchange/$organizationName/service/$exchangeService/mailingList/$mailingListAddress/member/account/$memberAccountId
	* Message : Missing identifier.
	*/


	public java.lang.String postOrganizationNameServiceExchangeServiceAccountPrimaryEmailAddressTerminate(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String primaryEmailAddress) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/account/" + primaryEmailAddress + "/terminate";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}


	/*
	* Method creation failed.
	* Involved method : DELETE > /email/exchange/$organizationName/service/$exchangeService/account/$primaryEmailAddress/alias/$alias
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /email/exchange/$organizationName/service/$exchangeService/domain/$domainName/disclaimer
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /email/exchange/$organizationName/service/$exchangeService/domain/$domainName/disclaimer
	* Message : Missing identifier.
	*/


	public java.lang.String[] getOrganizationNameServiceExchangeServiceExternalContact(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String firstName, long id, java.lang.String lastName, java.lang.String displayName, java.lang.String externalEmailAddress) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/externalContact";
		String __data = "?";
		__data += "organizationName=" + organizationName;
		__data += "exchangeService=" + exchangeService;
		__data += "firstName=" + firstName;
		__data += "id=" + id;
		__data += "lastName=" + lastName;
		__data += "displayName=" + displayName;
		__data += "externalEmailAddress=" + externalEmailAddress;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getOrganizationNameServiceExchangeServiceExternalContact(java.lang.String organizationName, java.lang.String exchangeService) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/externalContact";
		String __data = "?";
		__data += "organizationName=" + organizationName;
		__data += "exchangeService=" + exchangeService;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /email/exchange/$organizationName/service/$exchangeService/sharedAccount/$sharedEmailAddress/fullAccess
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /email/exchange/$organizationName/service/$exchangeService/mailingList/$mailingListAddress/manager/account
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /email/exchange/$organizationName/service/$exchangeService/sharedAccount/$sharedEmailAddress/sendOnBehalfTo
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : DELETE > /email/exchange/$organizationName/service/$exchangeService/sharedAccount/$sharedEmailAddress/sendOnBehalfTo/$allowedAccountId
	* Message : Missing identifier.
	*/


	public java.lang.String[] getOrganizationNameServiceExchangeServiceDcvEmails(java.lang.String organizationName, java.lang.String exchangeService) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/dcvEmails";
		String __data = "?";
		__data += "organizationName=" + organizationName;
		__data += "exchangeService=" + exchangeService;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public long[] getOrganizationNameServiceExchangeServiceSharedAccountSharedEmailAddressTasks(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String sharedEmailAddress) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/sharedAccount/" + sharedEmailAddress + "/tasks";
		String __data = "?";
		__data += "organizationName=" + organizationName;
		__data += "exchangeService=" + exchangeService;
		__data += "sharedEmailAddress=" + sharedEmailAddress;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getOrganizationNameServiceExchangeServiceSharedAccountSharedEmailAddressSendOnBehalfTo(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String sharedEmailAddress) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/sharedAccount/" + sharedEmailAddress + "/sendOnBehalfTo";
		String __data = "?";
		__data += "organizationName=" + organizationName;
		__data += "exchangeService=" + exchangeService;
		__data += "sharedEmailAddress=" + sharedEmailAddress;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /email/exchange/$organizationName/service/$exchangeService/publicFolder/$path/permission/$allowedAccountId
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : DELETE > /email/exchange/$organizationName/service/$exchangeService/domain/$domainName/disclaimer
	* Message : Missing identifier.
	*/


	public long[] getOrganizationNameServiceExchangeServiceMailingListMailingListAddressSendOnBehalfTo(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String mailingListAddress) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/mailingList/" + mailingListAddress + "/sendOnBehalfTo";
		String __data = "?";
		__data += "organizationName=" + organizationName;
		__data += "exchangeService=" + exchangeService;
		__data += "mailingListAddress=" + mailingListAddress;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getOrganizationNameServiceExchangeServiceAccountPrimaryEmailAddressTasks(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String primaryEmailAddress) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/account/" + primaryEmailAddress + "/tasks";
		String __data = "?";
		__data += "organizationName=" + organizationName;
		__data += "exchangeService=" + exchangeService;
		__data += "primaryEmailAddress=" + primaryEmailAddress;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getOrganizationNameServiceExchangeServiceMailingListMailingListAddressManagerAccount(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String mailingListAddress) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/mailingList/" + mailingListAddress + "/manager/account";
		String __data = "?";
		__data += "organizationName=" + organizationName;
		__data += "exchangeService=" + exchangeService;
		__data += "mailingListAddress=" + mailingListAddress;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : DELETE > /email/exchange/$organizationName/service/$exchangeService/mailingList/$mailingListAddress/sendAs/$allowedAccountId
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /email/exchange/$organizationName/service/$exchangeService/account/$primaryEmailAddress/outlookURL
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /email/exchange/$organizationName/service/$exchangeService/activateSharepoint
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /email/exchange/$organizationName/service/$exchangeService/sharedAccount/$sharedEmailAddress/fullAccess/$allowedAccountId
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /email/exchange/$organizationName/service/$exchangeService/mailingList/$mailingListAddress
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : DELETE > /email/exchange/$organizationName/service/$exchangeService/account/$primaryEmailAddress
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /email/exchange/$organizationName/service/$exchangeService/externalContact/$externalEmailAddress
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /email/exchange/$organizationName/service/$exchangeService/protocol
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /email/exchange/$organizationName/service/$exchangeService/renewSSL
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /email/exchange/$organizationName/service/$exchangeService/account/$primaryEmailAddress/alias
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /email/exchange/$organizationName/service/$exchangeService/device/$identity/clearDevice
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /email/exchange/$organizationName/service/$exchangeService/mailingList/$mailingListAddress
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /email/exchange/$organizationName/service/$exchangeService/server
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /email/exchange/$organizationName/service/$exchangeService/publicFolder/$path
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /email/exchange/$organizationName/service/$exchangeService/account/$primaryEmailAddress/exportURL
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /email/exchange/$organizationName/service/$exchangeService/domain/$domainName/disclaimer
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /email/exchange/$organizationName/service/$exchangeService/resourceAccount/$resourceEmailAddress
	* Message : Missing identifier.
	*/


	public long[] getOrganizationNameServiceExchangeServiceMailingListMailingListAddressMemberContact(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String mailingListAddress) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/mailingList/" + mailingListAddress + "/member/contact";
		String __data = "?";
		__data += "organizationName=" + organizationName;
		__data += "exchangeService=" + exchangeService;
		__data += "mailingListAddress=" + mailingListAddress;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /email/exchange/$organizationName/service/$exchangeService/account/$primaryEmailAddress/diagnostics
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : DELETE > /email/exchange/$organizationName/service/$exchangeService/account/$primaryEmailAddress/sendOnBehalfTo/$allowedAccountId
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : DELETE > /email/exchange/$organizationName/service/$exchangeService/mailingList/$mailingListAddress/member/contact/$memberContactId
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /email/exchange/$organizationName/service/$exchangeService/resourceAccount/$resourceEmailAddress/delegate/$allowedAccountId
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /email/exchange/$organizationName/service/$exchangeService/task/$id
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /email/exchange/$organizationName/service/$exchangeService/sharedAccountQuota
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /email/exchange/$organizationName/service/$exchangeService/mailingList/$mailingListAddress/manager/account/$managerAccountId
	* Message : Missing identifier.
	*/


	public long[] getOrganizationNameServiceExchangeServiceSharedAccountSharedEmailAddressFullAccess(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String sharedEmailAddress) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/sharedAccount/" + sharedEmailAddress + "/fullAccess";
		String __data = "?";
		__data += "organizationName=" + organizationName;
		__data += "exchangeService=" + exchangeService;
		__data += "sharedEmailAddress=" + sharedEmailAddress;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /email/exchange/$organizationName/service/$exchangeService/account/$primaryEmailAddress/alias/$alias
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /email/exchange/$organizationName/service/$exchangeService/mailingList/$mailingListAddress/alias
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /email/exchange/$organizationName/service/$exchangeService/resourceAccount/$resourceEmailAddress/delegate
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /email/exchange/$organizationName/service/$exchangeService/publicFolder/$path/permission
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /email/exchange/$organizationName/service/$exchangeService/mailingList/$mailingListAddress/sendOnBehalfTo/$allowedAccountId
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /email/exchange/$organizationName/service/$exchangeService/sharedAccount/$sharedEmailAddress/sendAs
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /email/exchange/$organizationName/service/$exchangeService/mailingList/$mailingListAddress/sendAs/$allowedAccountId
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : DELETE > /email/exchange/$organizationName/service/$exchangeService/mailingList/$mailingListAddress/member/account/$memberAccountId
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /email/exchange/$organizationName/service/$exchangeService/account/$primaryEmailAddress/diagnostics
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /email/exchange/$organizationName/service/$exchangeService/externalContact
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /email/exchange/$organizationName/service/$exchangeService/externalContact
	* Message : Missing identifier.
	*/


	public java.lang.String[] getOrganizationNameServiceExchangeServiceMailingList(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String mailingListAddress) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/mailingList";
		String __data = "?";
		__data += "organizationName=" + organizationName;
		__data += "exchangeService=" + exchangeService;
		__data += "mailingListAddress=" + mailingListAddress;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getOrganizationNameServiceExchangeServiceMailingList(java.lang.String organizationName, java.lang.String exchangeService) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/mailingList";
		String __data = "?";
		__data += "organizationName=" + organizationName;
		__data += "exchangeService=" + exchangeService;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /email/exchange/$organizationName/service/$exchangeService/mailingList/$mailingListAddress/member/account
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /email/exchange/$organizationName/service/$exchangeService/mailingList/$mailingListAddress/member/account
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /email/exchange/$organizationName/service/$exchangeService/protocol/activeSyncMailNotification
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /email/exchange/$organizationName/service/$exchangeService/account/$primaryEmailAddress/fullAccess/$allowedAccountId
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /email/exchange/$organizationName/service/$exchangeService/account/$primaryEmailAddress/sendOnBehalfTo/$allowedAccountId
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /email/exchange/$organizationName/service/$exchangeService/mailingList/$mailingListAddress/alias/$alias
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /email/exchange/$organizationName/service/$exchangeService/domain/$domainName/disclaimer
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /email/exchange/$organizationName/service/$exchangeService/account/$primaryEmailAddress/sendOnBehalfTo
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /email/exchange/$organizationName/service/$exchangeService/serviceInfos
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : DELETE > /email/exchange/$organizationName/service/$exchangeService/publicFolder/$path
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /email/exchange/$organizationName/service/$exchangeService/sharedAccount/$sharedEmailAddress/sendOnBehalfTo/$allowedAccountId
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /email/exchange/$organizationName/service/$exchangeService/account/$primaryEmailAddress/export
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /email/exchange/$organizationName/service/$exchangeService/account/$primaryEmailAddress/sendAs/$allowedAccountId
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /email/exchange/$organizationName/service/$exchangeService/sharedAccount
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /email/exchange/$organizationName/service/$exchangeService/sharedAccount
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /email/exchange/$organizationName/service/$exchangeService/account/$primaryEmailAddress/export
	* Message : Missing identifier.
	*/


	public java.lang.String[] getOrganizationNameServiceExchangeServiceAccountPrimaryEmailAddressAlias(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String primaryEmailAddress) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/account/" + primaryEmailAddress + "/alias";
		String __data = "?";
		__data += "organizationName=" + organizationName;
		__data += "exchangeService=" + exchangeService;
		__data += "primaryEmailAddress=" + primaryEmailAddress;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /email/exchange/$organizationName/service/$exchangeService/sharedAccount/$sharedEmailAddress/tasks/$id
	* Message : Missing identifier.
	*/


	public java.lang.String[] getOrganizationNameServiceExchangeServiceResourceAccount(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String resourceEmailAddress) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/resourceAccount";
		String __data = "?";
		__data += "organizationName=" + organizationName;
		__data += "exchangeService=" + exchangeService;
		__data += "resourceEmailAddress=" + resourceEmailAddress;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getOrganizationNameServiceExchangeServiceResourceAccount(java.lang.String organizationName, java.lang.String exchangeService) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/resourceAccount";
		String __data = "?";
		__data += "organizationName=" + organizationName;
		__data += "exchangeService=" + exchangeService;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /email/exchange/$organizationName/service/$exchangeService/account/$primaryEmailAddress/exportURL
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /email/exchange/$organizationName/service/$exchangeService/account/$primaryEmailAddress/fullAccess
	* Message : Missing identifier.
	*/


	public java.lang.String[] getOrganizationNameServiceExchangeServiceDevice(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String identity, java.lang.String IMEI, java.lang.String deviceState) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/device";
		String __data = "?";
		__data += "organizationName=" + organizationName;
		__data += "exchangeService=" + exchangeService;
		__data += "identity=" + identity;
		__data += "IMEI=" + IMEI;
		__data += "deviceState=" + deviceState;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getOrganizationNameServiceExchangeServiceDevice(java.lang.String organizationName, java.lang.String exchangeService) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/device";
		String __data = "?";
		__data += "organizationName=" + organizationName;
		__data += "exchangeService=" + exchangeService;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : PUT > /email/exchange/$organizationName/service/$exchangeService/account/$primaryEmailAddress/protocol
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /email/exchange/$organizationName/service/$exchangeService/mailingList
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /email/exchange/$organizationName/service/$exchangeService/mailingList
	* Message : Missing identifier.
	*/


	public java.lang.String[] getOrganizationNameServiceExchangeServiceMailingListMailingListAddressAlias(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String mailingListAddress) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/mailingList/" + mailingListAddress + "/alias";
		String __data = "?";
		__data += "organizationName=" + organizationName;
		__data += "exchangeService=" + exchangeService;
		__data += "mailingListAddress=" + mailingListAddress;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : PUT > /email/exchange/$organizationName/service/$exchangeService
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : DELETE > /email/exchange/$organizationName/service/$exchangeService/resourceAccount/$resourceEmailAddress
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : DELETE > /email/exchange/$organizationName/service/$exchangeService/externalContact/$externalEmailAddress
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /email/exchange/$organizationName/service/$exchangeService/account/$primaryEmailAddress/changePassword
	* Message : Missing identifier.
	*/


	public long[] getOrganizationNameServiceExchangeServicePublicFolderPathPermission(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String path) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/publicFolder/" + path + "/permission";
		String __data = "?";
		__data += "organizationName=" + organizationName;
		__data += "exchangeService=" + exchangeService;
		__data += "path=" + path;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : DELETE > /email/exchange/$organizationName/service/$exchangeService/mailingList/$mailingListAddress/alias/$alias
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : DELETE > /email/exchange/$organizationName/service/$exchangeService/protocol/activeSyncMailNotification/$notifiedAccountId
	* Message : Missing identifier.
	*/


	public long[] getOrganizationNameServiceExchangeServiceAccountPrimaryEmailAddressSendOnBehalfTo(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String primaryEmailAddress) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/account/" + primaryEmailAddress + "/sendOnBehalfTo";
		String __data = "?";
		__data += "organizationName=" + organizationName;
		__data += "exchangeService=" + exchangeService;
		__data += "primaryEmailAddress=" + primaryEmailAddress;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /email/exchange/$organizationName/service/$exchangeService/account/$primaryEmailAddress/protocol
	* Message : Missing identifier.
	*/


	public long[] getOrganizationNameServiceExchangeServiceTask(java.lang.String organizationName, java.lang.String exchangeService) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/task";
		String __data = "?";
		__data += "organizationName=" + organizationName;
		__data += "exchangeService=" + exchangeService;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : PUT > /email/exchange/$organizationName/service/$exchangeService/protocol
	* Message : Missing identifier.
	*/


	public java.lang.String[] getOrganizationNameServiceExchangeServiceDomainDomainNameDisclaimerAttribute(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String domainName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/domain/" + domainName + "/disclaimerAttribute";
		String __data = "?";
		__data += "organizationName=" + organizationName;
		__data += "exchangeService=" + exchangeService;
		__data += "domainName=" + domainName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /email/exchange/$organizationName/service/$exchangeService/mailingList/$mailingListAddress/sendOnBehalfTo
	* Message : Missing identifier.
	*/


	public long[] getOrganizationNameServiceExchangeServiceMailingListMailingListAddressSendAs(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String mailingListAddress) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/mailingList/" + mailingListAddress + "/sendAs";
		String __data = "?";
		__data += "organizationName=" + organizationName;
		__data += "exchangeService=" + exchangeService;
		__data += "mailingListAddress=" + mailingListAddress;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : DELETE > /email/exchange/$organizationName/service/$exchangeService/account/$primaryEmailAddress/fullAccess/$allowedAccountId
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : DELETE > /email/exchange/$organizationName/service/$exchangeService/mailingList/$mailingListAddress/sendOnBehalfTo/$allowedAccountId
	* Message : Missing identifier.
	*/


}
