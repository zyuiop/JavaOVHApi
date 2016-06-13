package net.zyuiop.ovhapi.impl.methods.email;

import net.zyuiop.ovhapi.api.methods.email.Domain;
import com.google.gson.Gson;
import net.zyuiop.ovhapi.api.OVHApiMethod;
import java.util.HashMap;
import java.util.Map;
import net.zyuiop.ovhapi.impl.OVHRawCalls;
import java.net.URL;
public class DomainImpl implements Domain { 

	private final OVHRawCalls client;

	public DomainImpl(OVHRawCalls client) { 
		this.client = client;
	}

	public java.lang.String getDomainDnsMXRecords(java.lang.String domain, java.lang.String subDomain) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + domain + "/dnsMXRecords";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getDomainDnsMXRecords(java.lang.String domain) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + domain + "/dnsMXRecords";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public void postDomainAccountAccountNameUpdateUsage(java.lang.String domain, java.lang.String accountName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + domain + "/account/" + accountName + "/updateUsage";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public java.lang.String deleteDomainAccountAccountNameDelegationAccountId(java.lang.String domain, java.lang.String accountName, java.lang.String accountId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + domain + "/account/" + accountName + "/delegation/" + accountId + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.DomainService getDomain(java.lang.String domain) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + domain + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.email.domain.DomainService.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.Rule getDomainAccountAccountNameFilterNameRuleId(java.lang.String domain, java.lang.String accountName, java.lang.String name, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + domain + "/account/" + accountName + "/filter/" + name + "/rule/" + id + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.email.domain.Rule.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.TaskFilter deleteDelegatedAccountEmailFilterName(java.lang.String email, java.lang.String name) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/delegatedAccount/" + email + "/filter/" + name + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.email.domain.TaskFilter.class);
	}

	public long[] getDelegatedAccountEmailFilterNameRule(java.lang.String email, java.lang.String name) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/delegatedAccount/" + email + "/filter/" + name + "/rule";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public long[] postDomainChangeContact(java.lang.String domain, java.lang.String contactAdmin, java.lang.String contactTech, java.lang.String contactBilling) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + domain + "/changeContact";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("contactAdmin", contactAdmin);
		dataMap.put("contactTech", contactTech);
		dataMap.put("contactBilling", contactBilling);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public long[] postDomainChangeContact(java.lang.String domain) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + domain + "/changeContact";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.TaskFilter postDomainAccountAccountNameFilter(long priority, java.lang.String value, boolean active, java.lang.String operand, java.lang.String name, java.lang.String action, java.lang.String header, java.lang.String domain, java.lang.String accountName, java.lang.String actionParam) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + domain + "/account/" + accountName + "/filter";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("priority", priority);
		dataMap.put("value", value);
		dataMap.put("active", active);
		dataMap.put("operand", operand);
		dataMap.put("name", name);
		dataMap.put("action", action);
		dataMap.put("header", header);
		dataMap.put("actionParam", actionParam);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.email.domain.TaskFilter.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.TaskFilter postDomainAccountAccountNameFilter(long priority, java.lang.String value, boolean active, java.lang.String operand, java.lang.String name, java.lang.String action, java.lang.String header, java.lang.String domain, java.lang.String accountName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + domain + "/account/" + accountName + "/filter";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("priority", priority);
		dataMap.put("value", value);
		dataMap.put("active", active);
		dataMap.put("operand", operand);
		dataMap.put("name", name);
		dataMap.put("action", action);
		dataMap.put("header", header);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.email.domain.TaskFilter.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.MailingList getDomainMailingListName(java.lang.String domain, java.lang.String name) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + domain + "/mailingList/" + name + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.email.domain.MailingList.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.TaskMl deleteDomainMailingListName(java.lang.String domain, java.lang.String name) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + domain + "/mailingList/" + name + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.email.domain.TaskMl.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.TaskFilter postDelegatedAccountEmailFilterNameChangePriority(long priority, java.lang.String email, java.lang.String name) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/delegatedAccount/" + email + "/filter/" + name + "/changePriority";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("priority", priority);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.email.domain.TaskFilter.class);
	}

	public void putDomainAccountAccountName(net.zyuiop.ovhapi.api.objects.email.domain.Account param0, java.lang.String domain, java.lang.String accountName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + domain + "/account/" + accountName + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public void postDomainMigrateDelegationV3toV6(java.lang.String domain) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + domain + "/migrateDelegationV3toV6";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public java.lang.String getDomainAccountAccountNameDelegation(java.lang.String domain, java.lang.String accountName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + domain + "/account/" + accountName + "/delegation";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.TaskMl deleteDomainMailingListNameSubscriberEmail(java.lang.String domain, java.lang.String name, java.lang.String email) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + domain + "/mailingList/" + name + "/subscriber/" + email + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.email.domain.TaskMl.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.Account getDomainAccountAccountName(java.lang.String domain, java.lang.String accountName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + domain + "/account/" + accountName + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.email.domain.Account.class);
	}

	public java.lang.String getDomainAccount(java.lang.String domain, java.lang.String accountName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + domain + "/account";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getDomainAccount(java.lang.String domain) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + domain + "/account";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.TaskFilter postDomainAccountAccountNameFilterNameChangePriority(long priority, java.lang.String domain, java.lang.String accountName, java.lang.String name) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + domain + "/account/" + accountName + "/filter/" + name + "/changePriority";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("priority", priority);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.email.domain.TaskFilter.class);
	}

	public long[] getDomainTaskMailinglist(java.lang.String domain, java.lang.String account) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + domain + "/task/mailinglist";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public long[] getDomainTaskMailinglist(java.lang.String domain) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + domain + "/task/mailinglist";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public java.lang.String getDelegatedAccountEmailFilter(java.lang.String email) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/delegatedAccount/" + email + "/filter";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public long[] getDomainAccountAccountNameFilterNameRule(java.lang.String domain, java.lang.String accountName, java.lang.String name) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + domain + "/account/" + accountName + "/filter/" + name + "/rule";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public java.lang.String getDomainAcl(java.lang.String domain) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + domain + "/acl";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.Delegation getDomainAccountAccountNameDelegationAccountId(java.lang.String domain, java.lang.String accountName, java.lang.String accountId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + domain + "/account/" + accountName + "/delegation/" + accountId + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.email.domain.Delegation.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.TaskPop deleteDomainAccountAccountName(java.lang.String domain, java.lang.String accountName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + domain + "/account/" + accountName + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.email.domain.TaskPop.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.Subscriber getDomainMailingListNameSubscriberEmail(java.lang.String domain, java.lang.String name, java.lang.String email) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + domain + "/mailingList/" + name + "/subscriber/" + email + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.email.domain.Subscriber.class);
	}

	public java.lang.String getDelegatedAccount(java.lang.String domain, java.lang.String accountName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/delegatedAccount";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getDelegatedAccount() throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/delegatedAccount";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getDomainMailingList(java.lang.String domain, java.lang.String name) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + domain + "/mailingList";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getDomainMailingList(java.lang.String domain) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + domain + "/mailingList";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.Filter getDelegatedAccountEmailFilterName(java.lang.String email, java.lang.String name) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/delegatedAccount/" + email + "/filter/" + name + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.email.domain.Filter.class);
	}

	public java.lang.String getDomainRedirection(java.lang.String domain, java.lang.String to, java.lang.String from) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + domain + "/redirection";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getDomainRedirection(java.lang.String domain) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + domain + "/redirection";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.domain.DomainUsageAccountStruct postDelegatedAccountEmailUsage(java.lang.String email) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/delegatedAccount/" + email + "/usage";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.domain.DomainUsageAccountStruct.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.TaskFilter postDomainAccountAccountNameFilterNameRule(java.lang.String value, java.lang.String operand, java.lang.String header, java.lang.String domain, java.lang.String accountName, java.lang.String name) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + domain + "/account/" + accountName + "/filter/" + name + "/rule";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("value", value);
		dataMap.put("operand", operand);
		dataMap.put("header", header);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.email.domain.TaskFilter.class);
	}

	public java.lang.String getDomainResponder(java.lang.String domain, java.lang.String account) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + domain + "/responder";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getDomainResponder(java.lang.String domain) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + domain + "/responder";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.domain.DomainSummary getDomainSummary(java.lang.String domain) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + domain + "/summary";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.domain.DomainSummary.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.TaskSpecialAccount getDomainTaskRedirectionId(java.lang.String domain, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + domain + "/task/redirection/" + id + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.email.domain.TaskSpecialAccount.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.TaskPop postDelegatedAccountEmailChangePassword(java.lang.String password, java.lang.String email) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/delegatedAccount/" + email + "/changePassword";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("password", password);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.email.domain.TaskPop.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.Moderator getDomainMailingListNameModeratorEmail(java.lang.String domain, java.lang.String name, java.lang.String email) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + domain + "/mailingList/" + name + "/moderator/" + email + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.email.domain.Moderator.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.Responder getDomainResponderAccount(java.lang.String domain, java.lang.String account) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + domain + "/responder/" + account + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.email.domain.Responder.class);
	}

	public net.zyuiop.ovhapi.api.objects.domain.DomainUsageAccountStruct getDomainAccountAccountNameUsage(java.lang.String domain, java.lang.String accountName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + domain + "/account/" + accountName + "/usage";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.domain.DomainUsageAccountStruct.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.Filter getDomainAccountAccountNameFilterName(java.lang.String domain, java.lang.String accountName, java.lang.String name) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + domain + "/account/" + accountName + "/filter/" + name + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.email.domain.Filter.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.AccountDelegated getDelegatedAccountEmail(java.lang.String email) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/delegatedAccount/" + email + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.email.domain.AccountDelegated.class);
	}

	public long[] getDomainTaskAccount(java.lang.String domain, java.lang.String name) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + domain + "/task/account";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public long[] getDomainTaskAccount(java.lang.String domain) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + domain + "/task/account";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.TaskMl postDomainMailingListNameSendListByEmail(java.lang.String email, java.lang.String domain, java.lang.String name) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + domain + "/mailingList/" + name + "/sendListByEmail";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("email", email);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.email.domain.TaskMl.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.TaskFilter postDelegatedAccountEmailFilterNameRule(java.lang.String value, java.lang.String operand, java.lang.String header, java.lang.String email, java.lang.String name) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/delegatedAccount/" + email + "/filter/" + name + "/rule";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("value", value);
		dataMap.put("operand", operand);
		dataMap.put("header", header);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.email.domain.TaskFilter.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.TaskMl postDomainMailingListNameChangeOptions(net.zyuiop.ovhapi.api.objects.domain.DomainMlOptionsStruct options, java.lang.String domain, java.lang.String name) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + domain + "/mailingList/" + name + "/changeOptions";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("options", options);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.email.domain.TaskMl.class);
	}

	public java.lang.String postDomainAccountAccountNameDelegation(java.lang.String accountId, java.lang.String domain, java.lang.String accountName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + domain + "/account/" + accountName + "/delegation";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("accountId", accountId);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getDomainMailingListNameModerator(java.lang.String domain, java.lang.String name, java.lang.String email) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + domain + "/mailingList/" + name + "/moderator";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getDomainMailingListNameModerator(java.lang.String domain, java.lang.String name) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + domain + "/mailingList/" + name + "/moderator";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getDomainDnsMXFilter(java.lang.String domain, java.lang.String subDomain) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + domain + "/dnsMXFilter";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getDomainDnsMXFilter(java.lang.String domain) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + domain + "/dnsMXFilter";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.RedirectionGlobal getDomainRedirectionId(java.lang.String domain, java.lang.String id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + domain + "/redirection/" + id + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.email.domain.RedirectionGlobal.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.TaskSpecialAccount getDomainTaskResponderId(java.lang.String domain, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + domain + "/task/responder/" + id + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.email.domain.TaskSpecialAccount.class);
	}

	public java.lang.String getEmailDomain() throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0//email/domain";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.TaskMl postDomainMailingList(net.zyuiop.ovhapi.api.objects.domain.DomainMlOptionsStruct options, java.lang.String language, java.lang.String name, java.lang.String ownerEmail, java.lang.String domain, java.lang.String replyTo) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + domain + "/mailingList";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("options", options);
		dataMap.put("language", language);
		dataMap.put("name", name);
		dataMap.put("ownerEmail", ownerEmail);
		dataMap.put("replyTo", replyTo);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.email.domain.TaskMl.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.TaskMl postDomainMailingList(net.zyuiop.ovhapi.api.objects.domain.DomainMlOptionsStruct options, java.lang.String language, java.lang.String name, java.lang.String ownerEmail, java.lang.String domain) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + domain + "/mailingList";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("options", options);
		dataMap.put("language", language);
		dataMap.put("name", name);
		dataMap.put("ownerEmail", ownerEmail);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.email.domain.TaskMl.class);
	}

	public java.lang.String getDomainAccountAccountNameFilter(java.lang.String domain, java.lang.String accountName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + domain + "/account/" + accountName + "/filter";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.Acl postDomainAcl(java.lang.String accountId, java.lang.String domain) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + domain + "/acl";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("accountId", accountId);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.email.domain.Acl.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.TaskFilter deleteDelegatedAccountEmailFilterNameRuleId(java.lang.String email, java.lang.String name, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/delegatedAccount/" + email + "/filter/" + name + "/rule/" + id + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.email.domain.TaskFilter.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.TaskPop postDomainAccountAccountNameChangePassword(java.lang.String password, java.lang.String domain, java.lang.String accountName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + domain + "/account/" + accountName + "/changePassword";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("password", password);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.email.domain.TaskPop.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.TaskSpecialAccount postDomainResponder(boolean copy, java.lang.String account, java.lang.String content, java.lang.String domain, java.lang.String copyTo, java.util.Date to, java.util.Date from) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + domain + "/responder";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("copy", copy);
		dataMap.put("account", account);
		dataMap.put("content", content);
		dataMap.put("copyTo", copyTo);
		dataMap.put("to", to);
		dataMap.put("from", from);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.email.domain.TaskSpecialAccount.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.TaskSpecialAccount postDomainResponder(boolean copy, java.lang.String account, java.lang.String content, java.lang.String domain) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + domain + "/responder";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("copy", copy);
		dataMap.put("account", account);
		dataMap.put("content", content);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.email.domain.TaskSpecialAccount.class);
	}

	public java.lang.String getDomainMailingListNameSubscriber(java.lang.String domain, java.lang.String name, java.lang.String email) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + domain + "/mailingList/" + name + "/subscriber";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getDomainMailingListNameSubscriber(java.lang.String domain, java.lang.String name) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + domain + "/mailingList/" + name + "/subscriber";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.TaskSpecialAccount deleteDomainRedirectionId(java.lang.String domain, java.lang.String id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + domain + "/redirection/" + id + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.email.domain.TaskSpecialAccount.class);
	}

	public void putDelegatedAccountEmail(net.zyuiop.ovhapi.api.objects.email.domain.AccountDelegated param0, java.lang.String email) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/delegatedAccount/" + email + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.TaskFilter deleteDomainAccountAccountNameFilterNameRuleId(java.lang.String domain, java.lang.String accountName, java.lang.String name, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + domain + "/account/" + accountName + "/filter/" + name + "/rule/" + id + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.email.domain.TaskFilter.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.TaskMl getDomainTaskMailinglistId(java.lang.String domain, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + domain + "/task/mailinglist/" + id + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.email.domain.TaskMl.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.TaskFilter getDomainTaskFilterId(java.lang.String domain, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + domain + "/task/filter/" + id + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.email.domain.TaskFilter.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.TaskPop getDomainTaskAccountId(java.lang.String domain, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + domain + "/task/account/" + id + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.email.domain.TaskPop.class);
	}

	public void putDomainMailingListName(net.zyuiop.ovhapi.api.objects.email.domain.MailingList param0, java.lang.String domain, java.lang.String name) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + domain + "/mailingList/" + name + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.Rule getDelegatedAccountEmailFilterNameRuleId(java.lang.String email, java.lang.String name, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/delegatedAccount/" + email + "/filter/" + name + "/rule/" + id + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.email.domain.Rule.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.Acl getDomainAclAccountId(java.lang.String domain, java.lang.String accountId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + domain + "/acl/" + accountId + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.email.domain.Acl.class);
	}

	public long[] getDomainTaskResponder(java.lang.String domain, java.lang.String account) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + domain + "/task/responder";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public long[] getDomainTaskResponder(java.lang.String domain) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + domain + "/task/responder";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public long[] getDomainTaskFilter(java.lang.String domain, java.lang.String account) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + domain + "/task/filter";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public long[] getDomainTaskFilter(java.lang.String domain) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + domain + "/task/filter";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.services.Service getDomainServiceInfos(java.lang.String domain) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + domain + "/serviceInfos";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.services.Service.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.TaskFilter postDelegatedAccountEmailFilter(long priority, java.lang.String value, boolean active, java.lang.String operand, java.lang.String name, java.lang.String action, java.lang.String header, java.lang.String email, java.lang.String actionParam) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/delegatedAccount/" + email + "/filter";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("priority", priority);
		dataMap.put("value", value);
		dataMap.put("active", active);
		dataMap.put("operand", operand);
		dataMap.put("name", name);
		dataMap.put("action", action);
		dataMap.put("header", header);
		dataMap.put("actionParam", actionParam);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.email.domain.TaskFilter.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.TaskFilter postDelegatedAccountEmailFilter(long priority, java.lang.String value, boolean active, java.lang.String operand, java.lang.String name, java.lang.String action, java.lang.String header, java.lang.String email) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/delegatedAccount/" + email + "/filter";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("priority", priority);
		dataMap.put("value", value);
		dataMap.put("active", active);
		dataMap.put("operand", operand);
		dataMap.put("name", name);
		dataMap.put("action", action);
		dataMap.put("header", header);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.email.domain.TaskFilter.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.TaskMl postDomainMailingListNameSubscriber(java.lang.String email, java.lang.String domain, java.lang.String name) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + domain + "/mailingList/" + name + "/subscriber";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("email", email);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.email.domain.TaskMl.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.TaskSpecialAccount deleteDomainResponderAccount(java.lang.String domain, java.lang.String account) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + domain + "/responder/" + account + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.email.domain.TaskSpecialAccount.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.TaskSpecialAccount postDomainRedirectionIdChangeRedirection(java.lang.String to, java.lang.String domain, java.lang.String id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + domain + "/redirection/" + id + "/changeRedirection";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("to", to);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.email.domain.TaskSpecialAccount.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.TaskFilter postDomainAccountAccountNameFilterNameChangeActivity(boolean activity, java.lang.String domain, java.lang.String accountName, java.lang.String name) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + domain + "/account/" + accountName + "/filter/" + name + "/changeActivity";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("activity", activity);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.email.domain.TaskFilter.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.TaskMl postDomainMailingListNameModerator(java.lang.String email, java.lang.String domain, java.lang.String name) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + domain + "/mailingList/" + name + "/moderator";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("email", email);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.email.domain.TaskMl.class);
	}

	public long[] getDomainTaskRedirection(java.lang.String domain, java.lang.String account) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + domain + "/task/redirection";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public long[] getDomainTaskRedirection(java.lang.String domain) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + domain + "/task/redirection";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public void putDomainResponderAccount(net.zyuiop.ovhapi.api.objects.email.domain.Responder param0, java.lang.String domain, java.lang.String account) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + domain + "/responder/" + account + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.TaskFilter deleteDomainAccountAccountNameFilterName(java.lang.String domain, java.lang.String accountName, java.lang.String name) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + domain + "/account/" + accountName + "/filter/" + name + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.email.domain.TaskFilter.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.TaskPop postDomainAccount(java.lang.String password, java.lang.String accountName, java.lang.String domain, java.lang.String description, long size) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + domain + "/account";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("password", password);
		dataMap.put("accountName", accountName);
		dataMap.put("description", description);
		dataMap.put("size", size);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.email.domain.TaskPop.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.TaskPop postDomainAccount(java.lang.String password, java.lang.String accountName, java.lang.String domain) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + domain + "/account";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("password", password);
		dataMap.put("accountName", accountName);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.email.domain.TaskPop.class);
	}

	public void postDomainChangeDnsMXFilter(java.lang.String mxFilter, java.lang.String domain, java.lang.String subDomain, java.lang.String customTarget) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + domain + "/changeDnsMXFilter";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("mxFilter", mxFilter);
		dataMap.put("subDomain", subDomain);
		dataMap.put("customTarget", customTarget);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public void postDomainChangeDnsMXFilter(java.lang.String mxFilter, java.lang.String domain) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + domain + "/changeDnsMXFilter";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("mxFilter", mxFilter);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.domain.DomainQuota getDomainQuota(java.lang.String domain) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + domain + "/quota";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.domain.DomainQuota.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.TaskFilter postDelegatedAccountEmailFilterNameChangeActivity(boolean activity, java.lang.String email, java.lang.String name) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/delegatedAccount/" + email + "/filter/" + name + "/changeActivity";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("activity", activity);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.email.domain.TaskFilter.class);
	}

	public void putDomainServiceInfos(net.zyuiop.ovhapi.api.objects.services.Service param0, java.lang.String domain) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + domain + "/serviceInfos";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public void postDelegatedAccountEmailUpdateUsage(java.lang.String email) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/delegatedAccount/" + email + "/updateUsage";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.TaskMl deleteDomainMailingListNameModeratorEmail(java.lang.String domain, java.lang.String name, java.lang.String email) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + domain + "/mailingList/" + name + "/moderator/" + email + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.email.domain.TaskMl.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.TaskSpecialAccount postDomainRedirection(java.lang.String to, boolean localCopy, java.lang.String from, java.lang.String domain) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + domain + "/redirection";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("to", to);
		dataMap.put("localCopy", localCopy);
		dataMap.put("from", from);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.email.domain.TaskSpecialAccount.class);
	}

	public void deleteDomainAclAccountId(java.lang.String domain, java.lang.String accountId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + domain + "/acl/" + accountId + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

}
