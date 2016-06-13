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
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/domains/" + domain + "/tasks/" + taskId + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.cdnanycast.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.cdnanycast.Task deleteServiceNameDomainsDomainCacheRulesCacheRuleId(java.lang.String serviceName, java.lang.String domain, long cacheRuleId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/domains/" + domain + "/cacheRules/" + cacheRuleId + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.cdnanycast.Task.class);
	}

	public long[] getServiceNameDomainsDomainTasks(java.lang.String serviceName, java.lang.String domain) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/domains/" + domain + "/tasks";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.cdnanycast.Anycast getServiceName(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.cdnanycast.Anycast.class);
	}

	public net.zyuiop.ovhapi.api.objects.cdnanycast.CacheRule getServiceNameDomainsDomainCacheRulesCacheRuleId(java.lang.String serviceName, java.lang.String domain, long cacheRuleId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/domains/" + domain + "/cacheRules/" + cacheRuleId + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.cdnanycast.CacheRule.class);
	}

	public net.zyuiop.ovhapi.api.objects.cdnanycast.Domain getServiceNameDomainsDomain(java.lang.String serviceName, java.lang.String domain) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/domains/" + domain + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.cdnanycast.Domain.class);
	}

	public long[] getServiceNameDomainsDomainCacheRules(java.lang.String serviceName, java.lang.String domain, java.lang.String fileMatch) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/domains/" + domain + "/cacheRules";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public long[] getServiceNameDomainsDomainCacheRules(java.lang.String serviceName, java.lang.String domain) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/domains/" + domain + "/cacheRules";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.cdnanycast.Task getServiceNameSslTasksTaskId(java.lang.String serviceName, long taskId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/ssl/tasks/" + taskId + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.cdnanycast.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.cdnanycast.Domain postServiceNameDomains(java.lang.String domain, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/domains";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("domain", domain);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.cdnanycast.Domain.class);
	}

	public net.zyuiop.ovhapi.api.objects.cdnanycast.StatsDataType getServiceNameDomainsDomainStatistics(java.lang.String period, java.lang.String value, java.lang.String type, java.lang.String serviceName, java.lang.String domain) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/domains/" + domain + "/statistics";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.cdnanycast.StatsDataType.class);
	}

	public long[] getServiceNameDomainsDomainCacheRulesCacheRuleIdTasks(java.lang.String serviceName, java.lang.String domain, long cacheRuleId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/domains/" + domain + "/cacheRules/" + cacheRuleId + "/tasks";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public void putServiceNameDomainsDomain(net.zyuiop.ovhapi.api.objects.cdnanycast.Domain param0, java.lang.String serviceName, java.lang.String domain) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/domains/" + domain + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public java.lang.String deleteServiceNameDomainsDomainBackendsIp(java.lang.String serviceName, java.lang.String domain, java.lang.String ip) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/domains/" + domain + "/backends/" + ip + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.cdnanycast.Ssl postServiceNameSsl(java.lang.String certificate, java.lang.String name, java.lang.String key, java.lang.String serviceName, java.lang.String chain) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/ssl";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("certificate", certificate);
		dataMap.put("name", name);
		dataMap.put("key", key);
		dataMap.put("chain", chain);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.cdnanycast.Ssl.class);
	}

	public net.zyuiop.ovhapi.api.objects.cdnanycast.Ssl postServiceNameSsl(java.lang.String certificate, java.lang.String name, java.lang.String key, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/ssl";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("certificate", certificate);
		dataMap.put("name", name);
		dataMap.put("key", key);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.cdnanycast.Ssl.class);
	}

	public net.zyuiop.ovhapi.api.objects.cdnanycast.Pop getPopsName(java.lang.String name) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/pops/" + name + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, false), net.zyuiop.ovhapi.api.objects.cdnanycast.Pop.class);
	}

	public void putServiceNameServiceInfos(net.zyuiop.ovhapi.api.objects.services.Service param0, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/serviceInfos";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.cdnanycast.Ssl getServiceNameSsl(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/ssl";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.cdnanycast.Ssl.class);
	}

	public net.zyuiop.ovhapi.api.objects.cdnanycast.Task deleteServiceNameSsl(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/ssl";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.cdnanycast.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.cdnanycast.Task postServiceNameDomainsDomainFlush(java.lang.String serviceName, java.lang.String domain) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/domains/" + domain + "/flush";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.cdnanycast.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.cdnanycast.Task postServiceNameDomainsDomainCacheRulesCacheRuleIdFlush(java.lang.String serviceName, java.lang.String domain, long cacheRuleId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/domains/" + domain + "/cacheRules/" + cacheRuleId + "/flush";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.cdnanycast.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.cdnanycast.CacheRule postServiceNameDomainsDomainCacheRules(java.lang.String cacheType, long ttl, java.lang.String fileMatch, java.lang.String fileType, java.lang.String serviceName, java.lang.String domain) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/domains/" + domain + "/cacheRules";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("cacheType", cacheType);
		dataMap.put("ttl", ttl);
		dataMap.put("fileMatch", fileMatch);
		dataMap.put("fileType", fileType);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.cdnanycast.CacheRule.class);
	}

	public net.zyuiop.ovhapi.api.objects.cdnanycast.Task getServiceNameDomainsDomainCacheRulesCacheRuleIdTasksTaskId(java.lang.String serviceName, java.lang.String domain, long cacheRuleId, long taskId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/domains/" + domain + "/cacheRules/" + cacheRuleId + "/tasks/" + taskId + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.cdnanycast.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.cdnanycast.Task postServiceNameSslUpdate(java.lang.String certificate, java.lang.String key, java.lang.String serviceName, java.lang.String chain) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/ssl/update";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("certificate", certificate);
		dataMap.put("key", key);
		dataMap.put("chain", chain);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.cdnanycast.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.cdnanycast.Task postServiceNameSslUpdate(java.lang.String certificate, java.lang.String key, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/ssl/update";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("certificate", certificate);
		dataMap.put("key", key);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.cdnanycast.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.cdnanycast.Task deleteServiceNameDomainsDomain(java.lang.String serviceName, java.lang.String domain) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/domains/" + domain + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.cdnanycast.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.cdnanycast.StatsDataType getServiceNameQuota(java.lang.String period, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/quota";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.cdnanycast.StatsDataType.class);
	}

	public java.lang.String getServiceNameDomains(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/domains";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getCdnDedicated() throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0//cdn/dedicated";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getPops() throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/pops";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, false), java.lang.String.class);
	}

	public java.lang.String getServiceNameDomainsDomainBackends(java.lang.String serviceName, java.lang.String domain) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/domains/" + domain + "/backends";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.cdnanycast.Backend postServiceNameDomainsDomainBackends(java.lang.String ip, java.lang.String serviceName, java.lang.String domain) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/domains/" + domain + "/backends";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("ip", ip);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.cdnanycast.Backend.class);
	}

	public void putServiceNameDomainsDomainCacheRulesCacheRuleId(net.zyuiop.ovhapi.api.objects.cdnanycast.CacheRule param0, java.lang.String serviceName, java.lang.String domain, long cacheRuleId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/domains/" + domain + "/cacheRules/" + cacheRuleId + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public long[] getServiceNameSslTasks(java.lang.String serviceName, java.lang.String function, java.lang.String status) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/ssl/tasks";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public long[] getServiceNameSslTasks(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/ssl/tasks";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.services.Service getServiceNameServiceInfos(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/serviceInfos";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.services.Service.class);
	}

	public net.zyuiop.ovhapi.api.objects.cdnanycast.Backend getServiceNameDomainsDomainBackendsIp(java.lang.String serviceName, java.lang.String domain, java.lang.String ip) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/domains/" + domain + "/backends/" + ip + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.cdnanycast.Backend.class);
	}

}
