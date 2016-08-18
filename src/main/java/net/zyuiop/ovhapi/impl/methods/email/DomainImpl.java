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


	/*
	* Method creation failed.
	* Involved method : GET > /email/domain/$domain
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /email/domain/$domain/account/$accountName/filter/$name
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /email/domain/$domain/mailingList/$name/moderator
	* Message : Missing identifier.
	*/


	public long[] getDomainTaskResponder(java.lang.String domain, java.lang.String account) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/task/responder";
		String __data = "?";
		__data += "domain=" + domain;
		__data += "account=" + account;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getDomainTaskResponder(java.lang.String domain) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/task/responder";
		String __data = "?";
		__data += "domain=" + domain;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /email/domain/$domain/mailingList/$name/moderator/$email
	* Message : Missing identifier.
	*/


	public void postDomainMigrateDelegationV3toV6(java.lang.String domain) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/migrateDelegationV3toV6";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /email/domain/$domain/redirection
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /email/domain/$domain/account
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /email/domain/$domain/account
	* Message : Missing identifier.
	*/


	public java.lang.String getDomainAccountAccountNameDelegation(java.lang.String domain, java.lang.String accountName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/account/" + accountName + "/delegation";
		String __data = "?";
		__data += "domain=" + domain;
		__data += "accountName=" + accountName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /email/domain/$domain/mailingList/$name/subscriber/$email
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /email/domain/$domain/acl/$accountId
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /email/domain/delegatedAccount/$email/filter/$name/rule/$id
	* Message : Missing identifier.
	*/


	public long[] getDomainTaskAccount(java.lang.String domain, java.lang.String name) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/task/account";
		String __data = "?";
		__data += "domain=" + domain;
		__data += "name=" + name;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getDomainTaskAccount(java.lang.String domain) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/task/account";
		String __data = "?";
		__data += "domain=" + domain;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /email/domain/$domain/summary
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /email/domain/$domain/account/$accountName
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /email/domain/delegatedAccount/$email/filter/$name
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /email/domain/delegatedAccount/$email/filter/$name/changePriority
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /email/domain/delegatedAccount/$email/usage
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /email/domain/$domain/account/$accountName
	* Message : Missing identifier.
	*/


	public long[] getDomainAccountAccountNameFilterNameRule(java.lang.String domain, java.lang.String accountName, java.lang.String name) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/account/" + accountName + "/filter/" + name + "/rule";
		String __data = "?";
		__data += "domain=" + domain;
		__data += "accountName=" + accountName;
		__data += "name=" + name;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /email/domain/$domain/task/mailinglist/$id
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /email/domain/$domain/quota
	* Message : Missing identifier.
	*/


	public java.lang.String[] getDomainResponder(java.lang.String domain, java.lang.String account) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/responder";
		String __data = "?";
		__data += "domain=" + domain;
		__data += "account=" + account;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getDomainResponder(java.lang.String domain) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/responder";
		String __data = "?";
		__data += "domain=" + domain;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /email/domain/delegatedAccount/$email/filter
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /email/domain/delegatedAccount/$email/filter
	* Message : Missing identifier.
	*/


	public java.lang.String[] getDomainAccountAccountNameFilter(java.lang.String domain, java.lang.String accountName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/account/" + accountName + "/filter";
		String __data = "?";
		__data += "domain=" + domain;
		__data += "accountName=" + accountName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public long[] getDelegatedAccountEmailFilterNameRule(java.lang.String email, java.lang.String name) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/delegatedAccount/" + email + "/filter/" + name + "/rule";
		String __data = "?";
		__data += "email=" + email;
		__data += "name=" + name;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public java.lang.String getDomainAcl(java.lang.String domain) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/acl";
		String __data = "?";
		__data += "domain=" + domain;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /email/domain/delegatedAccount/$email/filter/$name/changeActivity
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /email/domain/$domain/acl
	* Message : Missing identifier.
	*/


	public void postDelegatedAccountEmailUpdateUsage(java.lang.String email) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/delegatedAccount/" + email + "/updateUsage";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : DELETE > /email/domain/$domain/account/$accountName/filter/$name/rule/$id
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /email/domain/$domain/mailingList/$name/subscriber
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /email/domain/$domain/account/$accountName/filter/$name/rule
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : DELETE > /email/domain/$domain/mailingList/$name/subscriber/$email
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : DELETE > /email/domain/$domain/mailingList/$name
	* Message : Missing identifier.
	*/


	public java.lang.String[] getDomainDnsMXRecords(java.lang.String domain, java.lang.String subDomain) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/dnsMXRecords";
		String __data = "?";
		__data += "domain=" + domain;
		__data += "subDomain=" + subDomain;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getDomainDnsMXRecords(java.lang.String domain) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/dnsMXRecords";
		String __data = "?";
		__data += "domain=" + domain;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /email/domain/$domain/account/$accountName/filter/$name/changeActivity
	* Message : Missing identifier.
	*/


	public java.lang.String[] getDelegatedAccountEmailFilter(java.lang.String email) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/delegatedAccount/" + email + "/filter";
		String __data = "?";
		__data += "email=" + email;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /email/domain/$domain/account/$accountName/delegation/$accountId
	* Message : Missing identifier.
	*/


	public long[] getDomainTaskRedirection(java.lang.String domain, java.lang.String account) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/task/redirection";
		String __data = "?";
		__data += "domain=" + domain;
		__data += "account=" + account;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getDomainTaskRedirection(java.lang.String domain) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/task/redirection";
		String __data = "?";
		__data += "domain=" + domain;
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

	public java.lang.String[] getEmailDomain() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/email/domain";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getDomainRedirection(java.lang.String domain, java.lang.String to, java.lang.String from) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/redirection";
		String __data = "?";
		__data += "domain=" + domain;
		__data += "to=" + to;
		__data += "from=" + from;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getDomainRedirection(java.lang.String domain) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/redirection";
		String __data = "?";
		__data += "domain=" + domain;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /email/domain/$domain/mailingList/$name/changeOptions
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /email/domain/$domain/account/$accountName/changePassword
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /email/domain/$domain/task/redirection/$id
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /email/domain/$domain/responder
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /email/domain/$domain/responder
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : DELETE > /email/domain/$domain/account/$accountName
	* Message : Missing identifier.
	*/


	public java.lang.String getDomainDnsMXFilter(java.lang.String domain, java.lang.String subDomain) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/dnsMXFilter";
		String __data = "?";
		__data += "domain=" + domain;
		__data += "subDomain=" + subDomain;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public java.lang.String getDomainDnsMXFilter(java.lang.String domain) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/dnsMXFilter";
		String __data = "?";
		__data += "domain=" + domain;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /email/domain/$domain/account/$accountName/filter/$name/changePriority
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /email/domain/$domain/responder/$account
	* Message : Missing identifier.
	*/


	public java.lang.String[] getDomainAccount(java.lang.String domain, java.lang.String accountName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/account";
		String __data = "?";
		__data += "domain=" + domain;
		__data += "accountName=" + accountName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getDomainAccount(java.lang.String domain) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/account";
		String __data = "?";
		__data += "domain=" + domain;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public long[] getDomainTaskFilter(java.lang.String domain, java.lang.String account) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/task/filter";
		String __data = "?";
		__data += "domain=" + domain;
		__data += "account=" + account;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getDomainTaskFilter(java.lang.String domain) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/task/filter";
		String __data = "?";
		__data += "domain=" + domain;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : DELETE > /email/domain/$domain/responder/$account
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /email/domain/$domain/task/responder/$id
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /email/domain/$domain/redirection/$id/changeRedirection
	* Message : Missing identifier.
	*/


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


	/*
	* Method creation failed.
	* Involved method : POST > /email/domain/$domain/mailingList
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /email/domain/$domain/mailingList
	* Message : Missing identifier.
	*/


	public java.lang.String[] getDomainMailingListNameModerator(java.lang.String domain, java.lang.String name, java.lang.String email) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/mailingList/" + name + "/moderator";
		String __data = "?";
		__data += "domain=" + domain;
		__data += "name=" + name;
		__data += "email=" + email;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getDomainMailingListNameModerator(java.lang.String domain, java.lang.String name) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/mailingList/" + name + "/moderator";
		String __data = "?";
		__data += "domain=" + domain;
		__data += "name=" + name;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : DELETE > /email/domain/$domain/redirection/$id
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /email/domain/$domain/serviceInfos
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /email/domain/$domain/redirection/$id
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /email/domain/$domain/account/$accountName/usage
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /email/domain/$domain/task/filter/$id
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : DELETE > /email/domain/$domain/account/$accountName/filter/$name
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /email/domain/$domain/mailingList/$name
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : DELETE > /email/domain/delegatedAccount/$email/filter/$name
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /email/domain/$domain/mailingList/$name
	* Message : Missing identifier.
	*/


	public void postDomainAccountAccountNameUpdateUsage(java.lang.String domain, java.lang.String accountName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/account/" + accountName + "/updateUsage";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : PUT > /email/domain/delegatedAccount/$email
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /email/domain/delegatedAccount/$email/filter/$name/rule
	* Message : Missing identifier.
	*/


	public java.lang.String deleteDomainAccountAccountNameDelegationAccountId(java.lang.String domain, java.lang.String accountName, java.lang.String accountId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/account/" + accountName + "/delegation/" + accountId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /email/domain/$domain/task/account/$id
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /email/domain/$domain/responder/$account
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /email/domain/$domain/mailingList/$name/sendListByEmail
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /email/domain/$domain/serviceInfos
	* Message : Missing identifier.
	*/


	public long[] getDomainTaskMailinglist(java.lang.String domain, java.lang.String account) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/task/mailinglist";
		String __data = "?";
		__data += "domain=" + domain;
		__data += "account=" + account;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getDomainTaskMailinglist(java.lang.String domain) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/task/mailinglist";
		String __data = "?";
		__data += "domain=" + domain;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /email/domain/$domain/account/$accountName/filter/$name/rule/$id
	* Message : Missing identifier.
	*/


	public java.lang.String[] getDomainMailingListNameSubscriber(java.lang.String domain, java.lang.String name, java.lang.String email) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/mailingList/" + name + "/subscriber";
		String __data = "?";
		__data += "domain=" + domain;
		__data += "name=" + name;
		__data += "email=" + email;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getDomainMailingListNameSubscriber(java.lang.String domain, java.lang.String name) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/mailingList/" + name + "/subscriber";
		String __data = "?";
		__data += "domain=" + domain;
		__data += "name=" + name;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getDomainMailingList(java.lang.String domain, java.lang.String name) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/mailingList";
		String __data = "?";
		__data += "domain=" + domain;
		__data += "name=" + name;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getDomainMailingList(java.lang.String domain) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/mailingList";
		String __data = "?";
		__data += "domain=" + domain;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : DELETE > /email/domain/delegatedAccount/$email/filter/$name/rule/$id
	* Message : Missing identifier.
	*/


	public java.lang.String postDomainAccountAccountNameDelegation(java.lang.String accountId, java.lang.String domain, java.lang.String accountName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/account/" + accountName + "/delegation";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("accountId", accountId);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public void deleteDomainAclAccountId(java.lang.String domain, java.lang.String accountId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/" + domain + "/acl/" + accountId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /email/domain/delegatedAccount/$email
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /email/domain/$domain/account/$accountName/filter
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /email/domain/$domain/account/$accountName/filter
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : DELETE > /email/domain/$domain/mailingList/$name/moderator/$email
	* Message : Missing identifier.
	*/


	public java.lang.String[] getDelegatedAccount(java.lang.String domain, java.lang.String accountName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/delegatedAccount";
		String __data = "?";
		__data += "domain=" + domain;
		__data += "accountName=" + accountName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getDelegatedAccount() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/email/domain/delegatedAccount";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /email/domain/delegatedAccount/$email/changePassword
	* Message : Missing identifier.
	*/


}
