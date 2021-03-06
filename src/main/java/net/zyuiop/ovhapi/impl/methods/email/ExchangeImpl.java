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

	public net.zyuiop.ovhapi.api.objects.email.exchange.ExchangeAccountDiagnosis getOrganizationNameServiceExchangeServiceAccountPrimaryEmailAddressDiagnostics(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String primaryEmailAddress) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/account/" + primaryEmailAddress + "/diagnostics";
		String __data = "?";
		__data += "organizationName=" + organizationName;
		__data += "exchangeService=" + exchangeService;
		__data += "primaryEmailAddress=" + primaryEmailAddress;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.ExchangeAccountDiagnosis.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.exchange.Task postOrganizationNameServiceExchangeServiceActivateSharepoint(java.lang.String primaryEmailAddress, java.lang.String subDomain, java.lang.String organizationName, java.lang.String exchangeService) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/activateSharepoint";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("primaryEmailAddress", primaryEmailAddress);
		__dataMap.put("subDomain", subDomain);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.exchange.Task deleteOrganizationNameServiceExchangeServicePublicFolderPath(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String path) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/publicFolder/" + path + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.Task.class);
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

	public void putOrganizationNameServiceExchangeServiceServiceInfos(net.zyuiop.ovhapi.api.objects.services.Service param0, java.lang.String organizationName, java.lang.String exchangeService) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/serviceInfos";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void putOrganizationNameServiceExchangeServiceAccountPrimaryEmailAddressProtocol(net.zyuiop.ovhapi.api.objects.email.exchange.ExchangeAccountProtocol param0, java.lang.String organizationName, java.lang.String exchangeService, java.lang.String primaryEmailAddress) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/account/" + primaryEmailAddress + "/protocol";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public java.lang.String[] getEmailExchange() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/email/exchange";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public void putOrganizationNameServiceExchangeService(net.zyuiop.ovhapi.api.objects.email.exchange.ExchangeService param0, java.lang.String organizationName, java.lang.String exchangeService) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.email.exchange.Task postOrganizationNameServiceExchangeServiceAccountPrimaryEmailAddressExport(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String primaryEmailAddress) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/account/" + primaryEmailAddress + "/export";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.exchange.Task postOrganizationNameServiceExchangeServiceResourceAccountResourceEmailAddressDelegate(long allowedAccountId, java.lang.String organizationName, java.lang.String exchangeService, java.lang.String resourceEmailAddress) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/resourceAccount/" + resourceEmailAddress + "/delegate";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("allowedAccountId", allowedAccountId);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.Task.class);
	}

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

	public net.zyuiop.ovhapi.api.objects.email.exchange.Task deleteOrganizationNameServiceExchangeServicePublicFolderPathPermissionAllowedAccountId(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String path, long allowedAccountId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/publicFolder/" + path + "/permission/" + allowedAccountId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.Task.class);
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

	public net.zyuiop.ovhapi.api.objects.email.exchange.ExchangeServiceDevice getOrganizationNameServiceExchangeServiceDeviceIdentity(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String identity) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/device/" + identity + "";
		String __data = "?";
		__data += "organizationName=" + organizationName;
		__data += "exchangeService=" + exchangeService;
		__data += "identity=" + identity;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.ExchangeServiceDevice.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.exchange.Task postOrganizationNameServiceExchangeServiceAccountPrimaryEmailAddressFullAccess(long allowedAccountId, java.lang.String organizationName, java.lang.String exchangeService, java.lang.String primaryEmailAddress) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/account/" + primaryEmailAddress + "/fullAccess";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("allowedAccountId", allowedAccountId);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.Task.class);
	}

	public java.lang.String postOrganizationNameServiceExchangeServiceAccountPrimaryEmailAddressTerminate(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String primaryEmailAddress) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/account/" + primaryEmailAddress + "/terminate";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.exchange.Task postOrganizationNameServiceExchangeServiceAccountPrimaryEmailAddressDiagnostics(java.lang.String password, java.lang.String organizationName, java.lang.String exchangeService, java.lang.String primaryEmailAddress) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/account/" + primaryEmailAddress + "/diagnostics";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("password", password);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.exchange.ExchangeAccountSendAs getOrganizationNameServiceExchangeServiceAccountPrimaryEmailAddressSendAsAllowedAccountId(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String primaryEmailAddress, long allowedAccountId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/account/" + primaryEmailAddress + "/sendAs/" + allowedAccountId + "";
		String __data = "?";
		__data += "organizationName=" + organizationName;
		__data += "exchangeService=" + exchangeService;
		__data += "primaryEmailAddress=" + primaryEmailAddress;
		__data += "allowedAccountId=" + allowedAccountId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.ExchangeAccountSendAs.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.exchange.ExchangeDistributionGroupMember getOrganizationNameServiceExchangeServiceMailingListMailingListAddressMemberAccountMemberAccountId(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String mailingListAddress, long memberAccountId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/mailingList/" + mailingListAddress + "/member/account/" + memberAccountId + "";
		String __data = "?";
		__data += "organizationName=" + organizationName;
		__data += "exchangeService=" + exchangeService;
		__data += "mailingListAddress=" + mailingListAddress;
		__data += "memberAccountId=" + memberAccountId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.ExchangeDistributionGroupMember.class);
	}

	public java.lang.String[] getOrganizationNameService(java.lang.String organizationName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service";
		String __data = "?";
		__data += "organizationName=" + organizationName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.email.exchange.ExchangeServiceProtocol getOrganizationNameServiceExchangeServiceProtocol(java.lang.String organizationName, java.lang.String exchangeService) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/protocol";
		String __data = "?";
		__data += "organizationName=" + organizationName;
		__data += "exchangeService=" + exchangeService;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.ExchangeServiceProtocol.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.exchange.ExchangeAccountAlias getOrganizationNameServiceExchangeServiceAccountPrimaryEmailAddressAliasAlias(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String primaryEmailAddress, java.lang.String alias) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/account/" + primaryEmailAddress + "/alias/" + alias + "";
		String __data = "?";
		__data += "organizationName=" + organizationName;
		__data += "exchangeService=" + exchangeService;
		__data += "primaryEmailAddress=" + primaryEmailAddress;
		__data += "alias=" + alias;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.ExchangeAccountAlias.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.exchange.Task deleteOrganizationNameServiceExchangeServiceDomainDomainNameDisclaimer(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String domainName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/domain/" + domainName + "/disclaimer";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.exchange.Task deleteOrganizationNameServiceExchangeServiceSharedAccountSharedEmailAddressSendOnBehalfToAllowedAccountId(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String sharedEmailAddress, long allowedAccountId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/sharedAccount/" + sharedEmailAddress + "/sendOnBehalfTo/" + allowedAccountId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.exchange.Account getOrganizationNameServiceExchangeServiceAccountPrimaryEmailAddress(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String primaryEmailAddress) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/account/" + primaryEmailAddress + "";
		String __data = "?";
		__data += "organizationName=" + organizationName;
		__data += "exchangeService=" + exchangeService;
		__data += "primaryEmailAddress=" + primaryEmailAddress;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.Account.class);
	}

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

	public void putOrganizationNameServiceExchangeServicePublicFolderPath(net.zyuiop.ovhapi.api.objects.email.exchange.PublicFolder param0, java.lang.String organizationName, java.lang.String exchangeService, java.lang.String path) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/publicFolder/" + path + "";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void putOrganizationNameServiceExchangeServiceDomainDomainNameDisclaimer(net.zyuiop.ovhapi.api.objects.email.exchange.Disclaimer param0, java.lang.String organizationName, java.lang.String exchangeService, java.lang.String domainName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/domain/" + domainName + "/disclaimer";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public java.lang.String[] getOrganizationNameServiceExchangeServiceDcvEmails(java.lang.String organizationName, java.lang.String exchangeService) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/dcvEmails";
		String __data = "?";
		__data += "organizationName=" + organizationName;
		__data += "exchangeService=" + exchangeService;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.email.exchange.Task deleteOrganizationNameServiceExchangeServiceResourceAccountResourceEmailAddress(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String resourceEmailAddress) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/resourceAccount/" + resourceEmailAddress + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.Task.class);
	}

	public void putOrganizationNameServiceExchangeServiceMailingListMailingListAddress(net.zyuiop.ovhapi.api.objects.email.exchange.MailingList param0, java.lang.String organizationName, java.lang.String exchangeService, java.lang.String mailingListAddress) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/mailingList/" + mailingListAddress + "";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.email.exchange.Task deleteOrganizationNameServiceExchangeServiceAccountPrimaryEmailAddressFullAccessAllowedAccountId(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String primaryEmailAddress, long allowedAccountId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/account/" + primaryEmailAddress + "/fullAccess/" + allowedAccountId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.exchange.Task postOrganizationNameServiceExchangeServiceProtocolActiveSyncMailNotification(long notifiedAccountId, java.lang.String organizationName, java.lang.String exchangeService) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/protocol/activeSyncMailNotification";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("notifiedAccountId", notifiedAccountId);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.exchange.Task deleteOrganizationNameServiceExchangeServiceMailingListMailingListAddress(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String mailingListAddress) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/mailingList/" + mailingListAddress + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.services.Service getOrganizationNameServiceExchangeServiceServiceInfos(java.lang.String organizationName, java.lang.String exchangeService) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/serviceInfos";
		String __data = "?";
		__data += "organizationName=" + organizationName;
		__data += "exchangeService=" + exchangeService;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.services.Service.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.exchange.ExchangeService getOrganizationNameServiceExchangeService(java.lang.String organizationName, java.lang.String exchangeService) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "";
		String __data = "?";
		__data += "organizationName=" + organizationName;
		__data += "exchangeService=" + exchangeService;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.ExchangeService.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.exchange.Task postOrganizationNameServiceExchangeServiceRenewSSL(java.lang.String dcv, java.lang.String organizationName, java.lang.String exchangeService) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/renewSSL";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("dcv", dcv);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.Task.class);
	}

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

	public net.zyuiop.ovhapi.api.objects.email.exchange.Task postOrganizationNameServiceExchangeServiceSharedAccountSharedEmailAddressFullAccess(long allowedAccountId, java.lang.String organizationName, java.lang.String exchangeService, java.lang.String sharedEmailAddress) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/sharedAccount/" + sharedEmailAddress + "/fullAccess";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("allowedAccountId", allowedAccountId);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.exchange.Domain getOrganizationNameServiceExchangeServiceDomainDomainName(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String domainName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/domain/" + domainName + "";
		String __data = "?";
		__data += "organizationName=" + organizationName;
		__data += "exchangeService=" + exchangeService;
		__data += "domainName=" + domainName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.Domain.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.exchange.OutlookVersions[] getOrganizationNameServiceExchangeServiceOutlookAvailability(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String outlookLanguage, java.lang.String outlookVersion) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/outlookAvailability";
		String __data = "?";
		__data += "organizationName=" + organizationName;
		__data += "exchangeService=" + exchangeService;
		__data += "outlookLanguage=" + outlookLanguage;
		__data += "outlookVersion=" + outlookVersion;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.OutlookVersions[].class);
	}

	public net.zyuiop.ovhapi.api.objects.email.exchange.OutlookVersions[] getOrganizationNameServiceExchangeServiceOutlookAvailability(java.lang.String organizationName, java.lang.String exchangeService) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/outlookAvailability";
		String __data = "?";
		__data += "organizationName=" + organizationName;
		__data += "exchangeService=" + exchangeService;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.OutlookVersions[].class);
	}

	public net.zyuiop.ovhapi.api.objects.email.exchange.ExchangeSharedAccountSendAs getOrganizationNameServiceExchangeServiceSharedAccountSharedEmailAddressSendAsAllowedAccountId(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String sharedEmailAddress, long allowedAccountId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/sharedAccount/" + sharedEmailAddress + "/sendAs/" + allowedAccountId + "";
		String __data = "?";
		__data += "organizationName=" + organizationName;
		__data += "exchangeService=" + exchangeService;
		__data += "sharedEmailAddress=" + sharedEmailAddress;
		__data += "allowedAccountId=" + allowedAccountId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.ExchangeSharedAccountSendAs.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.exchange.Task deleteOrganizationNameServiceExchangeServiceAccountPrimaryEmailAddressExport(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String primaryEmailAddress) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/account/" + primaryEmailAddress + "/export";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.exchange.Task deleteOrganizationNameServiceExchangeServiceResourceAccountResourceEmailAddressDelegateAllowedAccountId(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String resourceEmailAddress, long allowedAccountId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/resourceAccount/" + resourceEmailAddress + "/delegate/" + allowedAccountId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.exchange.Task postOrganizationNameServiceExchangeServiceAccountPrimaryEmailAddressOutlookURL(java.lang.String language, java.lang.String version, java.lang.String organizationName, java.lang.String exchangeService, java.lang.String primaryEmailAddress) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/account/" + primaryEmailAddress + "/outlookURL";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("language", language);
		__dataMap.put("version", version);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.exchange.Task postOrganizationNameServiceExchangeServiceSharedAccountSharedEmailAddressSendOnBehalfTo(long allowAccountId, java.lang.String organizationName, java.lang.String exchangeService, java.lang.String sharedEmailAddress) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/sharedAccount/" + sharedEmailAddress + "/sendOnBehalfTo";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("allowAccountId", allowAccountId);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.exchange.Task deleteOrganizationNameServiceExchangeServiceAccountPrimaryEmailAddressAliasAlias(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String primaryEmailAddress, java.lang.String alias) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/account/" + primaryEmailAddress + "/alias/" + alias + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.exchange.Task postOrganizationNameServiceExchangeServiceAccountPrimaryEmailAddressChangePassword(java.lang.String password, java.lang.String organizationName, java.lang.String exchangeService, java.lang.String primaryEmailAddress) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/account/" + primaryEmailAddress + "/changePassword";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("password", password);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.exchange.Task postOrganizationNameServiceExchangeServiceMailingListMailingListAddressSendOnBehalfTo(long allowAccountId, java.lang.String organizationName, java.lang.String exchangeService, java.lang.String mailingListAddress) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/mailingList/" + mailingListAddress + "/sendOnBehalfTo";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("allowAccountId", allowAccountId);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.exchange.ExchangeSharedAccountFullAccess getOrganizationNameServiceExchangeServiceSharedAccountSharedEmailAddressFullAccessAllowedAccountId(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String sharedEmailAddress, long allowedAccountId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/sharedAccount/" + sharedEmailAddress + "/fullAccess/" + allowedAccountId + "";
		String __data = "?";
		__data += "organizationName=" + organizationName;
		__data += "exchangeService=" + exchangeService;
		__data += "sharedEmailAddress=" + sharedEmailAddress;
		__data += "allowedAccountId=" + allowedAccountId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.ExchangeSharedAccountFullAccess.class);
	}

	public void putOrganizationNameServiceExchangeServiceDeviceIdentity(net.zyuiop.ovhapi.api.objects.email.exchange.ExchangeServiceDevice param0, java.lang.String organizationName, java.lang.String exchangeService, java.lang.String identity) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/device/" + identity + "";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.email.exchange.ExchangeAccountProtocol getOrganizationNameServiceExchangeServiceAccountPrimaryEmailAddressProtocol(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String primaryEmailAddress) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/account/" + primaryEmailAddress + "/protocol";
		String __data = "?";
		__data += "organizationName=" + organizationName;
		__data += "exchangeService=" + exchangeService;
		__data += "primaryEmailAddress=" + primaryEmailAddress;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.ExchangeAccountProtocol.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.exchange.Task postOrganizationNameServiceExchangeServiceUpdateDeviceList(java.lang.String organizationName, java.lang.String exchangeService) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/updateDeviceList";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.exchange.Task postOrganizationNameServiceExchangeServicePublicFolder(long quota, java.lang.String type, java.lang.String path, java.lang.String organizationName, java.lang.String exchangeService, java.lang.String anonymousPermission, java.lang.String defaultPermission) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/publicFolder";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("quota", quota);
		__dataMap.put("type", type);
		__dataMap.put("path", path);
		__dataMap.put("anonymousPermission", anonymousPermission);
		__dataMap.put("defaultPermission", defaultPermission);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.exchange.Task postOrganizationNameServiceExchangeServicePublicFolder(long quota, java.lang.String type, java.lang.String path, java.lang.String organizationName, java.lang.String exchangeService) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/publicFolder";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("quota", quota);
		__dataMap.put("type", type);
		__dataMap.put("path", path);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.Task.class);
	}

	public void putOrganizationNameServiceExchangeServiceAccountPrimaryEmailAddress(net.zyuiop.ovhapi.api.objects.email.exchange.Account param0, java.lang.String organizationName, java.lang.String exchangeService, java.lang.String primaryEmailAddress) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/account/" + primaryEmailAddress + "";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.email.exchange.Task postOrganizationNameServiceExchangeServiceDomainDomainNameDisclaimer(java.lang.String content, java.lang.String organizationName, java.lang.String exchangeService, java.lang.String domainName, boolean outsideOnly) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/domain/" + domainName + "/disclaimer";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("content", content);
		__dataMap.put("outsideOnly", outsideOnly);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.exchange.Task postOrganizationNameServiceExchangeServiceDomainDomainNameDisclaimer(java.lang.String content, java.lang.String organizationName, java.lang.String exchangeService, java.lang.String domainName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/domain/" + domainName + "/disclaimer";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("content", content);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.exchange.Task deleteOrganizationNameServiceExchangeServiceSharedAccountSharedEmailAddress(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String sharedEmailAddress) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/sharedAccount/" + sharedEmailAddress + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.Task.class);
	}

	public void putOrganizationNameServiceExchangeServiceProtocol(net.zyuiop.ovhapi.api.objects.email.exchange.ExchangeServiceProtocol param0, java.lang.String organizationName, java.lang.String exchangeService) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/protocol";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

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

	public net.zyuiop.ovhapi.api.objects.email.exchange.Export getOrganizationNameServiceExchangeServiceAccountPrimaryEmailAddressExport(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String primaryEmailAddress) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/account/" + primaryEmailAddress + "/export";
		String __data = "?";
		__data += "organizationName=" + organizationName;
		__data += "exchangeService=" + exchangeService;
		__data += "primaryEmailAddress=" + primaryEmailAddress;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.Export.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.exchange.ExchangeMailingListAlias getOrganizationNameServiceExchangeServiceMailingListMailingListAddressAliasAlias(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String mailingListAddress, java.lang.String alias) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/mailingList/" + mailingListAddress + "/alias/" + alias + "";
		String __data = "?";
		__data += "organizationName=" + organizationName;
		__data += "exchangeService=" + exchangeService;
		__data += "mailingListAddress=" + mailingListAddress;
		__data += "alias=" + alias;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.ExchangeMailingListAlias.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.exchange.ExchangeDistributionGroupSendOnBehalfTo getOrganizationNameServiceExchangeServiceMailingListMailingListAddressSendOnBehalfToAllowedAccountId(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String mailingListAddress, long allowedAccountId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/mailingList/" + mailingListAddress + "/sendOnBehalfTo/" + allowedAccountId + "";
		String __data = "?";
		__data += "organizationName=" + organizationName;
		__data += "exchangeService=" + exchangeService;
		__data += "mailingListAddress=" + mailingListAddress;
		__data += "allowedAccountId=" + allowedAccountId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.ExchangeDistributionGroupSendOnBehalfTo.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.exchange.Task postOrganizationNameServiceExchangeServiceResourceAccount(java.lang.String resourceEmailAddress, java.lang.String type, long capacity, java.lang.String organizationName, java.lang.String exchangeService, boolean allowConflict, java.lang.String displayName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/resourceAccount";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("resourceEmailAddress", resourceEmailAddress);
		__dataMap.put("type", type);
		__dataMap.put("capacity", capacity);
		__dataMap.put("allowConflict", allowConflict);
		__dataMap.put("displayName", displayName);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.exchange.Task postOrganizationNameServiceExchangeServiceResourceAccount(java.lang.String resourceEmailAddress, java.lang.String type, long capacity, java.lang.String organizationName, java.lang.String exchangeService) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/resourceAccount";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("resourceEmailAddress", resourceEmailAddress);
		__dataMap.put("type", type);
		__dataMap.put("capacity", capacity);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.exchange.Task postOrganizationNameServiceExchangeServiceAccountPrimaryEmailAddressSendAs(long allowAccountId, java.lang.String organizationName, java.lang.String exchangeService, java.lang.String primaryEmailAddress) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/account/" + primaryEmailAddress + "/sendAs";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("allowAccountId", allowAccountId);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.exchange.Task postOrganizationNameServiceExchangeServiceAccountPrimaryEmailAddressAlias(java.lang.String alias, java.lang.String organizationName, java.lang.String exchangeService, java.lang.String primaryEmailAddress) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/account/" + primaryEmailAddress + "/alias";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("alias", alias);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.exchange.Task postOrganizationNameServiceExchangeServiceMailingListMailingListAddressAlias(java.lang.String alias, java.lang.String organizationName, java.lang.String exchangeService, java.lang.String mailingListAddress) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/mailingList/" + mailingListAddress + "/alias";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("alias", alias);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.exchange.Task deleteOrganizationNameServiceExchangeServiceProtocolActiveSyncMailNotificationNotifiedAccountId(java.lang.String organizationName, java.lang.String exchangeService, long notifiedAccountId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/protocol/activeSyncMailNotification/" + notifiedAccountId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.exchange.Task deleteOrganizationNameServiceExchangeServiceAccountPrimaryEmailAddressSendOnBehalfToAllowedAccountId(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String primaryEmailAddress, long allowedAccountId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/account/" + primaryEmailAddress + "/sendOnBehalfTo/" + allowedAccountId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.exchange.Task postOrganizationNameServiceExchangeServiceMailingListMailingListAddressManagerAccount(long managerAccountId, java.lang.String organizationName, java.lang.String exchangeService, java.lang.String mailingListAddress) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/mailingList/" + mailingListAddress + "/manager/account";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("managerAccountId", managerAccountId);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.exchange.Task postOrganizationNameServiceExchangeServiceAccountPrimaryEmailAddressExportURL(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String primaryEmailAddress) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/account/" + primaryEmailAddress + "/exportURL";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.Task.class);
	}

	public long[] getOrganizationNameServiceExchangeServiceTask(java.lang.String organizationName, java.lang.String exchangeService) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/task";
		String __data = "?";
		__data += "organizationName=" + organizationName;
		__data += "exchangeService=" + exchangeService;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

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

	public net.zyuiop.ovhapi.api.objects.email.exchange.Task deleteOrganizationNameServiceExchangeServiceMailingListMailingListAddressSendAsAllowedAccountId(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String mailingListAddress, long allowedAccountId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/mailingList/" + mailingListAddress + "/sendAs/" + allowedAccountId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.Task.class);
	}

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

	public net.zyuiop.ovhapi.api.objects.email.exchange.Task deleteOrganizationNameServiceExchangeServiceSharedAccountSharedEmailAddressSendAsAllowedAccountId(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String sharedEmailAddress, long allowedAccountId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/sharedAccount/" + sharedEmailAddress + "/sendAs/" + allowedAccountId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.exchange.Task getOrganizationNameServiceExchangeServiceAccountPrimaryEmailAddressTasksId(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String primaryEmailAddress, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/account/" + primaryEmailAddress + "/tasks/" + id + "";
		String __data = "?";
		__data += "organizationName=" + organizationName;
		__data += "exchangeService=" + exchangeService;
		__data += "primaryEmailAddress=" + primaryEmailAddress;
		__data += "id=" + id;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.exchange.Task deleteOrganizationNameServiceExchangeServiceAccountPrimaryEmailAddressSendAsAllowedAccountId(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String primaryEmailAddress, long allowedAccountId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/account/" + primaryEmailAddress + "/sendAs/" + allowedAccountId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.exchange.ExchangeSharedAccountSendOnBehalfTo getOrganizationNameServiceExchangeServiceSharedAccountSharedEmailAddressSendOnBehalfToAllowedAccountId(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String sharedEmailAddress, long allowedAccountId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/sharedAccount/" + sharedEmailAddress + "/sendOnBehalfTo/" + allowedAccountId + "";
		String __data = "?";
		__data += "organizationName=" + organizationName;
		__data += "exchangeService=" + exchangeService;
		__data += "sharedEmailAddress=" + sharedEmailAddress;
		__data += "allowedAccountId=" + allowedAccountId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.ExchangeSharedAccountSendOnBehalfTo.class);
	}

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

	public net.zyuiop.ovhapi.api.objects.email.exchange.DailyLicense[] getOrganizationNameServiceExchangeServiceLicense(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String license, java.util.Date toDate, java.util.Date fromDate) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/license";
		String __data = "?";
		__data += "organizationName=" + organizationName;
		__data += "exchangeService=" + exchangeService;
		__data += "license=" + license;
		__data += "toDate=" + toDate;
		__data += "fromDate=" + fromDate;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.DailyLicense[].class);
	}

	public net.zyuiop.ovhapi.api.objects.email.exchange.DailyLicense[] getOrganizationNameServiceExchangeServiceLicense(java.lang.String organizationName, java.lang.String exchangeService) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/license";
		String __data = "?";
		__data += "organizationName=" + organizationName;
		__data += "exchangeService=" + exchangeService;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.DailyLicense[].class);
	}

	public net.zyuiop.ovhapi.api.objects.email.exchange.Task postOrganizationNameServiceExchangeServiceMailingList(java.lang.String joinRestriction, java.lang.String departRestriction, java.lang.String mailingListAddress, java.lang.String organizationName, java.lang.String exchangeService, boolean hiddenFromGAL, boolean senderAuthentification, long maxSendSize, long maxReceiveSize, java.lang.String displayName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/mailingList";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("joinRestriction", joinRestriction);
		__dataMap.put("departRestriction", departRestriction);
		__dataMap.put("mailingListAddress", mailingListAddress);
		__dataMap.put("hiddenFromGAL", hiddenFromGAL);
		__dataMap.put("senderAuthentification", senderAuthentification);
		__dataMap.put("maxSendSize", maxSendSize);
		__dataMap.put("maxReceiveSize", maxReceiveSize);
		__dataMap.put("displayName", displayName);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.exchange.Task postOrganizationNameServiceExchangeServiceMailingList(java.lang.String joinRestriction, java.lang.String departRestriction, java.lang.String mailingListAddress, java.lang.String organizationName, java.lang.String exchangeService) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/mailingList";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("joinRestriction", joinRestriction);
		__dataMap.put("departRestriction", departRestriction);
		__dataMap.put("mailingListAddress", mailingListAddress);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.exchange.Task deleteOrganizationNameServiceExchangeServiceMailingListMailingListAddressMemberAccountMemberAccountId(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String mailingListAddress, long memberAccountId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/mailingList/" + mailingListAddress + "/member/account/" + memberAccountId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.exchange.ResourceAccount getOrganizationNameServiceExchangeServiceResourceAccountResourceEmailAddress(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String resourceEmailAddress) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/resourceAccount/" + resourceEmailAddress + "";
		String __data = "?";
		__data += "organizationName=" + organizationName;
		__data += "exchangeService=" + exchangeService;
		__data += "resourceEmailAddress=" + resourceEmailAddress;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.ResourceAccount.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.exchange.Task getOrganizationNameServiceExchangeServiceSharedAccountSharedEmailAddressTasksId(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String sharedEmailAddress, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/sharedAccount/" + sharedEmailAddress + "/tasks/" + id + "";
		String __data = "?";
		__data += "organizationName=" + organizationName;
		__data += "exchangeService=" + exchangeService;
		__data += "sharedEmailAddress=" + sharedEmailAddress;
		__data += "id=" + id;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.exchange.PublicFolderQuota getOrganizationNameServiceExchangeServicePublicFolderQuota(java.lang.String organizationName, java.lang.String exchangeService) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/publicFolderQuota";
		String __data = "?";
		__data += "organizationName=" + organizationName;
		__data += "exchangeService=" + exchangeService;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.PublicFolderQuota.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.exchange.MailingList getOrganizationNameServiceExchangeServiceMailingListMailingListAddress(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String mailingListAddress) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/mailingList/" + mailingListAddress + "";
		String __data = "?";
		__data += "organizationName=" + organizationName;
		__data += "exchangeService=" + exchangeService;
		__data += "mailingListAddress=" + mailingListAddress;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.MailingList.class);
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

	public net.zyuiop.ovhapi.api.objects.email.exchange.Task postOrganizationNameServiceExchangeServiceAccountPrimaryEmailAddressSendOnBehalfTo(long allowAccountId, java.lang.String organizationName, java.lang.String exchangeService, java.lang.String primaryEmailAddress) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/account/" + primaryEmailAddress + "/sendOnBehalfTo";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("allowAccountId", allowAccountId);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.Task.class);
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

	public net.zyuiop.ovhapi.api.objects.email.exchange.Task deleteOrganizationNameServiceExchangeServiceAccountPrimaryEmailAddress(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String primaryEmailAddress) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/account/" + primaryEmailAddress + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.Task.class);
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

	public net.zyuiop.ovhapi.api.objects.email.exchange.SharedAccount getOrganizationNameServiceExchangeServiceSharedAccountSharedEmailAddress(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String sharedEmailAddress) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/sharedAccount/" + sharedEmailAddress + "";
		String __data = "?";
		__data += "organizationName=" + organizationName;
		__data += "exchangeService=" + exchangeService;
		__data += "sharedEmailAddress=" + sharedEmailAddress;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.SharedAccount.class);
	}

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

	public void putOrganizationNameServiceExchangeServiceResourceAccountResourceEmailAddress(net.zyuiop.ovhapi.api.objects.email.exchange.ResourceAccount param0, java.lang.String organizationName, java.lang.String exchangeService, java.lang.String resourceEmailAddress) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/resourceAccount/" + resourceEmailAddress + "";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.email.exchange.ExchangeResourceAccountDelegate getOrganizationNameServiceExchangeServiceResourceAccountResourceEmailAddressDelegateAllowedAccountId(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String resourceEmailAddress, long allowedAccountId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/resourceAccount/" + resourceEmailAddress + "/delegate/" + allowedAccountId + "";
		String __data = "?";
		__data += "organizationName=" + organizationName;
		__data += "exchangeService=" + exchangeService;
		__data += "resourceEmailAddress=" + resourceEmailAddress;
		__data += "allowedAccountId=" + allowedAccountId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.ExchangeResourceAccountDelegate.class);
	}

	public void putOrganizationNameServiceExchangeServiceExternalContactExternalEmailAddress(net.zyuiop.ovhapi.api.objects.email.exchange.ExchangeExternalContact param0, java.lang.String organizationName, java.lang.String exchangeService, java.lang.String externalEmailAddress) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/externalContact/" + externalEmailAddress + "";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.email.exchange.ExchangeDistributionGroupSendAs getOrganizationNameServiceExchangeServiceMailingListMailingListAddressSendAsAllowedAccountId(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String mailingListAddress, long allowedAccountId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/mailingList/" + mailingListAddress + "/sendAs/" + allowedAccountId + "";
		String __data = "?";
		__data += "organizationName=" + organizationName;
		__data += "exchangeService=" + exchangeService;
		__data += "mailingListAddress=" + mailingListAddress;
		__data += "allowedAccountId=" + allowedAccountId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.ExchangeDistributionGroupSendAs.class);
	}

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

	public net.zyuiop.ovhapi.api.objects.email.exchange.Task postOrganizationNameServiceExchangeServicePublicFolderPathPermission(long allowedAccountId, java.lang.String accessRights, java.lang.String organizationName, java.lang.String exchangeService, java.lang.String path) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/publicFolder/" + path + "/permission";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("allowedAccountId", allowedAccountId);
		__dataMap.put("accessRights", accessRights);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.exchange.Task deleteOrganizationNameServiceExchangeServiceMailingListMailingListAddressAliasAlias(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String mailingListAddress, java.lang.String alias) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/mailingList/" + mailingListAddress + "/alias/" + alias + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.Task.class);
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

	public net.zyuiop.ovhapi.api.objects.email.exchange.Task postOrganizationNameServiceExchangeServiceSharedAccount(long quota, java.lang.String sharedEmailAddress, java.lang.String organizationName, java.lang.String exchangeService, java.lang.String initials, java.lang.String firstName, boolean hiddenFromGAL, java.lang.String lastName, java.lang.String mailingFilter, java.lang.String displayName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/sharedAccount";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("quota", quota);
		__dataMap.put("sharedEmailAddress", sharedEmailAddress);
		__dataMap.put("initials", initials);
		__dataMap.put("firstName", firstName);
		__dataMap.put("hiddenFromGAL", hiddenFromGAL);
		__dataMap.put("lastName", lastName);
		__dataMap.put("mailingFilter", mailingFilter);
		__dataMap.put("displayName", displayName);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.exchange.Task postOrganizationNameServiceExchangeServiceSharedAccount(long quota, java.lang.String sharedEmailAddress, java.lang.String organizationName, java.lang.String exchangeService) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/sharedAccount";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("quota", quota);
		__dataMap.put("sharedEmailAddress", sharedEmailAddress);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.Task.class);
	}

	public void putOrganizationNameServiceExchangeServiceDomainDomainName(net.zyuiop.ovhapi.api.objects.email.exchange.Domain param0, java.lang.String organizationName, java.lang.String exchangeService, java.lang.String domainName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/domain/" + domainName + "";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.email.exchange.Server getOrganizationNameServiceExchangeServiceServer(java.lang.String organizationName, java.lang.String exchangeService) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/server";
		String __data = "?";
		__data += "organizationName=" + organizationName;
		__data += "exchangeService=" + exchangeService;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.Server.class);
	}

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

	public net.zyuiop.ovhapi.api.objects.email.exchange.Task deleteOrganizationNameServiceExchangeServiceSharedAccountSharedEmailAddressFullAccessAllowedAccountId(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String sharedEmailAddress, long allowedAccountId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/sharedAccount/" + sharedEmailAddress + "/fullAccess/" + allowedAccountId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.exchange.ExchangeAccountSendOnBehalfTo getOrganizationNameServiceExchangeServiceAccountPrimaryEmailAddressSendOnBehalfToAllowedAccountId(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String primaryEmailAddress, long allowedAccountId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/account/" + primaryEmailAddress + "/sendOnBehalfTo/" + allowedAccountId + "";
		String __data = "?";
		__data += "organizationName=" + organizationName;
		__data += "exchangeService=" + exchangeService;
		__data += "primaryEmailAddress=" + primaryEmailAddress;
		__data += "allowedAccountId=" + allowedAccountId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.ExchangeAccountSendOnBehalfTo.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.exchange.Task postOrganizationNameServiceExchangeServiceSharedAccountSharedEmailAddressSendAs(long allowAccountId, java.lang.String organizationName, java.lang.String exchangeService, java.lang.String sharedEmailAddress) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/sharedAccount/" + sharedEmailAddress + "/sendAs";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("allowAccountId", allowAccountId);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.Task.class);
	}

	public void putOrganizationNameServiceExchangeServicePublicFolderPathPermissionAllowedAccountId(net.zyuiop.ovhapi.api.objects.email.exchange.ExchangePublicFolderPermission param0, java.lang.String organizationName, java.lang.String exchangeService, java.lang.String path, long allowedAccountId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/publicFolder/" + path + "/permission/" + allowedAccountId + "";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.email.exchange.Task postOrganizationNameServiceExchangeServiceAccount(java.lang.String license, java.lang.String login, java.lang.String password, java.lang.String domain, java.lang.String organizationName, java.lang.String exchangeService, java.lang.String initials, java.lang.String firstName, boolean hiddenFromGAL, java.lang.String SAMAccountName, java.lang.String mailingFilter, java.lang.String lastName, boolean outlookLicense, java.lang.String displayName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/account";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("license", license);
		__dataMap.put("login", login);
		__dataMap.put("password", password);
		__dataMap.put("domain", domain);
		__dataMap.put("initials", initials);
		__dataMap.put("firstName", firstName);
		__dataMap.put("hiddenFromGAL", hiddenFromGAL);
		__dataMap.put("SAMAccountName", SAMAccountName);
		__dataMap.put("mailingFilter", mailingFilter);
		__dataMap.put("lastName", lastName);
		__dataMap.put("outlookLicense", outlookLicense);
		__dataMap.put("displayName", displayName);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.exchange.Task postOrganizationNameServiceExchangeServiceAccount(java.lang.String license, java.lang.String login, java.lang.String password, java.lang.String domain, java.lang.String organizationName, java.lang.String exchangeService) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/account";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("license", license);
		__dataMap.put("login", login);
		__dataMap.put("password", password);
		__dataMap.put("domain", domain);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.exchange.Task deleteOrganizationNameServiceExchangeServiceMailingListMailingListAddressSendOnBehalfToAllowedAccountId(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String mailingListAddress, long allowedAccountId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/mailingList/" + mailingListAddress + "/sendOnBehalfTo/" + allowedAccountId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.exchange.Task getOrganizationNameServiceExchangeServiceTaskId(java.lang.String organizationName, java.lang.String exchangeService, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/task/" + id + "";
		String __data = "?";
		__data += "organizationName=" + organizationName;
		__data += "exchangeService=" + exchangeService;
		__data += "id=" + id;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.exchange.Disclaimer getOrganizationNameServiceExchangeServiceDomainDomainNameDisclaimer(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String domainName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/domain/" + domainName + "/disclaimer";
		String __data = "?";
		__data += "organizationName=" + organizationName;
		__data += "exchangeService=" + exchangeService;
		__data += "domainName=" + domainName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.Disclaimer.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.exchange.Task deleteOrganizationNameServiceExchangeServiceMailingListMailingListAddressMemberContactMemberContactId(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String mailingListAddress, long memberContactId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/mailingList/" + mailingListAddress + "/member/contact/" + memberContactId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.exchange.ExchangePublicFolderPermission getOrganizationNameServiceExchangeServicePublicFolderPathPermissionAllowedAccountId(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String path, long allowedAccountId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/publicFolder/" + path + "/permission/" + allowedAccountId + "";
		String __data = "?";
		__data += "organizationName=" + organizationName;
		__data += "exchangeService=" + exchangeService;
		__data += "path=" + path;
		__data += "allowedAccountId=" + allowedAccountId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.ExchangePublicFolderPermission.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.exchange.PublicFolder getOrganizationNameServiceExchangeServicePublicFolderPath(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String path) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/publicFolder/" + path + "";
		String __data = "?";
		__data += "organizationName=" + organizationName;
		__data += "exchangeService=" + exchangeService;
		__data += "path=" + path;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.PublicFolder.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.exchange.Task postOrganizationNameServiceExchangeServiceMailingListMailingListAddressSendAs(long allowAccountId, java.lang.String organizationName, java.lang.String exchangeService, java.lang.String mailingListAddress) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/mailingList/" + mailingListAddress + "/sendAs";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("allowAccountId", allowAccountId);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.exchange.OutlookUrl getOrganizationNameServiceExchangeServiceAccountPrimaryEmailAddressOutlookURL(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String primaryEmailAddress) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/account/" + primaryEmailAddress + "/outlookURL";
		String __data = "?";
		__data += "organizationName=" + organizationName;
		__data += "exchangeService=" + exchangeService;
		__data += "primaryEmailAddress=" + primaryEmailAddress;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.OutlookUrl.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.exchange.Task postOrganizationNameServiceExchangeServiceMailingListMailingListAddressMemberAccount(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String mailingListAddress, long memberContactId, long memberAccountId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/mailingList/" + mailingListAddress + "/member/account";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("memberContactId", memberContactId);
		__dataMap.put("memberAccountId", memberAccountId);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.exchange.Task postOrganizationNameServiceExchangeServiceMailingListMailingListAddressMemberAccount(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String mailingListAddress) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/mailingList/" + mailingListAddress + "/member/account";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.Task.class);
	}

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

	public net.zyuiop.ovhapi.api.objects.email.exchange.Task postOrganizationNameServiceExchangeServiceMailingListMailingListAddressMemberContact(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String mailingListAddress, long memberContactId, long memberAccountId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/mailingList/" + mailingListAddress + "/member/contact";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("memberContactId", memberContactId);
		__dataMap.put("memberAccountId", memberAccountId);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.exchange.Task postOrganizationNameServiceExchangeServiceMailingListMailingListAddressMemberContact(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String mailingListAddress) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/mailingList/" + mailingListAddress + "/member/contact";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.exchange.Task postOrganizationNameServiceExchangeServiceDomain(java.lang.String name, java.lang.String type, java.lang.String organizationName, java.lang.String exchangeService, java.lang.String mxRelay, boolean configureAutodiscover, java.lang.String organization2010, boolean configureMx, boolean main) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/domain";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("name", name);
		__dataMap.put("type", type);
		__dataMap.put("mxRelay", mxRelay);
		__dataMap.put("configureAutodiscover", configureAutodiscover);
		__dataMap.put("organization2010", organization2010);
		__dataMap.put("configureMx", configureMx);
		__dataMap.put("main", main);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.exchange.Task postOrganizationNameServiceExchangeServiceDomain(java.lang.String name, java.lang.String type, java.lang.String organizationName, java.lang.String exchangeService) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/domain";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("name", name);
		__dataMap.put("type", type);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.exchange.Task deleteOrganizationNameServiceExchangeServiceDomainDomainName(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String domainName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/domain/" + domainName + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.Task.class);
	}

	public long[] getOrganizationNameServiceExchangeServiceProtocolActiveSyncMailNotification(java.lang.String organizationName, java.lang.String exchangeService) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/protocol/activeSyncMailNotification";
		String __data = "?";
		__data += "organizationName=" + organizationName;
		__data += "exchangeService=" + exchangeService;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.email.exchange.ExchangeDistributionGroupMember getOrganizationNameServiceExchangeServiceMailingListMailingListAddressMemberContactMemberContactId(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String mailingListAddress, long memberContactId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/mailingList/" + mailingListAddress + "/member/contact/" + memberContactId + "";
		String __data = "?";
		__data += "organizationName=" + organizationName;
		__data += "exchangeService=" + exchangeService;
		__data += "mailingListAddress=" + mailingListAddress;
		__data += "memberContactId=" + memberContactId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.ExchangeDistributionGroupMember.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.exchange.Task postOrganizationNameServiceExchangeServiceDeviceIdentityClearDevice(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String identity) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/device/" + identity + "/clearDevice";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.Task.class);
	}

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

	public net.zyuiop.ovhapi.api.objects.email.exchange.ExchangeServiceActiveSyncNotification getOrganizationNameServiceExchangeServiceProtocolActiveSyncMailNotificationNotifiedAccountId(java.lang.String organizationName, java.lang.String exchangeService, long notifiedAccountId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/protocol/activeSyncMailNotification/" + notifiedAccountId + "";
		String __data = "?";
		__data += "organizationName=" + organizationName;
		__data += "exchangeService=" + exchangeService;
		__data += "notifiedAccountId=" + notifiedAccountId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.ExchangeServiceActiveSyncNotification.class);
	}

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

	public net.zyuiop.ovhapi.api.objects.email.exchange.Task deleteOrganizationNameServiceExchangeServiceMailingListMailingListAddressManagerAccountManagerAccountId(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String mailingListAddress, long managerAccountId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/mailingList/" + mailingListAddress + "/manager/account/" + managerAccountId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.Task.class);
	}

	public void putOrganizationNameServiceExchangeServiceSharedAccountSharedEmailAddress(net.zyuiop.ovhapi.api.objects.email.exchange.SharedAccount param0, java.lang.String organizationName, java.lang.String exchangeService, java.lang.String sharedEmailAddress) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/sharedAccount/" + sharedEmailAddress + "";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.email.exchange.ExchangeAccountFullAccess getOrganizationNameServiceExchangeServiceAccountPrimaryEmailAddressFullAccessAllowedAccountId(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String primaryEmailAddress, long allowedAccountId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/account/" + primaryEmailAddress + "/fullAccess/" + allowedAccountId + "";
		String __data = "?";
		__data += "organizationName=" + organizationName;
		__data += "exchangeService=" + exchangeService;
		__data += "primaryEmailAddress=" + primaryEmailAddress;
		__data += "allowedAccountId=" + allowedAccountId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.ExchangeAccountFullAccess.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.exchange.SharedAccountQuota getOrganizationNameServiceExchangeServiceSharedAccountQuota(java.lang.String organizationName, java.lang.String exchangeService) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/sharedAccountQuota";
		String __data = "?";
		__data += "organizationName=" + organizationName;
		__data += "exchangeService=" + exchangeService;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.SharedAccountQuota.class);
	}

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

	public net.zyuiop.ovhapi.api.objects.email.exchange.Task deleteOrganizationNameServiceExchangeServiceExternalContactExternalEmailAddress(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String externalEmailAddress) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/externalContact/" + externalEmailAddress + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.exchange.Task postOrganizationNameServiceExchangeServiceExternalContact(java.lang.String externalEmailAddress, java.lang.String organizationName, java.lang.String exchangeService, java.lang.String initials, java.lang.String firstName, boolean hiddenFromGAL, java.lang.String organization2010, java.lang.String lastName, java.lang.String displayName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/externalContact";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("externalEmailAddress", externalEmailAddress);
		__dataMap.put("initials", initials);
		__dataMap.put("firstName", firstName);
		__dataMap.put("hiddenFromGAL", hiddenFromGAL);
		__dataMap.put("organization2010", organization2010);
		__dataMap.put("lastName", lastName);
		__dataMap.put("displayName", displayName);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.exchange.Task postOrganizationNameServiceExchangeServiceExternalContact(java.lang.String externalEmailAddress, java.lang.String organizationName, java.lang.String exchangeService) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/externalContact";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("externalEmailAddress", externalEmailAddress);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.Task.class);
	}

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

	public net.zyuiop.ovhapi.api.objects.email.exchange.ExchangeDistributionGroupManager getOrganizationNameServiceExchangeServiceMailingListMailingListAddressManagerAccountManagerAccountId(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String mailingListAddress, long managerAccountId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/mailingList/" + mailingListAddress + "/manager/account/" + managerAccountId + "";
		String __data = "?";
		__data += "organizationName=" + organizationName;
		__data += "exchangeService=" + exchangeService;
		__data += "mailingListAddress=" + mailingListAddress;
		__data += "managerAccountId=" + managerAccountId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.ExchangeDistributionGroupManager.class);
	}

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

	public net.zyuiop.ovhapi.api.objects.email.exchange.ExchangeExternalContact getOrganizationNameServiceExchangeServiceExternalContactExternalEmailAddress(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String externalEmailAddress) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/externalContact/" + externalEmailAddress + "";
		String __data = "?";
		__data += "organizationName=" + organizationName;
		__data += "exchangeService=" + exchangeService;
		__data += "externalEmailAddress=" + externalEmailAddress;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.ExchangeExternalContact.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.exchange.ExportUrl getOrganizationNameServiceExchangeServiceAccountPrimaryEmailAddressExportURL(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String primaryEmailAddress) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/exchange/" + organizationName + "/service/" + exchangeService + "/account/" + primaryEmailAddress + "/exportURL";
		String __data = "?";
		__data += "organizationName=" + organizationName;
		__data += "exchangeService=" + exchangeService;
		__data += "primaryEmailAddress=" + primaryEmailAddress;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.email.exchange.ExportUrl.class);
	}

}
