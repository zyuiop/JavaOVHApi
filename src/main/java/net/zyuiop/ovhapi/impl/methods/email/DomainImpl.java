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
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/dnsMXRecords";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public java.lang.String getDomainDnsMXRecords(java.lang.String domain) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/dnsMXRecords";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public void postDomainAccountAccountNameUpdateUsage(java.lang.String domain, java.lang.String accountName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/account/" + accountName + "/updateUsage";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public java.lang.String deleteDomainAccountAccountNameDelegationAccountId(java.lang.String domain, java.lang.String accountName, java.lang.String accountId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/account/" + accountName + "/delegation/" + accountId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.DomainService getDomain(java.lang.String domain) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.email.domain.DomainServiceImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.Rule getDomainAccountAccountNameFilterNameRuleId(java.lang.String domain, java.lang.String accountName, java.lang.String name, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/account/" + accountName + "/filter/" + name + "/rule/" + id + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.email.domain.RuleImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.TaskFilter deleteDelegatedAccountEmailFilterName(java.lang.String email, java.lang.String name) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/delegatedAccount/" + email + "/filter/" + name + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.email.domain.TaskFilterImpl.class);
	}

	public long[] getDelegatedAccountEmailFilterNameRule(java.lang.String email, java.lang.String name) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/delegatedAccount/" + email + "/filter/" + name + "/rule";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] postDomainChangeContact(java.lang.String domain, java.lang.String contactAdmin, java.lang.String contactTech, java.lang.String contactBilling) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/changeContact";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("contactAdmin", contactAdmin);
		__dataMap.put("contactTech", contactTech);
		__dataMap.put("contactBilling", contactBilling);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] postDomainChangeContact(java.lang.String domain) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/changeContact";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.TaskFilter postDomainAccountAccountNameFilter(long priority, java.lang.String value, boolean active, java.lang.String operand, java.lang.String name, java.lang.String action, java.lang.String header, java.lang.String domain, java.lang.String accountName, java.lang.String actionParam) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/account/" + accountName + "/filter";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("priority", priority);
		__dataMap.put("value", value);
		__dataMap.put("active", active);
		__dataMap.put("operand", operand);
		__dataMap.put("name", name);
		__dataMap.put("action", action);
		__dataMap.put("header", header);
		__dataMap.put("actionParam", actionParam);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.email.domain.TaskFilterImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.TaskFilter postDomainAccountAccountNameFilter(long priority, java.lang.String value, boolean active, java.lang.String operand, java.lang.String name, java.lang.String action, java.lang.String header, java.lang.String domain, java.lang.String accountName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/account/" + accountName + "/filter";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("priority", priority);
		__dataMap.put("value", value);
		__dataMap.put("active", active);
		__dataMap.put("operand", operand);
		__dataMap.put("name", name);
		__dataMap.put("action", action);
		__dataMap.put("header", header);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.email.domain.TaskFilterImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.MailingList getDomainMailingListName(java.lang.String domain, java.lang.String name) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/mailingList/" + name + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.email.domain.MailingListImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.TaskMl deleteDomainMailingListName(java.lang.String domain, java.lang.String name) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/mailingList/" + name + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.email.domain.TaskMlImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.TaskFilter postDelegatedAccountEmailFilterNameChangePriority(long priority, java.lang.String email, java.lang.String name) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/delegatedAccount/" + email + "/filter/" + name + "/changePriority";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("priority", priority);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.email.domain.TaskFilterImpl.class);
	}

	public void putDomainAccountAccountName(net.zyuiop.ovhapi.api.objects.email.domain.Account param0, java.lang.String domain, java.lang.String accountName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/account/" + accountName + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("null", null);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void postDomainMigrateDelegationV3toV6(java.lang.String domain) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/migrateDelegationV3toV6";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public java.lang.String getDomainAccountAccountNameDelegation(java.lang.String domain, java.lang.String accountName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/account/" + accountName + "/delegation";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.TaskMl deleteDomainMailingListNameSubscriberEmail(java.lang.String domain, java.lang.String name, java.lang.String email) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/mailingList/" + name + "/subscriber/" + email + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.email.domain.TaskMlImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.Account getDomainAccountAccountName(java.lang.String domain, java.lang.String accountName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/account/" + accountName + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.email.domain.AccountImpl.class);
	}

	public java.lang.String getDomainAccount(java.lang.String domain, java.lang.String accountName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/account";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public java.lang.String getDomainAccount(java.lang.String domain) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/account";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.TaskFilter postDomainAccountAccountNameFilterNameChangePriority(long priority, java.lang.String domain, java.lang.String accountName, java.lang.String name) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/account/" + accountName + "/filter/" + name + "/changePriority";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("priority", priority);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.email.domain.TaskFilterImpl.class);
	}

	public long[] getDomainTaskMailinglist(java.lang.String domain, java.lang.String account) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/task/mailinglist";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getDomainTaskMailinglist(java.lang.String domain) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/task/mailinglist";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public java.lang.String getDelegatedAccountEmailFilter(java.lang.String email) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/delegatedAccount/" + email + "/filter";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public long[] getDomainAccountAccountNameFilterNameRule(java.lang.String domain, java.lang.String accountName, java.lang.String name) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/account/" + accountName + "/filter/" + name + "/rule";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public java.lang.String getDomainAcl(java.lang.String domain) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/acl";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.Delegation getDomainAccountAccountNameDelegationAccountId(java.lang.String domain, java.lang.String accountName, java.lang.String accountId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/account/" + accountName + "/delegation/" + accountId + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.email.domain.DelegationImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.TaskPop deleteDomainAccountAccountName(java.lang.String domain, java.lang.String accountName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/account/" + accountName + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.email.domain.TaskPopImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.Subscriber getDomainMailingListNameSubscriberEmail(java.lang.String domain, java.lang.String name, java.lang.String email) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/mailingList/" + name + "/subscriber/" + email + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.email.domain.SubscriberImpl.class);
	}

	public java.lang.String getDelegatedAccount(java.lang.String domain, java.lang.String accountName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/delegatedAccount";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public java.lang.String getDelegatedAccount() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/delegatedAccount";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public java.lang.String getDomainMailingList(java.lang.String domain, java.lang.String name) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/mailingList";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public java.lang.String getDomainMailingList(java.lang.String domain) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/mailingList";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.Filter getDelegatedAccountEmailFilterName(java.lang.String email, java.lang.String name) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/delegatedAccount/" + email + "/filter/" + name + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.email.domain.FilterImpl.class);
	}

	public java.lang.String getDomainRedirection(java.lang.String domain, java.lang.String to, java.lang.String from) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/redirection";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public java.lang.String getDomainRedirection(java.lang.String domain) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/redirection";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.domain.DomainUsageAccountStruct postDelegatedAccountEmailUsage(java.lang.String email) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/delegatedAccount/" + email + "/usage";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.domain.DomainUsageAccountStructImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.TaskFilter postDomainAccountAccountNameFilterNameRule(java.lang.String value, java.lang.String operand, java.lang.String header, java.lang.String domain, java.lang.String accountName, java.lang.String name) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/account/" + accountName + "/filter/" + name + "/rule";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("value", value);
		__dataMap.put("operand", operand);
		__dataMap.put("header", header);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.email.domain.TaskFilterImpl.class);
	}

	public java.lang.String getDomainResponder(java.lang.String domain, java.lang.String account) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/responder";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public java.lang.String getDomainResponder(java.lang.String domain) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/responder";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.domain.DomainSummary getDomainSummary(java.lang.String domain) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/summary";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.domain.DomainSummaryImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.TaskSpecialAccount getDomainTaskRedirectionId(java.lang.String domain, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/task/redirection/" + id + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.email.domain.TaskSpecialAccountImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.TaskPop postDelegatedAccountEmailChangePassword(java.lang.String password, java.lang.String email) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/delegatedAccount/" + email + "/changePassword";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("password", password);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.email.domain.TaskPopImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.Moderator getDomainMailingListNameModeratorEmail(java.lang.String domain, java.lang.String name, java.lang.String email) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/mailingList/" + name + "/moderator/" + email + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.email.domain.ModeratorImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.Responder getDomainResponderAccount(java.lang.String domain, java.lang.String account) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/responder/" + account + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.email.domain.ResponderImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.domain.DomainUsageAccountStruct getDomainAccountAccountNameUsage(java.lang.String domain, java.lang.String accountName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/account/" + accountName + "/usage";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.domain.DomainUsageAccountStructImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.Filter getDomainAccountAccountNameFilterName(java.lang.String domain, java.lang.String accountName, java.lang.String name) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/account/" + accountName + "/filter/" + name + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.email.domain.FilterImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.AccountDelegated getDelegatedAccountEmail(java.lang.String email) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/delegatedAccount/" + email + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.email.domain.AccountDelegatedImpl.class);
	}

	public long[] getDomainTaskAccount(java.lang.String domain, java.lang.String name) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/task/account";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getDomainTaskAccount(java.lang.String domain) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/task/account";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.TaskMl postDomainMailingListNameSendListByEmail(java.lang.String email, java.lang.String domain, java.lang.String name) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/mailingList/" + name + "/sendListByEmail";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("email", email);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.email.domain.TaskMlImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.TaskFilter postDelegatedAccountEmailFilterNameRule(java.lang.String value, java.lang.String operand, java.lang.String header, java.lang.String email, java.lang.String name) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/delegatedAccount/" + email + "/filter/" + name + "/rule";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("value", value);
		__dataMap.put("operand", operand);
		__dataMap.put("header", header);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.email.domain.TaskFilterImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.TaskMl postDomainMailingListNameChangeOptions(net.zyuiop.ovhapi.api.objects.domain.DomainMlOptionsStruct options, java.lang.String domain, java.lang.String name) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/mailingList/" + name + "/changeOptions";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("options", options);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.email.domain.TaskMlImpl.class);
	}

	public java.lang.String postDomainAccountAccountNameDelegation(java.lang.String accountId, java.lang.String domain, java.lang.String accountName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/account/" + accountName + "/delegation";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("accountId", accountId);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public java.lang.String getDomainMailingListNameModerator(java.lang.String domain, java.lang.String name, java.lang.String email) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/mailingList/" + name + "/moderator";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public java.lang.String getDomainMailingListNameModerator(java.lang.String domain, java.lang.String name) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/mailingList/" + name + "/moderator";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public java.lang.String getDomainDnsMXFilter(java.lang.String domain, java.lang.String subDomain) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/dnsMXFilter";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public java.lang.String getDomainDnsMXFilter(java.lang.String domain) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/dnsMXFilter";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.RedirectionGlobal getDomainRedirectionId(java.lang.String domain, java.lang.String id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/redirection/" + id + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.email.domain.RedirectionGlobalImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.TaskSpecialAccount getDomainTaskResponderId(java.lang.String domain, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/task/responder/" + id + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.email.domain.TaskSpecialAccountImpl.class);
	}

	public java.lang.String getEmailDomain() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/email/domain";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.TaskMl postDomainMailingList(net.zyuiop.ovhapi.api.objects.domain.DomainMlOptionsStruct options, java.lang.String language, java.lang.String name, java.lang.String ownerEmail, java.lang.String domain, java.lang.String replyTo) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/mailingList";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("options", options);
		__dataMap.put("language", language);
		__dataMap.put("name", name);
		__dataMap.put("ownerEmail", ownerEmail);
		__dataMap.put("replyTo", replyTo);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.email.domain.TaskMlImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.TaskMl postDomainMailingList(net.zyuiop.ovhapi.api.objects.domain.DomainMlOptionsStruct options, java.lang.String language, java.lang.String name, java.lang.String ownerEmail, java.lang.String domain) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/mailingList";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("options", options);
		__dataMap.put("language", language);
		__dataMap.put("name", name);
		__dataMap.put("ownerEmail", ownerEmail);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.email.domain.TaskMlImpl.class);
	}

	public java.lang.String getDomainAccountAccountNameFilter(java.lang.String domain, java.lang.String accountName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/account/" + accountName + "/filter";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.Acl postDomainAcl(java.lang.String accountId, java.lang.String domain) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/acl";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("accountId", accountId);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.email.domain.AclImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.TaskFilter deleteDelegatedAccountEmailFilterNameRuleId(java.lang.String email, java.lang.String name, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/delegatedAccount/" + email + "/filter/" + name + "/rule/" + id + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.email.domain.TaskFilterImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.TaskPop postDomainAccountAccountNameChangePassword(java.lang.String password, java.lang.String domain, java.lang.String accountName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/account/" + accountName + "/changePassword";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("password", password);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.email.domain.TaskPopImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.TaskSpecialAccount postDomainResponder(boolean copy, java.lang.String account, java.lang.String content, java.lang.String domain, java.lang.String copyTo, java.util.Date to, java.util.Date from) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/responder";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("copy", copy);
		__dataMap.put("account", account);
		__dataMap.put("content", content);
		__dataMap.put("copyTo", copyTo);
		__dataMap.put("to", to);
		__dataMap.put("from", from);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.email.domain.TaskSpecialAccountImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.TaskSpecialAccount postDomainResponder(boolean copy, java.lang.String account, java.lang.String content, java.lang.String domain) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/responder";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("copy", copy);
		__dataMap.put("account", account);
		__dataMap.put("content", content);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.email.domain.TaskSpecialAccountImpl.class);
	}

	public java.lang.String getDomainMailingListNameSubscriber(java.lang.String domain, java.lang.String name, java.lang.String email) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/mailingList/" + name + "/subscriber";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public java.lang.String getDomainMailingListNameSubscriber(java.lang.String domain, java.lang.String name) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/mailingList/" + name + "/subscriber";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.TaskSpecialAccount deleteDomainRedirectionId(java.lang.String domain, java.lang.String id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/redirection/" + id + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.email.domain.TaskSpecialAccountImpl.class);
	}

	public void putDelegatedAccountEmail(net.zyuiop.ovhapi.api.objects.email.domain.AccountDelegated param0, java.lang.String email) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/delegatedAccount/" + email + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("null", null);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.TaskFilter deleteDomainAccountAccountNameFilterNameRuleId(java.lang.String domain, java.lang.String accountName, java.lang.String name, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/account/" + accountName + "/filter/" + name + "/rule/" + id + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.email.domain.TaskFilterImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.TaskMl getDomainTaskMailinglistId(java.lang.String domain, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/task/mailinglist/" + id + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.email.domain.TaskMlImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.TaskFilter getDomainTaskFilterId(java.lang.String domain, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/task/filter/" + id + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.email.domain.TaskFilterImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.TaskPop getDomainTaskAccountId(java.lang.String domain, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/task/account/" + id + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.email.domain.TaskPopImpl.class);
	}

	public void putDomainMailingListName(net.zyuiop.ovhapi.api.objects.email.domain.MailingList param0, java.lang.String domain, java.lang.String name) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/mailingList/" + name + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("null", null);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.Rule getDelegatedAccountEmailFilterNameRuleId(java.lang.String email, java.lang.String name, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/delegatedAccount/" + email + "/filter/" + name + "/rule/" + id + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.email.domain.RuleImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.Acl getDomainAclAccountId(java.lang.String domain, java.lang.String accountId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/acl/" + accountId + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.email.domain.AclImpl.class);
	}

	public long[] getDomainTaskResponder(java.lang.String domain, java.lang.String account) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/task/responder";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getDomainTaskResponder(java.lang.String domain) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/task/responder";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getDomainTaskFilter(java.lang.String domain, java.lang.String account) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/task/filter";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getDomainTaskFilter(java.lang.String domain) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/task/filter";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.services.Service getDomainServiceInfos(java.lang.String domain) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/serviceInfos";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.services.ServiceImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.TaskFilter postDelegatedAccountEmailFilter(long priority, java.lang.String value, boolean active, java.lang.String operand, java.lang.String name, java.lang.String action, java.lang.String header, java.lang.String email, java.lang.String actionParam) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/delegatedAccount/" + email + "/filter";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("priority", priority);
		__dataMap.put("value", value);
		__dataMap.put("active", active);
		__dataMap.put("operand", operand);
		__dataMap.put("name", name);
		__dataMap.put("action", action);
		__dataMap.put("header", header);
		__dataMap.put("actionParam", actionParam);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.email.domain.TaskFilterImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.TaskFilter postDelegatedAccountEmailFilter(long priority, java.lang.String value, boolean active, java.lang.String operand, java.lang.String name, java.lang.String action, java.lang.String header, java.lang.String email) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/delegatedAccount/" + email + "/filter";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("priority", priority);
		__dataMap.put("value", value);
		__dataMap.put("active", active);
		__dataMap.put("operand", operand);
		__dataMap.put("name", name);
		__dataMap.put("action", action);
		__dataMap.put("header", header);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.email.domain.TaskFilterImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.TaskMl postDomainMailingListNameSubscriber(java.lang.String email, java.lang.String domain, java.lang.String name) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/mailingList/" + name + "/subscriber";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("email", email);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.email.domain.TaskMlImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.TaskSpecialAccount deleteDomainResponderAccount(java.lang.String domain, java.lang.String account) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/responder/" + account + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.email.domain.TaskSpecialAccountImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.TaskSpecialAccount postDomainRedirectionIdChangeRedirection(java.lang.String to, java.lang.String domain, java.lang.String id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/redirection/" + id + "/changeRedirection";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("to", to);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.email.domain.TaskSpecialAccountImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.TaskFilter postDomainAccountAccountNameFilterNameChangeActivity(boolean activity, java.lang.String domain, java.lang.String accountName, java.lang.String name) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/account/" + accountName + "/filter/" + name + "/changeActivity";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("activity", activity);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.email.domain.TaskFilterImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.TaskMl postDomainMailingListNameModerator(java.lang.String email, java.lang.String domain, java.lang.String name) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/mailingList/" + name + "/moderator";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("email", email);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.email.domain.TaskMlImpl.class);
	}

	public long[] getDomainTaskRedirection(java.lang.String domain, java.lang.String account) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/task/redirection";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getDomainTaskRedirection(java.lang.String domain) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/task/redirection";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public void putDomainResponderAccount(net.zyuiop.ovhapi.api.objects.email.domain.Responder param0, java.lang.String domain, java.lang.String account) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/responder/" + account + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("null", null);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.TaskFilter deleteDomainAccountAccountNameFilterName(java.lang.String domain, java.lang.String accountName, java.lang.String name) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/account/" + accountName + "/filter/" + name + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.email.domain.TaskFilterImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.TaskPop postDomainAccount(java.lang.String password, java.lang.String accountName, java.lang.String domain, java.lang.String description, long size) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/account";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("password", password);
		__dataMap.put("accountName", accountName);
		__dataMap.put("description", description);
		__dataMap.put("size", size);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.email.domain.TaskPopImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.TaskPop postDomainAccount(java.lang.String password, java.lang.String accountName, java.lang.String domain) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/account";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("password", password);
		__dataMap.put("accountName", accountName);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.email.domain.TaskPopImpl.class);
	}

	public void postDomainChangeDnsMXFilter(java.lang.String mxFilter, java.lang.String domain, java.lang.String subDomain, java.lang.String customTarget) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/changeDnsMXFilter";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("mxFilter", mxFilter);
		__dataMap.put("subDomain", subDomain);
		__dataMap.put("customTarget", customTarget);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void postDomainChangeDnsMXFilter(java.lang.String mxFilter, java.lang.String domain) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/changeDnsMXFilter";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("mxFilter", mxFilter);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.domain.DomainQuota getDomainQuota(java.lang.String domain) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/quota";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.domain.DomainQuotaImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.TaskFilter postDelegatedAccountEmailFilterNameChangeActivity(boolean activity, java.lang.String email, java.lang.String name) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/delegatedAccount/" + email + "/filter/" + name + "/changeActivity";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("activity", activity);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.email.domain.TaskFilterImpl.class);
	}

	public void putDomainServiceInfos(net.zyuiop.ovhapi.api.objects.services.Service param0, java.lang.String domain) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/serviceInfos";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("null", null);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void postDelegatedAccountEmailUpdateUsage(java.lang.String email) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/delegatedAccount/" + email + "/updateUsage";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.TaskMl deleteDomainMailingListNameModeratorEmail(java.lang.String domain, java.lang.String name, java.lang.String email) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/mailingList/" + name + "/moderator/" + email + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.email.domain.TaskMlImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.email.domain.TaskSpecialAccount postDomainRedirection(java.lang.String to, boolean localCopy, java.lang.String from, java.lang.String domain) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/redirection";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("to", to);
		__dataMap.put("localCopy", localCopy);
		__dataMap.put("from", from);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.email.domain.TaskSpecialAccountImpl.class);
	}

	public void deleteDomainAclAccountId(java.lang.String domain, java.lang.String accountId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/acl/" + accountId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

}
