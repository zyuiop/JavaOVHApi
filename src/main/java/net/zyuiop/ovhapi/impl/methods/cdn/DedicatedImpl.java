package net.zyuiop.ovhapi.impl.methods.cdn;

import net.zyuiop.ovhapi.api.methods.cdn.Dedicated;
import com.google.gson.Gson;
import net.zyuiop.ovhapi.api.OVHApiMethod;
import java.util.HashMap;
import java.util.Map;
import net.zyuiop.ovhapi.impl.OVHRawCalls;
import java.net.URL;
public class DedicatedImpl implements Dedicated { 

	private final OVHRawCalls client;

	public DedicatedImpl(OVHRawCalls client) { 
		this.client = client;
	}


	/*
	* Method creation failed.
	* Involved method : DELETE > /cdn/dedicated/$serviceName/domains/$domain
	* Message : Missing identifier.
	*/


	public java.lang.String deleteServiceNameDomainsDomainBackendsIp(java.lang.String serviceName, java.lang.String domain, java.lang.String ip) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cdn/dedicated/" + serviceName + "/domains/" + domain + "/backends/" + ip + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public long[] getServiceNameDomainsDomainCacheRulesCacheRuleIdTasks(java.lang.String serviceName, java.lang.String domain, long cacheRuleId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cdn/dedicated/" + serviceName + "/domains/" + domain + "/cacheRules/" + cacheRuleId + "/tasks";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "domain=" + domain;
		__data += "cacheRuleId=" + cacheRuleId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /cdn/dedicated/$serviceName/domains/$domain/cacheRules/$cacheRuleId/flush
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /cdn/dedicated/$serviceName/domains
	* Message : Missing identifier.
	*/


	public java.lang.String[] getServiceNameDomains(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cdn/dedicated/" + serviceName + "/domains";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /cdn/dedicated/$serviceName/domains/$domain/cacheRules/$cacheRuleId/tasks/$taskId
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /cdn/dedicated/pops/$name
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /cdn/dedicated/$serviceName/domains/$domain
	* Message : Missing identifier.
	*/


	public long[] getServiceNameDomainsDomainCacheRules(java.lang.String serviceName, java.lang.String domain, java.lang.String fileMatch) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cdn/dedicated/" + serviceName + "/domains/" + domain + "/cacheRules";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "domain=" + domain;
		__data += "fileMatch=" + fileMatch;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getServiceNameDomainsDomainCacheRules(java.lang.String serviceName, java.lang.String domain) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cdn/dedicated/" + serviceName + "/domains/" + domain + "/cacheRules";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "domain=" + domain;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /cdn/dedicated/$serviceName/ssl/tasks/$taskId
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /cdn/dedicated/$serviceName/domains/$domain/cacheRules
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : DELETE > /cdn/dedicated/$serviceName/domains/$domain/cacheRules/$cacheRuleId
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /cdn/dedicated/$serviceName/ssl/update
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /cdn/dedicated/$serviceName/ssl/update
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /cdn/dedicated/$serviceName/domains/$domain
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /cdn/dedicated/$serviceName/domains/$domain/backends/$ip
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /cdn/dedicated/$serviceName/domains/$domain/backends
	* Message : Missing identifier.
	*/


	public long[] getServiceNameDomainsDomainTasks(java.lang.String serviceName, java.lang.String domain) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cdn/dedicated/" + serviceName + "/domains/" + domain + "/tasks";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "domain=" + domain;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /cdn/dedicated/$serviceName/ssl
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /cdn/dedicated/$serviceName/ssl
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /cdn/dedicated/$serviceName/domains/$domain/tasks/$taskId
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /cdn/dedicated/$serviceName/domains/$domain/cacheRules/$cacheRuleId
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /cdn/dedicated/$serviceName/domains/$domain/cacheRules/$cacheRuleId
	* Message : Missing identifier.
	*/


	public java.lang.String[] getPops() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cdn/dedicated/pops";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, false), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : PUT > /cdn/dedicated/$serviceName/serviceInfos
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /cdn/dedicated/$serviceName/domains/$domain/statistics
	* Message : Missing identifier.
	*/


	public java.lang.String[] getServiceNameDomainsDomainBackends(java.lang.String serviceName, java.lang.String domain) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cdn/dedicated/" + serviceName + "/domains/" + domain + "/backends";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "domain=" + domain;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /cdn/dedicated/$serviceName/ssl
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /cdn/dedicated/$serviceName/domains/$domain/flush
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /cdn/dedicated/$serviceName
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /cdn/dedicated/$serviceName/serviceInfos
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /cdn/dedicated/$serviceName/quota
	* Message : Missing identifier.
	*/


	public java.lang.String[] getCdnDedicated() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cdn/dedicated/cdn/dedicated";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : DELETE > /cdn/dedicated/$serviceName/ssl
	* Message : Missing identifier.
	*/


	public long[] getServiceNameSslTasks(java.lang.String serviceName, java.lang.String function, java.lang.String status) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cdn/dedicated/" + serviceName + "/ssl/tasks";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "function=" + function;
		__data += "status=" + status;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getServiceNameSslTasks(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cdn/dedicated/" + serviceName + "/ssl/tasks";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

}
