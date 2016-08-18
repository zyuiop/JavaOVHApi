package net.zyuiop.ovhapi.impl.methods.cdn;

import net.zyuiop.ovhapi.api.methods.cdn.Website;
import com.google.gson.Gson;
import net.zyuiop.ovhapi.api.OVHApiMethod;
import java.util.HashMap;
import java.util.Map;
import net.zyuiop.ovhapi.impl.OVHRawCalls;
import java.net.URL;
public class WebsiteImpl implements Website { 

	private final OVHRawCalls client;

	public WebsiteImpl(OVHRawCalls client) { 
		this.client = client;
	}

	public net.zyuiop.ovhapi.api.objects.cdn.website.Task deleteServiceNameZoneBackendsIpv4(java.lang.String serviceName, java.lang.String ipv4) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cdn/website/" + serviceName + "/zone/backends/" + ipv4 + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.cdn.website.Task.class);
	}

	public long[] getServiceNameZoneTasks(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cdn/website/" + serviceName + "/zone/tasks";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.cdn.website.Task postServiceNameZoneDomainsDomainFlush(java.lang.String serviceName, java.lang.String domain) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cdn/website/" + serviceName + "/zone/domains/" + domain + "/flush";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.cdn.website.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.cdn.website.Domain postServiceNameZoneDomains(java.lang.String domain, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cdn/website/" + serviceName + "/zone/domains";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("domain", domain);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.cdn.website.Domain.class);
	}

	public net.zyuiop.ovhapi.api.objects.cdn.website.Task postServiceNameZoneBackends(java.lang.String ipv4, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cdn/website/" + serviceName + "/zone/backends";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("ipv4", ipv4);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.cdn.website.Task.class);
	}

	public long[] getServiceNameZoneBackendsIpv4Tasks(java.lang.String serviceName, java.lang.String ipv4) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cdn/website/" + serviceName + "/zone/backends/" + ipv4 + "/tasks";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "ipv4=" + ipv4;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public java.lang.String[] getCdnWebsite() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cdn/website/cdn/website";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.cdn.website.Website getServiceName(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cdn/website/" + serviceName + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.cdn.website.Website.class);
	}

	public net.zyuiop.ovhapi.api.objects.cdn.website.Task deleteServiceNameZone(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cdn/website/" + serviceName + "/zone";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.cdn.website.Task.class);
	}

	public long[] getServiceNameZoneDomainsDomainTasks(java.lang.String serviceName, java.lang.String domain) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cdn/website/" + serviceName + "/zone/domains/" + domain + "/tasks";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "domain=" + domain;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public java.lang.String[] getServiceNameZoneDomains(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cdn/website/" + serviceName + "/zone/domains";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public void putServiceNameServiceInfos(net.zyuiop.ovhapi.api.objects.services.Service param0, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cdn/website/" + serviceName + "/serviceInfos";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public java.lang.String[] getServiceNameZoneBackends(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cdn/website/" + serviceName + "/zone/backends";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.cdn.website.Domain getServiceNameZoneDomainsDomain(java.lang.String serviceName, java.lang.String domain) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cdn/website/" + serviceName + "/zone/domains/" + domain + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "domain=" + domain;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.cdn.website.Domain.class);
	}

	public net.zyuiop.ovhapi.api.objects.cdn.website.Task deleteServiceNameZoneDomainsDomain(java.lang.String serviceName, java.lang.String domain) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cdn/website/" + serviceName + "/zone/domains/" + domain + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.cdn.website.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.cdn.website.Task getServiceNameZoneBackendsIpv4TasksTaskId(java.lang.String serviceName, java.lang.String ipv4, long taskId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cdn/website/" + serviceName + "/zone/backends/" + ipv4 + "/tasks/" + taskId + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "ipv4=" + ipv4;
		__data += "taskId=" + taskId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.cdn.website.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.cdn.website.Zone postServiceNameZone(java.lang.String zone, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cdn/website/" + serviceName + "/zone";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("zone", zone);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.cdn.website.Zone.class);
	}

	public net.zyuiop.ovhapi.api.objects.cdn.website.Zone getServiceNameZone(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cdn/website/" + serviceName + "/zone";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.cdn.website.Zone.class);
	}

	public net.zyuiop.ovhapi.api.objects.cdn.website.StatsDataType[] getServiceNameZoneDomainsDomainStatistics(java.lang.String period, java.lang.String value, java.lang.String type, java.lang.String serviceName, java.lang.String domain) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cdn/website/" + serviceName + "/zone/domains/" + domain + "/statistics";
		String __data = "?";
		__data += "period=" + period;
		__data += "value=" + value;
		__data += "type=" + type;
		__data += "serviceName=" + serviceName;
		__data += "domain=" + domain;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.cdn.website.StatsDataType[].class);
	}

	public net.zyuiop.ovhapi.api.objects.cdn.website.Backend getServiceNameZoneBackendsIpv4(java.lang.String serviceName, java.lang.String ipv4) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cdn/website/" + serviceName + "/zone/backends/" + ipv4 + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "ipv4=" + ipv4;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.cdn.website.Backend.class);
	}

	public net.zyuiop.ovhapi.api.objects.cdn.website.Task getServiceNameZoneDomainsDomainTasksTaskId(java.lang.String serviceName, java.lang.String domain, long taskId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cdn/website/" + serviceName + "/zone/domains/" + domain + "/tasks/" + taskId + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "domain=" + domain;
		__data += "taskId=" + taskId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.cdn.website.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.services.Service getServiceNameServiceInfos(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cdn/website/" + serviceName + "/serviceInfos";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.services.Service.class);
	}

	public net.zyuiop.ovhapi.api.objects.cdn.website.Task getServiceNameZoneTasksTaskId(java.lang.String serviceName, long taskId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/cdn/website/" + serviceName + "/zone/tasks/" + taskId + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "taskId=" + taskId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.cdn.website.Task.class);
	}

}
