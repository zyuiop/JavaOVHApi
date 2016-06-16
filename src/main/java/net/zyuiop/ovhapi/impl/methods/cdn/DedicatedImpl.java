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

	public net.zyuiop.ovhapi.api.objects.cdnanycast.Task getServiceNameDomainsDomainTasksTaskId(java.lang.String serviceName, java.lang.String domain, long taskId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cdn/dedicated/" + serviceName + "/domains/" + domain + "/tasks/" + taskId + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.cdnanycast.TaskImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.cdnanycast.Task deleteServiceNameDomainsDomainCacheRulesCacheRuleId(java.lang.String serviceName, java.lang.String domain, long cacheRuleId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cdn/dedicated/" + serviceName + "/domains/" + domain + "/cacheRules/" + cacheRuleId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.cdnanycast.TaskImpl.class);
	}

	public long[] getServiceNameDomainsDomainTasks(java.lang.String serviceName, java.lang.String domain) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cdn/dedicated/" + serviceName + "/domains/" + domain + "/tasks";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.cdnanycast.Anycast getServiceName(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cdn/dedicated/" + serviceName + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.cdnanycast.AnycastImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.cdnanycast.CacheRule getServiceNameDomainsDomainCacheRulesCacheRuleId(java.lang.String serviceName, java.lang.String domain, long cacheRuleId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cdn/dedicated/" + serviceName + "/domains/" + domain + "/cacheRules/" + cacheRuleId + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.cdnanycast.CacheRuleImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.cdnanycast.Domain getServiceNameDomainsDomain(java.lang.String serviceName, java.lang.String domain) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cdn/dedicated/" + serviceName + "/domains/" + domain + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.cdnanycast.DomainImpl.class);
	}

	public long[] getServiceNameDomainsDomainCacheRules(java.lang.String serviceName, java.lang.String domain, java.lang.String fileMatch) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cdn/dedicated/" + serviceName + "/domains/" + domain + "/cacheRules";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getServiceNameDomainsDomainCacheRules(java.lang.String serviceName, java.lang.String domain) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cdn/dedicated/" + serviceName + "/domains/" + domain + "/cacheRules";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.cdnanycast.Task getServiceNameSslTasksTaskId(java.lang.String serviceName, long taskId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cdn/dedicated/" + serviceName + "/ssl/tasks/" + taskId + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.cdnanycast.TaskImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.cdnanycast.Domain postServiceNameDomains(java.lang.String domain, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cdn/dedicated/" + serviceName + "/domains";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("domain", domain);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.cdnanycast.DomainImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.cdnanycast.StatsDataType getServiceNameDomainsDomainStatistics(java.lang.String period, java.lang.String value, java.lang.String type, java.lang.String serviceName, java.lang.String domain) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cdn/dedicated/" + serviceName + "/domains/" + domain + "/statistics";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.cdnanycast.StatsDataTypeImpl.class);
	}

	public long[] getServiceNameDomainsDomainCacheRulesCacheRuleIdTasks(java.lang.String serviceName, java.lang.String domain, long cacheRuleId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cdn/dedicated/" + serviceName + "/domains/" + domain + "/cacheRules/" + cacheRuleId + "/tasks";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public void putServiceNameDomainsDomain(net.zyuiop.ovhapi.api.objects.cdnanycast.Domain param0, java.lang.String serviceName, java.lang.String domain) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cdn/dedicated/" + serviceName + "/domains/" + domain + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("null", null);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public java.lang.String deleteServiceNameDomainsDomainBackendsIp(java.lang.String serviceName, java.lang.String domain, java.lang.String ip) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cdn/dedicated/" + serviceName + "/domains/" + domain + "/backends/" + ip + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.cdnanycast.Ssl postServiceNameSsl(java.lang.String certificate, java.lang.String name, java.lang.String key, java.lang.String serviceName, java.lang.String chain) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cdn/dedicated/" + serviceName + "/ssl";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("certificate", certificate);
		__dataMap.put("name", name);
		__dataMap.put("key", key);
		__dataMap.put("chain", chain);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.cdnanycast.SslImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.cdnanycast.Ssl postServiceNameSsl(java.lang.String certificate, java.lang.String name, java.lang.String key, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cdn/dedicated/" + serviceName + "/ssl";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("certificate", certificate);
		__dataMap.put("name", name);
		__dataMap.put("key", key);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.cdnanycast.SslImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.cdnanycast.Pop getPopsName(java.lang.String name) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cdn/dedicated/pops/" + name + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, false), net.zyuiop.ovhapi.impl.objects.cdnanycast.PopImpl.class);
	}

	public void putServiceNameServiceInfos(net.zyuiop.ovhapi.api.objects.services.Service param0, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cdn/dedicated/" + serviceName + "/serviceInfos";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("null", null);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.cdnanycast.Ssl getServiceNameSsl(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cdn/dedicated/" + serviceName + "/ssl";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.cdnanycast.SslImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.cdnanycast.Task deleteServiceNameSsl(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cdn/dedicated/" + serviceName + "/ssl";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.cdnanycast.TaskImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.cdnanycast.Task postServiceNameDomainsDomainFlush(java.lang.String serviceName, java.lang.String domain) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cdn/dedicated/" + serviceName + "/domains/" + domain + "/flush";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.cdnanycast.TaskImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.cdnanycast.Task postServiceNameDomainsDomainCacheRulesCacheRuleIdFlush(java.lang.String serviceName, java.lang.String domain, long cacheRuleId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cdn/dedicated/" + serviceName + "/domains/" + domain + "/cacheRules/" + cacheRuleId + "/flush";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.cdnanycast.TaskImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.cdnanycast.CacheRule postServiceNameDomainsDomainCacheRules(java.lang.String cacheType, long ttl, java.lang.String fileMatch, java.lang.String fileType, java.lang.String serviceName, java.lang.String domain) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cdn/dedicated/" + serviceName + "/domains/" + domain + "/cacheRules";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("cacheType", cacheType);
		__dataMap.put("ttl", ttl);
		__dataMap.put("fileMatch", fileMatch);
		__dataMap.put("fileType", fileType);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.cdnanycast.CacheRuleImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.cdnanycast.Task getServiceNameDomainsDomainCacheRulesCacheRuleIdTasksTaskId(java.lang.String serviceName, java.lang.String domain, long cacheRuleId, long taskId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cdn/dedicated/" + serviceName + "/domains/" + domain + "/cacheRules/" + cacheRuleId + "/tasks/" + taskId + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.cdnanycast.TaskImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.cdnanycast.Task postServiceNameSslUpdate(java.lang.String certificate, java.lang.String key, java.lang.String serviceName, java.lang.String chain) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cdn/dedicated/" + serviceName + "/ssl/update";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("certificate", certificate);
		__dataMap.put("key", key);
		__dataMap.put("chain", chain);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.cdnanycast.TaskImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.cdnanycast.Task postServiceNameSslUpdate(java.lang.String certificate, java.lang.String key, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cdn/dedicated/" + serviceName + "/ssl/update";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("certificate", certificate);
		__dataMap.put("key", key);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.cdnanycast.TaskImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.cdnanycast.Task deleteServiceNameDomainsDomain(java.lang.String serviceName, java.lang.String domain) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cdn/dedicated/" + serviceName + "/domains/" + domain + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.cdnanycast.TaskImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.cdnanycast.StatsDataType getServiceNameQuota(java.lang.String period, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cdn/dedicated/" + serviceName + "/quota";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.cdnanycast.StatsDataTypeImpl.class);
	}

	public java.lang.String getServiceNameDomains(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cdn/dedicated/" + serviceName + "/domains";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public java.lang.String getCdnDedicated() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cdn/dedicated/cdn/dedicated";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public java.lang.String getPops() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cdn/dedicated/pops";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, false), java.lang.String.class);
	}

	public java.lang.String getServiceNameDomainsDomainBackends(java.lang.String serviceName, java.lang.String domain) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cdn/dedicated/" + serviceName + "/domains/" + domain + "/backends";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.cdnanycast.Backend postServiceNameDomainsDomainBackends(java.lang.String ip, java.lang.String serviceName, java.lang.String domain) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cdn/dedicated/" + serviceName + "/domains/" + domain + "/backends";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("ip", ip);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.cdnanycast.BackendImpl.class);
	}

	public void putServiceNameDomainsDomainCacheRulesCacheRuleId(net.zyuiop.ovhapi.api.objects.cdnanycast.CacheRule param0, java.lang.String serviceName, java.lang.String domain, long cacheRuleId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cdn/dedicated/" + serviceName + "/domains/" + domain + "/cacheRules/" + cacheRuleId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("null", null);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public long[] getServiceNameSslTasks(java.lang.String serviceName, java.lang.String function, java.lang.String status) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cdn/dedicated/" + serviceName + "/ssl/tasks";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getServiceNameSslTasks(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cdn/dedicated/" + serviceName + "/ssl/tasks";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.services.Service getServiceNameServiceInfos(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cdn/dedicated/" + serviceName + "/serviceInfos";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.services.ServiceImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.cdnanycast.Backend getServiceNameDomainsDomainBackendsIp(java.lang.String serviceName, java.lang.String domain, java.lang.String ip) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cdn/dedicated/" + serviceName + "/domains/" + domain + "/backends/" + ip + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.cdnanycast.BackendImpl.class);
	}

}
